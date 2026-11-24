package android.gov.nist.javax.sip.header;

import a.hne;
import a.hny;
import a.twn;
import android.gov.nist.core.Separators;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.WarningHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class Warning extends SIPHeader implements WarningHeader {
    private static final long serialVersionUID = -3433328864230783899L;
    protected String agent;
    protected int code;
    protected String text;

    public Warning() {
        super("Warning");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.text;
        int i = this.code;
        if (str == null) {
            sb.append(Integer.toString(i));
            sb.append(Separators.SP);
            sb.append(this.agent);
            return sb;
        }
        sb.append(Integer.toString(i));
        sb.append(Separators.SP);
        hne.B(sb, this.agent, Separators.SP, Separators.DOUBLE_QUOTE);
        sb.append(this.text);
        sb.append(Separators.DOUBLE_QUOTE);
        return sb;
    }

    @Override // android.javax.sip.header.WarningHeader
    public String getAgent() {
        return this.agent;
    }

    @Override // android.javax.sip.header.WarningHeader
    public int getCode() {
        return this.code;
    }

    @Override // android.javax.sip.header.WarningHeader
    public String getText() {
        return this.text;
    }

    @Override // android.javax.sip.header.WarningHeader
    public void setAgent(String str) {
        if (str != null) {
            this.agent = str;
        } else {
            hny.u("the host parameter in the Warning header is null");
        }
    }

    @Override // android.javax.sip.header.WarningHeader
    public void setCode(int i) throws InvalidArgumentException {
        if (i <= 99 || i >= 1000) {
            throw new InvalidArgumentException(twn.m(i, "Code parameter in the Warning header is invalid: code="));
        }
        this.code = i;
    }

    @Override // android.javax.sip.header.WarningHeader
    public void setText(String str) throws ParseException {
        if (str != null) {
            this.text = str;
        } else {
            hny.j(0, "The text parameter in the Warning header is null");
        }
    }
}
