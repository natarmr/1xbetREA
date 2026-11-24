package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface RetryAfterHeader extends Header, Parameters {
    public static final String NAME = "Retry-After";

    String getComment();

    int getDuration();

    int getRetryAfter();

    void setComment(String str);

    void setDuration(int i);

    void setRetryAfter(int i);
}
