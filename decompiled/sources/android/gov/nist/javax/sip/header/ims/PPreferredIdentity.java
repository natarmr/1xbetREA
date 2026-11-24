package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class PPreferredIdentity extends AddressParametersHeader implements PPreferredIdentityHeader, SIPHeaderNamesIms, ExtensionHeader {
    public PPreferredIdentity(AddressImpl addressImpl) {
        super("P-Preferred-Identity");
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
        return sb;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public PPreferredIdentity() {
        super("P-Preferred-Identity");
    }
}
