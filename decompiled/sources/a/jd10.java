package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jd10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jd10 f16307a;
    private static final ugi0 descriptor;

    static {
        jd10 jd10Var = new jd10();
        f16307a = jd10Var;
        zna0 zna0Var = new zna0("org.xplatform.lotto.impl.data.models.LottoRequest", jd10Var, 10);
        zna0Var.j("GameId", false);
        zna0Var.j("Whence", false);
        zna0Var.j("Lang", false);
        zna0Var.j("LobbyUrl", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("PlayerBonusId", false);
        zna0Var.j("Domen", false);
        zna0Var.j("Demo", false);
        zna0Var.j("SubCategoryId", false);
        zna0Var.j("metrics", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{s710Var, okxVar, ysm0Var, ysm0Var, ysm0Var, s710Var, ysm0Var, sm8.f32432a, jiyVarJ0, mu0.f22390a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        long jR = 0;
        long jR2 = 0;
        Integer num = null;
        ou0 ou0Var = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
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
                    jR2 = bldVarA.r(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strX4 = bldVarA.x(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    zB = bldVarA.B(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    break;
                case 9:
                    ou0Var = (ou0) bldVarA.m(ugi0Var, 9, mu0.f22390a, ou0Var);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ld10(i, jR, iJ, strX, strX2, strX3, jR2, strX4, zB, num, ou0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ld10 ld10Var = (ld10) obj;
        ld10Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, ld10Var.f19827a);
        cldVarA.i(1, ld10Var.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, ld10Var.c);
        cldVarA.z(ugi0Var, 3, ld10Var.d);
        cldVarA.z(ugi0Var, 4, ld10Var.e);
        cldVarA.n(ugi0Var, 5, ld10Var.f);
        cldVarA.z(ugi0Var, 6, ld10Var.g);
        cldVarA.x(ugi0Var, 7, ld10Var.h);
        cldVarA.p(ugi0Var, 8, okx.f25427a, ld10Var.i);
        cldVarA.m(ugi0Var, 9, mu0.f22390a, ld10Var.j);
        cldVarA.c(ugi0Var);
    }
}
