package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ofw extends jjt {
    private static final ofw DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private sfw params_;
    private int version_;

    static {
        ofw ofwVar = new ofw();
        DEFAULT_INSTANCE = ofwVar;
        jjt.u(ofw.class, ofwVar);
    }

    public static nfw A() {
        return (nfw) DEFAULT_INSTANCE.i();
    }

    public static ofw B(og9 og9Var, qso qsoVar) {
        return (ofw) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static ofw x() {
        return DEFAULT_INSTANCE;
    }

    public final void C(int i) {
        this.keySize_ = i;
    }

    public final void D(sfw sfwVar) {
        this.params_ = sfwVar;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new ofw();
            case 4:
                return new nfw(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (ofw.class) {
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
        return this.keySize_;
    }

    public final sfw z() {
        sfw sfwVar = this.params_;
        return sfwVar == null ? sfw.x() : sfwVar;
    }
}
