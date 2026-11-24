package android.gov.nist.javax.sip.header;

import a.twn;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.MaxForwardsHeader;
import android.javax.sip.header.TooManyHopsException;

/* JADX INFO: loaded from: classes.dex */
public class MaxForwards extends SIPHeader implements MaxForwardsHeader {
    private static final long serialVersionUID = -3096874323347175943L;
    protected int maxForwards;

    public MaxForwards(int i) throws InvalidArgumentException {
        super("Max-Forwards");
        setMaxForwards(i);
    }

    @Override // android.javax.sip.header.MaxForwardsHeader
    public void decrementMaxForwards() throws TooManyHopsException {
        int i = this.maxForwards;
        if (i <= 0) {
            throw new TooManyHopsException("has already reached 0!");
        }
        this.maxForwards = i - 1;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaxForwardsHeader) && getMaxForwards() == ((MaxForwardsHeader) obj).getMaxForwards();
    }

    @Override // android.javax.sip.header.MaxForwardsHeader
    public int getMaxForwards() {
        return this.maxForwards;
    }

    public boolean hasReachedZero() {
        return this.maxForwards == 0;
    }

    @Override // android.javax.sip.header.MaxForwardsHeader
    public void setMaxForwards(int i) throws InvalidArgumentException {
        if (i < 0 || i > 255) {
            throw new InvalidArgumentException(twn.m(i, "bad max forwards value "));
        }
        this.maxForwards = i;
    }

    public MaxForwards() {
        super("Max-Forwards");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.maxForwards);
        return sb;
    }
}
