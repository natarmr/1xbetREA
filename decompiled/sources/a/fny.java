package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fny extends jjt {
    private static final fny DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile hq80 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private fky keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        fny fnyVar = new fny();
        DEFAULT_INSTANCE = fnyVar;
        jjt.u(fny.class, fnyVar);
    }

    public static eny C() {
        return (eny) DEFAULT_INSTANCE.i();
    }

    public final zky A() {
        zky zkyVar;
        int i = this.status_;
        if (i == 0) {
            zkyVar = zky.UNKNOWN_STATUS;
        } else if (i == 1) {
            zkyVar = zky.ENABLED;
        } else if (i != 2) {
            zkyVar = i != 3 ? null : zky.DESTROYED;
        } else {
            zkyVar = zky.DISABLED;
        }
        return zkyVar == null ? zky.UNRECOGNIZED : zkyVar;
    }

    public final boolean B() {
        return this.keyData_ != null;
    }

    public final void D(fky fkyVar) {
        this.keyData_ = fkyVar;
    }

    public final void E(int i) {
        this.keyId_ = i;
    }

    public final void F(af80 af80Var) {
        this.outputPrefixType_ = af80Var.b();
    }

    public final void G() {
        this.status_ = zky.ENABLED.a();
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new fny();
            case 4:
                return new eny(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (fny.class) {
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

    public final fky x() {
        fky fkyVar = this.keyData_;
        return fkyVar == null ? fky.x() : fkyVar;
    }

    public final int y() {
        return this.keyId_;
    }

    public final af80 z() {
        af80 af80VarA = af80.a(this.outputPrefixType_);
        return af80VarA == null ? af80.UNRECOGNIZED : af80VarA;
    }
}
