package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface AcceptHeader extends MediaType, Parameters, Header {
    public static final String NAME = "Accept";

    boolean allowsAllContentSubTypes();

    boolean allowsAllContentTypes();

    float getQValue();

    void setQValue(float f);
}
