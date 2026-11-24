package android.gov.nist.javax.sip.header;

import a.hny;
import a.itt0;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.address.Address;
import android.javax.sip.header.ContactHeader;

/* JADX INFO: loaded from: classes.dex */
public final class Contact extends AddressParametersHeader implements ContactHeader {
    public static final String ACTION = "action";
    public static final String EXPIRES = "expires";
    public static final String PROXY = "proxy";
    public static final String Q = "q";
    public static final String REDIRECT = "redirect";
    private static final long serialVersionUID = 1677294871695706288L;
    private ContactList contactList;
    protected boolean wildCardFlag;

    public Contact() {
        super("Contact");
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        Contact contact = (Contact) super.clone();
        ContactList contactList = this.contactList;
        if (contactList != null) {
            contact.contactList = (ContactList) contactList.clone();
        }
        return contact;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (this.wildCardFlag) {
            sb.append('*');
            return sb;
        }
        if (this.address.getAddressType() == 1) {
            this.address.encode(sb);
        } else {
            sb.append('<');
            this.address.encode(sb);
            sb.append('>');
        }
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof ContactHeader) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.javax.sip.header.HeaderAddress
    public Address getAddress() {
        return this.address;
    }

    public ContactList getContactList() {
        return this.contactList;
    }

    public NameValueList getContactParms() {
        return this.parameters;
    }

    @Override // android.javax.sip.header.ContactHeader
    public int getExpires() {
        return getParameterAsInt("expires");
    }

    public String getPubGruuParam() {
        return (String) this.parameters.getValue(ParameterNames.PUB_GRUU);
    }

    @Override // android.javax.sip.header.ContactHeader
    public float getQValue() {
        return getParameterAsFloat("q");
    }

    public String getSipInstanceParam() {
        return (String) this.parameters.getValue(ParameterNames.SIP_INSTANCE);
    }

    public String getTempGruuParam() {
        return (String) this.parameters.getValue(ParameterNames.TEMP_GRUU);
    }

    public boolean getWildCardFlag() {
        return this.wildCardFlag;
    }

    @Override // android.javax.sip.header.ContactHeader
    public boolean isWildCard() {
        return this.address.isWildcard();
    }

    public void removePubGruuParam() {
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            nameValueList.delete(ParameterNames.PUB_GRUU);
        }
    }

    public void removeSipInstanceParam() {
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            nameValueList.delete(ParameterNames.SIP_INSTANCE);
        }
    }

    public void removeTempGruuParam() {
        NameValueList nameValueList = this.parameters;
        if (nameValueList != null) {
            nameValueList.delete(ParameterNames.TEMP_GRUU);
        }
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.javax.sip.header.HeaderAddress
    public void setAddress(Address address) {
        if (address == null) {
            hny.u("null address");
        } else {
            this.address = (AddressImpl) address;
            this.wildCardFlag = false;
        }
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }

    @Override // android.javax.sip.header.ContactHeader
    public void setExpires(int i) {
        this.parameters.set("expires", Integer.valueOf(i));
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) {
        NameValue nameValue = this.parameters.getNameValue(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(str2);
            return;
        }
        NameValue nameValue2 = new NameValue(str, str2);
        if (str.equalsIgnoreCase("methods")) {
            nameValue2.setQuotedValue();
        }
        this.parameters.set(nameValue2);
    }

    public void setPubGruuParam(String str) {
        this.parameters.set(ParameterNames.PUB_GRUU, str);
    }

    @Override // android.javax.sip.header.ContactHeader
    public void setQValue(float f) throws InvalidArgumentException {
        if (f == -1.0f || (f >= 0.0f && f <= 1.0f)) {
            this.parameters.set("q", Float.valueOf(f));
        } else {
            itt0.r("JAIN-SIP Exception, Contact, setQValue(), the qValue is not between 0 and 1");
        }
    }

    public void setSipInstanceParam(String str) {
        this.parameters.set(ParameterNames.SIP_INSTANCE, str);
    }

    public void setTempGruuParam(String str) {
        this.parameters.set(ParameterNames.TEMP_GRUU, str);
    }

    @Override // android.javax.sip.header.ContactHeader
    public void setWildCard() {
        setWildCardFlag(true);
    }

    public void setWildCardFlag(boolean z) {
        this.wildCardFlag = true;
        AddressImpl addressImpl = new AddressImpl();
        this.address = addressImpl;
        addressImpl.setWildCardFlag();
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
