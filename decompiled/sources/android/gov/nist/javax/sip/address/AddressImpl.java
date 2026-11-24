package android.gov.nist.javax.sip.address;

import a.hne;
import a.itt0;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.Separators;
import android.javax.sip.address.Address;
import android.javax.sip.address.URI;

/* JADX INFO: loaded from: classes.dex */
public final class AddressImpl extends NetObject implements Address {
    public static final int ADDRESS_SPEC = 2;
    public static final int NAME_ADDR = 1;
    public static final int WILD_CARD = 3;
    private static final long serialVersionUID = 429592779568617259L;
    protected GenericURI address;
    protected int addressType = 1;
    protected String displayName;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        AddressImpl addressImpl = (AddressImpl) super.clone();
        GenericURI genericURI = this.address;
        if (genericURI != null) {
            addressImpl.address = (GenericURI) genericURI.clone();
        }
        return addressImpl;
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        if (this.addressType == 3) {
            sb.append('*');
            return sb;
        }
        if (this.displayName != null) {
            sb.append(Separators.DOUBLE_QUOTE);
            hne.B(sb, this.displayName, Separators.DOUBLE_QUOTE, Separators.SP);
        }
        if (this.address != null) {
            if (this.addressType == 1 || this.displayName != null) {
                sb.append(Separators.LESS_THAN);
            }
            this.address.encode(sb);
            if (this.addressType == 1 || this.displayName != null) {
                sb.append(Separators.GREATER_THAN);
            }
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Address) {
            return getURI().equals(((Address) obj).getURI());
        }
        return false;
    }

    public int getAddressType() {
        return this.addressType;
    }

    @Override // android.javax.sip.address.Address
    public String getDisplayName() {
        return this.displayName;
    }

    public String getHost() {
        GenericURI genericURI = this.address;
        if (genericURI instanceof SipUri) {
            return ((SipUri) genericURI).getHostPort().getHost().getHostname();
        }
        itt0.k("address is not a SipUri");
        return null;
    }

    public HostPort getHostPort() {
        GenericURI genericURI = this.address;
        if (genericURI instanceof SipUri) {
            return ((SipUri) genericURI).getHostPort();
        }
        itt0.k("address is not a SipUri");
        return null;
    }

    public int getPort() {
        GenericURI genericURI = this.address;
        if (genericURI instanceof SipUri) {
            return ((SipUri) genericURI).getHostPort().getPort();
        }
        itt0.k("address is not a SipUri");
        return 0;
    }

    @Override // android.javax.sip.address.Address
    public URI getURI() {
        return this.address;
    }

    public String getUserAtHostPort() {
        GenericURI genericURI = this.address;
        return genericURI instanceof SipUri ? ((SipUri) genericURI).getUserAtHostPort() : genericURI.toString();
    }

    public boolean hasDisplayName() {
        return this.displayName != null;
    }

    @Override // android.javax.sip.address.Address
    public int hashCode() {
        return this.address.hashCode();
    }

    public boolean isSIPAddress() {
        return this.address instanceof SipUri;
    }

    @Override // android.javax.sip.address.Address
    public boolean isWildcard() {
        return this.addressType == 3;
    }

    @Override // android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        AddressImpl addressImpl = (AddressImpl) obj;
        if (addressImpl.getMatcher() != null) {
            return addressImpl.getMatcher().match(encode());
        }
        String str = addressImpl.displayName;
        if (str != null && this.displayName == null) {
            return false;
        }
        if (str == null) {
            return this.address.match(addressImpl.address);
        }
        return this.displayName.equalsIgnoreCase(str) && this.address.match(addressImpl.address);
    }

    public void removeDisplayName() {
        this.displayName = null;
    }

    public void removeParameter(String str) {
        GenericURI genericURI = this.address;
        if (genericURI instanceof SipUri) {
            ((SipUri) genericURI).removeParameter(str);
        } else {
            itt0.k("address is not a SipUri");
        }
    }

    public void setAddess(URI uri) {
        this.address = (GenericURI) uri;
    }

    public void setAddressType(int i) {
        this.addressType = i;
    }

    @Override // android.javax.sip.address.Address
    public void setDisplayName(String str) {
        this.displayName = str;
        this.addressType = 1;
    }

    @Override // android.javax.sip.address.Address
    public void setURI(URI uri) {
        this.address = (GenericURI) uri;
    }

    public void setUser(String str) {
        ((SipUri) this.address).setUser(str);
    }

    public void setWildCardFlag() {
        this.addressType = 3;
        SipUri sipUri = new SipUri();
        this.address = sipUri;
        sipUri.setUser(Separators.STAR);
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }
}
