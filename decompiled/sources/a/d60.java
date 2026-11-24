package a;

/* JADX INFO: loaded from: classes2.dex */
public final class d60 extends jjt {
    private static final d60 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER;
    private int keySize_;
    private f60 params_;

    static {
        d60 d60Var = new d60();
        DEFAULT_INSTANCE = d60Var;
        jjt.u(d60.class, d60Var);
    }

    public static c60 A() {
        return (c60) DEFAULT_INSTANCE.i();
    }

    public static d60 x() {
        return DEFAULT_INSTANCE;
    }

    public final void B(int i) {
        this.keySize_ = i;
    }

    public final void C(f60 f60Var) {
        this.params_ = f60Var;
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
                return new d60();
            case 4:
                return new c60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (d60.class) {
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

    public final int y() {
        return this.keySize_;
    }

    public final f60 z() {
        f60 f60Var = this.params_;
        return f60Var == null ? f60.x() : f60Var;
    }
}
