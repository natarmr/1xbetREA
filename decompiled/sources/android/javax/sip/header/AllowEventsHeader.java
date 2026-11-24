package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface AllowEventsHeader extends Header {
    public static final String NAME = "Allow-Events";

    String getEventType();

    void setEventType(String str);
}
