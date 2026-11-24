package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s50 extends jjt {
    private static final s50 DEFAULT_INSTANCE;
    private static volatile hq80 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        s50 s50Var = new s50();
        DEFAULT_INSTANCE = s50Var;
        jjt.u(s50.class, s50Var);
    }

    public static s50 x() {
        return DEFAULT_INSTANCE;
    }

    public static r50 z() {
        return (r50) DEFAULT_INSTANCE.i();
    }

    public final void A() {
        this.tagSize_ = 16;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new s50();
            case 4:
                return new r50(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (s50.class) {
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
        return this.tagSize_;
    }
}
