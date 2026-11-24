package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.javax.sip.header.RouteHeader;

/* JADX INFO: loaded from: classes.dex */
public class Route extends AddressParametersHeader implements RouteHeader {
    private static final long serialVersionUID = 5683577362998368846L;

    public Route(AddressImpl addressImpl) {
        super("Route");
        this.address = addressImpl;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
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
        return (obj instanceof RouteHeader) && super.equals(obj);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.javax.sip.header.Header
    public int hashCode() {
        return this.address.getHostPort().encode().toLowerCase().hashCode();
    }

    public Route() {
        super("Route");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
