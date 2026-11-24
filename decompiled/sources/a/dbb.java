package a;

/* JADX INFO: loaded from: classes2.dex */
public final class dbb extends jjt {
    private static final dbb DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private og9 keyValue_ = og9.b;
    private int version_;

    static {
        dbb dbbVar = new dbb();
        DEFAULT_INSTANCE = dbbVar;
        jjt.u(dbb.class, dbbVar);
    }

    public static dbb A(og9 og9Var, qso qsoVar) {
        return (dbb) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static cbb z() {
        return (cbb) DEFAULT_INSTANCE.i();
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new dbb();
            case 4:
                return new cbb(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (dbb.class) {
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
