package android.gov.nist.javax.sip.stack;

import a.jf4;
import a.v4i0;
import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.core.StackLogger;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.ParameterNames;
import android.gov.nist.javax.sip.address.SipUri;
import android.gov.nist.javax.sip.header.RequestLine;
import android.gov.nist.javax.sip.header.Route;
import android.gov.nist.javax.sip.header.RouteList;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.ListeningPoint;
import android.javax.sip.SipException;
import android.javax.sip.SipStack;
import android.javax.sip.address.Hop;
import android.javax.sip.address.Router;
import android.javax.sip.address.SipURI;
import android.javax.sip.address.URI;
import android.javax.sip.header.ViaHeader;
import android.javax.sip.message.Request;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRouter implements Router {
    private static StackLogger logger = CommonLogger.getLogger(DefaultRouter.class);
    private Hop defaultRoute;
    private SIPTransactionStack sipStack;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultRouter(SipStack sipStack, String str) {
        SIPTransactionStack sIPTransactionStack = (SIPTransactionStack) sipStack;
        this.sipStack = sIPTransactionStack;
        if (str != null) {
            try {
                this.defaultRoute = sIPTransactionStack.getAddressResolver().resolveAddress(new HopImpl(str));
            } catch (IllegalArgumentException e) {
                logger.logError("Invalid default route specification - need host:port/transport");
                throw e;
            }
        }
    }

    public final Hop createHop(SipURI sipURI, Request request) {
        int port;
        String transportParam = sipURI.isSecure() ? ParameterNames.TLS : sipURI.getTransportParam();
        if (transportParam == null) {
            ViaHeader viaHeader = (ViaHeader) request.getHeader("Via");
            if (viaHeader != null) {
                transportParam = viaHeader.getTransport();
            }
            if (transportParam == null) {
                transportParam = ListeningPoint.UDP;
            }
        }
        if (sipURI.getPort() != -1) {
            port = sipURI.getPort();
        } else {
            port = transportParam.equalsIgnoreCase(ParameterNames.TLS) ? 5061 : 5060;
        }
        return this.sipStack.getAddressResolver().resolveAddress(new HopImpl(sipURI.getMAddrParam() != null ? sipURI.getMAddrParam() : sipURI.getHost(), port, transportParam));
    }

    public void fixStrictRouting(SIPRequest sIPRequest) {
        RouteList routeHeaders = sIPRequest.getRouteHeaders();
        SipUri sipUri = (SipUri) ((Route) routeHeaders.getFirst()).getAddress().getURI();
        routeHeaders.removeFirst();
        AddressImpl addressImpl = new AddressImpl();
        addressImpl.setAddess(sIPRequest.getRequestURI());
        routeHeaders.add(new Route(addressImpl));
        sIPRequest.setRequestURI(sipUri);
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("post: fixStrictRouting" + sIPRequest);
        }
    }

    @Override // android.javax.sip.address.Router
    public Hop getNextHop(Request request) throws SipException {
        SIPRequest sIPRequest = (SIPRequest) request;
        RequestLine requestLine = sIPRequest.getRequestLine();
        if (requestLine == null) {
            return this.defaultRoute;
        }
        URI uri = requestLine.getUri();
        if (uri == null) {
            jf4.o("Bad message: Null requestURI");
            return null;
        }
        RouteList routeHeaders = sIPRequest.getRouteHeaders();
        if (routeHeaders != null && routeHeaders.getFirst() != null) {
            URI uri2 = ((Route) routeHeaders.getFirst()).getAddress().getURI();
            if (!uri2.isSipURI()) {
                v4i0.k("First Route not a SIP URI");
                return null;
            }
            SipURI sipURI = (SipURI) uri2;
            if (!sipURI.hasLrParam()) {
                fixStrictRouting(sIPRequest);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Route post processing fixed strict routing");
                }
            }
            Hop hopCreateHop = createHop(sipURI, request);
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("NextHop based on Route:" + hopCreateHop);
            }
            return hopCreateHop;
        }
        if (uri.isSipURI()) {
            SipURI sipURI2 = (SipURI) uri;
            if (sipURI2.getMAddrParam() != null) {
                Hop hopCreateHop2 = createHop(sipURI2, request);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Using request URI maddr to route the request = " + hopCreateHop2.toString());
                }
                return hopCreateHop2;
            }
        }
        if (this.defaultRoute != null) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Using outbound proxy to route the request = " + this.defaultRoute.toString());
            }
            return this.defaultRoute;
        }
        if (!uri.isSipURI()) {
            InternalErrorHandler.handleException("Unexpected non-sip URI", logger);
            return null;
        }
        Hop hopCreateHop3 = createHop((SipURI) uri, request);
        if (hopCreateHop3 == null || !logger.isLoggingEnabled(32)) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("returning null hop -- loop detected");
            }
            return hopCreateHop3;
        }
        logger.logDebug("Used request-URI for nextHop = " + hopCreateHop3.toString());
        return hopCreateHop3;
    }

    @Override // android.javax.sip.address.Router
    public ListIterator getNextHops(Request request) {
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(getNextHop(request));
            return linkedList.listIterator();
        } catch (SipException unused) {
            return null;
        }
    }

    @Override // android.javax.sip.address.Router
    public Hop getOutboundProxy() {
        return this.defaultRoute;
    }

    private DefaultRouter() {
    }
}
