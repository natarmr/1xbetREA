package a;

/* JADX INFO: loaded from: classes2.dex */
public final class g70 extends jjt {
    private static final g70 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    static {
        g70 g70Var = new g70();
        DEFAULT_INSTANCE = g70Var;
        jjt.u(g70.class, g70Var);
    }

    public static f70 y() {
        return (f70) DEFAULT_INSTANCE.i();
    }

    public static g70 z(og9 og9Var, qso qsoVar) {
        return (g70) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public final void A(int i) {
        this.keySize_ = i;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 3:
                return new g70();
            case 4:
                return new f70(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (g70.class) {
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

    public final int x() {
        return this.keySize_;
    }
}
