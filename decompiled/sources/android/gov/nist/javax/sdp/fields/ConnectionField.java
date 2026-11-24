package android.gov.nist.javax.sdp.fields;

import a.brm0;
import a.j1e;
import a.ohq;
import a.wch0;
import android.gov.nist.core.Host;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionField extends SDPField implements j1e {
    protected ConnectionAddress address;
    protected String addrtype;
    protected String nettype;

    public ConnectionField() {
        super(SDPFieldNames.CONNECTION_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ConnectionField connectionField = (ConnectionField) super.clone();
        ConnectionAddress connectionAddress = this.address;
        if (connectionAddress != null) {
            connectionField.address = (ConnectionAddress) connectionAddress.clone();
        }
        return connectionField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.nettype;
        String string = SDPFieldNames.CONNECTION_FIELD;
        if (str != null) {
            string = SDPFieldNames.CONNECTION_FIELD + this.nettype;
        }
        if (this.addrtype != null) {
            StringBuilder sbT = brm0.t(string, Separators.SP);
            sbT.append(this.addrtype);
            string = sbT.toString();
        }
        if (this.address != null) {
            StringBuilder sbT2 = brm0.t(string, Separators.SP);
            sbT2.append(this.address.encode());
            string = sbT2.toString();
        }
        return string.concat(Separators.NEWLINE);
    }

    public String getAddress() {
        Host address;
        ConnectionAddress connectionAddress = getConnectionAddress();
        if (connectionAddress == null || (address = connectionAddress.getAddress()) == null) {
            return null;
        }
        return address.getAddress();
    }

    public String getAddressType() {
        return getAddrtype();
    }

    public String getAddrtype() {
        return this.addrtype;
    }

    public ConnectionAddress getConnectionAddress() {
        return this.address;
    }

    public String getNettype() {
        return this.nettype;
    }

    public String getNetworkType() {
        return getNettype();
    }

    public void setAddrType(String str) {
        this.addrtype = str;
    }

    public void setAddress(String str) throws wch0 {
        if (str == null) {
            ohq.s("the addr is null");
            return;
        }
        ConnectionAddress connectionAddress = this.address;
        if (connectionAddress == null) {
            this.address = new ConnectionAddress();
            this.address.setAddress(new Host(str));
        } else {
            Host address = connectionAddress.getAddress();
            if (address == null) {
                this.address.setAddress(new Host(str));
            } else {
                address.setAddress(str);
            }
        }
        setAddress(this.address);
    }

    public void setAddressType(String str) throws wch0 {
        if (str != null) {
            this.addrtype = str;
        } else {
            ohq.s("the type is null");
        }
    }

    public void setNettype(String str) {
        this.nettype = str;
    }

    public void setNetworkType(String str) throws wch0 {
        if (str != null) {
            setNettype(str);
        } else {
            ohq.s("the type is null");
        }
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }

    public void setAddress(ConnectionAddress connectionAddress) {
        this.address = connectionAddress;
    }
}
