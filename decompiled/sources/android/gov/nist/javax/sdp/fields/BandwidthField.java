package android.gov.nist.javax.sdp.fields;

import a.axq;
import a.ohq;
import a.qqp;
import a.rz4;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public class BandwidthField extends SDPField implements qqp {
    protected int bandwidth;
    protected String bwtype;

    public BandwidthField() {
        super(SDPFieldNames.BANDWIDTH_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.bwtype;
        String strN = SDPFieldNames.BANDWIDTH_FIELD;
        if (str != null) {
            strN = axq.n(new StringBuilder(SDPFieldNames.BANDWIDTH_FIELD), this.bwtype, Separators.COLON);
        }
        return rz4.j(this.bandwidth, Separators.NEWLINE, new StringBuilder(strN));
    }

    public int getBandwidth() {
        return this.bandwidth;
    }

    public String getBwtype() {
        return this.bwtype;
    }

    public String getType() {
        return getBwtype();
    }

    public int getValue() {
        return getBandwidth();
    }

    public void setBandwidth(int i) {
        this.bandwidth = i;
    }

    public void setBwtype(String str) {
        this.bwtype = str;
    }

    public void setType(String str) {
        if (str != null) {
            setBwtype(str);
        } else {
            ohq.s("The type is null");
        }
    }

    public void setValue(int i) {
        setBandwidth(i);
    }
}
