package a;

/* JADX INFO: loaded from: classes2.dex */
public final class x50 extends jjt {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final x50 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER;
    private d60 aesCtrKeyFormat_;
    private ofw hmacKeyFormat_;

    static {
        x50 x50Var = new x50();
        DEFAULT_INSTANCE = x50Var;
        jjt.u(x50.class, x50Var);
    }

    public static x50 A(og9 og9Var, qso qsoVar) {
        return (x50) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static w50 z() {
        return (w50) DEFAULT_INSTANCE.i();
    }

    public final void B(d60 d60Var) {
        this.aesCtrKeyFormat_ = d60Var;
    }

    public final void C(ofw ofwVar) {
        this.hmacKeyFormat_ = ofwVar;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new x50();
            case 4:
                return new w50(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (x50.class) {
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

    public final d60 x() {
        d60 d60Var = this.aesCtrKeyFormat_;
        return d60Var == null ? d60.x() : d60Var;
    }

    public final ofw y() {
        ofw ofwVar = this.hmacKeyFormat_;
        return ofwVar == null ? ofw.x() : ofwVar;
    }
}
