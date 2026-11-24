package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class loc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final loc0 f20385a;
    private static final ugi0 descriptor;

    static {
        loc0 loc0Var = new loc0();
        f20385a = loc0Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.core.data.models.PromoRequest", loc0Var, 4);
        zna0Var.j("GT", false);
        zna0Var.j("BAC", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var, ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        long jR = 0;
        long jR2 = 0;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jR2 = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new poc0(i, jR, jR2, strX, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        poc0 poc0Var = (poc0) obj;
        poc0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, poc0Var.f27323a);
        cldVarA.n(ugi0Var, 1, poc0Var.b);
        cldVarA.z(ugi0Var, 2, poc0Var.c);
        cldVarA.i(3, poc0Var.d, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
