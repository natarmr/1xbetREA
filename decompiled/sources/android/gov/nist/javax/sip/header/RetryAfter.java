package android.gov.nist.javax.sip.header;

import a.hny;
import a.itt0;
import a.twn;
import android.gov.nist.core.Separators;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.RetryAfterHeader;

/* JADX INFO: loaded from: classes.dex */
public class RetryAfter extends ParametersHeader implements RetryAfterHeader {
    public static final String DURATION = "duration";
    private static final long serialVersionUID = -1029458515616146140L;
    protected String comment;
    protected Integer retryAfter;

    public RetryAfter() {
        super("Retry-After");
        this.retryAfter = new Integer(0);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        Integer num = this.retryAfter;
        if (num != null) {
            sb.append(num);
        }
        if (this.comment != null) {
            sb.append(" (" + this.comment + Separators.RPAREN);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.javax.sip.header.RetryAfterHeader
    public String getComment() {
        return this.comment;
    }

    @Override // android.javax.sip.header.RetryAfterHeader
    public int getDuration() {
        if (getParameter("duration") == null) {
            return -1;
        }
        return super.getParameterAsInt("duration");
    }

    @Override // android.javax.sip.header.RetryAfterHeader
    public int getRetryAfter() {
        return this.retryAfter.intValue();
    }

    public boolean hasComment() {
        return this.comment != null;
    }

    public void removeComment() {
        this.comment = null;
    }

    public void removeDuration() {
        super.removeParameter("duration");
    }

    @Override // android.javax.sip.header.RetryAfterHeader
    public void setComment(String str) {
        if (str != null) {
            this.comment = str;
        } else {
            hny.u("the comment parameter is null");
        }
    }

    @Override // android.javax.sip.header.RetryAfterHeader
    public void setDuration(int i) throws InvalidArgumentException {
        if (i >= 0) {
            setParameter("duration", i);
        } else {
            itt0.r("the duration parameter is <0");
        }
    }

    @Override // android.javax.sip.header.RetryAfterHeader
    public void setRetryAfter(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException(twn.m(i, "invalid parameter "));
        }
        this.retryAfter = Integer.valueOf(i);
    }
}
