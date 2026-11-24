package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lqj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lqj0 f20490a;
    private static final ugi0 descriptor;

    static {
        lqj0 lqj0Var = new lqj0();
        f20490a = lqj0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.ShootoutGameScoreResponse", lqj0Var, 1);
        zna0Var.j("penalty", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(tc90.f33710a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        bd90 bd90Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                bd90Var = (bd90) bldVarA.e(ugi0Var, 0, tc90.f33710a, bd90Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new nqj0(i, bd90Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nqj0 nqj0Var = (nqj0) obj;
        nqj0Var.getClass();
        bd90 bd90Var = nqj0Var.f23963a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bd90Var != null) {
            cldVarA.p(ugi0Var, 0, tc90.f33710a, bd90Var);
        }
        cldVarA.c(ugi0Var);
    }
}
