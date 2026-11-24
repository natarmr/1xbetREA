package android.gov.nist.javax.sip.header.ims;

import a.hne;
import a.hny;
import a.itt0;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.InvalidArgumentException;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public abstract class SecurityAgree extends ParametersHeader {
    private String secMechanism;

    public SecurityAgree(String str) {
        super(str);
        this.parameters.setSeparator(Separators.SEMICOLON);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        SecurityAgree securityAgree = (SecurityAgree) super.clone();
        String str = this.secMechanism;
        if (str != null) {
            securityAgree.secMechanism = str;
        }
        return securityAgree;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        hne.B(sb, this.secMechanism, Separators.SEMICOLON, Separators.SP);
        return this.parameters.encode(sb);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof SecurityAgreeHeader) {
            SecurityAgreeHeader securityAgreeHeader = (SecurityAgreeHeader) obj;
            if (getSecurityMechanism().equals(securityAgreeHeader.getSecurityMechanism()) && equalParameters(securityAgreeHeader)) {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm() {
        return getParameter(ParameterNamesIms.ALG);
    }

    public String getEncryptionAlgorithm() {
        return getParameter(ParameterNamesIms.EALG);
    }

    public String getMode() {
        return getParameter(ParameterNamesIms.MOD);
    }

    public int getPortClient() {
        return Integer.parseInt(getParameter(ParameterNamesIms.PORT_C));
    }

    public int getPortServer() {
        return Integer.parseInt(getParameter(ParameterNamesIms.PORT_S));
    }

    public float getPreference() {
        return Float.parseFloat(getParameter("q"));
    }

    public String getProtocol() {
        return getParameter(ParameterNamesIms.PROT);
    }

    public int getSPIClient() {
        return Integer.parseInt(getParameter(ParameterNamesIms.SPI_C));
    }

    public int getSPIServer() {
        return Integer.parseInt(getParameter(ParameterNamesIms.SPI_S));
    }

    public String getSecurityMechanism() {
        return this.secMechanism;
    }

    public void setAlgorithm(String str) throws ParseException {
        if (str != null) {
            setParameter(ParameterNamesIms.ALG, str);
        } else {
            hny.u("JAIN-SIP Exception, SecurityClient, setAlgorithm(), the algorithm parameter is null");
        }
    }

    public void setEncryptionAlgorithm(String str) throws ParseException {
        if (str != null) {
            setParameter(ParameterNamesIms.EALG, str);
        } else {
            hny.u("JAIN-SIP Exception, SecurityClient, setEncryptionAlgorithm(), the encryption-algorithm parameter is null");
        }
    }

    public void setMode(String str) throws ParseException {
        if (str != null) {
            setParameter(ParameterNamesIms.MOD, str);
        } else {
            hny.u("JAIN-SIP Exception, SecurityClient, setMode(), the mode parameter is null");
        }
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) throws ParseException {
        if (str2 == null) {
            hny.u("null value");
            return;
        }
        NameValue nameValue = this.parameters.getNameValue(str.toLowerCase());
        if (nameValue != null) {
            nameValue.setValueAsObject(str2);
            return;
        }
        NameValue nameValue2 = new NameValue(str, str2);
        if (str.equalsIgnoreCase(ParameterNamesIms.D_VER)) {
            nameValue2.setQuotedValue();
            if (str2.startsWith(Separators.DOUBLE_QUOTE)) {
                hny.j(0, str2.concat(" : Unexpected DOUBLE_QUOTE"));
                return;
            }
        }
        super.setParameter(nameValue2);
    }

    public void setPortClient(int i) throws InvalidArgumentException {
        if (i >= 0) {
            setParameter(ParameterNamesIms.PORT_C, i);
        } else {
            itt0.r("JAIN-SIP Exception, SecurityClient, setPortClient(), the port-c parameter is <0");
        }
    }

    public void setPortServer(int i) throws InvalidArgumentException {
        if (i >= 0) {
            setParameter(ParameterNamesIms.PORT_S, i);
        } else {
            itt0.r("JAIN-SIP Exception, SecurityClient, setPortServer(), the port-s parameter is <0");
        }
    }

    public void setPreference(float f) throws InvalidArgumentException {
        if (f >= 0.0f) {
            setParameter("q", f);
        } else {
            itt0.r("JAIN-SIP Exception, SecurityClient, setPreference(), the preference (q) parameter is <0");
        }
    }

    public void setProtocol(String str) throws ParseException {
        if (str != null) {
            setParameter(ParameterNamesIms.PROT, str);
        } else {
            hny.u("JAIN-SIP Exception, SecurityClient, setProtocol(), the protocol parameter is null");
        }
    }

    public void setSPIClient(int i) throws InvalidArgumentException {
        if (i >= 0) {
            setParameter(ParameterNamesIms.SPI_C, i);
        } else {
            itt0.r("JAIN-SIP Exception, SecurityClient, setSPIClient(), the spi-c parameter is <0");
        }
    }

    public void setSPIServer(int i) throws InvalidArgumentException {
        if (i >= 0) {
            setParameter(ParameterNamesIms.SPI_S, i);
        } else {
            itt0.r("JAIN-SIP Exception, SecurityClient, setSPIServer(), the spi-s parameter is <0");
        }
    }

    public void setSecurityMechanism(String str) {
        if (str != null) {
            this.secMechanism = str;
        } else {
            hny.u("JAIN-SIP Exception, SecurityAgree, setSecurityMechanism(), the sec-mechanism parameter is null");
        }
    }

    public SecurityAgree() {
        this.parameters.setSeparator(Separators.SEMICOLON);
    }
}
