package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qqy extends jjt {
    private static final qqy DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER;
    private String keyUri_ = "";

    static {
        qqy qqyVar = new qqy();
        DEFAULT_INSTANCE = qqyVar;
        jjt.u(qqy.class, qqyVar);
    }

    public static qqy x() {
        return DEFAULT_INSTANCE;
    }

    public static qqy z(og9 og9Var, qso qsoVar) {
        return (qqy) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new qqy();
            case 4:
                return new fbb(DEFAULT_INSTANCE, (byte) 2);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (qqy.class) {
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

    public final String y() {
        return this.keyUri_;
    }
}
