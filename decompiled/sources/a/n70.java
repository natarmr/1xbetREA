package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n70 extends jjt {
    private static final n70 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private og9 keyValue_ = og9.b;
    private int version_;

    static {
        n70 n70Var = new n70();
        DEFAULT_INSTANCE = n70Var;
        jjt.u(n70.class, n70Var);
    }

    public static n70 A(og9 og9Var, qso qsoVar) {
        return (n70) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static m70 z() {
        return (m70) DEFAULT_INSTANCE.i();
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
                return new n70();
            case 4:
                return new m70(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (n70.class) {
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
