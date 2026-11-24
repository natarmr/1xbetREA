package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x2s0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x2s0 f40185a;
    private static final ugi0 descriptor;

    static {
        x2s0 x2s0Var = new x2s0();
        f40185a = x2s0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.TournamentPersonalInfoResponse", x2s0Var, 4);
        zna0Var.j("tournamentId", true);
        zna0Var.j("meParticipating", true);
        zna0Var.j("crmParticipantCurrentStage", true);
        zna0Var.j("isBlocked", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Boolean bool = null;
        Long l2 = null;
        Boolean bool2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            } else if (iF == 2) {
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                bool2 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new z2s0(i, l, bool, l2, bool2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z2s0 z2s0Var = (z2s0) obj;
        z2s0Var.getClass();
        Boolean bool = z2s0Var.d;
        Long l = z2s0Var.c;
        Boolean bool2 = z2s0Var.b;
        Long l2 = z2s0Var.f43687a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
