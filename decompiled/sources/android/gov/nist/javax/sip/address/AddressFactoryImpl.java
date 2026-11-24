package android.gov.nist.javax.sip.address;

import a.hne;
import a.hny;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.StringMsgParser;
import android.gov.nist.javax.sip.parser.URLParser;
import android.javax.sip.address.Address;
import android.javax.sip.address.SipURI;
import android.javax.sip.address.TelURL;
import android.javax.sip.address.URI;
import java.text.ParseException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class AddressFactoryImpl implements AddressFactoryEx {
    public static final Pattern SCHEME_PATTERN = Pattern.compile("\\p{Alpha}[[{\\p{Alpha}][\\p{Digit}][\\+][-][\\.]]*");

    @Override // android.javax.sip.address.AddressFactory
    public Address createAddress(String str) {
        if (str == null) {
            hny.u("null address");
            return null;
        }
        if (!str.equals(Separators.STAR)) {
            return new StringMsgParser().parseAddress(str);
        }
        AddressImpl addressImpl = new AddressImpl();
        addressImpl.setAddressType(3);
        SipUri sipUri = new SipUri();
        sipUri.setUser(Separators.STAR);
        addressImpl.setURI(sipUri);
        return addressImpl;
    }

    @Override // android.javax.sip.address.AddressFactory
    public SipURI createSipURI(String str, String str2) throws ParseException {
        if (str2 == null) {
            hny.u("null host");
            return null;
        }
        StringBuilder sb = new StringBuilder("sip:");
        if (str != null) {
            sb.append(str);
            sb.append(Separators.AT);
        }
        if (str2.indexOf(58) != str2.lastIndexOf(58) && str2.trim().charAt(0) != '[') {
            str2 = hne.l(']', "[", str2);
        }
        sb.append(str2);
        try {
            return createSipURI(sb.toString());
        } catch (ParseException e) {
            hny.j(0, e.getMessage());
            return null;
        }
    }

    @Override // android.javax.sip.address.AddressFactory
    public TelURL createTelURL(String str) throws ParseException {
        if (str == null) {
            hny.u("null url");
            return null;
        }
        if (!str.startsWith("tel:")) {
            str = "tel:".concat(str);
        }
        try {
            return (TelURLImpl) new StringMsgParser().parseUrl(str);
        } catch (ParseException e) {
            hny.j(0, e.getMessage());
            return null;
        }
    }

    @Override // android.javax.sip.address.AddressFactory
    public URI createURI(String str) throws ParseException {
        if (str == null) {
            hny.u("null arg");
            return null;
        }
        try {
            String strPeekScheme = new URLParser(str).peekScheme();
            if (strPeekScheme == null) {
                throw new ParseException("bad scheme", 0);
            }
            if (!strPeekScheme.equalsIgnoreCase("sip") && !strPeekScheme.equalsIgnoreCase("sips")) {
                if (strPeekScheme.equalsIgnoreCase("tel")) {
                    return createTelURL(str);
                }
                if (SCHEME_PATTERN.matcher(strPeekScheme).matches()) {
                    return new GenericURI(str);
                }
                throw new ParseException("the scheme " + strPeekScheme + " from the following uri " + str + " doesn't match ALPHA *(ALPHA / DIGIT / \"+\" / \"-\" / \".\" ) from RFC3261", 0);
            }
            return createSipURI(str);
        } catch (ParseException e) {
            hny.j(0, e.getMessage());
            return null;
        }
    }

    @Override // android.javax.sip.address.AddressFactory
    public Address createAddress(String str, URI uri) {
        if (uri != null) {
            AddressImpl addressImpl = new AddressImpl();
            if (str != null) {
                addressImpl.setDisplayName(str);
            }
            addressImpl.setURI(uri);
            return addressImpl;
        }
        hny.u("null  URI");
        return null;
    }

    @Override // android.javax.sip.address.AddressFactory
    public Address createAddress(URI uri) {
        if (uri != null) {
            AddressImpl addressImpl = new AddressImpl();
            addressImpl.setURI(uri);
            return addressImpl;
        }
        hny.u("null address");
        return null;
    }

    public Address createAddress() {
        return new AddressImpl();
    }

    @Override // android.gov.nist.javax.sip.address.AddressFactoryEx
    public SipURI createSipURI(String str) throws ParseException {
        if (str != null) {
            try {
                return new StringMsgParser().parseSIPUrl(str);
            } catch (ParseException e) {
                hny.j(0, e.getMessage());
                return null;
            }
        }
        hny.u("null URI");
        return null;
    }
}
