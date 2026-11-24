package android.gov.nist.javax.sip.header.ims;

import a.hny;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.address.GenericURI;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.javax.sip.address.URI;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class PAssociatedURI extends AddressParametersHeader implements PAssociatedURIHeader, SIPHeaderNamesIms, ExtensionHeader {
    public PAssociatedURI(GenericURI genericURI) {
        super("P-Associated-URI");
        AddressImpl addressImpl = new AddressImpl();
        this.address = addressImpl;
        addressImpl.setURI(genericURI);
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        PAssociatedURI pAssociatedURI = (PAssociatedURI) super.clone();
        AddressImpl addressImpl = this.address;
        if (addressImpl != null) {
            pAssociatedURI.address = (AddressImpl) addressImpl.clone();
        }
        return pAssociatedURI;
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
        if (this.parameters.isEmpty()) {
            return sb;
        }
        sb.append(Separators.SEMICOLON);
        return this.parameters.encode(sb);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader
    public URI getAssociatedURI() {
        return this.address.getURI();
    }

    @Override // android.gov.nist.javax.sip.header.ims.PAssociatedURIHeader
    public void setAssociatedURI(URI uri) {
        if (uri != null) {
            this.address.setURI(uri);
        } else {
            hny.u("null URI");
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public PAssociatedURI(AddressImpl addressImpl) {
        super("P-Associated-URI");
        this.address = addressImpl;
    }

    public PAssociatedURI() {
        super("P-Associated-URI");
    }
}
