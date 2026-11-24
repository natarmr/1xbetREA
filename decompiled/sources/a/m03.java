package a;

/* JADX INFO: loaded from: classes2.dex */
public final class m03 extends kjt {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final m03 DEFAULT_INSTANCE;
    private static volatile iq80 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        m03 m03Var = new m03();
        DEFAULT_INSTANCE = m03Var;
        kjt.p(m03.class, m03Var);
    }

    public static l03 r() {
        return (l03) DEFAULT_INSTANCE.i();
    }

    @Override // a.kjt
    public final Object j(int i) {
        iq80 djtVar;
        switch (hne.E(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new y9e0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 3:
                return new m03();
            case 4:
                return new l03(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (m03.class) {
                    try {
                        djtVar = PARSER;
                        if (djtVar == null) {
                            djtVar = new djt();
                            PARSER = djtVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return djtVar;
            default:
                e9d0.b();
                return null;
        }
    }

    public final void s(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    public final void t(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }
}
