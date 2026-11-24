package android.gov.nist.javax.sip.parser;

import a.hny;
import android.gov.nist.core.InternalErrorHandler;
import android.gov.nist.javax.sip.header.SIPHeaderNamesCache;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.parser.extensions.JoinParser;
import android.gov.nist.javax.sip.parser.extensions.MinSEParser;
import android.gov.nist.javax.sip.parser.extensions.ReferencesParser;
import android.gov.nist.javax.sip.parser.extensions.ReferredByParser;
import android.gov.nist.javax.sip.parser.extensions.ReplacesParser;
import android.gov.nist.javax.sip.parser.extensions.SessionExpiresParser;
import android.gov.nist.javax.sip.parser.ims.PAccessNetworkInfoParser;
import android.gov.nist.javax.sip.parser.ims.PAssertedIdentityParser;
import android.gov.nist.javax.sip.parser.ims.PAssertedServiceParser;
import android.gov.nist.javax.sip.parser.ims.PAssociatedURIParser;
import android.gov.nist.javax.sip.parser.ims.PCalledPartyIDParser;
import android.gov.nist.javax.sip.parser.ims.PChargingFunctionAddressesParser;
import android.gov.nist.javax.sip.parser.ims.PChargingVectorParser;
import android.gov.nist.javax.sip.parser.ims.PMediaAuthorizationParser;
import android.gov.nist.javax.sip.parser.ims.PPreferredIdentityParser;
import android.gov.nist.javax.sip.parser.ims.PPreferredServiceParser;
import android.gov.nist.javax.sip.parser.ims.PProfileKeyParser;
import android.gov.nist.javax.sip.parser.ims.PServedUserParser;
import android.gov.nist.javax.sip.parser.ims.PUserDatabaseParser;
import android.gov.nist.javax.sip.parser.ims.PVisitedNetworkIDParser;
import android.gov.nist.javax.sip.parser.ims.PathParser;
import android.gov.nist.javax.sip.parser.ims.PrivacyParser;
import android.gov.nist.javax.sip.parser.ims.SecurityClientParser;
import android.gov.nist.javax.sip.parser.ims.SecurityServerParser;
import android.gov.nist.javax.sip.parser.ims.SecurityVerifyParser;
import android.gov.nist.javax.sip.parser.ims.ServiceRouteParser;
import android.javax.sip.header.ReferToHeader;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ParserFactory {
    private static Map<String, Class<? extends HeaderParser>> parserTable = new ConcurrentHashMap(90);
    private static ConcurrentHashMap<Class, Constructor> parserConstructorCache = new ConcurrentHashMap<>();
    private static Class[] constructorArgs = {String.class};

    static {
        parserTable.put("Reply-To".toLowerCase(), ReplyToParser.class);
        parserTable.put("In-Reply-To".toLowerCase(), InReplyToParser.class);
        parserTable.put("Accept-Encoding".toLowerCase(), AcceptEncodingParser.class);
        parserTable.put("Accept-Language".toLowerCase(), AcceptLanguageParser.class);
        parserTable.put("t", ToParser.class);
        parserTable.put("To".toLowerCase(), ToParser.class);
        parserTable.put("From".toLowerCase(), FromParser.class);
        parserTable.put("f", FromParser.class);
        parserTable.put("CSeq".toLowerCase(), CSeqParser.class);
        parserTable.put("Via".toLowerCase(), ViaParser.class);
        parserTable.put("v", ViaParser.class);
        parserTable.put("Contact".toLowerCase(), ContactParser.class);
        parserTable.put("m", ContactParser.class);
        parserTable.put("Content-Type".toLowerCase(), ContentTypeParser.class);
        parserTable.put("c", ContentTypeParser.class);
        parserTable.put("Content-Length".toLowerCase(), ContentLengthParser.class);
        parserTable.put("l", ContentLengthParser.class);
        parserTable.put("Authorization".toLowerCase(), AuthorizationParser.class);
        parserTable.put("WWW-Authenticate".toLowerCase(), WWWAuthenticateParser.class);
        parserTable.put("Call-ID".toLowerCase(), CallIDParser.class);
        parserTable.put("i", CallIDParser.class);
        parserTable.put("Route".toLowerCase(), RouteParser.class);
        parserTable.put("Record-Route".toLowerCase(), RecordRouteParser.class);
        parserTable.put("Date".toLowerCase(), DateParser.class);
        parserTable.put("Proxy-Authorization".toLowerCase(), ProxyAuthorizationParser.class);
        parserTable.put("Proxy-Authenticate".toLowerCase(), ProxyAuthenticateParser.class);
        parserTable.put("Retry-After".toLowerCase(), RetryAfterParser.class);
        parserTable.put("Require".toLowerCase(), RequireParser.class);
        parserTable.put("Proxy-Require".toLowerCase(), ProxyRequireParser.class);
        parserTable.put("Timestamp".toLowerCase(), TimeStampParser.class);
        parserTable.put("Unsupported".toLowerCase(), UnsupportedParser.class);
        parserTable.put("User-Agent".toLowerCase(), UserAgentParser.class);
        parserTable.put("Supported".toLowerCase(), SupportedParser.class);
        parserTable.put("k", SupportedParser.class);
        parserTable.put("Server".toLowerCase(), ServerParser.class);
        parserTable.put("Subject".toLowerCase(), SubjectParser.class);
        parserTable.put("s", SubjectParser.class);
        parserTable.put("Subscription-State".toLowerCase(), SubscriptionStateParser.class);
        parserTable.put("Max-Forwards".toLowerCase(), MaxForwardsParser.class);
        parserTable.put("MIME-Version".toLowerCase(), MimeVersionParser.class);
        parserTable.put("Min-Expires".toLowerCase(), MinExpiresParser.class);
        parserTable.put("Organization".toLowerCase(), OrganizationParser.class);
        parserTable.put("Priority".toLowerCase(), PriorityParser.class);
        parserTable.put("RAck".toLowerCase(), RAckParser.class);
        parserTable.put("RSeq".toLowerCase(), RSeqParser.class);
        parserTable.put("Reason".toLowerCase(), ReasonParser.class);
        parserTable.put("Warning".toLowerCase(), WarningParser.class);
        parserTable.put("Expires".toLowerCase(), ExpiresParser.class);
        parserTable.put("Event".toLowerCase(), EventParser.class);
        parserTable.put("o", EventParser.class);
        parserTable.put("Error-Info".toLowerCase(), ErrorInfoParser.class);
        parserTable.put("Content-Language".toLowerCase(), ContentLanguageParser.class);
        parserTable.put("Content-Encoding".toLowerCase(), ContentEncodingParser.class);
        parserTable.put("e", ContentEncodingParser.class);
        parserTable.put("Content-Disposition".toLowerCase(), ContentDispositionParser.class);
        parserTable.put("Call-Info".toLowerCase(), CallInfoParser.class);
        parserTable.put("Authentication-Info".toLowerCase(), AuthenticationInfoParser.class);
        parserTable.put("Allow".toLowerCase(), AllowParser.class);
        parserTable.put("Allow-Events".toLowerCase(), AllowEventsParser.class);
        parserTable.put("u", AllowEventsParser.class);
        parserTable.put("Alert-Info".toLowerCase(), AlertInfoParser.class);
        parserTable.put("Accept".toLowerCase(), AcceptParser.class);
        parserTable.put(ReferToHeader.NAME.toLowerCase(), ReferToParser.class);
        parserTable.put("r", ReferToParser.class);
        parserTable.put("SIP-ETag".toLowerCase(), SIPETagParser.class);
        parserTable.put("SIP-If-Match".toLowerCase(), SIPIfMatchParser.class);
        parserTable.put("P-Access-Network-Info".toLowerCase(), PAccessNetworkInfoParser.class);
        parserTable.put("P-Asserted-Identity".toLowerCase(), PAssertedIdentityParser.class);
        parserTable.put("P-Preferred-Identity".toLowerCase(), PPreferredIdentityParser.class);
        parserTable.put("P-Charging-Vector".toLowerCase(), PChargingVectorParser.class);
        parserTable.put("P-Charging-Function-Addresses".toLowerCase(), PChargingFunctionAddressesParser.class);
        parserTable.put("P-Media-Authorization".toLowerCase(), PMediaAuthorizationParser.class);
        parserTable.put("Path".toLowerCase(), PathParser.class);
        parserTable.put("Privacy".toLowerCase(), PrivacyParser.class);
        parserTable.put("Service-Route".toLowerCase(), ServiceRouteParser.class);
        parserTable.put("P-Visited-Network-ID".toLowerCase(), PVisitedNetworkIDParser.class);
        parserTable.put("P-Served-User".toLowerCase(), PServedUserParser.class);
        parserTable.put("P-Preferred-Service".toLowerCase(), PPreferredServiceParser.class);
        parserTable.put("P-Asserted-Service".toLowerCase(), PAssertedServiceParser.class);
        parserTable.put("P-Profile-Key".toLowerCase(), PProfileKeyParser.class);
        parserTable.put("P-User-Database".toLowerCase(), PUserDatabaseParser.class);
        parserTable.put("P-Associated-URI".toLowerCase(), PAssociatedURIParser.class);
        parserTable.put("P-Called-Party-ID".toLowerCase(), PCalledPartyIDParser.class);
        parserTable.put("Security-Server".toLowerCase(), SecurityServerParser.class);
        parserTable.put("Security-Client".toLowerCase(), SecurityClientParser.class);
        parserTable.put("Security-Verify".toLowerCase(), SecurityVerifyParser.class);
        parserTable.put("Referred-By".toLowerCase(), ReferredByParser.class);
        parserTable.put("b", ReferToParser.class);
        parserTable.put("Session-Expires".toLowerCase(), SessionExpiresParser.class);
        parserTable.put("x", SessionExpiresParser.class);
        parserTable.put("Min-SE".toLowerCase(), MinSEParser.class);
        parserTable.put("Replaces".toLowerCase(), ReplacesParser.class);
        parserTable.put("Join".toLowerCase(), JoinParser.class);
        parserTable.put(ReferencesHeader.NAME.toLowerCase(), ReferencesParser.class);
    }

    public static void addToParserTable(String str, Class<? extends HeaderParser> cls) {
        parserTable.put(str.toLowerCase(), cls);
    }

    public static HeaderParser createParser(String str) {
        String headerName = Lexer.getHeaderName(str);
        String headerValue = Lexer.getHeaderValue(str);
        if (headerName == null || headerValue == null) {
            hny.j(0, "The header name or value is null");
            return null;
        }
        Class<? extends HeaderParser> cls = parserTable.get(SIPHeaderNamesCache.toLowerCase(headerName));
        if (cls == null) {
            return new HeaderParser(str);
        }
        try {
            Constructor constructor = parserConstructorCache.get(cls);
            if (constructor == null) {
                constructor = cls.getConstructor(constructorArgs);
                parserConstructorCache.putIfAbsent(cls, constructor);
            }
            return constructor.newInstance(str);
        } catch (Exception e) {
            InternalErrorHandler.handleException(e);
            return null;
        }
    }
}
