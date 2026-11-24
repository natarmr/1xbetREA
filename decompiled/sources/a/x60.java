package a;

/* JADX INFO: loaded from: classes2.dex */
public final class x60 extends jjt {
    private static final x60 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        x60 x60Var = new x60();
        DEFAULT_INSTANCE = x60Var;
        jjt.u(x60.class, x60Var);
    }

    public static w60 y() {
        return (w60) DEFAULT_INSTANCE.i();
    }

    public static x60 z(og9 og9Var, qso qsoVar) {
        return (x60) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public final void A(int i) {
        this.keySize_ = i;
    }

    @Override // a.jjt
    public final Object j(int i) {
        hq80 cjtVar;
        switch (hne.E(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new x60();
            case 4:
                return new w60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (x60.class) {
                    try {
                        cjtVar = PARSER;
                        if (cjtVar == null) {
                            cjtVar = new cjt();
                            PARSER = cjtVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cjtVar;
            default:
                e9d0.b();
                return null;
        }
    }

    public final int x() {
        return this.keySize_;
    }
}
