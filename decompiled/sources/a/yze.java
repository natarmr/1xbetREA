package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yze implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yze f43511a;
    private static final ugi0 descriptor;

    static {
        yze yzeVar = new yze();
        f43511a = yzeVar;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.request.CouponMakeSaleRequest", yzeVar, 10);
        zna0Var.j("BetId", false);
        zna0Var.j("Language", false);
        zna0Var.j("Lng", false);
        zna0Var.j("SaleSum", false);
        zna0Var.j("RemainingSum", false);
        zna0Var.j("betGUID", false);
        zna0Var.j("AutoSaleOrder", false);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        tbl tblVar = tbl.f33669a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, ysm0Var, ysm0Var, tblVar, tblVar, jiyVarJ1, tblVar, s710Var, s710Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        double dT = 0.0d;
        double dT2 = 0.0d;
        double dT3 = 0.0d;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX2 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    dT = bldVarA.t(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    dT2 = bldVarA.t(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str2);
                    i |= 32;
                    break;
                case 6:
                    dT3 = bldVarA.t(ugi0Var, 6);
                    i |= 64;
                    continue;
                case 7:
                    jR = bldVarA.r(ugi0Var, 7);
                    i |= 128;
                    continue;
                case 8:
                    jR2 = bldVarA.r(ugi0Var, 8);
                    i |= 256;
                    continue;
                case 9:
                    strX3 = bldVarA.x(ugi0Var, 9);
                    i |= 512;
                    continue;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new c0f(dT, dT2, dT3, i, jR, jR2, str, strX, strX2, str2, strX3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c0f c0fVar = (c0f) obj;
        c0fVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        ysm0 ysm0Var = ysm0.f43175a;
        cldVarA.p(ugi0Var, 0, ysm0Var, c0fVar.f3522a);
        cldVarA.z(ugi0Var, 1, c0fVar.b);
        cldVarA.z(ugi0Var, 2, c0fVar.c);
        cldVarA.j(ugi0Var, 3, c0fVar.d);
        cldVarA.j(ugi0Var, 4, c0fVar.e);
        cldVarA.p(ugi0Var, 5, ysm0Var, c0fVar.f);
        cldVarA.j(ugi0Var, 6, c0fVar.g);
        cldVarA.n(ugi0Var, 7, c0fVar.h);
        cldVarA.n(ugi0Var, 8, c0fVar.i);
        cldVarA.z(ugi0Var, 9, c0fVar.j);
        cldVarA.c(ugi0Var);
    }
}
