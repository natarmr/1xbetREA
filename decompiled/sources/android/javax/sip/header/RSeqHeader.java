package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface RSeqHeader extends Header {
    public static final String NAME = "RSeq";

    int getSequenceNumber();

    void setSequenceNumber(int i);
}
