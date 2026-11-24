package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gv6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gv6 f11962a;
    private static final ugi0 descriptor;

    static {
        gv6 gv6Var = new gv6();
        f11962a = gv6Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.bets.data.models.BetEventRequest", gv6Var, 6);
        zna0Var.j("Coef", false);
        zna0Var.j("GameId", false);
        zna0Var.j("Kind", false);
        zna0Var.j("Param", false);
        zna0Var.j("PlayerId", false);
        zna0Var.j("Type", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        s710 s710Var = s710.f31729a;
        okx okxVar = okx.f25427a;
        return new jiy[]{ysm0Var, s710Var, okxVar, ysm0Var, okxVar, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        String strX2 = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
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
                    jR = bldVarA.r(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iJ = bldVarA.j(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX2 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ2 = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jR2 = bldVarA.r(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new iv6(i, strX, jR, iJ, strX2, iJ2, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iv6 iv6Var = (iv6) obj;
        iv6Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, iv6Var.f15431a);
        cldVarA.n(ugi0Var, 1, iv6Var.b);
        cldVarA.i(2, iv6Var.c, ugi0Var);
        cldVarA.z(ugi0Var, 3, iv6Var.d);
        cldVarA.i(4, iv6Var.e, ugi0Var);
        cldVarA.n(ugi0Var, 5, iv6Var.f);
        cldVarA.c(ugi0Var);
    }
}
