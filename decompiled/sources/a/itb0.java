package a;

/* JADX INFO: loaded from: classes2.dex */
public final class itb0 extends mjt {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final itb0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile jq80 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        itb0 itb0Var = new itb0();
        DEFAULT_INSTANCE = itb0Var;
        mjt.j(itb0.class, itb0Var);
    }

    public static itb0 n() {
        return DEFAULT_INSTANCE;
    }

    public static htb0 v() {
        return (htb0) ((bjt) DEFAULT_INSTANCE.c(5));
    }

    public final void A(int i) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i);
    }

    public final void B(long j) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j);
    }

    public final void C(String str) {
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void D(gtb0 gtb0Var) {
        this.value_ = gtb0Var;
        this.valueCase_ = 6;
    }

    @Override // a.mjt
    public final Object c(int i) {
        jq80 ejtVar;
        switch (hne.E(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z9e0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", gtb0.class});
            case 3:
                return new itb0();
            case 4:
                return new htb0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jq80 jq80Var = PARSER;
                if (jq80Var != null) {
                    return jq80Var;
                }
                synchronized (itb0.class) {
                    try {
                        ejtVar = PARSER;
                        if (ejtVar == null) {
                            ejtVar = new ejt();
                            PARSER = ejtVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ejtVar;
            default:
                e9d0.b();
                return null;
        }
    }

    public final boolean l() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final mg9 m() {
        return this.valueCase_ == 8 ? (mg9) this.value_ : mg9.c;
    }

    public final double o() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float p() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int q() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long r() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String s() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final gtb0 t() {
        return this.valueCase_ == 6 ? (gtb0) this.value_ : gtb0.m();
    }

    public final int u() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final void w(boolean z) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z);
    }

    public final void x(mg9 mg9Var) {
        this.valueCase_ = 8;
        this.value_ = mg9Var;
    }

    public final void y(double d) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d);
    }

    public final void z(float f) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f);
    }
}
