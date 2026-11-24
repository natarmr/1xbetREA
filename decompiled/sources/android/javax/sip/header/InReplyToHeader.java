package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface InReplyToHeader extends Header {
    public static final String NAME = "In-Reply-To";

    String getCallId();

    void setCallId(String str);
}
