package a;

/* JADX INFO: loaded from: classes2.dex */
public final class u60 extends jjt {
    private static final u60 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private og9 keyValue_ = og9.b;
    private int version_;

    static {
        u60 u60Var = new u60();
        DEFAULT_INSTANCE = u60Var;
        jjt.u(u60.class, u60Var);
    }

    public static u60 A(og9 og9Var, qso qsoVar) {
        return (u60) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static t60 z() {
        return (t60) DEFAULT_INSTANCE.i();
    }

    public final void B(kg9 kg9Var) {
        this.keyValue_ = kg9Var;
    }

    public final void C() {
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new u60();
            case 4:
                return new t60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (u60.class) {
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

    public final int y() {
        return this.version_;
    }
}
