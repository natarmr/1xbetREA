package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p9t implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p9t f26624a;
    private static final ugi0 descriptor;

    static {
        p9t p9tVar = new p9t();
        f26624a = p9tVar;
        zna0 zna0Var = new zna0("org.xplatform.games_mania.data.models.GamesManiaPlayGameRequest", p9tVar, 2);
        zna0Var.j("BAC", false);
        zna0Var.j("BS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new r9t(i, jR, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        r9t r9tVar = (r9t) obj;
        r9tVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        long j = r9tVar.f30102a;
        Double d = r9tVar.b;
        cldVarA.n(ugi0Var, 0, j);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
