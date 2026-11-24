package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gbb extends jjt {
    private static final gbb DEFAULT_INSTANCE;
    private static volatile hq80 PARSER;

    static {
        gbb gbbVar = new gbb();
        DEFAULT_INSTANCE = gbbVar;
        jjt.u(gbb.class, gbbVar);
    }

    public static gbb x() {
        return DEFAULT_INSTANCE;
    }

    public static gbb y(og9 og9Var, qso qsoVar) {
        return (gbb) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new gbb();
            case 4:
                return new fbb(DEFAULT_INSTANCE, (byte) 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (gbb.class) {
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
