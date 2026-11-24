package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l1s0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1s0 f19273a;
    private static final ugi0 descriptor;

    static {
        l1s0 l1s0Var = new l1s0();
        f19273a = l1s0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.TournamentFullInfoResponse", l1s0Var, 1);
        zna0Var.j("tournament", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(t4s0.f33337a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        d5s0 d5s0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                d5s0Var = (d5s0) bldVarA.e(ugi0Var, 0, t4s0.f33337a, d5s0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new n1s0(i, d5s0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n1s0 n1s0Var = (n1s0) obj;
        n1s0Var.getClass();
        d5s0 d5s0Var = n1s0Var.f22768a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d5s0Var != null) {
            cldVarA.p(ugi0Var, 0, t4s0.f33337a, d5s0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
