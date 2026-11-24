package android.gov.nist.javax.sip.header;

import a.jf4;
import a.v4i0;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class CallIdentifier extends SIPObject {
    private static final long serialVersionUID = 7314773655675451377L;
    protected String host;
    protected String localId;

    public CallIdentifier(String str, String str2) {
        this.localId = str;
        this.host = str2;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        sb.append(this.localId);
        if (this.host != null) {
            sb.append(Separators.AT);
            sb.append(this.host);
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(CallIdentifier.class)) {
            return false;
        }
        CallIdentifier callIdentifier = (CallIdentifier) obj;
        if (this.localId.compareTo(callIdentifier.localId) != 0) {
            return false;
        }
        String str = this.host;
        String str2 = callIdentifier.host;
        if (str == str2) {
            return true;
        }
        return (str != null || str2 == null) && (str == null || str2 != null) && str.compareToIgnoreCase(str2) == 0;
    }

    public String getHost() {
        return this.host;
    }

    public String getLocalId() {
        return this.localId;
    }

    public int hashCode() {
        String str = this.localId;
        if (str != null) {
            return str.hashCode();
        }
        v4i0.p("Hash code called before id is set");
        return 0;
    }

    public void setCallID(String str) {
        if (str == null) {
            jf4.o("NULL!");
            return;
        }
        int iIndexOf = str.indexOf(64);
        if (iIndexOf == -1) {
            this.localId = str;
            this.host = null;
            return;
        }
        this.localId = str.substring(0, iIndexOf);
        this.host = str.substring(iIndexOf + 1, str.length());
        if (this.localId != null) {
            return;
        }
        jf4.o("CallID  must be token@token or token");
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setLocalId(String str) {
        this.localId = str;
    }

    public CallIdentifier() {
    }

    public CallIdentifier(String str) {
        setCallID(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }
}
