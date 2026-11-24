package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xxv0 extends jjt {
    private static final xxv0 DEFAULT_INSTANCE;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        xxv0 xxv0Var = new xxv0();
        DEFAULT_INSTANCE = xxv0Var;
        jjt.u(xxv0.class, xxv0Var);
    }

    public static xxv0 x() {
        return DEFAULT_INSTANCE;
    }

    public static xxv0 y(og9 og9Var, qso qsoVar) {
        return (xxv0) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new xxv0();
            case 4:
                return new fbb(DEFAULT_INSTANCE, (byte) 5);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (xxv0.class) {
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
}
