package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hnj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hnj0 f13356a;
    private static final ugi0 descriptor;

    static {
        hnj0 hnj0Var = new hnj0();
        f13356a = hnj0Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.history.data.model.ShareCouponRequest", hnj0Var, 5);
        zna0Var.j("CfView", false);
        zna0Var.j("CouponId", false);
        zna0Var.j("UseBetCfView", false);
        zna0Var.j("TimeZone", false);
        zna0Var.j("UseTwelveHourTimeFormat", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{okx.f25427a, ysm0.f43175a, sm8Var, tbl.f33669a, sm8Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        boolean zB2 = false;
        String strX = null;
        double dT = 0.0d;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                zB = bldVarA.B(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                dT = bldVarA.t(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                zB2 = bldVarA.B(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new lnj0(i, iJ, strX, zB, dT, zB2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lnj0 lnj0Var = (lnj0) obj;
        lnj0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, lnj0Var.f20348a, ugi0Var);
        cldVarA.z(ugi0Var, 1, lnj0Var.b);
        cldVarA.x(ugi0Var, 2, lnj0Var.c);
        cldVarA.j(ugi0Var, 3, lnj0Var.d);
        cldVarA.x(ugi0Var, 4, lnj0Var.e);
        cldVarA.c(ugi0Var);
    }
}
