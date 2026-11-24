package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tv0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tv0 f34575a;
    private static final ugi0 descriptor;

    static {
        tv0 tv0Var = new tv0();
        f34575a = tv0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.game.impl.game.data.models.AggregatorGameRequestUnAuthRequest", tv0Var, 9);
        zna0Var.j("Demo", false);
        zna0Var.j("Domen", false);
        zna0Var.j("GameId", false);
        zna0Var.j("Whence", false);
        zna0Var.j("RefId", false);
        zna0Var.j("Lang", false);
        zna0Var.j("LobbyUrl", false);
        zna0Var.j("SubCategoryId", false);
        zna0Var.j("metrics", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(mu0.f22390a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{sm8.f32432a, ysm0Var, s710.f31729a, okxVar, okxVar, ysm0Var, ysm0Var, jiyVarJ0, jiyVarJ1};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        ou0 ou0Var = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        long jR = 0;
        int i = 0;
        boolean zB = false;
        int iJ = 0;
        int iJ2 = 0;
        boolean z = true;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zB = bldVarA.B(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    jR = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iJ = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ2 = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX2 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strX3 = bldVarA.x(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num);
                    i |= 128;
                    break;
                case 8:
                    ou0Var = (ou0) bldVarA.e(ugi0Var, 8, mu0.f22390a, ou0Var);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new vv0(i, zB, strX, jR, iJ, iJ2, strX2, strX3, num, ou0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vv0 vv0Var = (vv0) obj;
        vv0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.x(ugi0Var, 0, vv0Var.f38074a);
        cldVarA.z(ugi0Var, 1, vv0Var.b);
        cldVarA.n(ugi0Var, 2, vv0Var.c);
        cldVarA.i(3, vv0Var.d, ugi0Var);
        cldVarA.i(4, vv0Var.e, ugi0Var);
        cldVarA.z(ugi0Var, 5, vv0Var.f);
        cldVarA.z(ugi0Var, 6, vv0Var.g);
        cldVarA.p(ugi0Var, 7, okx.f25427a, vv0Var.h);
        cldVarA.p(ugi0Var, 8, mu0.f22390a, vv0Var.i);
        cldVarA.c(ugi0Var);
    }
}
