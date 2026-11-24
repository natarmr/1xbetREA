package android.gov.nist.javax.sip.header;

import a.hny;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import android.javax.sip.address.URI;
import android.javax.sip.header.CallInfoHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public final class CallInfo extends ParametersHeader implements CallInfoHeader {
    private static final long serialVersionUID = -8179246487696752928L;
    protected GenericURI info;

    public CallInfo() {
        super("Call-Info");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        CallInfo callInfo = (CallInfo) super.clone();
        GenericURI genericURI = this.info;
        if (genericURI != null) {
            callInfo.info = (GenericURI) genericURI.clone();
        }
        return callInfo;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(Separators.LESS_THAN);
        this.info.encode(sb);
        sb.append(Separators.GREATER_THAN);
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null && !nameValueList.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.javax.sip.header.CallInfoHeader
    public URI getInfo() {
        return this.info;
    }

    @Override // android.javax.sip.header.CallInfoHeader
    public String getPurpose() {
        return getParameter(ParameterNames.PURPOSE);
    }

    @Override // android.javax.sip.header.CallInfoHeader
    public void setInfo(URI uri) {
        this.info = (GenericURI) uri;
    }

    @Override // android.javax.sip.header.CallInfoHeader
    public void setPurpose(String str) {
        if (str == null) {
            hny.u("null arg");
        } else {
            try {
                setParameter(ParameterNames.PURPOSE, str);
            } catch (ParseException unused) {
            }
        }
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
