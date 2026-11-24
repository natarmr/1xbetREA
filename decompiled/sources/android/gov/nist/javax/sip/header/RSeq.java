package android.gov.nist.javax.sip.header;

import a.h97;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.RSeqHeader;

/* JADX INFO: loaded from: classes.dex */
public class RSeq extends SIPHeader implements RSeqHeader {
    private static final long serialVersionUID = 8765762413224043394L;
    protected long sequenceNumber;

    public RSeq() {
        super("RSeq");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(Long.toString(this.sequenceNumber));
        return sb;
    }

    public long getSeqNumber() {
        return this.sequenceNumber;
    }

    @Override // android.javax.sip.header.RSeqHeader
    public int getSequenceNumber() {
        return (int) this.sequenceNumber;
    }

    public void setSeqNumber(long j) {
        if (j <= 0 || j > 2147483648L) {
            throw new InvalidArgumentException(h97.h(j, "Bad seq number "));
        }
        this.sequenceNumber = j;
    }

    @Override // android.javax.sip.header.RSeqHeader
    public void setSequenceNumber(int i) {
        setSeqNumber(i);
    }
}
