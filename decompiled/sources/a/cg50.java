package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cg50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cg50 f4297a;
    private static final ugi0 descriptor;

    static {
        cg50 cg50Var = new cg50();
        f4297a = cg50Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.alt_design_l.data.nearest_game_details.model.NearestGameDetailsCricketScoreResponse", cg50Var, 1);
        zna0Var.j("wicketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(si50.f32247a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ui50 ui50Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                ui50Var = (ui50) bldVarA.e(ugi0Var, 0, si50.f32247a, ui50Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new eg50(i, ui50Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        eg50 eg50Var = (eg50) obj;
        eg50Var.getClass();
        ui50 ui50Var = eg50Var.f7746a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ui50Var != null) {
            cldVarA.p(ugi0Var, 0, si50.f32247a, ui50Var);
        }
        cldVarA.c(ugi0Var);
    }
}
