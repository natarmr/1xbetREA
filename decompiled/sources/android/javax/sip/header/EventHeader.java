package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface EventHeader extends Parameters, Header {
    public static final String NAME = "Event";

    String getEventId();

    String getEventType();

    void setEventId(String str);

    void setEventType(String str);
}
