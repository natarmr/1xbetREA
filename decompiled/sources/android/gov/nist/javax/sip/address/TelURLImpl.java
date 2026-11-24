package android.gov.nist.javax.sip.address;

import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.javax.sip.address.TelURL;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class TelURLImpl extends GenericURI implements TelURL {
    private static final long serialVersionUID = 5873527320305915954L;
    protected TelephoneNumber telephoneNumber;

    public TelURLImpl() {
        this.scheme = "tel";
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        TelURLImpl telURLImpl = (TelURLImpl) super.clone();
        TelephoneNumber telephoneNumber = this.telephoneNumber;
        if (telephoneNumber != null) {
            telURLImpl.telephoneNumber = (TelephoneNumber) telephoneNumber.clone();
        }
        return telURLImpl;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        sb.append(this.scheme);
        sb.append(':');
        this.telephoneNumber.encode(sb);
        return sb;
    }

    @Override // android.javax.sip.address.TelURL
    public String getIsdnSubAddress() {
        return this.telephoneNumber.getIsdnSubaddress();
    }

    @Override // android.javax.sip.header.Parameters
    public String getParameter(String str) {
        return this.telephoneNumber.getParameter(str);
    }

    @Override // android.javax.sip.header.Parameters
    public Iterator<String> getParameterNames() {
        return this.telephoneNumber.getParameterNames();
    }

    public NameValueList getParameters() {
        return this.telephoneNumber.getParameters();
    }

    @Override // android.javax.sip.address.TelURL
    public String getPhoneContext() {
        return getParameter("phone-context");
    }

    @Override // android.javax.sip.address.TelURL
    public String getPhoneNumber() {
        return this.telephoneNumber.getPhoneNumber();
    }

    @Override // android.javax.sip.address.TelURL
    public String getPostDial() {
        return this.telephoneNumber.getPostDial();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.javax.sip.address.URI
    public String getScheme() {
        return this.scheme;
    }

    @Override // android.javax.sip.address.TelURL
    public boolean isGlobal() {
        return this.telephoneNumber.isGlobal();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.javax.sip.address.URI
    public boolean isSipURI() {
        return false;
    }

    @Override // android.javax.sip.header.Parameters
    public void removeParameter(String str) {
        this.telephoneNumber.removeParameter(str);
    }

    @Override // android.javax.sip.address.TelURL
    public void setGlobal(boolean z) {
        this.telephoneNumber.setGlobal(z);
    }

    @Override // android.javax.sip.address.TelURL
    public void setIsdnSubAddress(String str) {
        this.telephoneNumber.setIsdnSubaddress(str);
    }

    @Override // android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) {
        this.telephoneNumber.setParameter(str, str2);
    }

    @Override // android.javax.sip.address.TelURL
    public void setPhoneContext(String str) {
        if (str == null) {
            removeParameter("phone-context");
        } else {
            setParameter("phone-context", str);
        }
    }

    @Override // android.javax.sip.address.TelURL
    public void setPhoneNumber(String str) {
        this.telephoneNumber.setPhoneNumber(str);
    }

    @Override // android.javax.sip.address.TelURL
    public void setPostDial(String str) {
        this.telephoneNumber.setPostDial(str);
    }

    public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.javax.sip.address.NetObject, android.javax.sip.address.URI
    public String toString() {
        return this.scheme + Separators.COLON + this.telephoneNumber.encode();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }
}
