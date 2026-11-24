package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface RAckHeader extends Header {
    public static final String NAME = "RAck";

    int getCSeqNumber();

    String getMethod();

    int getRSeqNumber();

    void setCSeqNumber(int i);

    void setMethod(String str);

    void setRSeqNumber(int i);
}
