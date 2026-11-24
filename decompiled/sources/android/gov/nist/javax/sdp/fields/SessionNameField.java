package android.gov.nist.javax.sdp.fields;

import a.axq;
import a.cki0;
import a.ohq;
import a.wch0;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class SessionNameField extends SDPField implements cki0 {
    protected String sessionName;

    public SessionNameField() {
        super(SDPFieldNames.SESSION_NAME_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return axq.n(new StringBuilder(SDPFieldNames.SESSION_NAME_FIELD), this.sessionName, Separators.NEWLINE);
    }

    public String getSessionName() {
        return this.sessionName;
    }

    public String getValue() {
        return getSessionName();
    }

    public void setSessionName(String str) {
        this.sessionName = str;
    }

    public void setValue(String str) throws wch0 {
        if (str != null) {
            setSessionName(str);
        } else {
            ohq.s("The value is null");
        }
    }
}
