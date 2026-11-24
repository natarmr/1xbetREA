package a;

/* JADX INFO: loaded from: classes2.dex */
public final class pqy extends jjt {
    private static final pqy DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private qqy params_;
    private int version_;

    static {
        pqy pqyVar = new pqy();
        DEFAULT_INSTANCE = pqyVar;
        jjt.u(pqy.class, pqyVar);
    }

    public static pqy A(og9 og9Var, qso qsoVar) {
        return (pqy) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static oqy z() {
        return (oqy) DEFAULT_INSTANCE.i();
    }

    public final void B(qqy qqyVar) {
        qqyVar.getClass();
        this.params_ = qqyVar;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new pqy();
            case 4:
                return new oqy(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (pqy.class) {
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

    public final qqy x() {
        qqy qqyVar = this.params_;
        return qqyVar == null ? qqy.x() : qqyVar;
    }

    public final int y() {
        return this.version_;
    }
}
