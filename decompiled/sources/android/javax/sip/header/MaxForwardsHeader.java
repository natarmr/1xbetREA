package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface MaxForwardsHeader extends Header {
    public static final String NAME = "Max-Forwards";

    void decrementMaxForwards();

    @Override // android.javax.sip.header.Header
    boolean equals(Object obj);

    int getMaxForwards();

    void setMaxForwards(int i);
}
