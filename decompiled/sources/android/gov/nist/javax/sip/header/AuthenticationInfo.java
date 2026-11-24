package android.gov.nist.javax.sip.header;

import a.hny;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.javax.sip.header.AuthenticationInfoHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationInfo extends ParametersHeader implements AuthenticationInfoHeader {
    private static final long serialVersionUID = -4371927900917127057L;
    private String scheme;

    public AuthenticationInfo() {
        super("Authentication-Info");
        this.parameters.setSeparator(Separators.COMMA);
    }

    public void add(NameValue nameValue) {
        this.parameters.set(nameValue);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.scheme;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        return this.parameters.encode(sb);
    }

    public NameValue getAuthInfo(String str) {
        return this.parameters.getNameValue(str);
    }

    public String getAuthenticationInfo() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public String getCNonce() {
        return getParameter("cnonce");
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public String getNextNonce() {
        return getParameter(ParameterNames.NEXT_NONCE);
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public int getNonceCount() {
        return getParameterAsInt("nc");
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public String getQop() {
        return getParameter("qop");
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public String getResponse() {
        return getParameter(ParameterNames.RESPONSE_AUTH);
    }

    public String getSNum() {
        return getParameter(ParameterNames.SNUM);
    }

    public String getSRand() {
        return getParameter(ParameterNames.SRAND);
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getTargetName() {
        return getParameter(ParameterNames.TARGET_NAME);
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public void setCNonce(String str) throws ParseException {
        setParameter("cnonce", str);
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public void setNextNonce(String str) throws ParseException {
        setParameter(ParameterNames.NEXT_NONCE, str);
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public void setNonceCount(int i) throws ParseException {
        if (i < 0) {
            hny.j(0, "bad value");
        } else {
            String hexString = Integer.toHexString(i);
            setParameter("nc", "00000000".substring(0, 8 - hexString.length()).concat(hexString));
        }
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) throws ParseException {
        if (str == null) {
            hny.u("null name");
            return;
        }
        NameValue nameValue = this.parameters.getNameValue(str.toLowerCase());
        if (nameValue != null) {
            nameValue.setValueAsObject(str2);
            return;
        }
        NameValue nameValue2 = new NameValue(str, str2);
        if (str.equalsIgnoreCase("qop") || str.equalsIgnoreCase(ParameterNames.NEXT_NONCE) || str.equalsIgnoreCase("realm") || str.equalsIgnoreCase("cnonce") || str.equalsIgnoreCase("nonce") || str.equalsIgnoreCase("opaque") || str.equalsIgnoreCase("username") || str.equalsIgnoreCase("domain") || str.equalsIgnoreCase(ParameterNames.NEXT_NONCE) || str.equalsIgnoreCase(ParameterNames.RESPONSE_AUTH) || str.equalsIgnoreCase(ParameterNames.SRAND) || str.equalsIgnoreCase(ParameterNames.SNUM) || str.equalsIgnoreCase(ParameterNames.TARGET_NAME)) {
            if (str2 == null) {
                hny.u("null value");
                return;
            } else {
                if (str2.startsWith(Separators.DOUBLE_QUOTE)) {
                    hny.j(0, str2.concat(" : Unexpected DOUBLE_QUOTE"));
                    return;
                }
                nameValue2.setQuotedValue();
            }
        }
        super.setParameter(nameValue2);
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public void setQop(String str) throws ParseException {
        setParameter("qop", str);
    }

    @Override // android.javax.sip.header.AuthenticationInfoHeader
    public void setResponse(String str) throws ParseException {
        setParameter(ParameterNames.RESPONSE_AUTH, str);
    }

    public void setSNum(String str) throws ParseException {
        setParameter(ParameterNames.SNUM, str);
    }

    public void setSRand(String str) throws ParseException {
        setParameter(ParameterNames.SRAND, str);
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setTargetName(String str) throws ParseException {
        setParameter(ParameterNames.TARGET_NAME, str);
    }
}
