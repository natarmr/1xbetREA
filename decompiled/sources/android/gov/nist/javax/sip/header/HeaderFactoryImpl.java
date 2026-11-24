package android.gov.nist.javax.sip.header;

import a.h97;
import a.hne;
import a.hny;
import a.itt0;
import a.jf4;
import a.twn;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.header.extensions.Join;
import android.gov.nist.javax.sip.header.extensions.JoinHeader;
import android.gov.nist.javax.sip.header.extensions.MinSE;
import android.gov.nist.javax.sip.header.extensions.References;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.header.extensions.ReferredBy;
import android.gov.nist.javax.sip.header.extensions.ReferredByHeader;
import android.gov.nist.javax.sip.header.extensions.Replaces;
import android.gov.nist.javax.sip.header.extensions.ReplacesHeader;
import android.gov.nist.javax.sip.header.extensions.SessionExpires;
import android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfo;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfoHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentity;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PAssertedService;
import android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader;
import android.gov.nist.javax.sip.header.ims.PAssociatedURI;
import android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader;
import android.gov.nist.javax.sip.header.ims.PCalledPartyID;
import android.gov.nist.javax.sip.header.ims.PCalledPartyIDHeader;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddresses;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddressesHeader;
import android.gov.nist.javax.sip.header.ims.PChargingVector;
import android.gov.nist.javax.sip.header.ims.PChargingVectorHeader;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorization;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorizationHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentity;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentityHeader;
import android.gov.nist.javax.sip.header.ims.PPreferredService;
import android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader;
import android.gov.nist.javax.sip.header.ims.PProfileKey;
import android.gov.nist.javax.sip.header.ims.PProfileKeyHeader;
import android.gov.nist.javax.sip.header.ims.PServedUser;
import android.gov.nist.javax.sip.header.ims.PServedUserHeader;
import android.gov.nist.javax.sip.header.ims.PUserDatabase;
import android.gov.nist.javax.sip.header.ims.PUserDatabaseHeader;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkID;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkIDHeader;
import android.gov.nist.javax.sip.header.ims.Path;
import android.gov.nist.javax.sip.header.ims.PathHeader;
import android.gov.nist.javax.sip.header.ims.Privacy;
import android.gov.nist.javax.sip.header.ims.PrivacyHeader;
import android.gov.nist.javax.sip.header.ims.SecurityClient;
import android.gov.nist.javax.sip.header.ims.SecurityClientHeader;
import android.gov.nist.javax.sip.header.ims.SecurityServer;
import android.gov.nist.javax.sip.header.ims.SecurityServerHeader;
import android.gov.nist.javax.sip.header.ims.SecurityVerify;
import android.gov.nist.javax.sip.header.ims.SecurityVerifyHeader;
import android.gov.nist.javax.sip.header.ims.ServiceRoute;
import android.gov.nist.javax.sip.header.ims.ServiceRouteHeader;
import android.gov.nist.javax.sip.parser.RequestLineParser;
import android.gov.nist.javax.sip.parser.StatusLineParser;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.address.Address;
import android.javax.sip.address.URI;
import android.javax.sip.header.AcceptEncodingHeader;
import android.javax.sip.header.AcceptHeader;
import android.javax.sip.header.AcceptLanguageHeader;
import android.javax.sip.header.AlertInfoHeader;
import android.javax.sip.header.AllowEventsHeader;
import android.javax.sip.header.AllowHeader;
import android.javax.sip.header.AuthenticationInfoHeader;
import android.javax.sip.header.AuthorizationHeader;
import android.javax.sip.header.CSeqHeader;
import android.javax.sip.header.CallIdHeader;
import android.javax.sip.header.CallInfoHeader;
import android.javax.sip.header.ContactHeader;
import android.javax.sip.header.ContentDispositionHeader;
import android.javax.sip.header.ContentEncodingHeader;
import android.javax.sip.header.ContentLanguageHeader;
import android.javax.sip.header.ContentLengthHeader;
import android.javax.sip.header.ContentTypeHeader;
import android.javax.sip.header.DateHeader;
import android.javax.sip.header.ErrorInfoHeader;
import android.javax.sip.header.EventHeader;
import android.javax.sip.header.ExpiresHeader;
import android.javax.sip.header.ExtensionHeader;
import android.javax.sip.header.FromHeader;
import android.javax.sip.header.Header;
import android.javax.sip.header.HeaderFactory;
import android.javax.sip.header.InReplyToHeader;
import android.javax.sip.header.MaxForwardsHeader;
import android.javax.sip.header.MimeVersionHeader;
import android.javax.sip.header.MinExpiresHeader;
import android.javax.sip.header.OrganizationHeader;
import android.javax.sip.header.PriorityHeader;
import android.javax.sip.header.ProxyAuthenticateHeader;
import android.javax.sip.header.ProxyAuthorizationHeader;
import android.javax.sip.header.ProxyRequireHeader;
import android.javax.sip.header.RAckHeader;
import android.javax.sip.header.RSeqHeader;
import android.javax.sip.header.ReasonHeader;
import android.javax.sip.header.RecordRouteHeader;
import android.javax.sip.header.ReferToHeader;
import android.javax.sip.header.ReplyToHeader;
import android.javax.sip.header.RequireHeader;
import android.javax.sip.header.RetryAfterHeader;
import android.javax.sip.header.RouteHeader;
import android.javax.sip.header.SIPETagHeader;
import android.javax.sip.header.SIPIfMatchHeader;
import android.javax.sip.header.ServerHeader;
import android.javax.sip.header.SubjectHeader;
import android.javax.sip.header.SubscriptionStateHeader;
import android.javax.sip.header.SupportedHeader;
import android.javax.sip.header.TimeStampHeader;
import android.javax.sip.header.ToHeader;
import android.javax.sip.header.UnsupportedHeader;
import android.javax.sip.header.UserAgentHeader;
import android.javax.sip.header.ViaHeader;
import android.javax.sip.header.WWWAuthenticateHeader;
import android.javax.sip.header.WarningHeader;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class HeaderFactoryImpl implements HeaderFactory, HeaderFactoryExt {
    private boolean stripAddressScopeZones;

    public HeaderFactoryImpl() {
        this.stripAddressScopeZones = false;
        this.stripAddressScopeZones = Boolean.getBoolean("android.gov.nist.core.STRIP_ADDR_SCOPES");
    }

    @Override // android.javax.sip.header.HeaderFactory
    public AcceptEncodingHeader createAcceptEncodingHeader(String str) {
        if (str == null) {
            hny.u("the encoding parameter is null");
            return null;
        }
        AcceptEncoding acceptEncoding = new AcceptEncoding();
        acceptEncoding.setEncoding(str);
        return acceptEncoding;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public AcceptHeader createAcceptHeader(String str, String str2) {
        if (str == null || str2 == null) {
            hny.u("contentType or subtype is null ");
            return null;
        }
        Accept accept = new Accept();
        accept.setContentType(str);
        accept.setContentSubType(str2);
        return accept;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public AcceptLanguageHeader createAcceptLanguageHeader(Locale locale) {
        if (locale == null) {
            hny.u("null arg");
            return null;
        }
        AcceptLanguage acceptLanguage = new AcceptLanguage();
        acceptLanguage.setAcceptLanguage(locale);
        return acceptLanguage;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public AlertInfoHeader createAlertInfoHeader(URI uri) {
        if (uri == null) {
            hny.u("null arg alertInfo");
            return null;
        }
        AlertInfo alertInfo = new AlertInfo();
        alertInfo.setAlertInfo(uri);
        return alertInfo;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public AllowEventsHeader createAllowEventsHeader(String str) {
        if (str == null) {
            hny.u("null arg eventType");
            return null;
        }
        AllowEvents allowEvents = new AllowEvents();
        allowEvents.setEventType(str);
        return allowEvents;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public AllowHeader createAllowHeader(String str) {
        if (str == null) {
            hny.u("null arg method");
            return null;
        }
        Allow allow = new Allow();
        allow.setMethod(str);
        return allow;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public AuthenticationInfoHeader createAuthenticationInfoHeader(String str) throws ParseException {
        if (str == null) {
            hny.u("null arg response");
            return null;
        }
        AuthenticationInfo authenticationInfo = new AuthenticationInfo();
        authenticationInfo.setResponse(str);
        return authenticationInfo;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public AuthorizationHeader createAuthorizationHeader(String str) {
        if (str == null) {
            hny.u("null arg scheme ");
            return null;
        }
        Authorization authorization = new Authorization();
        authorization.setScheme(str);
        return authorization;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public CSeqHeader createCSeqHeader(long j, String str) throws InvalidArgumentException {
        if (j < 0) {
            throw new InvalidArgumentException(h97.h(j, "bad arg "));
        }
        if (str == null) {
            hny.u("null arg method");
            return null;
        }
        CSeq cSeq = new CSeq();
        cSeq.setMethod(str);
        cSeq.setSeqNumber(j);
        return cSeq;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public CallIdHeader createCallIdHeader(String str) {
        if (str == null) {
            hny.u("null arg callId");
            return null;
        }
        CallID callID = new CallID();
        callID.setCallId(str);
        return callID;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public CallInfoHeader createCallInfoHeader(URI uri) {
        if (uri == null) {
            hny.u("null arg callInfo");
            return null;
        }
        CallInfo callInfo = new CallInfo();
        callInfo.setInfo(uri);
        return callInfo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PChargingVectorHeader createChargingVectorHeader(String str) {
        if (str == null) {
            hny.u("null icid arg!");
            return null;
        }
        PChargingVector pChargingVector = new PChargingVector();
        pChargingVector.setICID(str);
        return pChargingVector;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ContactHeader createContactHeader(Address address) {
        if (address == null) {
            hny.u("null arg address");
            return null;
        }
        Contact contact = new Contact();
        contact.setAddress(address);
        return contact;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ContentDispositionHeader createContentDispositionHeader(String str) {
        if (str == null) {
            hny.u("null arg contentDisposition");
            return null;
        }
        ContentDisposition contentDisposition = new ContentDisposition();
        contentDisposition.setDispositionType(str);
        return contentDisposition;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ContentEncodingHeader createContentEncodingHeader(String str) {
        if (str == null) {
            hny.u("null encoding");
            return null;
        }
        ContentEncoding contentEncoding = new ContentEncoding();
        contentEncoding.setEncoding(str);
        return contentEncoding;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ContentLanguageHeader createContentLanguageHeader(Locale locale) {
        if (locale == null) {
            hny.u("null arg contentLanguage");
            return null;
        }
        ContentLanguage contentLanguage = new ContentLanguage();
        contentLanguage.setContentLanguage(locale);
        return contentLanguage;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ContentLengthHeader createContentLengthHeader(int i) throws InvalidArgumentException {
        if (i < 0) {
            itt0.r("bad contentLength");
            return null;
        }
        ContentLength contentLength = new ContentLength();
        contentLength.setContentLength(i);
        return contentLength;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ContentTypeHeader createContentTypeHeader(String str, String str2) {
        if (str == null || str2 == null) {
            hny.u("null contentType or subType");
            return null;
        }
        ContentType contentType = new ContentType();
        contentType.setContentType(str);
        contentType.setContentSubType(str2);
        return contentType;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public DateHeader createDateHeader(Calendar calendar) {
        SIPDateHeader sIPDateHeader = new SIPDateHeader();
        if (calendar != null) {
            sIPDateHeader.setDate(calendar);
            return sIPDateHeader;
        }
        hny.u("null date");
        return null;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ErrorInfoHeader createErrorInfoHeader(URI uri) {
        if (uri != null) {
            return new ErrorInfo((GenericURI) uri);
        }
        hny.u("null arg");
        return null;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public EventHeader createEventHeader(String str) {
        if (str == null) {
            hny.u("null eventType");
            return null;
        }
        Event event = new Event();
        event.setEventType(str);
        return event;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ExpiresHeader createExpiresHeader(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException(twn.m(i, "bad value "));
        }
        Expires expires = new Expires();
        expires.setExpires(i);
        return expires;
    }

    public ExtensionHeader createExtensionHeader(String str, String str2) {
        if (str == null) {
            hny.u("bad name");
            return null;
        }
        ExtensionHeaderImpl extensionHeaderImpl = new ExtensionHeaderImpl();
        extensionHeaderImpl.setName(str);
        extensionHeaderImpl.setValue(str2);
        return extensionHeaderImpl;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public FromHeader createFromHeader(Address address, String str) {
        if (address == null) {
            hny.u("null address arg");
            return null;
        }
        From from = new From();
        from.setAddress(address);
        if (str != null) {
            from.setTag(str);
        }
        return from;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public Header createHeader(String str) throws ParseException {
        new StringMsgParser();
        SIPHeader sIPHeader = StringMsgParser.parseSIPHeader(str.trim());
        if (!(sIPHeader instanceof SIPHeaderList)) {
            return sIPHeader;
        }
        SIPHeaderList sIPHeaderList = (SIPHeaderList) sIPHeader;
        if (sIPHeaderList.size() > 1) {
            hny.j(0, "Only singleton allowed ".concat(str));
            return null;
        }
        if (sIPHeaderList.size() != 0) {
            return sIPHeaderList.getFirst();
        }
        try {
            return (Header) ((SIPHeaderList) sIPHeader).getMyClass().newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // android.javax.sip.header.HeaderFactory
    public List createHeaders(String str) throws ParseException {
        if (str == null) {
            hny.u("null arg!");
            return null;
        }
        new StringMsgParser();
        SIPHeader sIPHeader = StringMsgParser.parseSIPHeader(str);
        if (sIPHeader instanceof SIPHeaderList) {
            return (SIPHeaderList) sIPHeader;
        }
        hny.j(0, "List of headers of this type is not allowed in a message");
        return null;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public InReplyToHeader createInReplyToHeader(String str) throws ParseException {
        if (str == null) {
            hny.u("null callId arg");
            return null;
        }
        InReplyTo inReplyTo = new InReplyTo();
        inReplyTo.setCallId(str);
        return inReplyTo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public JoinHeader createJoinHeader(String str, String str2, String str3) throws ParseException {
        Join join = new Join();
        join.setCallId(str);
        join.setFromTag(str3);
        join.setToTag(str2);
        return join;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public MaxForwardsHeader createMaxForwardsHeader(int i) throws InvalidArgumentException {
        if (i < 0 || i > 255) {
            throw new InvalidArgumentException(twn.m(i, "bad maxForwards arg "));
        }
        MaxForwards maxForwards = new MaxForwards();
        maxForwards.setMaxForwards(i);
        return maxForwards;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public MimeVersionHeader createMimeVersionHeader(int i, int i2) throws InvalidArgumentException {
        if (i < 0 || i2 < 0) {
            itt0.r("bad major/minor version");
            return null;
        }
        MimeVersion mimeVersion = new MimeVersion();
        mimeVersion.setMajorVersion(i);
        mimeVersion.setMinorVersion(i2);
        return mimeVersion;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public MinExpiresHeader createMinExpiresHeader(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException(twn.m(i, "bad minExpires "));
        }
        MinExpires minExpires = new MinExpires();
        minExpires.setExpires(i);
        return minExpires;
    }

    public ExtensionHeader createMinSEHeader(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException(twn.m(i, "bad value "));
        }
        MinSE minSE = new MinSE();
        minSE.setExpires(i);
        return minSE;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public OrganizationHeader createOrganizationHeader(String str) {
        if (str == null) {
            hny.u("bad organization arg");
            return null;
        }
        Organization organization = new Organization();
        organization.setOrganization(str);
        return organization;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAccessNetworkInfoHeader createPAccessNetworkInfoHeader() {
        return new PAccessNetworkInfo();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssertedIdentityHeader createPAssertedIdentityHeader(Address address) {
        if (address == null) {
            hny.u("null address!");
            return null;
        }
        PAssertedIdentity pAssertedIdentity = new PAssertedIdentity();
        pAssertedIdentity.setAddress(address);
        return pAssertedIdentity;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssertedServiceHeader createPAssertedServiceHeader() {
        return new PAssertedService();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PAssociatedURIHeader createPAssociatedURIHeader(Address address) {
        if (address == null) {
            hny.u("null associatedURI!");
            return null;
        }
        PAssociatedURI pAssociatedURI = new PAssociatedURI();
        pAssociatedURI.setAddress(address);
        return pAssociatedURI;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PCalledPartyIDHeader createPCalledPartyIDHeader(Address address) {
        if (address == null) {
            hny.u("null address!");
            return null;
        }
        PCalledPartyID pCalledPartyID = new PCalledPartyID();
        pCalledPartyID.setAddress(address);
        return pCalledPartyID;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PChargingFunctionAddressesHeader createPChargingFunctionAddressesHeader() {
        return new PChargingFunctionAddresses();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PMediaAuthorizationHeader createPMediaAuthorizationHeader(String str) throws InvalidArgumentException {
        if (str == null || str == "") {
            itt0.r("The Media-Authorization-Token parameter is null or empty");
            return null;
        }
        PMediaAuthorization pMediaAuthorization = new PMediaAuthorization();
        pMediaAuthorization.setMediaAuthorizationToken(str);
        return pMediaAuthorization;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PPreferredIdentityHeader createPPreferredIdentityHeader(Address address) {
        if (address == null) {
            hny.u("null address!");
            return null;
        }
        PPreferredIdentity pPreferredIdentity = new PPreferredIdentity();
        pPreferredIdentity.setAddress(address);
        return pPreferredIdentity;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PPreferredServiceHeader createPPreferredServiceHeader() {
        return new PPreferredService();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PProfileKeyHeader createPProfileKeyHeader(Address address) {
        if (address == null) {
            hny.u("Address is null");
            return null;
        }
        PProfileKey pProfileKey = new PProfileKey();
        pProfileKey.setAddress(address);
        return pProfileKey;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PServedUserHeader createPServedUserHeader(Address address) {
        if (address == null) {
            hny.u("Address is null");
            return null;
        }
        PServedUser pServedUser = new PServedUser();
        pServedUser.setAddress(address);
        return pServedUser;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PUserDatabaseHeader createPUserDatabaseHeader(String str) {
        if (str == null || str.equals(Separators.SP)) {
            hny.u("Database name is null");
            return null;
        }
        PUserDatabase pUserDatabase = new PUserDatabase();
        pUserDatabase.setDatabaseName(str);
        return pUserDatabase;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PVisitedNetworkIDHeader createPVisitedNetworkIDHeader() {
        return new PVisitedNetworkID();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PathHeader createPathHeader(Address address) {
        if (address == null) {
            hny.u("null address!");
            return null;
        }
        Path path = new Path();
        path.setAddress(address);
        return path;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public PriorityHeader createPriorityHeader(String str) {
        if (str == null) {
            hny.u("bad priority arg");
            return null;
        }
        Priority priority = new Priority();
        priority.setPriority(str);
        return priority;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public PrivacyHeader createPrivacyHeader(String str) {
        if (str != null) {
            return new Privacy(str);
        }
        hny.u("null privacyType arg");
        return null;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ProxyAuthenticateHeader createProxyAuthenticateHeader(String str) {
        if (str == null) {
            hny.u("bad scheme arg");
            return null;
        }
        ProxyAuthenticate proxyAuthenticate = new ProxyAuthenticate();
        proxyAuthenticate.setScheme(str);
        return proxyAuthenticate;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ProxyAuthorizationHeader createProxyAuthorizationHeader(String str) {
        if (str == null) {
            hny.u("bad scheme arg");
            return null;
        }
        ProxyAuthorization proxyAuthorization = new ProxyAuthorization();
        proxyAuthorization.setScheme(str);
        return proxyAuthorization;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ProxyRequireHeader createProxyRequireHeader(String str) {
        if (str == null) {
            hny.u("bad optionTag arg");
            return null;
        }
        ProxyRequire proxyRequire = new ProxyRequire();
        proxyRequire.setOptionTag(str);
        return proxyRequire;
    }

    public RAckHeader createRAckHeader(long j, long j2, String str) throws InvalidArgumentException {
        if (str == null) {
            hny.u("Bad method");
            return null;
        }
        if (j2 < 0 || j < 0) {
            itt0.r("bad cseq/rseq arg");
            return null;
        }
        RAck rAck = new RAck();
        rAck.setMethod(str);
        rAck.setCSequenceNumber(j2);
        rAck.setRSequenceNumber(j);
        return rAck;
    }

    public RSeqHeader createRSeqHeader(long j) throws InvalidArgumentException {
        if (j < 0) {
            throw new InvalidArgumentException(h97.h(j, "invalid sequenceNumber arg "));
        }
        RSeq rSeq = new RSeq();
        rSeq.setSeqNumber(j);
        return rSeq;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ReasonHeader createReasonHeader(String str, int i, String str2) throws InvalidArgumentException {
        if (str == null) {
            hny.u("bad protocol arg");
            return null;
        }
        if (i < 0) {
            itt0.r("bad cause");
            return null;
        }
        Reason reason = new Reason();
        reason.setProtocol(str);
        reason.setCause(i);
        reason.setText(str2);
        return reason;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public RecordRouteHeader createRecordRouteHeader(Address address) {
        if (address == null) {
            hny.u("Null argument!");
            return null;
        }
        RecordRoute recordRoute = new RecordRoute();
        recordRoute.setAddress(address);
        return recordRoute;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ReferToHeader createReferToHeader(Address address) {
        if (address == null) {
            hny.u("null address!");
            return null;
        }
        ReferTo referTo = new ReferTo();
        referTo.setAddress(address);
        return referTo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReferencesHeader createReferencesHeader(String str, String str2) {
        References references = new References();
        references.setCallId(str);
        references.setRel(str2);
        return references;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReferredByHeader createReferredByHeader(Address address) {
        if (address == null) {
            hny.u("null address!");
            return null;
        }
        ReferredBy referredBy = new ReferredBy();
        referredBy.setAddress(address);
        return referredBy;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ReplacesHeader createReplacesHeader(String str, String str2, String str3) throws ParseException {
        Replaces replaces = new Replaces();
        replaces.setCallId(str);
        replaces.setFromTag(str3);
        replaces.setToTag(str2);
        return replaces;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ReplyToHeader createReplyToHeader(Address address) {
        if (address == null) {
            hny.u("null address");
            return null;
        }
        ReplyTo replyTo = new ReplyTo();
        replyTo.setAddress(address);
        return replyTo;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SipRequestLine createRequestLine(String str) {
        return new RequestLineParser(str).parse();
    }

    @Override // android.javax.sip.header.HeaderFactory
    public RequireHeader createRequireHeader(String str) {
        if (str == null) {
            hny.u("null optionTag");
            return null;
        }
        Require require = new Require();
        require.setOptionTag(str);
        return require;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public RetryAfterHeader createRetryAfterHeader(int i) throws InvalidArgumentException {
        if (i < 0) {
            itt0.r("bad retryAfter arg");
            return null;
        }
        RetryAfter retryAfter = new RetryAfter();
        retryAfter.setRetryAfter(i);
        return retryAfter;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public RouteHeader createRouteHeader(Address address) {
        if (address == null) {
            hny.u("null address arg");
            return null;
        }
        Route route = new Route();
        route.setAddress(address);
        return route;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public SIPETagHeader createSIPETagHeader(String str) {
        return new SIPETag(str);
    }

    @Override // android.javax.sip.header.HeaderFactory
    public SIPIfMatchHeader createSIPIfMatchHeader(String str) {
        return new SIPIfMatch(str);
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityClientHeader createSecurityClientHeader() {
        return new SecurityClient();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityServerHeader createSecurityServerHeader() {
        return new SecurityServer();
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SecurityVerifyHeader createSecurityVerifyHeader() {
        return new SecurityVerify();
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ServerHeader createServerHeader(List list) {
        if (list == null) {
            hny.u("null productList arg");
            return null;
        }
        Server server = new Server();
        server.setProduct(list);
        return server;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public ServiceRouteHeader createServiceRouteHeader(Address address) {
        if (address == null) {
            hny.u("null address!");
            return null;
        }
        ServiceRoute serviceRoute = new ServiceRoute();
        serviceRoute.setAddress(address);
        return serviceRoute;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SessionExpiresHeader createSessionExpiresHeader(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException(twn.m(i, "bad value "));
        }
        SessionExpires sessionExpires = new SessionExpires();
        sessionExpires.setExpires(i);
        return sessionExpires;
    }

    @Override // android.gov.nist.javax.sip.header.HeaderFactoryExt
    public SipStatusLine createStatusLine(String str) {
        return new StatusLineParser(str).parse();
    }

    @Override // android.javax.sip.header.HeaderFactory
    public SubjectHeader createSubjectHeader(String str) {
        if (str == null) {
            hny.u("null subject arg");
            return null;
        }
        Subject subject = new Subject();
        subject.setSubject(str);
        return subject;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public SubscriptionStateHeader createSubscriptionStateHeader(String str) {
        if (str == null) {
            hny.u("null subscriptionState arg");
            return null;
        }
        SubscriptionState subscriptionState = new SubscriptionState();
        subscriptionState.setState(str);
        return subscriptionState;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public SupportedHeader createSupportedHeader(String str) {
        if (str == null) {
            hny.u("null optionTag arg");
            return null;
        }
        Supported supported = new Supported();
        supported.setOptionTag(str);
        return supported;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public TimeStampHeader createTimeStampHeader(float f) {
        if (f < 0.0f) {
            jf4.o("illegal timeStamp");
            return null;
        }
        TimeStamp timeStamp = new TimeStamp();
        timeStamp.setTimeStamp(f);
        return timeStamp;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ToHeader createToHeader(Address address, String str) {
        if (address == null) {
            hny.u("null address");
            return null;
        }
        To to = new To();
        to.setAddress(address);
        if (str != null) {
            to.setTag(str);
        }
        return to;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public UnsupportedHeader createUnsupportedHeader(String str) {
        if (str == null) {
            hny.u(str);
            return null;
        }
        Unsupported unsupported = new Unsupported();
        unsupported.setOptionTag(str);
        return unsupported;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public UserAgentHeader createUserAgentHeader(List list) {
        if (list == null) {
            hny.u("null user agent");
            return null;
        }
        UserAgent userAgent = new UserAgent();
        userAgent.setProduct(list);
        return userAgent;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ViaHeader createViaHeader(String str, int i, String str2, String str3) {
        int iIndexOf;
        if (str == null || str2 == null) {
            hny.u("null arg");
            return null;
        }
        Via via = new Via();
        if (str3 != null) {
            via.setBranch(str3);
        }
        if (str.indexOf(58) >= 0 && str.indexOf(91) < 0) {
            if (this.stripAddressScopeZones && (iIndexOf = str.indexOf(37)) != -1) {
                str = str.substring(0, iIndexOf);
            }
            str = hne.l(']', "[", str);
        }
        via.setHost(str);
        via.setPort(i);
        via.setTransport(str2);
        return via;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public WWWAuthenticateHeader createWWWAuthenticateHeader(String str) {
        if (str == null) {
            hny.u("null scheme");
            return null;
        }
        WWWAuthenticate wWWAuthenticate = new WWWAuthenticate();
        wWWAuthenticate.setScheme(str);
        return wWWAuthenticate;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public WarningHeader createWarningHeader(String str, int i, String str2) throws ParseException, InvalidArgumentException {
        if (str == null) {
            hny.u("null arg");
            return null;
        }
        Warning warning = new Warning();
        warning.setAgent(str);
        warning.setCode(i);
        warning.setText(str2);
        return warning;
    }

    public void setPrettyEncoding(boolean z) {
        SIPHeaderList.setPrettyEncode(z);
    }

    @Override // android.javax.sip.header.HeaderFactory
    public ContactHeader createContactHeader() {
        Contact contact = new Contact();
        contact.setWildCardFlag(true);
        contact.setExpires(0);
        return contact;
    }

    @Override // android.javax.sip.header.HeaderFactory
    public RSeqHeader createRSeqHeader(int i) {
        return createRSeqHeader(i);
    }

    @Override // android.javax.sip.header.HeaderFactory
    public CSeqHeader createCSeqHeader(int i, String str) {
        return createCSeqHeader(i, str);
    }

    @Override // android.javax.sip.header.HeaderFactory
    public RAckHeader createRAckHeader(int i, int i2, String str) {
        return createRAckHeader(i, i2, str);
    }

    @Override // android.javax.sip.header.HeaderFactory
    public Header createHeader(String str, String str2) {
        if (str != null) {
            return createHeader(str + Separators.COLON + str2);
        }
        hny.u("header name is null");
        return null;
    }
}
