package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aw80 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aw80 f1561a;
    private static final ugi0 descriptor;

    static {
        aw80 aw80Var = new aw80();
        f1561a = aw80Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.ParticipateTournamentRequest", aw80Var, 1);
        zna0Var.j("tournament_id", false);
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
        return new cw80(i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cw80 cw80Var = (cw80) obj;
        cw80Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, cw80Var.f5069a);
        cldVarA.c(ugi0Var);
    }
}
