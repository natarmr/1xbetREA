package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import android.javax.sip.address.URI;
import android.javax.sip.header.AlertInfoHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public final class AlertInfo extends ParametersHeader implements AlertInfoHeader {
    private static final long serialVersionUID = 4159657362051508719L;
    protected String string;
    protected GenericURI uri;

    public AlertInfo() {
        super("Alert-Info");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        AlertInfo alertInfo = (AlertInfo) super.clone();
        GenericURI genericURI = this.uri;
        if (genericURI != null) {
            alertInfo.uri = (GenericURI) genericURI.clone();
            return alertInfo;
        }
        String str = this.string;
        if (str != null) {
            alertInfo.string = str;
        }
        return alertInfo;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (this.uri != null) {
            sb.append(Separators.LESS_THAN);
            sb.append(this.uri.encode());
            sb.append(Separators.GREATER_THAN);
        } else {
            String str = this.string;
            if (str != null) {
                sb.append(str);
            }
        }
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            sb.append(this.parameters.encode());
        }
        return sb;
    }

    @Override // android.javax.sip.header.AlertInfoHeader
    public URI getAlertInfo() {
        GenericURI genericURI = this.uri;
        if (genericURI != null) {
            return genericURI;
        }
        try {
            return new GenericURI(this.string);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // android.javax.sip.header.AlertInfoHeader
    public void setAlertInfo(URI uri) {
        this.uri = (GenericURI) uri;
    }

    public void setAlertInfo(String str) {
        this.string = str;
    }
}
