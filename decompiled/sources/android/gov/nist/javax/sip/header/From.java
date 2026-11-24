package android.gov.nist.javax.sip.header;

import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.parser.Parser;
import android.javax.sip.address.Address;
import android.javax.sip.header.FromHeader;

/* JADX INFO: loaded from: classes.dex */
public final class From extends AddressParametersHeader implements FromHeader {
    private static final long serialVersionUID = -6312727234330643892L;

    public From(To to) {
        super("From");
        this.address = to.address;
        this.parameters = to.parameters;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (this.address.getAddressType() == 2) {
            sb.append(Separators.LESS_THAN);
        }
        this.address.encode(sb);
        if (this.address.getAddressType() == 2) {
            sb.append(Separators.GREATER_THAN);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(Separators.SEMICOLON);
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof FromHeader) && super.equals(obj);
    }

    public String getDisplayName() {
        return this.address.getDisplayName();
    }

    public HostPort getHostPort() {
        return this.address.getHostPort();
    }

    @Override // android.javax.sip.header.FromHeader
    public String getTag() {
        if (this.parameters == null) {
            return null;
        }
        return getParameter("tag");
    }

    public String getUserAtHostPort() {
        return this.address.getUserAtHostPort();
    }

    public boolean hasTag() {
        return hasParameter("tag");
    }

    public void removeTag() {
        this.parameters.delete("tag");
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.javax.sip.header.HeaderAddress
    public void setAddress(Address address) {
        this.address = (AddressImpl) address;
    }

    @Override // android.javax.sip.header.FromHeader
    public void setTag(String str) {
        Parser.checkToken(str);
        setParameter("tag", str);
    }

    public From() {
        super("From");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
