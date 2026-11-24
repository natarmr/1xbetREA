package a;

/* JADX INFO: loaded from: classes2.dex */
public final class b60 extends jjt {
    private static final b60 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private og9 keyValue_ = og9.b;
    private f60 params_;
    private int version_;

    static {
        b60 b60Var = new b60();
        DEFAULT_INSTANCE = b60Var;
        jjt.u(b60.class, b60Var);
    }

    public static a60 B() {
        return (a60) DEFAULT_INSTANCE.i();
    }

    public static b60 x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.version_;
    }

    public final void C(kg9 kg9Var) {
        this.keyValue_ = kg9Var;
    }

    public final void D(f60 f60Var) {
        f60Var.getClass();
        this.params_ = f60Var;
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
                return new b60();
            case 4:
                return new a60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (b60.class) {
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

    public final og9 y() {
        return this.keyValue_;
    }

    public final f60 z() {
        f60 f60Var = this.params_;
        return f60Var == null ? f60.x() : f60Var;
    }
}
