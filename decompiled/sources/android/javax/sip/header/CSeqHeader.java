package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface CSeqHeader extends Header {
    public static final String NAME = "CSeq";

    @Override // android.javax.sip.header.Header
    boolean equals(Object obj);

    String getMethod();

    long getSeqNumber();

    int getSequenceNumber();

    void setMethod(String str);

    void setSeqNumber(long j);

    void setSequenceNumber(int i);
}
