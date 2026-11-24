package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface TimeStampHeader extends Header {
    public static final String NAME = "Timestamp";

    float getDelay();

    long getTime();

    int getTimeDelay();

    float getTimeStamp();

    void setDelay(float f);

    void setTime(long j);

    void setTimeDelay(int i);

    void setTimeStamp(float f);
}
