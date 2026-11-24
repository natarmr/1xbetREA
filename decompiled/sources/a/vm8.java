package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vm8 extends r2e {
    public final /* synthetic */ byte b = 1;

    public vm8(double d) {
        super(Double.valueOf(d));
    }

    @Override // a.r2e
    public final wsy a(ym40 ym40Var) {
        switch (this.b) {
            case 0:
                ym40Var.getClass();
                ary aryVarC = ym40Var.c();
                aryVarC.getClass();
                return aryVarC.t(iwb0.BOOLEAN);
            case 1:
                ym40Var.getClass();
                ary aryVarC2 = ym40Var.c();
                aryVarC2.getClass();
                return aryVarC2.t(iwb0.DOUBLE);
            default:
                ym40Var.getClass();
                ary aryVarC3 = ym40Var.c();
                aryVarC3.getClass();
                return aryVarC3.t(iwb0.FLOAT);
        }
    }

    @Override // a.r2e
    public String toString() {
        byte b = this.b;
        Object obj = this.f29728a;
        switch (b) {
            case 1:
                return ((Number) obj).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) obj).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ vm8(Object obj) {
        super(obj);
    }

    public vm8(float f) {
        super(Float.valueOf(f));
    }
}
