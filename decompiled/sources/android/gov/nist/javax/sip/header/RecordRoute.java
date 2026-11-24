package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.javax.sip.header.RecordRouteHeader;

/* JADX INFO: loaded from: classes.dex */
public class RecordRoute extends AddressParametersHeader implements RecordRouteHeader {
    private static final long serialVersionUID = 2388023364181727205L;

    public RecordRoute(AddressImpl addressImpl) {
        super("Record-Route");
        this.address = addressImpl;
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

    public RecordRoute() {
        super("Record-Route");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }
}
