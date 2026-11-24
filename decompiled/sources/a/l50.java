package a;

/* JADX INFO: loaded from: classes2.dex */
public final class l50 extends jjt {
    private static final l50 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER;
    private int keySize_;
    private s50 params_;

    static {
        l50 l50Var = new l50();
        DEFAULT_INSTANCE = l50Var;
        jjt.u(l50.class, l50Var);
    }

    public static l50 A(og9 og9Var, qso qsoVar) {
        return (l50) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static k50 z() {
        return (k50) DEFAULT_INSTANCE.i();
    }

    public final void B() {
        this.keySize_ = 32;
    }

    public final void C(s50 s50Var) {
        this.params_ = s50Var;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new l50();
            case 4:
                return new k50(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (l50.class) {
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

    public final s50 y() {
        s50 s50Var = this.params_;
        return s50Var == null ? s50.x() : s50Var;
    }
}
