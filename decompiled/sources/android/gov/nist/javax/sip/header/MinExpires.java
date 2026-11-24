package android.gov.nist.javax.sip.header;

import a.twn;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.MinExpiresHeader;

/* JADX INFO: loaded from: classes.dex */
public class MinExpires extends SIPHeader implements MinExpiresHeader {
    private static final long serialVersionUID = 7001828209606095801L;
    protected int expires;

    public MinExpires() {
        super("Min-Expires");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(Integer.toString(this.expires));
        return sb;
    }

    @Override // android.javax.sip.header.ExpiresHeader
    public int getExpires() {
        return this.expires;
    }

    @Override // android.javax.sip.header.ExpiresHeader
    public void setExpires(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException(twn.m(i, "bad argument "));
        }
        this.expires = i;
    }
}
