package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fpn0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fpn0 f9937a;
    private static final ugi0 descriptor;

    static {
        fpn0 fpn0Var = new fpn0();
        f9937a = fpn0Var;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.domain.model.SwipeXFilterSportsModel", fpn0Var, 8);
        zna0Var.j("sportId", false);
        zna0Var.j("sportName", false);
        zna0Var.j("subSportId", false);
        zna0Var.j("subSportName", false);
        zna0Var.j("champsCount", false);
        zna0Var.j("selected", false);
        zna0Var.j("isCyber", false);
        zna0Var.j("imageUrl", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{s710Var, ysm0Var, s710Var, ysm0Var, okx.f25427a, sm8Var, sm8Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        boolean zB2 = false;
        long jR = 0;
        long jR2 = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
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
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    jR2 = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX2 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zB = bldVarA.B(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    zB2 = bldVarA.B(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strX3 = bldVarA.x(ugi0Var, 7);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new hpn0(i, jR, strX, jR2, strX2, iJ, zB, zB2, strX3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hpn0 hpn0Var = (hpn0) obj;
        hpn0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, hpn0Var.f13452a);
        cldVarA.z(ugi0Var, 1, hpn0Var.b);
        cldVarA.n(ugi0Var, 2, hpn0Var.c);
        cldVarA.z(ugi0Var, 3, hpn0Var.d);
        cldVarA.i(4, hpn0Var.e, ugi0Var);
        cldVarA.x(ugi0Var, 5, hpn0Var.f);
        cldVarA.x(ugi0Var, 6, hpn0Var.g);
        cldVarA.z(ugi0Var, 7, hpn0Var.h);
        cldVarA.c(ugi0Var);
    }
}
