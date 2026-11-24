package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bly extends jjt {
    private static final bly DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile hq80 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private og9 value_ = og9.b;

    static {
        bly blyVar = new bly();
        DEFAULT_INSTANCE = blyVar;
        jjt.u(bly.class, blyVar);
    }

    public static aly B() {
        return (aly) DEFAULT_INSTANCE.i();
    }

    public static bly x() {
        return DEFAULT_INSTANCE;
    }

    public final og9 A() {
        return this.value_;
    }

    public final void C(af80 af80Var) {
        this.outputPrefixType_ = af80Var.b();
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new bly();
            case 4:
                return new aly(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (bly.class) {
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

    public final af80 y() {
        af80 af80VarA = af80.a(this.outputPrefixType_);
        return af80VarA == null ? af80.UNRECOGNIZED : af80VarA;
    }

    public final String z() {
        return this.typeUrl_;
    }
}
