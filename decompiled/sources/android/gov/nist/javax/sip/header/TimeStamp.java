package android.gov.nist.javax.sip.header;

import a.itt0;
import a.twn;
import android.gov.nist.core.Separators;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.TimeStampHeader;

/* JADX INFO: loaded from: classes.dex */
public class TimeStamp extends SIPHeader implements TimeStampHeader {
    private static final long serialVersionUID = -3711322366481232720L;
    protected int delay;
    protected float delayFloat;
    protected long timeStamp;
    private float timeStampFloat;

    public TimeStamp() {
        super("Timestamp");
        this.timeStamp = -1L;
        this.delayFloat = -1.0f;
        this.timeStampFloat = -1.0f;
        this.delay = -1;
    }

    private String getDelayAsString() {
        int i = this.delay;
        if (i == -1 && this.delayFloat == -1.0f) {
            return "";
        }
        return i != -1 ? Integer.toString(i) : Float.toString(this.delayFloat);
    }

    private String getTimeStampAsString() {
        long j = this.timeStamp;
        if (j == -1 && this.timeStampFloat == -1.0f) {
            return "";
        }
        return j != -1 ? Long.toString(j) : Float.toString(this.timeStampFloat);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String timeStampAsString = getTimeStampAsString();
        String delayAsString = getDelayAsString();
        if (timeStampAsString.equals("") && delayAsString.equals("")) {
            sb.append("");
            return sb;
        }
        if (!timeStampAsString.equals("")) {
            sb.append(timeStampAsString);
        }
        if (!delayAsString.equals("")) {
            sb.append(Separators.SP);
            sb.append(delayAsString);
        }
        return sb;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public float getDelay() {
        float f = this.delayFloat;
        return f == -1.0f ? this.delay : f;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public long getTime() {
        long j = this.timeStamp;
        return j == -1 ? (long) this.timeStampFloat : j;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public int getTimeDelay() {
        int i = this.delay;
        return i == -1 ? (int) this.delayFloat : i;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public float getTimeStamp() {
        float f = this.timeStampFloat;
        return f == -1.0f ? this.timeStamp : f;
    }

    public boolean hasDelay() {
        return this.delay != -1;
    }

    public void removeDelay() {
        this.delay = -1;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public void setDelay(float f) throws InvalidArgumentException {
        if (f < 0.0f && f != -1.0f) {
            itt0.r("JAIN-SIP Exception, TimeStamp, setDelay(), the delay parameter is <0");
        } else {
            this.delayFloat = f;
            this.delay = -1;
        }
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public void setTime(long j) throws InvalidArgumentException {
        if (j < -1) {
            itt0.r("Illegal timestamp");
        } else {
            this.timeStamp = j;
            this.timeStampFloat = -1.0f;
        }
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public void setTimeDelay(int i) throws InvalidArgumentException {
        if (i < -1) {
            throw new InvalidArgumentException(twn.m(i, "Value out of range "));
        }
        this.delay = i;
        this.delayFloat = -1.0f;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public void setTimeStamp(float f) {
        if (f < 0.0f) {
            itt0.r("JAIN-SIP Exception, TimeStamp, setTimeStamp(), the timeStamp parameter is <0");
        } else {
            this.timeStamp = -1L;
            this.timeStampFloat = f;
        }
    }
}
