package android.gov.nist.javax.sip.header;

import a.h97;
import a.hny;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.message.SIPRequest;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.CSeqHeader;

/* JADX INFO: loaded from: classes.dex */
public class CSeq extends SIPHeader implements CSeqHeader {
    private static final long serialVersionUID = -5405798080040422910L;
    protected String method;
    protected Long seqno;

    public CSeq(long j, String str) {
        this();
        this.seqno = Long.valueOf(j);
        this.method = SIPRequest.getCannonicalName(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return this.headerName + ": " + encodeBody() + Separators.NEWLINE;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.seqno);
        sb.append(Separators.SP);
        sb.append(this.method.toUpperCase());
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof CSeqHeader) {
            CSeqHeader cSeqHeader = (CSeqHeader) obj;
            if (getSeqNumber() == cSeqHeader.getSeqNumber() && getMethod().equals(cSeqHeader.getMethod())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.javax.sip.header.CSeqHeader
    public String getMethod() {
        return this.method;
    }

    @Override // android.javax.sip.header.CSeqHeader
    public long getSeqNumber() {
        return this.seqno.longValue();
    }

    @Override // android.javax.sip.header.CSeqHeader
    public int getSequenceNumber() {
        Long l = this.seqno;
        if (l == null) {
            return 0;
        }
        return l.intValue();
    }

    @Override // android.javax.sip.header.CSeqHeader
    public void setMethod(String str) {
        if (str != null) {
            this.method = SIPRequest.getCannonicalName(str);
        } else {
            hny.u("JAIN-SIP Exception, CSeq, setMethod(), the meth parameter is null");
        }
    }

    @Override // android.javax.sip.header.CSeqHeader
    public void setSeqNumber(long j) {
        if (j < 0) {
            throw new InvalidArgumentException(h97.h(j, "JAIN-SIP Exception, CSeq, setSequenceNumber(), the sequence number parameter is < 0 : "));
        }
        if (j > 2147483648L) {
            throw new InvalidArgumentException(h97.h(j, "JAIN-SIP Exception, CSeq, setSequenceNumber(), the sequence number parameter is too large : "));
        }
        this.seqno = Long.valueOf(j);
    }

    @Override // android.javax.sip.header.CSeqHeader
    public void setSequenceNumber(int i) {
        setSeqNumber(i);
    }

    public CSeq() {
        super("CSeq");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
