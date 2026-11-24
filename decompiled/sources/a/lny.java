package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lny extends jjt {
    private static final lny DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile hq80 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        lny lnyVar = new lny();
        DEFAULT_INSTANCE = lnyVar;
        jjt.u(lny.class, lnyVar);
    }

    public static kny y() {
        return (kny) DEFAULT_INSTANCE.i();
    }

    public final void A(af80 af80Var) {
        this.outputPrefixType_ = af80Var.b();
    }

    public final void B(zky zkyVar) {
        this.status_ = zkyVar.a();
    }

    public final void C(String str) {
        str.getClass();
        this.typeUrl_ = str;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new lny();
            case 4:
                return new kny(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (lny.class) {
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
        return this.keyId_;
    }

    public final void z(int i) {
        this.keyId_ = i;
    }
}
