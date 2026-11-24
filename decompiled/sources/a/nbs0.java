package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nbs0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nbs0 f23256a;
    private static final ugi0 descriptor;

    static {
        nbs0 nbs0Var = new nbs0();
        f23256a = nbs0Var;
        zna0 zna0Var = new zna0("org.xplatform.favorites.api.domain.models.TrackCoefItem", nbs0Var, 2);
        zna0Var.j("game", false);
        zna0Var.j("betInfo", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ybs0.f42354a, i97.f14373a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        acs0 acs0Var = null;
        m97 m97Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                acs0Var = (acs0) bldVarA.m(ugi0Var, 0, ybs0.f42354a, acs0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                m97Var = (m97) bldVarA.m(ugi0Var, 1, i97.f14373a, m97Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new pbs0(i, acs0Var, m97Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pbs0 pbs0Var = (pbs0) obj;
        pbs0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, ybs0.f42354a, pbs0Var.f26723a);
        cldVarA.m(ugi0Var, 1, i97.f14373a, pbs0Var.b);
        cldVarA.c(ugi0Var);
    }
}
