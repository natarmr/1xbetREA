package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ym00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ym00 f42864a;
    private static final ugi0 descriptor;

    static {
        ym00 ym00Var = new ym00();
        f42864a = ym00Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.load_coupon.data.model.LoadCouponWithUserIdRequest", ym00Var, 5);
        zna0Var.j("UserId", false);
        zna0Var.j("Guid", false);
        zna0Var.j("Lng", false);
        zna0Var.j("partner", false);
        zna0Var.j("CfView", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710.f31729a, ysm0Var, ysm0Var, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        long jR = 0;
        String strX = null;
        String strX2 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                iJ = bldVarA.j(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new an00(i, jR, strX, strX2, iJ, iJ2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        an00 an00Var = (an00) obj;
        an00Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, an00Var.f1127a);
        cldVarA.z(ugi0Var, 1, an00Var.b);
        cldVarA.z(ugi0Var, 2, an00Var.c);
        cldVarA.i(3, an00Var.d, ugi0Var);
        cldVarA.i(4, an00Var.e, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
