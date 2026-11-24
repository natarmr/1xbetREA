package a;

/* JADX INFO: loaded from: classes2.dex */
public final class y7f extends kjt {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final y7f DEFAULT_INSTANCE;
    private static volatile iq80 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        y7f y7fVar = new y7f();
        DEFAULT_INSTANCE = y7fVar;
        kjt.p(y7f.class, y7fVar);
    }

    public static x7f r() {
        return (x7f) DEFAULT_INSTANCE.i();
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
                return new y9e0(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new y7f();
            case 4:
                return new x7f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                iq80 iq80Var = PARSER;
                if (iq80Var != null) {
                    return iq80Var;
                }
                synchronized (y7f.class) {
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

    public final void t(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    public final void u(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }
}
