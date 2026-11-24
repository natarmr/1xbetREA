package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface SubscriptionStateHeader extends Parameters, Header {
    public static final String ACTIVE = "active";
    public static final String DEACTIVATED = "deactivated";
    public static final String GIVE_UP = "giveup";
    public static final String NAME = "Subscription-State";
    public static final String NO_RESOURCE = "noresource";
    public static final String PENDING = "pending";
    public static final String PROBATION = "probation";
    public static final String REJECTED = "rejected";
    public static final String TERMINATED = "terminated";
    public static final String TIMEOUT = "timeout";
    public static final String UNKNOWN = "unknown";

    int getExpires();

    String getReasonCode();

    int getRetryAfter();

    String getState();

    void setExpires(int i);

    void setReasonCode(String str);

    void setRetryAfter(int i);

    void setState(String str);
}
