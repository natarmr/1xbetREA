package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j9r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j9r f16152a;
    private static final ugi0 descriptor;

    static {
        j9r j9rVar = new j9r();
        f16152a = j9rVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.request.FruitBlastGameRequest", j9rVar, 3);
        zna0Var.j("BS", true);
        zna0Var.j("BAC", false);
        zna0Var.j("BINF", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(tbl.f33669a), s710.f31729a, mrv.j0(zf8.f44290a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        bg8 bg8Var = null;
        Double d = null;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                bg8Var = (bg8) bldVarA.e(ugi0Var, 2, zf8.f44290a, bg8Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new l9r(i, jR, bg8Var, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l9r l9rVar = (l9r) obj;
        l9rVar.getClass();
        Double d = l9rVar.f19670a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d);
        }
        long j = l9rVar.b;
        bg8 bg8Var = l9rVar.c;
        cldVarA.n(ugi0Var, 1, j);
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 2, zf8.f44290a, bg8Var);
        }
        cldVarA.c(ugi0Var);
    }
}
