package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hft implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hft f12985a;
    private static final ugi0 descriptor;

    static {
        hft hftVar = new hft();
        f12985a = hftVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.request.GemsOdysseyGameRequest", hftVar, 6);
        zna0Var.j("UI", false);
        zna0Var.j("BINF", true);
        zna0Var.j("BS", true);
        zna0Var.j("BAC", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(zf8.f44290a);
        jiy jiyVarJ1 = mrv.j0(tbl.f33669a);
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, jiyVarJ0, jiyVarJ1, s710Var, ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        long jR = 0;
        long jR2 = 0;
        bg8 bg8Var = null;
        Double d = null;
        String strX = null;
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
                    bg8Var = (bg8) bldVarA.e(ugi0Var, 1, zf8.f44290a, bg8Var);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
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
                    iJ = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new jft(i, jR, bg8Var, d, jR2, strX, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jft jftVar = (jft) obj;
        jftVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        long j = jftVar.f16445a;
        Double d = jftVar.c;
        bg8 bg8Var = jftVar.b;
        cldVarA.n(ugi0Var, 0, j);
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 1, zf8.f44290a, bg8Var);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.n(ugi0Var, 3, jftVar.d);
        cldVarA.z(ugi0Var, 4, jftVar.e);
        cldVarA.i(5, jftVar.f, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
