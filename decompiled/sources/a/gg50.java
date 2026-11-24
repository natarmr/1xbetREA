package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gg50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gg50 f11238a;
    private static final ugi0 descriptor;

    static {
        gg50 gg50Var = new gg50();
        f11238a = gg50Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.alt_design_l.data.nearest_game_details.model.NearestGameDetailsExtendedScoreResponse", gg50Var, 2);
        zna0Var.j("innsStats", true);
        zna0Var.j("cricketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(og50.f25201a), mrv.j0(cg50.f4297a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        qg50 qg50Var = null;
        eg50 eg50Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                qg50Var = (qg50) bldVarA.e(ugi0Var, 0, og50.f25201a, qg50Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                eg50Var = (eg50) bldVarA.e(ugi0Var, 1, cg50.f4297a, eg50Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ig50(i, qg50Var, eg50Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ig50 ig50Var = (ig50) obj;
        ig50Var.getClass();
        eg50 eg50Var = ig50Var.b;
        qg50 qg50Var = ig50Var.f14720a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || qg50Var != null) {
            cldVarA.p(ugi0Var, 0, og50.f25201a, qg50Var);
        }
        if (cldVarA.u(ugi0Var) || eg50Var != null) {
            cldVarA.p(ugi0Var, 1, cg50.f4297a, eg50Var);
        }
        cldVarA.c(ugi0Var);
    }
}
