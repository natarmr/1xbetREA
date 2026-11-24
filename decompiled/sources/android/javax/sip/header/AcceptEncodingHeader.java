package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface AcceptEncodingHeader extends Parameters, Encoding, Header {
    public static final String NAME = "Accept-Encoding";

    float getQValue();

    void setQValue(float f);
}
