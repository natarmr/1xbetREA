package a;

/* JADX INFO: loaded from: classes.dex */
public interface xpg0 extends AutoCloseable {
    default boolean B0() {
        return getLong(0) != 0;
    }

    String J0(int i);

    boolean W0();

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    void i(byte[] bArr, int i);

    boolean isNull(int i);

    void o(int i, long j);

    void p(double d, int i);

    void reset();

    void s(int i);

    void t();

    void z(int i, String str);
}
