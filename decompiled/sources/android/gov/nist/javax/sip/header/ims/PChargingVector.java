package android.gov.nist.javax.sip.header.ims;

import a.hny;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.SipException;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class PChargingVector extends ParametersHeader implements PChargingVectorHeader, SIPHeaderNamesIms, ExtensionHeader {
    public PChargingVector() {
        super("P-Charging-Vector");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (getNameValue(ParameterNamesIms.ICID_VALUE) != null) {
            this.parameters.encode(sb);
            return sb;
        }
        try {
            throw new SipException("icid-value is mandatory");
        } catch (SipException e) {
            e.printStackTrace();
            return sb;
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getICID() {
        return getParameter(ParameterNamesIms.ICID_VALUE);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getICIDGeneratedAt() {
        return getParameter(ParameterNamesIms.ICID_GENERATED_AT);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getOriginatingIOI() {
        return getParameter(ParameterNamesIms.ORIG_IOI);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getTerminatingIOI() {
        return getParameter(ParameterNamesIms.TERM_IOI);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setICID(String str) {
        if (str != null) {
            setParameter(ParameterNamesIms.ICID_VALUE, str);
        } else {
            hny.u("JAIN-SIP Exception, P-Charging-Vector, setICID(), the icid parameter is null.");
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setICIDGeneratedAt(String str) {
        if (str != null) {
            setParameter(ParameterNamesIms.ICID_GENERATED_AT, str);
        } else {
            hny.u("JAIN-SIP Exception, P-Charging-Vector, setICIDGeneratedAt(), the host parameter is null.");
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setOriginatingIOI(String str) {
        if (str == null || str.length() == 0) {
            removeParameter(ParameterNamesIms.ORIG_IOI);
        } else {
            this.parameters.set(ParameterNamesIms.ORIG_IOI, str);
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setTerminatingIOI(String str) {
        if (str == null || str.length() == 0) {
            removeParameter(ParameterNamesIms.TERM_IOI);
        } else {
            this.parameters.set(ParameterNamesIms.TERM_IOI, str);
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
