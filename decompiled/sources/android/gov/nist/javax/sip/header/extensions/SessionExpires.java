package android.gov.nist.javax.sip.header.extensions;

import a.twn;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public final class SessionExpires extends ParametersHeader implements ExtensionHeader, SessionExpiresHeader {
    public static final String NAME = "Session-Expires";
    public static final String REFRESHER = "refresher";
    private static final long serialVersionUID = 8765762413224043300L;
    public int expires;

    public SessionExpires() {
        super("Session-Expires");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(Integer.toString(this.expires));
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public int getExpires() {
        return this.expires;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public String getRefresher() {
        return this.parameters.getParameter(REFRESHER);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public void setExpires(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException(twn.m(i, "bad argument "));
        }
        this.expires = i;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.SessionExpiresHeader
    public void setRefresher(String str) {
        this.parameters.set(REFRESHER, str);
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
