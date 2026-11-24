package android.gov.nist.javax.sip.header;

import a.hny;
import android.javax.sip.header.SubjectHeader;

/* JADX INFO: loaded from: classes.dex */
public class Subject extends SIPHeader implements SubjectHeader {
    private static final long serialVersionUID = -6479220126758862528L;
    protected String subject;

    public Subject() {
        super("Subject");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.subject;
        if (str != null) {
            sb.append(str);
            return sb;
        }
        sb.append("");
        return sb;
    }

    @Override // android.javax.sip.header.SubjectHeader
    public String getSubject() {
        return this.subject;
    }

    @Override // android.javax.sip.header.SubjectHeader
    public void setSubject(String str) {
        if (str != null) {
            this.subject = str;
        } else {
            hny.u("JAIN-SIP Exception,  Subject, setSubject(), the subject parameter is null");
        }
    }
}
