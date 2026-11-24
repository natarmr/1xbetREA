package android.gov.nist.javax.sdp.fields;

import a.axq;
import a.ohq;
import a.qqp;
import a.wch0;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class PhoneField extends SDPField implements qqp {
    protected String name;
    protected String phoneNumber;

    public PhoneField() {
        super(SDPFieldNames.PHONE_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.name;
        String strN = SDPFieldNames.PHONE_FIELD;
        if (str != null) {
            strN = axq.n(new StringBuilder(SDPFieldNames.PHONE_FIELD), this.name, Separators.LESS_THAN);
        }
        String strConcat = strN + this.phoneNumber;
        if (this.name != null) {
            strConcat = strConcat.concat(Separators.GREATER_THAN);
        }
        return strConcat.concat(Separators.NEWLINE);
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getValue() {
        return getName();
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setValue(String str) throws wch0 {
        if (str != null) {
            setName(str);
        } else {
            ohq.s("The value parameter is null");
        }
    }
}
