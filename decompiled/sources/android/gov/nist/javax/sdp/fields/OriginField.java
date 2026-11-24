package android.gov.nist.javax.sdp.fields;

import a.ohq;
import a.ta80;
import a.ua80;
import a.vqd;
import a.wch0;
import android.gov.nist.core.Host;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class OriginField extends SDPField implements ta80 {
    protected Host address;
    protected String addrtype;
    protected String nettype;
    private String sessIdString;
    private String sessVersionString;
    protected String username;

    public OriginField() {
        super(SDPFieldNames.ORIGIN_FIELD);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        OriginField originField = (OriginField) super.clone();
        Host host = this.address;
        if (host != null) {
            originField.address = (Host) host.clone();
        }
        return originField;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String strEncode;
        Host host = this.address;
        if (host != null) {
            strEncode = host.encode();
            if (Host.isIPv6Reference(strEncode)) {
                strEncode = vqd.k(1, 1, strEncode);
            }
        } else {
            strEncode = null;
        }
        StringBuilder sb = new StringBuilder(SDPFieldNames.ORIGIN_FIELD);
        sb.append(this.username);
        sb.append(Separators.SP);
        sb.append(this.sessIdString);
        sb.append(Separators.SP);
        sb.append(this.sessVersionString);
        sb.append(Separators.SP);
        sb.append(this.nettype);
        sb.append(Separators.SP);
        return ua80.m(sb, this.addrtype, Separators.SP, strEncode, Separators.NEWLINE);
    }

    public String getAddress() {
        Host host = getHost();
        if (host == null) {
            return null;
        }
        return host.getAddress();
    }

    public String getAddressType() {
        return getAddrtype();
    }

    public String getAddrtype() {
        return this.addrtype;
    }

    public Host getHost() {
        return this.address;
    }

    public String getNettype() {
        return this.nettype;
    }

    public String getNetworkType() {
        return getNettype();
    }

    public long getSessId() {
        return Long.valueOf(this.sessIdString).longValue();
    }

    public String getSessIdAsString() {
        return this.sessIdString;
    }

    public long getSessVersion() {
        return Long.valueOf(this.sessVersionString).longValue();
    }

    public String getSessVersionAsString() {
        return this.sessVersionString;
    }

    public long getSessionId() {
        return getSessId();
    }

    public long getSessionVersion() {
        return getSessVersion();
    }

    public String getUsername() {
        return this.username;
    }

    public void setAddress(String str) throws wch0 {
        if (str == null) {
            ohq.s("The addr parameter is null");
            return;
        }
        Host host = getHost();
        if (host == null) {
            host = new Host();
        }
        host.setAddress(str);
        setAddress(host);
    }

    public void setAddressType(String str) throws wch0 {
        if (str != null) {
            setAddrtype(str);
        } else {
            ohq.s("The type parameter is <0");
        }
    }

    public void setAddrtype(String str) {
        this.addrtype = str;
    }

    public void setNettype(String str) {
        this.nettype = str;
    }

    public void setNetworkType(String str) throws wch0 {
        if (str != null) {
            setNettype(str);
        } else {
            ohq.s("The type parameter is <0");
        }
    }

    public void setSessId(long j) {
        this.sessIdString = Long.toString(j);
    }

    public void setSessVersion(long j) {
        this.sessVersionString = Long.toString(j);
    }

    public void setSessionId(long j) throws wch0 {
        if (j >= 0) {
            setSessId(j);
        } else {
            ohq.s("The is parameter is <0");
        }
    }

    public void setSessionVersion(long j) throws wch0 {
        if (j >= 0) {
            setSessVersion(j);
        } else {
            ohq.s("The version parameter is <0");
        }
    }

    public void setUsername(String str) throws wch0 {
        if (str != null) {
            this.username = str;
        } else {
            ohq.s("The user parameter is null");
        }
    }

    public void setSessVersion(String str) {
        this.sessVersionString = str;
    }

    public void setSessionId(String str) {
        this.sessIdString = str;
    }

    public void setAddress(Host host) {
        this.address = host;
    }
}
