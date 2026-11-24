package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b9t implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b9t f2226a;
    private static final ugi0 descriptor;

    static {
        b9t b9tVar = new b9t();
        f2226a = b9tVar;
        zna0 zna0Var = new zna0("org.xplatform.games_mania.data.models.GamesManiaGetCardRequest", b9tVar, 1);
        zna0Var.j("BAC", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                jR = bldVarA.r(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new d9t(i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d9t d9tVar = (d9t) obj;
        d9tVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, d9tVar.f5718a);
        cldVarA.c(ugi0Var);
    }
}
