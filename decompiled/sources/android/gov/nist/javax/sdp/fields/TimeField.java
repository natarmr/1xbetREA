package android.gov.nist.javax.sdp.fields;

import a.brm0;
import a.ohq;
import a.qgq0;
import a.wch0;
import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class TimeField extends SDPField implements qgq0 {
    protected long startTime;
    protected long stopTime;

    public TimeField() {
        super(SDPFieldNames.TIME_FIELD);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        StringBuilder sb = new StringBuilder(SDPFieldNames.TIME_FIELD);
        sb.append(this.startTime);
        sb.append(Separators.SP);
        return brm0.k(this.stopTime, Separators.NEWLINE, sb);
    }

    public Date getStart() {
        return new Date((this.startTime - 2208988800L) * 1000);
    }

    public long getStartTime() {
        return this.startTime;
    }

    public Date getStop() {
        return new Date((this.stopTime - 2208988800L) * 1000);
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public boolean getTypedTime() {
        return false;
    }

    public boolean isZero() {
        return getStartTime() == 0 && getStopTime() == 0;
    }

    public void setStart(Date date) throws wch0 {
        if (date != null) {
            this.startTime = (date.getTime() / 1000) + 2208988800L;
        } else {
            ohq.s("The date is null");
        }
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStop(Date date) throws wch0 {
        if (date != null) {
            this.stopTime = (date.getTime() / 1000) + 2208988800L;
        } else {
            ohq.s("The date is null");
        }
    }

    public void setStopTime(long j) {
        this.stopTime = j;
    }

    public void setTypedTime(boolean z) {
    }

    public void setZero() {
        setStopTime(0L);
        setStartTime(0L);
    }
}
