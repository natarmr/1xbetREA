package android.gov.nist.javax.sip.clientauthutils;

import a.b1j;
import a.hny;
import a.itt0;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.gov.nist.javax.sip.stack.SIPClientTransaction;
import android.gov.nist.javax.sip.stack.SIPTransactionStack;
import android.javax.sip.ClientTransaction;
import android.javax.sip.DialogState;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.SipException;
import android.javax.sip.SipProvider;
import android.javax.sip.address.Hop;
import android.javax.sip.address.SipURI;
import android.javax.sip.address.URI;
import android.javax.sip.header.AuthorizationHeader;
import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.HeaderFactory;
import android.javax.sip.header.ProxyAuthenticateHeader;
import android.javax.sip.header.ViaHeader;
import android.javax.sip.header.WWWAuthenticateHeader;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.text.ParseException;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticationHelperImpl implements AuthenticationHelper {
    private static StackLogger logger = CommonLogger.getLogger(AuthenticationHelperImpl.class);
    private Object accountManager;
    private CredentialsCache cachedCredentials;
    private HeaderFactory headerFactory;
    private SIPTransactionStack sipStack;
    Timer timer;

    public AuthenticationHelperImpl(SIPTransactionStack sIPTransactionStack, AccountManager accountManager, HeaderFactory headerFactory) {
        this.accountManager = accountManager;
        this.headerFactory = headerFactory;
        this.sipStack = sIPTransactionStack;
        this.cachedCredentials = new CredentialsCache(sIPTransactionStack.getTimer());
    }

    private AuthorizationHeader getAuthorization(String str, String str2, String str3, WWWAuthenticateHeader wWWAuthenticateHeader, UserCredentials userCredentials) {
        String str4 = wWWAuthenticateHeader.getQop() != null ? "auth" : null;
        String strCalculateResponse = MessageDigestAlgorithm.calculateResponse(wWWAuthenticateHeader.getAlgorithm(), userCredentials.getUserName(), wWWAuthenticateHeader.getRealm(), userCredentials.getPassword(), wWWAuthenticateHeader.getNonce(), "00000001", "xyz", str, str2, str3, str4, logger);
        try {
            boolean z = wWWAuthenticateHeader instanceof ProxyAuthenticateHeader;
            HeaderFactory headerFactory = this.headerFactory;
            AuthorizationHeader authorizationHeaderCreateProxyAuthorizationHeader = z ? headerFactory.createProxyAuthorizationHeader(wWWAuthenticateHeader.getScheme()) : headerFactory.createAuthorizationHeader(wWWAuthenticateHeader.getScheme());
            authorizationHeaderCreateProxyAuthorizationHeader.setUsername(userCredentials.getUserName());
            authorizationHeaderCreateProxyAuthorizationHeader.setRealm(wWWAuthenticateHeader.getRealm());
            authorizationHeaderCreateProxyAuthorizationHeader.setNonce(wWWAuthenticateHeader.getNonce());
            authorizationHeaderCreateProxyAuthorizationHeader.setParameter("uri", str2);
            authorizationHeaderCreateProxyAuthorizationHeader.setResponse(strCalculateResponse);
            if (wWWAuthenticateHeader.getAlgorithm() != null) {
                authorizationHeaderCreateProxyAuthorizationHeader.setAlgorithm(wWWAuthenticateHeader.getAlgorithm());
            }
            if (wWWAuthenticateHeader.getOpaque() != null) {
                authorizationHeaderCreateProxyAuthorizationHeader.setOpaque(wWWAuthenticateHeader.getOpaque());
            }
            if (str4 != null) {
                authorizationHeaderCreateProxyAuthorizationHeader.setQop(str4);
                authorizationHeaderCreateProxyAuthorizationHeader.setCNonce("xyz");
                authorizationHeaderCreateProxyAuthorizationHeader.setNonceCount(Integer.parseInt("00000001"));
            }
            authorizationHeaderCreateProxyAuthorizationHeader.setResponse(strCalculateResponse);
            return authorizationHeaderCreateProxyAuthorizationHeader;
        } catch (ParseException unused) {
            itt0.k("Failed to create an authorization header!");
            return null;
        }
    }

    private void removeBranchID(Request request) {
        ((ViaHeader) request.getHeader("Via")).removeParameter("branch");
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public ClientTransaction handleChallenge(Response response, ClientTransaction clientTransaction, SipProvider sipProvider, int i, boolean z) throws SipException {
        Request requestCreateRequest;
        ListIterator headers;
        AuthenticationHelperImpl authenticationHelperImpl;
        AuthorizationHeader authorization;
        try {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("handleChallenge: " + response);
            }
            SIPRequest sIPRequest = (SIPRequest) clientTransaction.getRequest();
            if (sIPRequest.getToTag() == null && clientTransaction.getDialog() != null && clientTransaction.getDialog().getState() == DialogState.CONFIRMED) {
                requestCreateRequest = clientTransaction.getDialog().createRequest(sIPRequest.getMethod());
                ListIterator<String> headerNames = sIPRequest.getHeaderNames();
                while (headerNames.hasNext()) {
                    String next = headerNames.next();
                    if (requestCreateRequest.getHeader(next) == null) {
                        ListIterator<SIPHeader> headers2 = sIPRequest.getHeaders(next);
                        while (headers2.hasNext()) {
                            requestCreateRequest.addHeader(headers2.next());
                        }
                    }
                }
            } else {
                requestCreateRequest = (Request) sIPRequest.clone();
            }
            removeBranchID(requestCreateRequest);
            if (response == null || requestCreateRequest == null) {
                throw new NullPointerException("A null argument was passed to handle challenge.");
            }
            if (response.getStatusCode() == 401) {
                headers = response.getHeaders("WWW-Authenticate");
            } else {
                if (response.getStatusCode() != 407) {
                    throw new IllegalArgumentException("Unexpected status code ");
                }
                headers = response.getHeaders("Proxy-Authenticate");
            }
            if (headers == null) {
                throw new IllegalArgumentException("Could not find WWWAuthenticate or ProxyAuthenticate headers");
            }
            requestCreateRequest.removeHeader("Authorization");
            requestCreateRequest.removeHeader("Proxy-Authorization");
            CSeqHeader cSeqHeader = (CSeqHeader) requestCreateRequest.getHeader("CSeq");
            try {
                cSeqHeader.setSeqNumber(cSeqHeader.getSeqNumber() + 1);
                if (!z && sIPRequest.getRouteHeaders() == null) {
                    Hop nextHop = ((SIPClientTransaction) clientTransaction).getNextHop();
                    SipURI sipURI = (SipURI) requestCreateRequest.getRequestURI();
                    sipURI.setMAddrParam(nextHop.getHost());
                    if (nextHop.getPort() != -1) {
                        sipURI.setPort(nextHop.getPort());
                    }
                }
                ClientTransaction newClientTransaction = sipProvider.getNewClientTransaction(requestCreateRequest);
                while (headers.hasNext()) {
                    WWWAuthenticateHeader wWWAuthenticateHeader = (WWWAuthenticateHeader) headers.next();
                    String realm = wWWAuthenticateHeader.getRealm();
                    Object obj = this.accountManager;
                    if (obj instanceof SecureAccountManager) {
                        UserCredentialHash credentialHash = ((SecureAccountManager) obj).getCredentialHash(clientTransaction, realm);
                        if (credentialHash == null) {
                            logger.logDebug("Could not find creds");
                            throw new SipException("Cannot find user creds for the given user name and realm");
                        }
                        URI requestURI = requestCreateRequest.getRequestURI();
                        credentialHash.getSipDomain();
                        AuthenticationHelperImpl authenticationHelperImpl2 = this;
                        authorization = authenticationHelperImpl2.getAuthorization(requestCreateRequest.getMethod(), requestURI.toString(), requestCreateRequest.getContent() != null ? new String(requestCreateRequest.getRawContent()) : "", wWWAuthenticateHeader, credentialHash);
                        authenticationHelperImpl = authenticationHelperImpl2;
                    } else {
                        AuthenticationHelperImpl authenticationHelperImpl3 = this;
                        UserCredentials credentials = ((AccountManager) obj).getCredentials(clientTransaction, realm);
                        if (credentials == null) {
                            throw new SipException("Cannot find user creds for the given user name and realm");
                        }
                        credentials.getSipDomain();
                        authenticationHelperImpl = authenticationHelperImpl3;
                        authorization = authenticationHelperImpl.getAuthorization(requestCreateRequest.getMethod(), requestCreateRequest.getRequestURI().toString(), requestCreateRequest.getContent() != null ? new String(requestCreateRequest.getRawContent()) : "", wWWAuthenticateHeader, credentials);
                    }
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Created authorization header: " + authorization.toString());
                    }
                    if (i != 0) {
                        authenticationHelperImpl.cachedCredentials.cacheAuthorizationHeader(sIPRequest.getCallId().getCallId(), authorization, i);
                    }
                    requestCreateRequest.addHeader(authorization);
                    this = authenticationHelperImpl;
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Returning authorization transaction." + newClientTransaction);
                }
                return newClientTransaction;
            } catch (InvalidArgumentException unused) {
                throw new SipException("Invalid CSeq -- could not increment : " + cSeqHeader.getSeqNumber());
            }
        } catch (SipException e) {
            throw e;
        } catch (Exception e2) {
            logger.logError("Unexpected exception ", e2);
            throw new SipException("Unexpected exception ", e2);
        }
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public void removeCachedAuthenticationHeaders(String str) {
        if (str != null) {
            this.cachedCredentials.removeAuthenticationHeader(str);
        } else {
            hny.u("Null callId argument ");
        }
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public void setAuthenticationHeaders(Request request) {
        String callId = ((SIPRequest) request).getCallId().getCallId();
        request.removeHeader("Authorization");
        Collection<AuthorizationHeader> cachedAuthorizationHeaders = this.cachedCredentials.getCachedAuthorizationHeaders(callId);
        if (cachedAuthorizationHeaders == null) {
            if (logger.isLoggingEnabled(32)) {
                b1j.x("Could not find authentication headers for ", callId, logger);
            }
        } else {
            Iterator<AuthorizationHeader> it = cachedAuthorizationHeaders.iterator();
            while (it.hasNext()) {
                request.addHeader(it.next());
            }
        }
    }

    public AuthenticationHelperImpl(SIPTransactionStack sIPTransactionStack, SecureAccountManager secureAccountManager, HeaderFactory headerFactory) {
        this.accountManager = secureAccountManager;
        this.headerFactory = headerFactory;
        this.sipStack = sIPTransactionStack;
        this.cachedCredentials = new CredentialsCache(sIPTransactionStack.getTimer());
    }

    private AuthorizationHeader getAuthorization(String str, String str2, String str3, WWWAuthenticateHeader wWWAuthenticateHeader, UserCredentialHash userCredentialHash) {
        AuthorizationHeader authorizationHeaderCreateAuthorizationHeader;
        String str4 = wWWAuthenticateHeader.getQop() != null ? "auth" : null;
        String strCalculateResponse = MessageDigestAlgorithm.calculateResponse(wWWAuthenticateHeader.getAlgorithm(), userCredentialHash.getHashUserDomainPassword(), wWWAuthenticateHeader.getNonce(), "00000001", "xyz", str, str2, str3, str4, logger);
        try {
            boolean z = wWWAuthenticateHeader instanceof ProxyAuthenticateHeader;
            HeaderFactory headerFactory = this.headerFactory;
            if (z) {
                authorizationHeaderCreateAuthorizationHeader = headerFactory.createProxyAuthorizationHeader(wWWAuthenticateHeader.getScheme());
            } else {
                authorizationHeaderCreateAuthorizationHeader = headerFactory.createAuthorizationHeader(wWWAuthenticateHeader.getScheme());
            }
            authorizationHeaderCreateAuthorizationHeader.setUsername(userCredentialHash.getUserName());
            authorizationHeaderCreateAuthorizationHeader.setRealm(wWWAuthenticateHeader.getRealm());
            authorizationHeaderCreateAuthorizationHeader.setNonce(wWWAuthenticateHeader.getNonce());
            authorizationHeaderCreateAuthorizationHeader.setParameter("uri", str2);
            authorizationHeaderCreateAuthorizationHeader.setResponse(strCalculateResponse);
            if (wWWAuthenticateHeader.getAlgorithm() != null) {
                authorizationHeaderCreateAuthorizationHeader.setAlgorithm(wWWAuthenticateHeader.getAlgorithm());
            }
            if (wWWAuthenticateHeader.getOpaque() != null) {
                authorizationHeaderCreateAuthorizationHeader.setOpaque(wWWAuthenticateHeader.getOpaque());
            }
            if (str4 != null) {
                authorizationHeaderCreateAuthorizationHeader.setQop(str4);
                authorizationHeaderCreateAuthorizationHeader.setCNonce("xyz");
                authorizationHeaderCreateAuthorizationHeader.setNonceCount(Integer.parseInt("00000001"));
            }
            authorizationHeaderCreateAuthorizationHeader.setResponse(strCalculateResponse);
            return authorizationHeaderCreateAuthorizationHeader;
        } catch (ParseException unused) {
            itt0.k("Failed to create an authorization header!");
            return null;
        }
    }

    @Override // android.gov.nist.javax.sip.clientauthutils.AuthenticationHelper
    public ClientTransaction handleChallenge(Response response, ClientTransaction clientTransaction, SipProvider sipProvider, int i) {
        return handleChallenge(response, clientTransaction, sipProvider, i, false);
    }
}
