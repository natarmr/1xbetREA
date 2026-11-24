package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bn00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bn00 f2858a;
    private static final ugi0 descriptor;

    static {
        bn00 bn00Var = new bn00();
        f2858a = bn00Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.load_coupon.data.model.LoadCouponWithoutUserIdRequest", bn00Var, 4);
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
        return new jiy[]{ysm0Var, ysm0Var, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iJ = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new dn00(strX, i, iJ, iJ2, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dn00 dn00Var = (dn00) obj;
        dn00Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, dn00Var.f6344a);
        cldVarA.z(ugi0Var, 1, dn00Var.b);
        cldVarA.i(2, dn00Var.c, ugi0Var);
        cldVarA.i(3, dn00Var.d, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
