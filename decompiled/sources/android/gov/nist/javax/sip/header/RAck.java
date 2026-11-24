package android.gov.nist.javax.sip.header;

import a.h97;
import android.gov.nist.core.Separators;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.RAckHeader;

/* JADX INFO: loaded from: classes.dex */
public class RAck extends SIPHeader implements RAckHeader {
    private static final long serialVersionUID = 743999286077404118L;
    protected long cSeqNumber;
    protected String method;
    protected long rSeqNumber;

    public RAck() {
        super("RAck");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.rSeqNumber);
        sb.append(Separators.SP);
        sb.append(this.cSeqNumber);
        sb.append(Separators.SP);
        sb.append(this.method);
        return sb;
    }

    @Override // android.javax.sip.header.RAckHeader
    public int getCSeqNumber() {
        return (int) this.cSeqNumber;
    }

    public long getCSeqNumberLong() {
        return this.cSeqNumber;
    }

    public long getCSequenceNumber() {
        return this.cSeqNumber;
    }

    @Override // android.javax.sip.header.RAckHeader
    public String getMethod() {
        return this.method;
    }

    @Override // android.javax.sip.header.RAckHeader
    public int getRSeqNumber() {
        return (int) this.rSeqNumber;
    }

    public long getRSequenceNumber() {
        return this.rSeqNumber;
    }

    @Override // android.javax.sip.header.RAckHeader
    public void setCSeqNumber(int i) {
        setCSequenceNumber(i);
    }

    public void setCSequenceNumber(long j) {
        if (j <= 0 || j > 2147483648L) {
            throw new InvalidArgumentException(h97.h(j, "Bad CSeq # "));
        }
        this.cSeqNumber = j;
    }

    @Override // android.javax.sip.header.RAckHeader
    public void setMethod(String str) {
        this.method = str;
    }

    @Override // android.javax.sip.header.RAckHeader
    public void setRSeqNumber(int i) {
        setRSequenceNumber(i);
    }

    public void setRSequenceNumber(long j) {
        if (j <= 0 || this.cSeqNumber > 2147483648L) {
            throw new InvalidArgumentException(h97.h(j, "Bad rSeq # "));
        }
        this.rSeqNumber = j;
    }
}
