package android.gov.nist.javax.sip.header;

import a.hny;
import android.gov.nist.core.Separators;
import android.javax.sip.header.EventHeader;

/* JADX INFO: loaded from: classes.dex */
public class Event extends ParametersHeader implements EventHeader {
    private static final long serialVersionUID = -6458387810431874841L;
    protected String eventType;

    public Event() {
        super("Event");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.eventType;
        if (str != null) {
            sb.append(str);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.javax.sip.header.EventHeader
    public String getEventId() {
        return getParameter(ParameterNames.ID);
    }

    @Override // android.javax.sip.header.EventHeader
    public String getEventType() {
        return this.eventType;
    }

    public boolean match(Event event) {
        String str = event.eventType;
        if (str == null && this.eventType != null) {
            return false;
        }
        if (str != null && this.eventType == null) {
            return false;
        }
        if (this.eventType == null && str == null) {
            return false;
        }
        if (getEventId() != null || event.getEventId() == null) {
            return (getEventId() == null || event.getEventId() != null) && event.eventType.equalsIgnoreCase(this.eventType) && (getEventId() == event.getEventId() || getEventId().equalsIgnoreCase(event.getEventId()));
        }
        return false;
    }

    @Override // android.javax.sip.header.EventHeader
    public void setEventId(String str) {
        if (str != null) {
            setParameter(ParameterNames.ID, str);
        } else {
            hny.u(" the eventId parameter is null");
        }
    }

    @Override // android.javax.sip.header.EventHeader
    public void setEventType(String str) {
        if (str != null) {
            this.eventType = str;
        } else {
            hny.u(" the eventType is null");
        }
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
