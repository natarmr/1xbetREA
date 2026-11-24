package android.gov.nist.javax.sip.clientauthutils;

import a.b1j;
import a.kng0;
import a.w6x;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.Separators;
import android.javax.sip.address.URI;
import android.javax.sip.header.HeaderFactory;
import android.javax.sip.header.ProxyAuthenticateHeader;
import android.javax.sip.header.ProxyAuthorizationHeader;
import android.javax.sip.message.Request;
import android.javax.sip.message.Response;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class DigestServerAuthenticationHelper {
    public static final String DEFAULT_ALGORITHM = "MD5";
    public static final String DEFAULT_SCHEME = "Digest";
    private static final char[] toHex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private MessageDigest messageDigest = MessageDigest.getInstance(DEFAULT_ALGORITHM);

    private String generateNonce() {
        return toHexString(this.messageDigest.digest((new Long(new Date().getTime()).toString() + new Long(new Random().nextLong()).toString()).getBytes()));
    }

    public static String toHexString(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = toHex;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean doAuthenticateHashedPassword(Request request, String str) {
        ProxyAuthorizationHeader proxyAuthorizationHeader = (ProxyAuthorizationHeader) request.getHeader("Proxy-Authorization");
        if (proxyAuthorizationHeader == null) {
            return false;
        }
        String realm = proxyAuthorizationHeader.getRealm();
        if (proxyAuthorizationHeader.getUsername() == null || realm == null) {
            return false;
        }
        String nonce = proxyAuthorizationHeader.getNonce();
        URI uri = proxyAuthorizationHeader.getURI();
        if (uri == null) {
            return false;
        }
        String hexString = toHexString(this.messageDigest.digest((request.getMethod().toUpperCase() + Separators.COLON + uri.toString()).getBytes()));
        String cNonce = proxyAuthorizationHeader.getCNonce();
        String strQ = w6x.q(str, Separators.COLON, nonce);
        if (cNonce != null) {
            strQ = kng0.l(strQ, Separators.COLON, cNonce);
        }
        return toHexString(this.messageDigest.digest(kng0.l(strQ, Separators.COLON, hexString).getBytes())).equals(proxyAuthorizationHeader.getResponse());
    }

    public boolean doAuthenticatePlainTextPassword(Request request, String str) {
        ProxyAuthorizationHeader proxyAuthorizationHeader = (ProxyAuthorizationHeader) request.getHeader("Proxy-Authorization");
        if (proxyAuthorizationHeader == null) {
            return false;
        }
        String realm = proxyAuthorizationHeader.getRealm();
        String username = proxyAuthorizationHeader.getUsername();
        if (username == null || realm == null) {
            return false;
        }
        String nonce = proxyAuthorizationHeader.getNonce();
        URI uri = proxyAuthorizationHeader.getURI();
        if (uri == null) {
            return false;
        }
        String strK = b1j.k(username, Separators.COLON, realm, Separators.COLON, str);
        String str2 = request.getMethod().toUpperCase() + Separators.COLON + uri.toString();
        String hexString = toHexString(this.messageDigest.digest(strK.getBytes()));
        String hexString2 = toHexString(this.messageDigest.digest(str2.getBytes()));
        String cNonce = proxyAuthorizationHeader.getCNonce();
        String strQ = w6x.q(hexString, Separators.COLON, nonce);
        if (cNonce != null) {
            strQ = kng0.l(strQ, Separators.COLON, cNonce);
        }
        return toHexString(this.messageDigest.digest(kng0.l(strQ, Separators.COLON, hexString2).getBytes())).equals(proxyAuthorizationHeader.getResponse());
    }

    public void generateChallenge(HeaderFactory headerFactory, Response response, String str) {
        try {
            ProxyAuthenticateHeader proxyAuthenticateHeaderCreateProxyAuthenticateHeader = headerFactory.createProxyAuthenticateHeader("Digest");
            proxyAuthenticateHeaderCreateProxyAuthenticateHeader.setParameter("realm", str);
            proxyAuthenticateHeaderCreateProxyAuthenticateHeader.setParameter("nonce", generateNonce());
            proxyAuthenticateHeaderCreateProxyAuthenticateHeader.setParameter("opaque", "");
            proxyAuthenticateHeaderCreateProxyAuthenticateHeader.setParameter("stale", "FALSE");
            proxyAuthenticateHeaderCreateProxyAuthenticateHeader.setParameter("algorithm", DEFAULT_ALGORITHM);
            response.setHeader(proxyAuthenticateHeaderCreateProxyAuthenticateHeader);
        } catch (Exception e) {
            InternalErrorHandler.handleException(e);
        }
    }
}
