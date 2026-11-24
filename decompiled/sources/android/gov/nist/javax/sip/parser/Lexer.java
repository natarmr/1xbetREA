package android.gov.nist.javax.sip.parser;

import android.gov.nist.core.LexerCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.javax.sip.header.ReferToHeader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Lexer extends LexerCore {
    public Lexer(String str, String str2) {
        super(str, str2);
        selectLexer(str);
    }

    public static String getHeaderName(String str) {
        if (str == null) {
            return null;
        }
        try {
            int iIndexOf = str.indexOf(Separators.COLON);
            if (iIndexOf >= 1) {
                return str.substring(0, iIndexOf).trim();
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return null;
    }

    public static String getHeaderValue(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(str.indexOf(Separators.COLON) + 1);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // android.gov.nist.core.LexerCore
    public void selectLexer(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, Integer>> concurrentHashMap = LexerCore.lexerTables;
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = concurrentHashMap.get(str);
        this.currentLexerName = str;
        if (concurrentHashMap2 != null) {
            this.currentLexer = concurrentHashMap2;
            return;
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap3 = new ConcurrentHashMap<>();
        this.currentLexer = concurrentHashMap3;
        if (str.equals("method_keywordLexer")) {
            addKeyword("REGISTER", TokenTypes.REGISTER);
            addKeyword("ACK", TokenTypes.ACK);
            addKeyword("OPTIONS", TokenTypes.OPTIONS);
            addKeyword("BYE", TokenTypes.BYE);
            addKeyword("INVITE", TokenTypes.INVITE);
            addKeyword("sip", TokenTypes.SIP);
            addKeyword("sips", TokenTypes.SIPS);
            addKeyword("SUBSCRIBE", TokenTypes.SUBSCRIBE);
            addKeyword("NOTIFY", TokenTypes.NOTIFY);
            addKeyword("MESSAGE", TokenTypes.MESSAGE);
            addKeyword("PUBLISH", TokenTypes.PUBLISH);
        } else if (str.equals("command_keywordLexer")) {
            addKeyword("Error-Info", TokenTypes.ERROR_INFO);
            addKeyword("Allow-Events", TokenTypes.ALLOW_EVENTS);
            addKeyword("Authentication-Info", TokenTypes.AUTHENTICATION_INFO);
            addKeyword("Event", TokenTypes.EVENT);
            addKeyword("Min-Expires", TokenTypes.MIN_EXPIRES);
            addKeyword("RSeq", TokenTypes.RSEQ);
            addKeyword("RAck", TokenTypes.RACK);
            addKeyword("Reason", TokenTypes.REASON);
            addKeyword("Reply-To", TokenTypes.REPLY_TO);
            addKeyword("Subscription-State", TokenTypes.SUBSCRIPTION_STATE);
            addKeyword("Timestamp", TokenTypes.TIMESTAMP);
            addKeyword("In-Reply-To", TokenTypes.IN_REPLY_TO);
            addKeyword("MIME-Version", TokenTypes.MIME_VERSION);
            addKeyword("Alert-Info", TokenTypes.ALERT_INFO);
            addKeyword("From", TokenTypes.FROM);
            addKeyword("To", TokenTypes.TO);
            addKeyword(ReferToHeader.NAME, TokenTypes.REFER_TO);
            addKeyword("Via", TokenTypes.VIA);
            addKeyword("User-Agent", TokenTypes.USER_AGENT);
            addKeyword("Server", TokenTypes.SERVER);
            addKeyword("Accept-Encoding", TokenTypes.ACCEPT_ENCODING);
            addKeyword("Accept", 2068);
            addKeyword("Allow", TokenTypes.ALLOW);
            addKeyword("Route", TokenTypes.ROUTE);
            addKeyword("Authorization", TokenTypes.AUTHORIZATION);
            addKeyword("Proxy-Authorization", TokenTypes.PROXY_AUTHORIZATION);
            addKeyword("Retry-After", TokenTypes.RETRY_AFTER);
            addKeyword("Proxy-Require", TokenTypes.PROXY_REQUIRE);
            addKeyword("Content-Language", TokenTypes.CONTENT_LANGUAGE);
            addKeyword("Unsupported", TokenTypes.UNSUPPORTED);
            addKeyword("Supported", 2068);
            addKeyword("Warning", TokenTypes.WARNING);
            addKeyword("Max-Forwards", TokenTypes.MAX_FORWARDS);
            addKeyword("Date", TokenTypes.DATE);
            addKeyword("Priority", TokenTypes.PRIORITY);
            addKeyword("Proxy-Authenticate", TokenTypes.PROXY_AUTHENTICATE);
            addKeyword("Content-Encoding", TokenTypes.CONTENT_ENCODING);
            addKeyword("Content-Length", TokenTypes.CONTENT_LENGTH);
            addKeyword("Subject", TokenTypes.SUBJECT);
            addKeyword("Content-Type", TokenTypes.CONTENT_TYPE);
            addKeyword("Contact", TokenTypes.CONTACT);
            addKeyword("Call-ID", TokenTypes.CALL_ID);
            addKeyword("Require", TokenTypes.REQUIRE);
            addKeyword("Expires", TokenTypes.EXPIRES);
            addKeyword("Record-Route", TokenTypes.RECORD_ROUTE);
            addKeyword("Organization", TokenTypes.ORGANIZATION);
            addKeyword("CSeq", TokenTypes.CSEQ);
            addKeyword("Accept-Language", TokenTypes.ACCEPT_LANGUAGE);
            addKeyword("WWW-Authenticate", TokenTypes.WWW_AUTHENTICATE);
            addKeyword("Call-Info", TokenTypes.CALL_INFO);
            addKeyword("Content-Disposition", TokenTypes.CONTENT_DISPOSITION);
            addKeyword(TokenNames.K, 2068);
            addKeyword(TokenNames.C, TokenTypes.CONTENT_TYPE);
            addKeyword(TokenNames.E, TokenTypes.CONTENT_ENCODING);
            addKeyword(TokenNames.F, TokenTypes.FROM);
            addKeyword(TokenNames.I, TokenTypes.CALL_ID);
            addKeyword(TokenNames.M, TokenTypes.CONTACT);
            addKeyword(TokenNames.L, TokenTypes.CONTENT_LENGTH);
            addKeyword(TokenNames.S, TokenTypes.SUBJECT);
            addKeyword(TokenNames.T, TokenTypes.TO);
            addKeyword(TokenNames.U, TokenTypes.ALLOW_EVENTS);
            addKeyword(TokenNames.V, TokenTypes.VIA);
            addKeyword(TokenNames.R, TokenTypes.REFER_TO);
            addKeyword(TokenNames.O, TokenTypes.EVENT);
            addKeyword(TokenNames.X, TokenTypes.SESSIONEXPIRES_TO);
            addKeyword("SIP-ETag", TokenTypes.SIP_ETAG);
            addKeyword("SIP-If-Match", TokenTypes.SIP_IF_MATCH);
            addKeyword("Session-Expires", TokenTypes.SESSIONEXPIRES_TO);
            addKeyword("Min-SE", TokenTypes.MINSE_TO);
            addKeyword("Referred-By", TokenTypes.REFERREDBY_TO);
            addKeyword("Replaces", TokenTypes.REPLACES_TO);
            addKeyword("Join", TokenTypes.JOIN_TO);
            addKeyword("Path", TokenTypes.PATH);
            addKeyword("Service-Route", TokenTypes.SERVICE_ROUTE);
            addKeyword("P-Asserted-Identity", TokenTypes.P_ASSERTED_IDENTITY);
            addKeyword("P-Preferred-Identity", TokenTypes.P_PREFERRED_IDENTITY);
            addKeyword("Privacy", TokenTypes.PRIVACY);
            addKeyword("P-Called-Party-ID", TokenTypes.P_CALLED_PARTY_ID);
            addKeyword("P-Associated-URI", TokenTypes.P_ASSOCIATED_URI);
            addKeyword("P-Visited-Network-ID", TokenTypes.P_VISITED_NETWORK_ID);
            addKeyword("P-Charging-Function-Addresses", TokenTypes.P_CHARGING_FUNCTION_ADDRESSES);
            addKeyword("P-Charging-Vector", TokenTypes.P_VECTOR_CHARGING);
            addKeyword("P-Access-Network-Info", TokenTypes.P_ACCESS_NETWORK_INFO);
            addKeyword("P-Media-Authorization", TokenTypes.P_MEDIA_AUTHORIZATION);
            addKeyword("Security-Server", TokenTypes.SECURITY_SERVER);
            addKeyword("Security-Verify", TokenTypes.SECURITY_VERIFY);
            addKeyword("Security-Client", TokenTypes.SECURITY_CLIENT);
            addKeyword("P-User-Database", TokenTypes.P_USER_DATABASE);
            addKeyword("P-Profile-Key", TokenTypes.P_PROFILE_KEY);
            addKeyword("P-Served-User", TokenTypes.P_SERVED_USER);
            addKeyword("P-Preferred-Service", TokenTypes.P_PREFERRED_SERVICE);
            addKeyword("P-Asserted-Service", TokenTypes.P_ASSERTED_SERVICE);
            addKeyword(ReferencesHeader.NAME, TokenTypes.REFERENCES);
        } else if (str.equals("status_lineLexer") || str.equals("request_lineLexer")) {
            addKeyword("sip", TokenTypes.SIP);
        } else if (str.equals("sip_urlLexer")) {
            addKeyword("tel", TokenTypes.TEL);
            addKeyword("sip", TokenTypes.SIP);
            addKeyword("sips", TokenTypes.SIPS);
        }
        ConcurrentHashMap<String, Integer> concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, concurrentHashMap3);
        if (concurrentHashMapPutIfAbsent != null) {
            concurrentHashMap3 = concurrentHashMapPutIfAbsent;
        }
        this.currentLexer = concurrentHashMap3;
    }
}
