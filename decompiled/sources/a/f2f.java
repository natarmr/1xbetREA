package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f2f implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2f f8809a;
    private static final ugi0 descriptor;

    static {
        f2f f2fVar = new f2f();
        f8809a = f2fVar;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.request.CouponScannerRequest", f2fVar, 6);
        zna0Var.j("Language", false);
        zna0Var.j("CfView", false);
        zna0Var.j("BetId", false);
        zna0Var.j("CalculateSaleInfo", false);
        zna0Var.j("FCountry", false);
        zna0Var.j("FillOutRusNames", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{ysm0Var, okxVar, ysm0Var, sm8Var, okxVar, sm8Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        int iJ2 = 0;
        boolean zB2 = false;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX2 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zB = bldVarA.B(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ2 = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zB2 = bldVarA.B(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new h2f(i, strX, iJ, strX2, zB, iJ2, zB2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h2f h2fVar = (h2f) obj;
        h2fVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, h2fVar.f12329a);
        cldVarA.i(1, h2fVar.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, h2fVar.c);
        cldVarA.x(ugi0Var, 3, h2fVar.d);
        cldVarA.i(4, h2fVar.e, ugi0Var);
        cldVarA.x(ugi0Var, 5, h2fVar.f);
        cldVarA.c(ugi0Var);
    }
}
