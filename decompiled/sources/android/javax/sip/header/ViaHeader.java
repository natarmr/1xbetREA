package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface ViaHeader extends Parameters, Header {
    public static final String NAME = "Via";

    @Override // android.javax.sip.header.Header
    boolean equals(Object obj);

    String getBranch();

    String getHost();

    String getMAddr();

    int getPort();

    String getProtocol();

    int getRPort();

    String getReceived();

    int getTTL();

    String getTransport();

    void setBranch(String str);

    void setHost(String str);

    void setMAddr(String str);

    void setPort(int i);

    void setProtocol(String str);

    void setRPort();

    void setReceived(String str);

    void setTTL(int i);

    void setTransport(String str);
}
