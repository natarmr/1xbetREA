package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.PriorityHeader;

/* JADX INFO: loaded from: classes.dex */
public class Priority extends SIPHeader implements PriorityHeader {
    public static final String EMERGENCY = "emergency";
    public static final String NON_URGENT = "non-urgent";
    public static final String NORMAL = "normal";
    public static final String URGENT = "urgent";
    private static final long serialVersionUID = 3837543366074322106L;
    protected String priority;

    public Priority() {
        super("Priority");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.priority);
        return sb;
    }

    @Override // android.javax.sip.header.PriorityHeader
    public String getPriority() {
        return this.priority;
    }

    @Override // android.javax.sip.header.PriorityHeader
    public void setPriority(String str) {
        if (str != null) {
            this.priority = str;
        } else {
            hny.u("JAIN-SIP Exception,Priority, setPriority(), the priority parameter is null");
        }
    }
}
