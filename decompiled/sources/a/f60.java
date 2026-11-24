package a;

/* JADX INFO: loaded from: classes2.dex */
public final class f60 extends jjt {
    private static final f60 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER;
    private int ivSize_;

    static {
        f60 f60Var = new f60();
        DEFAULT_INSTANCE = f60Var;
        jjt.u(f60.class, f60Var);
    }

    public static f60 x() {
        return DEFAULT_INSTANCE;
    }

    public static e60 z() {
        return (e60) DEFAULT_INSTANCE.i();
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
                return new f60();
            case 4:
                return new e60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (f60.class) {
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
