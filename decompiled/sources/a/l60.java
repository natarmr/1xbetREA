package a;

/* JADX INFO: loaded from: classes2.dex */
public final class l60 extends jjt {
    private static final l60 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER;
    private int keySize_;
    private p60 params_;

    static {
        l60 l60Var = new l60();
        DEFAULT_INSTANCE = l60Var;
        jjt.u(l60.class, l60Var);
    }

    public static l60 A(og9 og9Var, qso qsoVar) {
        return (l60) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static k60 z() {
        return (k60) DEFAULT_INSTANCE.i();
    }

    public final void B(int i) {
        this.keySize_ = i;
    }

    public final void C(p60 p60Var) {
        this.params_ = p60Var;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new l60();
            case 4:
                return new k60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (l60.class) {
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

    public final p60 y() {
        p60 p60Var = this.params_;
        return p60Var == null ? p60.x() : p60Var;
    }
}
