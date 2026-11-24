package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.AllowHeader;

/* JADX INFO: loaded from: classes.dex */
public final class Allow extends SIPHeader implements AllowHeader {
    private static final long serialVersionUID = -3105079479020693930L;
    protected String method;

    public Allow() {
        super("Allow");
        this.method = "";
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.method);
        return sb;
    }

    @Override // android.javax.sip.header.AllowHeader
    public String getMethod() {
        return this.method;
    }

    @Override // android.javax.sip.header.AllowHeader
    public void setMethod(String str) {
        if (str != null) {
            this.method = str;
        } else {
            hny.u("JAIN-SIP Exception, Allow, setMethod(), the method parameter is null.");
        }
    }

    public Allow(String str) {
        super("Allow");
        this.method = str;
    }
}
