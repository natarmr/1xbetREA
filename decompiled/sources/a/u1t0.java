package a;

/* JADX INFO: loaded from: classes2.dex */
public final class u1t0 extends zkx {
    public final /* synthetic */ byte b = 0;

    public u1t0(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // a.r2e
    public final wsy a(ym40 ym40Var) {
        kzj0 kzj0VarI;
        kzj0 kzj0VarI2;
        kzj0 kzj0VarI3;
        kzj0 kzj0VarI4;
        byte b = this.b;
        ym40Var.getClass();
        switch (b) {
            case 0:
                wm40 wm40VarV = obb.V(ym40Var, i4m0.S);
                return (wm40VarV == null || (kzj0VarI = wm40VarV.I()) == null) ? f2o.c(c2o.z, "UByte") : kzj0VarI;
            case 1:
                wm40 wm40VarV2 = obb.V(ym40Var, i4m0.U);
                return (wm40VarV2 == null || (kzj0VarI2 = wm40VarV2.I()) == null) ? f2o.c(c2o.z, "UInt") : kzj0VarI2;
            case 2:
                wm40 wm40VarV3 = obb.V(ym40Var, i4m0.V);
                return (wm40VarV3 == null || (kzj0VarI3 = wm40VarV3.I()) == null) ? f2o.c(c2o.z, "ULong") : kzj0VarI3;
            default:
                wm40 wm40VarV4 = obb.V(ym40Var, i4m0.T);
                return (wm40VarV4 == null || (kzj0VarI4 = wm40VarV4.I()) == null) ? f2o.c(c2o.z, "UShort") : kzj0VarI4;
        }
    }

    @Override // a.r2e
    public final String toString() {
        byte b = this.b;
        Object obj = this.f29728a;
        switch (b) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public u1t0(short s) {
        super(Short.valueOf(s));
    }

    public u1t0(int i) {
        super(Integer.valueOf(i));
    }

    public u1t0(long j) {
        super(Long.valueOf(j));
    }
}
