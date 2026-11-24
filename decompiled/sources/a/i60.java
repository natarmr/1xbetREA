package a;

/* JADX INFO: loaded from: classes2.dex */
public final class i60 extends jjt {
    private static final i60 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private og9 keyValue_ = og9.b;
    private p60 params_;
    private int version_;

    static {
        i60 i60Var = new i60();
        DEFAULT_INSTANCE = i60Var;
        jjt.u(i60.class, i60Var);
    }

    public static h60 A() {
        return (h60) DEFAULT_INSTANCE.i();
    }

    public static i60 B(og9 og9Var, qso qsoVar) {
        return (i60) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public final void C(kg9 kg9Var) {
        this.keyValue_ = kg9Var;
    }

    public final void D(p60 p60Var) {
        p60Var.getClass();
        this.params_ = p60Var;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new i60();
            case 4:
                return new h60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (i60.class) {
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

    public final p60 y() {
        p60 p60Var = this.params_;
        return p60Var == null ? p60.x() : p60Var;
    }

    public final int z() {
        return this.version_;
    }
}
