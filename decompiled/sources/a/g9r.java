package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g9r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g9r f10930a;
    private static final ugi0 descriptor;

    static {
        g9r g9rVar = new g9r();
        f10930a = g9rVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.fruit_blast.FruitBlastCoefResponse", g9rVar, 1);
        zna0Var.j("EL", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(d9r.f5715a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        f9r f9rVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                f9rVar = (f9r) bldVarA.e(ugi0Var, 0, d9r.f5715a, f9rVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new i9r(i, f9rVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        i9r i9rVar = (i9r) obj;
        i9rVar.getClass();
        f9r f9rVar = i9rVar.f14401a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || f9rVar != null) {
            cldVarA.p(ugi0Var, 0, d9r.f5715a, f9rVar);
        }
        cldVarA.c(ugi0Var);
    }
}
