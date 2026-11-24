package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ln7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ln7 f20330a;
    private static final ugi0 descriptor;

    static {
        ln7 ln7Var = new ln7();
        f20330a = ln7Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.BetSystemResponse", ln7Var, 4);
        zna0Var.j("b", true);
        zna0Var.j("c", true);
        zna0Var.j("p", true);
        zna0Var.j("s", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new nn7(i, num, num2, num3, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nn7 nn7Var = (nn7) obj;
        nn7Var.getClass();
        Double d = nn7Var.d;
        Integer num = nn7Var.c;
        Integer num2 = nn7Var.b;
        Integer num3 = nn7Var.f23806a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
