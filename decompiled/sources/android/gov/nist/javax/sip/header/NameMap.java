package android.gov.nist.javax.sip.header;

import a.f140;
import android.gov.nist.core.PackageNames;
import android.gov.nist.javax.sip.header.ims.PAccessNetworkInfo;
import android.gov.nist.javax.sip.header.ims.PAssertedIdentity;
import android.gov.nist.javax.sip.header.ims.PAssociatedURI;
import android.gov.nist.javax.sip.header.ims.PCalledPartyID;
import android.gov.nist.javax.sip.header.ims.PChargingFunctionAddresses;
import android.gov.nist.javax.sip.header.ims.PChargingVector;
import android.gov.nist.javax.sip.header.ims.PMediaAuthorization;
import android.gov.nist.javax.sip.header.ims.PPreferredIdentity;
import android.gov.nist.javax.sip.header.ims.PVisitedNetworkID;
import android.gov.nist.javax.sip.header.ims.Path;
import android.gov.nist.javax.sip.header.ims.Privacy;
import android.gov.nist.javax.sip.header.ims.ServiceRoute;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class NameMap implements SIPHeaderNames, PackageNames {
    static Map<String, String> nameMap;

    static {
        initializeNameMap();
    }

    public static void addExtensionHeader(String str, String str2) {
        nameMap.put(str.toLowerCase(), str2);
    }

    public static Class getClassFromName(String str) {
        String str2 = nameMap.get(str.toLowerCase());
        if (str2 == null) {
            return null;
        }
        try {
            return Class.forName(str2);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void initializeNameMap() {
        nameMap = new HashMap(63);
        putNameMap("Min-Expires", MinExpires.class.getName());
        putNameMap("Error-Info", ErrorInfo.class.getName());
        putNameMap("Event", f140.l("Reply-To", f140.l("Expires", f140.l("Priority", f140.l("User-Agent", f140.l("Content-Disposition", f140.l("Proxy-Require", f140.l("Organization", f140.l("WWW-Authenticate", f140.l("Route", f140.l("Content-Encoding", f140.l("Retry-After", f140.l("Server", f140.l("Authorization", f140.l("From", f140.l("To", f140.l("Record-Route", f140.l("Accept", f140.l("Alert-Info", f140.l("Call-Info", f140.l("Allow", f140.l("MIME-Version", MimeVersion.class.getName(), InReplyTo.class, "In-Reply-To", Allow.class), ContentLanguage.class, "Content-Language", CallInfo.class), CSeq.class, "CSeq", AlertInfo.class), AcceptEncoding.class, "Accept-Encoding", Accept.class), AcceptLanguage.class, "Accept-Language", RecordRoute.class), TimeStamp.class, "Timestamp", To.class), Via.class, "Via", From.class), CallID.class, "Call-ID", Authorization.class), ProxyAuthenticate.class, "Proxy-Authenticate", Server.class), Unsupported.class, "Unsupported", RetryAfter.class), ContentType.class, "Content-Type", ContentEncoding.class), ContentLength.class, "Content-Length", Route.class), Contact.class, "Contact", WWWAuthenticate.class), MaxForwards.class, "Max-Forwards", Organization.class), ProxyAuthorization.class, "Proxy-Authorization", ProxyRequire.class), Require.class, "Require", ContentDisposition.class), Subject.class, "Subject", UserAgent.class), Warning.class, "Warning", Priority.class), SIPDateHeader.class, "Date", Expires.class), Supported.class, "Supported", ReplyTo.class), SubscriptionState.class, "Subscription-State", Event.class));
        putNameMap("Allow-Events", AllowEvents.class.getName());
        putNameMap("Referred-By", "ReferredBy");
        putNameMap("Session-Expires", "SessionExpires");
        putNameMap("Min-SE", "MinSE");
        putNameMap("Replaces", "Replaces");
        putNameMap("Join", "Join");
        putNameMap("Service-Route", f140.l("P-Preferred-Identity", f140.l("P-Media-Authorization", f140.l("P-Charging-Function-Addresses", f140.l("P-Associated-URI", f140.l("P-Access-Network-Info", PAccessNetworkInfo.class.getName(), PAssertedIdentity.class, "P-Asserted-Identity", PAssociatedURI.class), PCalledPartyID.class, "P-Called-Party-ID", PChargingFunctionAddresses.class), PChargingVector.class, "P-Charging-Vector", PMediaAuthorization.class), Path.class, "Path", PPreferredIdentity.class), Privacy.class, "Privacy", ServiceRoute.class));
        putNameMap("P-Visited-Network-ID", PVisitedNetworkID.class.getName());
    }

    public static void putNameMap(String str, String str2) {
        nameMap.put(str.toLowerCase(), str2);
    }
}
