package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l390 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l390 f19348a;
    private static final ugi0 descriptor;

    static {
        l390 l390Var = new l390();
        f19348a = l390Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.core.data.models.PayRotationRequest", l390Var, 6);
        zna0Var.j("CR", false);
        zna0Var.j("BP", false);
        zna0Var.j("GT", false);
        zna0Var.j("BAC", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{okxVar, sm8.f32432a, s710Var, s710Var, ysm0.f43175a, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        boolean zB = false;
        long jR = 0;
        long jR2 = 0;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iJ = bldVarA.j(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    zB = bldVarA.B(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    jR = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    jR2 = bldVarA.r(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iJ2 = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new n390(i, iJ, iJ2, jR, jR2, strX, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n390 n390Var = (n390) obj;
        n390Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, n390Var.f22840a, ugi0Var);
        cldVarA.x(ugi0Var, 1, n390Var.b);
        cldVarA.n(ugi0Var, 2, n390Var.c);
        cldVarA.n(ugi0Var, 3, n390Var.d);
        cldVarA.z(ugi0Var, 4, n390Var.e);
        cldVarA.i(5, n390Var.f, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
