package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p70 extends jjt {
    private static final p70 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        p70 p70Var = new p70();
        DEFAULT_INSTANCE = p70Var;
        jjt.u(p70.class, p70Var);
    }

    public static o70 y() {
        return (o70) DEFAULT_INSTANCE.i();
    }

    public static p70 z(og9 og9Var, qso qsoVar) {
        return (p70) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public final void A() {
        this.keySize_ = 64;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new p70();
            case 4:
                return new o70(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (p70.class) {
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
