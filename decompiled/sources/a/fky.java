package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fky extends jjt {
    private static final fky DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile hq80 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private og9 value_ = og9.b;

    static {
        fky fkyVar = new fky();
        DEFAULT_INSTANCE = fkyVar;
        jjt.u(fky.class, fkyVar);
    }

    public static dky B() {
        return (dky) DEFAULT_INSTANCE.i();
    }

    public static fky x() {
        return DEFAULT_INSTANCE;
    }

    public final og9 A() {
        return this.value_;
    }

    public final void C(eky ekyVar) {
        if (ekyVar != eky.UNRECOGNIZED) {
            this.keyMaterialType_ = ekyVar.f7974a;
        } else {
            ekyVar.getClass();
            jf4.o("Can't get the number of an unknown enum value.");
        }
    }

    public final void D(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public final void E(kg9 kg9Var) {
        this.value_ = kg9Var;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new fky();
            case 4:
                return new dky(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (fky.class) {
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

    public final eky y() {
        eky ekyVar;
        int i = this.keyMaterialType_;
        if (i == 0) {
            ekyVar = eky.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            ekyVar = eky.SYMMETRIC;
        } else if (i == 2) {
            ekyVar = eky.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            ekyVar = i != 4 ? null : eky.REMOTE;
        } else {
            ekyVar = eky.ASYMMETRIC_PUBLIC;
        }
        return ekyVar == null ? eky.UNRECOGNIZED : ekyVar;
    }

    public final String z() {
        return this.typeUrl_;
    }
}
