package android.gov.nist.javax.sdp.fields;

import a.ohq;
import a.sjy;
import a.wch0;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class KeyField extends SDPField implements sjy {
    protected String keyData;
    protected String type;

    public KeyField() {
        super(SDPFieldNames.KEY_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = SDPFieldNames.KEY_FIELD + this.type;
        if (this.keyData != null) {
            str = str.concat(Separators.COLON) + this.keyData;
        }
        return str.concat(Separators.NEWLINE);
    }

    public String getKey() {
        return getKeyData();
    }

    public String getKeyData() {
        return this.keyData;
    }

    public String getMethod() {
        return this.type;
    }

    public String getType() {
        return this.type;
    }

    public boolean hasKey() {
        return getKeyData() != null;
    }

    public void setKey(String str) throws wch0 {
        if (str != null) {
            setKeyData(str);
        } else {
            ohq.s("The key is null");
        }
    }

    public void setKeyData(String str) {
        this.keyData = str;
    }

    public void setMethod(String str) {
        this.type = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
