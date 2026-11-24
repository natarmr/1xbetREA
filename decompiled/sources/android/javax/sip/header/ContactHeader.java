package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface ContactHeader extends HeaderAddress, Parameters, Header {
    public static final String NAME = "Contact";

    int getExpires();

    float getQValue();

    boolean isWildCard();

    void setExpires(int i);

    void setQValue(float f);

    void setWildCard();
}
