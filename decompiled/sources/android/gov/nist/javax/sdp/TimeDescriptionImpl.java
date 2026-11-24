package android.gov.nist.javax.sdp;

import a.brm0;
import a.hny;
import a.ohq;
import a.qgq0;
import a.wch0;
import android.gov.nist.javax.sdp.fields.RepeatField;
import android.gov.nist.javax.sdp.fields.TimeField;
import java.io.Serializable;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class TimeDescriptionImpl implements Serializable, Cloneable {
    private Vector repeatList;
    private TimeField timeImpl;

    public TimeDescriptionImpl() {
        this.timeImpl = new TimeField();
        this.repeatList = new Vector();
    }

    public void addRepeatField(RepeatField repeatField) {
        if (repeatField != null) {
            this.repeatList.add(repeatField);
        } else {
            hny.u("null repeatField");
        }
    }

    public Vector getRepeatTimes(boolean z) {
        return this.repeatList;
    }

    public qgq0 getTime() {
        return this.timeImpl;
    }

    public void setRepeatTimes(Vector vector) {
        this.repeatList = vector;
    }

    public void setTime(qgq0 qgq0Var) throws wch0 {
        if (qgq0Var == null) {
            ohq.s("The parameter is null");
        } else if (qgq0Var instanceof TimeField) {
            this.timeImpl = (TimeField) qgq0Var;
        } else {
            ohq.s("The parameter is not an instance of TimeField");
        }
    }

    public String toString() {
        String strEncode = this.timeImpl.encode();
        for (int i = 0; i < this.repeatList.size(); i++) {
            RepeatField repeatField = (RepeatField) this.repeatList.elementAt(i);
            StringBuilder sbR = brm0.r(strEncode);
            sbR.append(repeatField.encode());
            strEncode = sbR.toString();
        }
        return strEncode;
    }

    public TimeDescriptionImpl(TimeField timeField) {
        this.timeImpl = timeField;
        this.repeatList = new Vector();
    }
}
