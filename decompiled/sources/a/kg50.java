package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kg50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kg50 f18224a;
    private static final ugi0 descriptor;

    static {
        kg50 kg50Var = new kg50();
        f18224a = kg50Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.alt_design_l.data.nearest_game_details.model.NearestGameDetailsFullScoreDetailResponse", kg50Var, 2);
        zna0Var.j("scoreOpp1", true);
        zna0Var.j("scoreOpp2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new mg50(i, l, l2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mg50 mg50Var = (mg50) obj;
        mg50Var.getClass();
        Long l = mg50Var.b;
        Long l2 = mg50Var.f21726a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
