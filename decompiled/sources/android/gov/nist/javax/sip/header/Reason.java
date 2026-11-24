package android.gov.nist.javax.sip.header;

import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.Utils;
import android.javax.sip.header.ReasonHeader;

/* JADX INFO: loaded from: classes.dex */
public class Reason extends ParametersHeader implements ReasonHeader {
    private static final long serialVersionUID = -8903376965568297388L;
    public final String CAUSE;
    public final String TEXT;
    protected String protocol;

    public Reason() {
        super("Reason");
        this.TEXT = ParameterNames.TEXT;
        this.CAUSE = ParameterNames.CAUSE;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.protocol);
        NameValueList nameValueList = this.parameters;
        if (nameValueList == null || nameValueList.isEmpty()) {
            return sb;
        }
        sb.append(Separators.SEMICOLON);
        return this.parameters.encode(sb);
    }

    @Override // android.javax.sip.header.ReasonHeader
    public int getCause() {
        return getParameterAsInt(ParameterNames.CAUSE);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.javax.sip.header.Header
    public String getName() {
        return "Reason";
    }

    @Override // android.javax.sip.header.ReasonHeader
    public String getProtocol() {
        return this.protocol;
    }

    @Override // android.javax.sip.header.ReasonHeader
    public String getText() {
        return this.parameters.getParameter(ParameterNames.TEXT);
    }

    @Override // android.javax.sip.header.ReasonHeader
    public void setCause(int i) {
        this.parameters.set(ParameterNames.CAUSE, Integer.valueOf(i));
    }

    @Override // android.javax.sip.header.ReasonHeader
    public void setProtocol(String str) {
        this.protocol = str;
    }

    @Override // android.javax.sip.header.ReasonHeader
    public void setText(String str) {
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        if (str.charAt(0) != '\"') {
            str = Utils.getQuotedString(str);
        }
        this.parameters.set(ParameterNames.TEXT, str);
    }
}
