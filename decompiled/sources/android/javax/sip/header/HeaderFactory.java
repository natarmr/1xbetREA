package android.javax.sip.header;

import android.javax.sip.address.Address;
import android.javax.sip.address.URI;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public interface HeaderFactory {
    AcceptEncodingHeader createAcceptEncodingHeader(String str);

    AcceptHeader createAcceptHeader(String str, String str2);

    AcceptLanguageHeader createAcceptLanguageHeader(Locale locale);

    AlertInfoHeader createAlertInfoHeader(URI uri);

    AllowEventsHeader createAllowEventsHeader(String str);

    AllowHeader createAllowHeader(String str);

    AuthenticationInfoHeader createAuthenticationInfoHeader(String str);

    AuthorizationHeader createAuthorizationHeader(String str);

    CSeqHeader createCSeqHeader(int i, String str);

    CSeqHeader createCSeqHeader(long j, String str);

    CallIdHeader createCallIdHeader(String str);

    CallInfoHeader createCallInfoHeader(URI uri);

    ContactHeader createContactHeader();

    ContactHeader createContactHeader(Address address);

    ContentDispositionHeader createContentDispositionHeader(String str);

    ContentEncodingHeader createContentEncodingHeader(String str);

    ContentLanguageHeader createContentLanguageHeader(Locale locale);

    ContentLengthHeader createContentLengthHeader(int i);

    ContentTypeHeader createContentTypeHeader(String str, String str2);

    DateHeader createDateHeader(Calendar calendar);

    ErrorInfoHeader createErrorInfoHeader(URI uri);

    EventHeader createEventHeader(String str);

    ExpiresHeader createExpiresHeader(int i);

    FromHeader createFromHeader(Address address, String str);

    Header createHeader(String str, String str2);

    List createHeaders(String str);

    InReplyToHeader createInReplyToHeader(String str);

    MaxForwardsHeader createMaxForwardsHeader(int i);

    MimeVersionHeader createMimeVersionHeader(int i, int i2);

    MinExpiresHeader createMinExpiresHeader(int i);

    OrganizationHeader createOrganizationHeader(String str);

    PriorityHeader createPriorityHeader(String str);

    ProxyAuthenticateHeader createProxyAuthenticateHeader(String str);

    ProxyAuthorizationHeader createProxyAuthorizationHeader(String str);

    ProxyRequireHeader createProxyRequireHeader(String str);

    RAckHeader createRAckHeader(int i, int i2, String str);

    RSeqHeader createRSeqHeader(int i);

    ReasonHeader createReasonHeader(String str, int i, String str2);

    RecordRouteHeader createRecordRouteHeader(Address address);

    ReferToHeader createReferToHeader(Address address);

    ReplyToHeader createReplyToHeader(Address address);

    RequireHeader createRequireHeader(String str);

    RetryAfterHeader createRetryAfterHeader(int i);

    RouteHeader createRouteHeader(Address address);

    SIPETagHeader createSIPETagHeader(String str);

    SIPIfMatchHeader createSIPIfMatchHeader(String str);

    ServerHeader createServerHeader(List list);

    SubjectHeader createSubjectHeader(String str);

    SubscriptionStateHeader createSubscriptionStateHeader(String str);

    SupportedHeader createSupportedHeader(String str);

    TimeStampHeader createTimeStampHeader(float f);

    ToHeader createToHeader(Address address, String str);

    UnsupportedHeader createUnsupportedHeader(String str);

    UserAgentHeader createUserAgentHeader(List list);

    ViaHeader createViaHeader(String str, int i, String str2, String str3);

    WWWAuthenticateHeader createWWWAuthenticateHeader(String str);

    WarningHeader createWarningHeader(String str, int i, String str2);
}
