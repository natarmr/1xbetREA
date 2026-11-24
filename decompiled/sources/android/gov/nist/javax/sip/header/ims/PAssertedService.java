package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class PAssertedService extends SIPHeader implements PAssertedServiceHeader, SIPHeaderNamesIms, ExtensionHeader {
    private String subAppIds;
    private String subServiceIds;

    public PAssertedService(String str) {
        super("P-Asserted-Service");
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        return (PAssertedService) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(ParameterNamesIms.SERVICE_ID);
        if (this.subServiceIds != null) {
            sb.append(ParameterNamesIms.SERVICE_ID_LABEL);
            sb.append(Separators.DOT);
            sb.append(getSubserviceIdentifiers());
            return sb;
        }
        if (this.subAppIds != null) {
            sb.append(ParameterNamesIms.APPLICATION_ID_LABEL);
            sb.append(Separators.DOT);
            sb.append(getApplicationIdentifiers());
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof PAssertedServiceHeader) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public String getApplicationIdentifiers() {
        char cCharAt = this.subAppIds.charAt(0);
        String str = this.subAppIds;
        return cCharAt == '.' ? str.substring(1).trim() : str;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public String getSubserviceIdentifiers() {
        char cCharAt = this.subServiceIds.charAt(0);
        String str = this.subServiceIds;
        return cCharAt == '.' ? str.substring(1).trim() : str;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public void setApplicationIdentifiers(String str) {
        this.subAppIds = str;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssertedServiceHeader
    public void setSubserviceIdentifiers(String str) {
        this.subServiceIds = str;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public PAssertedService() {
        super("P-Asserted-Service");
    }
}
