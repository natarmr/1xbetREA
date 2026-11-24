package android.gov.nist.javax.sip.header.ims;

import a.hny;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.AddressImpl;
import android.gov.nist.javax.sip.header.AddressParametersHeader;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class PServedUser extends AddressParametersHeader implements PServedUserHeader, SIPHeaderNamesIms, ExtensionHeader {
    public PServedUser(AddressImpl addressImpl) {
        super("P-Served-User");
        this.address = addressImpl;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        return (PServedUser) super.clone();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.address.encode());
        if (this.parameters.containsKey(ParameterNamesIms.REGISTRATION_STATE)) {
            sb.append(Separators.SEMICOLON);
            sb.append(ParameterNamesIms.REGISTRATION_STATE);
            sb.append("=");
            sb.append(getRegistrationState());
        }
        if (this.parameters.containsKey(ParameterNamesIms.SESSION_CASE)) {
            sb.append(Separators.SEMICOLON);
            sb.append(ParameterNamesIms.SESSION_CASE);
            sb.append("=");
            sb.append(getSessionCase());
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.AddressParametersHeader, android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof PServedUser) {
            return getAddress().equals(((PServedUser) obj).getAddress());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PServedUserHeader
    public String getRegistrationState() {
        return getParameter(ParameterNamesIms.REGISTRATION_STATE);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PServedUserHeader
    public String getSessionCase() {
        return getParameter(ParameterNamesIms.SESSION_CASE);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PServedUserHeader
    public void setRegistrationState(String str) {
        if (str == null) {
            hny.u("regstate Parameter value is null");
            return;
        }
        if (!str.equals("reg") && !str.equals("unreg")) {
            try {
                throw new InvalidArgumentException("Value can be either reg or unreg");
            } catch (InvalidArgumentException e) {
                e.printStackTrace();
            }
        } else {
            try {
                setParameter(ParameterNamesIms.REGISTRATION_STATE, str);
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PServedUserHeader
    public void setSessionCase(String str) {
        if (str == null) {
            hny.u("sess-case Parameter value is null");
            return;
        }
        if (!str.equals("orig") && !str.equals("term")) {
            try {
                throw new InvalidArgumentException("Value can be either orig or term");
            } catch (InvalidArgumentException e) {
                e.printStackTrace();
            }
        } else {
            try {
                setParameter(ParameterNamesIms.SESSION_CASE, str);
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public PServedUser() {
        super("P-Served-User");
    }
}
