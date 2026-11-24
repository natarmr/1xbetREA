package a;

/* JADX INFO: loaded from: classes2.dex */
public final class i50 extends jjt {
    private static final i50 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private og9 keyValue_ = og9.b;
    private s50 params_;
    private int version_;

    static {
        i50 i50Var = new i50();
        DEFAULT_INSTANCE = i50Var;
        jjt.u(i50.class, i50Var);
    }

    public static h50 A() {
        return (h50) DEFAULT_INSTANCE.i();
    }

    public static i50 B(og9 og9Var, qso qsoVar) {
        return (i50) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public final void C(kg9 kg9Var) {
        this.keyValue_ = kg9Var;
    }

    public final void D(s50 s50Var) {
        s50Var.getClass();
        this.params_ = s50Var;
    }

    public final void E() {
        this.version_ = 0;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new i50();
            case 4:
                return new h50(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (i50.class) {
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

    public final og9 x() {
        return this.keyValue_;
    }

    public final s50 y() {
        s50 s50Var = this.params_;
        return s50Var == null ? s50.x() : s50Var;
    }

    public final int z() {
        return this.version_;
    }
}
