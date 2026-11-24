package a;

/* JADX INFO: loaded from: classes2.dex */
public final class v50 extends jjt {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final v50 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile hq80 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b60 aesCtrKey_;
    private lfw hmacKey_;
    private int version_;

    static {
        v50 v50Var = new v50();
        DEFAULT_INSTANCE = v50Var;
        jjt.u(v50.class, v50Var);
    }

    public static u50 A() {
        return (u50) DEFAULT_INSTANCE.i();
    }

    public static v50 B(og9 og9Var, qso qsoVar) {
        return (v50) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public final void C(b60 b60Var) {
        b60Var.getClass();
        this.aesCtrKey_ = b60Var;
    }

    public final void D(lfw lfwVar) {
        lfwVar.getClass();
        this.hmacKey_ = lfwVar;
    }

    public final void E() {
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new v50();
            case 4:
                return new u50(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (v50.class) {
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

    public final b60 x() {
        b60 b60Var = this.aesCtrKey_;
        return b60Var == null ? b60.x() : b60Var;
    }

    public final lfw y() {
        lfw lfwVar = this.hmacKey_;
        return lfwVar == null ? lfw.x() : lfwVar;
    }

    public final int z() {
        return this.version_;
    }
}
