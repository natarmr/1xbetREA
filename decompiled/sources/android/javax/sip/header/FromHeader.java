package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface FromHeader extends HeaderAddress, Parameters, Header {
    public static final String NAME = "From";

    @Override // android.javax.sip.header.Header
    boolean equals(Object obj);

    String getTag();

    void setTag(String str);
}
