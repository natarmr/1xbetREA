package android.gov.nist.javax.sdp.fields;

import a.axq;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class EmailAddress extends SDPObject {
    protected String displayName;
    protected Email email;

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        EmailAddress emailAddress = (EmailAddress) super.clone();
        Email email = this.email;
        if (email != null) {
            emailAddress.email = (Email) email.clone();
        }
        return emailAddress;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = (this.displayName != null ? axq.n(new StringBuilder(), this.displayName, Separators.LESS_THAN) : "") + this.email.encode();
        return this.displayName != null ? str.concat(Separators.GREATER_THAN) : str;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}
