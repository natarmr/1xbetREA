package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface PriorityHeader extends Header {
    public static final String EMERGENCY = "Emergency";
    public static final String NAME = "Priority";
    public static final String NON_URGENT = "Non-Urgent";
    public static final String NORMAL = "Normal";
    public static final String URGENT = "Urgent";

    String getPriority();

    void setPriority(String str);
}
