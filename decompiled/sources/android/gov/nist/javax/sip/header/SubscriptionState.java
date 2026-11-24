package android.gov.nist.javax.sip.header;

import a.hny;
import a.itt0;
import android.gov.nist.core.Separators;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.SubscriptionStateHeader;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionState extends ParametersHeader implements SubscriptionStateHeader {
    private static final long serialVersionUID = -6673833053927258745L;
    protected int expires;
    protected String reasonCode;
    protected int retryAfter;
    protected String state;

    public SubscriptionState() {
        super("Subscription-State");
        this.expires = -1;
        this.retryAfter = -1;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.state;
        if (str != null) {
            sb.append(str);
        }
        if (this.reasonCode != null) {
            sb.append(";reason=");
            sb.append(this.reasonCode);
        }
        if (this.expires != -1) {
            sb.append(";expires=");
            sb.append(this.expires);
        }
        if (this.retryAfter != -1) {
            sb.append(";retry-after=");
            sb.append(this.retryAfter);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.javax.sip.header.SubscriptionStateHeader
    public int getExpires() {
        return this.expires;
    }

    @Override // android.javax.sip.header.SubscriptionStateHeader
    public String getReasonCode() {
        return this.reasonCode;
    }

    @Override // android.javax.sip.header.SubscriptionStateHeader
    public int getRetryAfter() {
        return this.retryAfter;
    }

    @Override // android.javax.sip.header.SubscriptionStateHeader
    public String getState() {
        return this.state;
    }

    @Override // android.javax.sip.header.SubscriptionStateHeader
    public void setExpires(int i) throws InvalidArgumentException {
        if (i >= 0) {
            this.expires = i;
        } else {
            itt0.r("JAIN-SIP Exception, SubscriptionState, setExpires(), the expires parameter is  < 0");
        }
    }

    @Override // android.javax.sip.header.SubscriptionStateHeader
    public void setReasonCode(String str) {
        if (str != null) {
            this.reasonCode = str;
        } else {
            hny.u("JAIN-SIP Exception, SubscriptionState, setReasonCode(), the reasonCode parameter is null");
        }
    }

    @Override // android.javax.sip.header.SubscriptionStateHeader
    public void setRetryAfter(int i) throws InvalidArgumentException {
        if (i > 0) {
            this.retryAfter = i;
        } else {
            itt0.r("JAIN-SIP Exception, SubscriptionState, setRetryAfter(), the retryAfter parameter is <=0");
        }
    }

    @Override // android.javax.sip.header.SubscriptionStateHeader
    public void setState(String str) {
        if (str != null) {
            this.state = str;
        } else {
            hny.u("JAIN-SIP Exception, SubscriptionState, setState(), the state parameter is null");
        }
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
