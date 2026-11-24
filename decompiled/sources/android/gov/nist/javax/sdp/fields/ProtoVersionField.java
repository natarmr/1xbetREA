package android.gov.nist.javax.sdp.fields;

import a.ohq;
import a.rz4;
import a.vbu0;
import a.wch0;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class ProtoVersionField extends SDPField implements vbu0 {
    protected int protoVersion;

    public ProtoVersionField() {
        super(SDPFieldNames.PROTO_VERSION_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return rz4.j(this.protoVersion, Separators.NEWLINE, new StringBuilder(SDPFieldNames.PROTO_VERSION_FIELD));
    }

    public int getProtoVersion() {
        return this.protoVersion;
    }

    public int getVersion() {
        return getProtoVersion();
    }

    public void setProtoVersion(int i) {
        this.protoVersion = i;
    }

    public void setVersion(int i) throws wch0 {
        if (i >= 0) {
            setProtoVersion(i);
        } else {
            ohq.s("The value is <0");
        }
    }
}
