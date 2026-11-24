package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lfw extends jjt {
    private static final lfw DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private og9 keyValue_ = og9.b;
    private sfw params_;
    private int version_;

    static {
        lfw lfwVar = new lfw();
        DEFAULT_INSTANCE = lfwVar;
        jjt.u(lfw.class, lfwVar);
    }

    public static kfw B() {
        return (kfw) DEFAULT_INSTANCE.i();
    }

    public static lfw C(og9 og9Var, qso qsoVar) {
        return (lfw) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static lfw x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.version_;
    }

    public final void D(kg9 kg9Var) {
        this.keyValue_ = kg9Var;
    }

    public final void E(sfw sfwVar) {
        sfwVar.getClass();
        this.params_ = sfwVar;
    }

    public final void F() {
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
                return new lfw();
            case 4:
                return new kfw(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (lfw.class) {
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

    public final sfw z() {
        sfw sfwVar = this.params_;
        return sfwVar == null ? sfw.x() : sfwVar;
    }
}
