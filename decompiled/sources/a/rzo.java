package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rzo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rzo f31371a;
    private static final ugi0 descriptor;

    static {
        rzo rzoVar = new rzo();
        f31371a = rzoVar;
        zna0 zna0Var = new zna0("org.xplatform.fast_games.impl.data.models.FastGamesRequest", rzoVar, 9);
        zna0Var.j("PlayerId", false);
        zna0Var.j("GameId", false);
        zna0Var.j("Whence", false);
        zna0Var.j("Lang", false);
        zna0Var.j("Ref", false);
        zna0Var.j("LobbyUrl", false);
        zna0Var.j("PlayerBonusId", false);
        zna0Var.j("Domen", false);
        zna0Var.j("Test", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        okx okxVar = okx.f25427a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{s710Var, s710Var, okxVar, ysm0Var, okxVar, ysm0Var, s710Var, ysm0Var, sm8.f32432a};
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
        long jR3 = 0;
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
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iJ = bldVarA.j(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX = bldVarA.x(ugi0Var, 3);
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
                    jR3 = bldVarA.r(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strX3 = bldVarA.x(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    zB = bldVarA.B(ugi0Var, 8);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new tzo(i, jR, jR2, iJ, strX, iJ2, strX2, jR3, strX3, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tzo tzoVar = (tzo) obj;
        tzoVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, tzoVar.f34814a);
        cldVarA.n(ugi0Var, 1, tzoVar.b);
        cldVarA.i(2, tzoVar.c, ugi0Var);
        cldVarA.z(ugi0Var, 3, tzoVar.d);
        cldVarA.i(4, tzoVar.e, ugi0Var);
        cldVarA.z(ugi0Var, 5, tzoVar.f);
        cldVarA.n(ugi0Var, 6, tzoVar.g);
        cldVarA.z(ugi0Var, 7, tzoVar.h);
        cldVarA.x(ugi0Var, 8, tzoVar.i);
        cldVarA.c(ugi0Var);
    }
}
