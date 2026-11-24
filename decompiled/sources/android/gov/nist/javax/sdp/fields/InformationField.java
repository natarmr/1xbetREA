package android.gov.nist.javax.sdp.fields;

import a.axq;
import a.f8x;
import a.ohq;
import a.wch0;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class InformationField extends SDPField implements f8x {
    protected String information;

    public InformationField() {
        super(SDPFieldNames.INFORMATION_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return axq.n(new StringBuilder(SDPFieldNames.INFORMATION_FIELD), this.information, Separators.NEWLINE);
    }

    public String getInformation() {
        return this.information;
    }

    public String getValue() {
        return this.information;
    }

    public void setInformation(String str) {
        this.information = str;
    }

    public void setValue(String str) throws wch0 {
        if (str != null) {
            setInformation(str);
        } else {
            ohq.s("The value is null");
        }
    }
}
