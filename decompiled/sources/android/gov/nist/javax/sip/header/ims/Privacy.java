package android.gov.nist.javax.sip.header.ims;

import a.hny;
import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* JADX INFO: loaded from: classes.dex */
public class Privacy extends SIPHeader implements PrivacyHeader, SIPHeaderNamesIms, ExtensionHeader {
    private String privacy;

    public Privacy() {
        super("Privacy");
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        Privacy privacy = (Privacy) super.clone();
        String str = this.privacy;
        if (str != null) {
            privacy.privacy = str;
        }
        return privacy;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.privacy);
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof PrivacyHeader) {
            return getPrivacy().equals(((PrivacyHeader) obj).getPrivacy());
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PrivacyHeader
    public String getPrivacy() {
        return this.privacy;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PrivacyHeader
    public void setPrivacy(String str) {
        if (str == null || str == "") {
            hny.u("JAIN-SIP Exception,  Privacy, setPrivacy(), privacy value is null or empty");
        } else {
            this.privacy = str;
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    public Privacy(String str) {
        this();
        this.privacy = str;
    }
}
