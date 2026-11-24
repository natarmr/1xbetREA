package android.gov.nist.javax.sip.header.extensions;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.header.ExtensionHeader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class References extends ParametersHeader implements ReferencesHeader, ExtensionHeader {
    private static final long serialVersionUID = 8536961681006637622L;
    private String callId;

    public References() {
        super(ReferencesHeader.NAME);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        boolean zIsEmpty = this.parameters.isEmpty();
        String str = this.callId;
        if (zIsEmpty) {
            sb.append(str);
            return sb;
        }
        sb.append(str);
        sb.append(Separators.SEMICOLON);
        return this.parameters.encode(sb);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public String getCallId() {
        return this.callId;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.javax.sip.header.Header
    public String getName() {
        return ReferencesHeader.NAME;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public String getParameter(String str) {
        return super.getParameter(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public Iterator getParameterNames() {
        return super.getParameterNames();
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public String getRel() {
        return getParameter(ReferencesHeader.REL);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void removeParameter(String str) {
        super.removeParameter(str);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public void setCallId(String str) {
        this.callId = str;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) {
        super.setParameter(str, str2);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public void setRel(String str) {
        if (str != null) {
            setParameter(ReferencesHeader.REL, str);
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) {
        throw new UnsupportedOperationException("operation not supported");
    }
}
