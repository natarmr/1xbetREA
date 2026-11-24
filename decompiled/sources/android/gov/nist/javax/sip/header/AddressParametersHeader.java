package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.address.AddressImpl;
import android.javax.sip.address.Address;
import android.javax.sip.header.HeaderAddress;
import android.javax.sip.header.Parameters;

/* JADX INFO: loaded from: classes.dex */
public abstract class AddressParametersHeader extends ParametersHeader implements Parameters {
    protected AddressImpl address;

    public AddressParametersHeader(String str) {
        super(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        AddressParametersHeader addressParametersHeader = (AddressParametersHeader) super.clone();
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            addressParametersHeader.address = (AddressImpl) addressImpl.clone();
        }
        return addressParametersHeader;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HeaderAddress) && (obj instanceof Parameters)) {
            HeaderAddress headerAddress = (HeaderAddress) obj;
            if (getAddress().equals(headerAddress.getAddress()) && equalParameters((Parameters) headerAddress)) {
                return true;
            }
        }
        return false;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = (AddressImpl) address;
    }

    public AddressParametersHeader(String str, boolean z) {
        super(str, z);
    }
}
