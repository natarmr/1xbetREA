package a;

/* JADX INFO: loaded from: classes2.dex */
public final class p60 extends jjt {
    private static final p60 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER;
    private int ivSize_;

    static {
        p60 p60Var = new p60();
        DEFAULT_INSTANCE = p60Var;
        jjt.u(p60.class, p60Var);
    }

    public static p60 x() {
        return DEFAULT_INSTANCE;
    }

    public static o60 z() {
        return (o60) DEFAULT_INSTANCE.i();
    }

    public final void A() {
        this.ivSize_ = 16;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new p60();
            case 4:
                return new o60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (p60.class) {
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
        return this.ivSize_;
    }
}
