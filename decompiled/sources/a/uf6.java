package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uf6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uf6 f35563a;
    private static final ugi0 descriptor;

    static {
        uf6 uf6Var = new uf6();
        f35563a = uf6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.game_info.BetBuilderCricketScoreResponse", uf6Var, 1);
        zna0Var.j("wicketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(tm6.f34178a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        vm6 vm6Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                vm6Var = (vm6) bldVarA.e(ugi0Var, 0, tm6.f34178a, vm6Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new wf6(i, vm6Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wf6 wf6Var = (wf6) obj;
        wf6Var.getClass();
        vm6 vm6Var = wf6Var.f39054a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || vm6Var != null) {
            cldVarA.p(ugi0Var, 0, tm6.f34178a, vm6Var);
        }
        cldVarA.c(ugi0Var);
    }
}
