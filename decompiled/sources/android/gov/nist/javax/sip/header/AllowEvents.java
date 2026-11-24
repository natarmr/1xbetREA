package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.AllowEventsHeader;

/* JADX INFO: loaded from: classes.dex */
public final class AllowEvents extends SIPHeader implements AllowEventsHeader {
    private static final long serialVersionUID = 617962431813193114L;
    protected String eventType;

    public AllowEvents(String str) {
        super("Allow-Events");
        this.eventType = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.eventType);
        return sb;
    }

    @Override // android.javax.sip.header.AllowEventsHeader
    public String getEventType() {
        return this.eventType;
    }

    @Override // android.javax.sip.header.AllowEventsHeader
    public void setEventType(String str) {
        if (str != null) {
            this.eventType = str;
        } else {
            hny.u("JAIN-SIP Exception,AllowEvents, setEventType(), the eventType parameter is null");
        }
    }

    public AllowEvents() {
        super("Allow-Events");
    }
}
