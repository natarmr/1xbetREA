package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yve implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yve f43314a;
    private static final ugi0 descriptor;

    static {
        yve yveVar = new yve();
        f43314a = yveVar;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.request.CouponDeleteOrderRequest", yveVar, 6);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Language", false);
        zna0Var.j("BetId", false);
        zna0Var.j("Lng", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{s710Var, s710Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        long jR2 = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX2 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX3 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX4 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new cwe(i, jR, jR2, strX, strX2, strX3, strX4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cwe cweVar = (cwe) obj;
        cweVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, cweVar.f5076a);
        cldVarA.n(ugi0Var, 1, cweVar.b);
        cldVarA.z(ugi0Var, 2, cweVar.c);
        cldVarA.z(ugi0Var, 3, cweVar.d);
        cldVarA.z(ugi0Var, 4, cweVar.e);
        cldVarA.z(ugi0Var, 5, cweVar.f);
        cldVarA.c(ugi0Var);
    }
}
