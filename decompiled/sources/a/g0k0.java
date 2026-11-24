package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g0k0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0k0 f10464a;
    private static final ugi0 descriptor;

    static {
        g0k0 g0k0Var = new g0k0();
        f10464a = g0k0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.SimulationResponse", g0k0Var, 6);
        zna0Var.j("gameId", true);
        zna0Var.j("kind", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("constId", true);
        zna0Var.j("startDate", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(okx.f25427a), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                    i |= 4;
                    break;
                case 3:
                    l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                    i |= 8;
                    break;
                case 4:
                    l4 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l4);
                    i |= 16;
                    break;
                case 5:
                    l5 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new k0k0(i, l, num, l2, l3, l4, l5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k0k0 k0k0Var = (k0k0) obj;
        k0k0Var.getClass();
        Long l = k0k0Var.f;
        Long l2 = k0k0Var.e;
        Long l3 = k0k0Var.d;
        Long l4 = k0k0Var.c;
        Integer num = k0k0Var.b;
        Long l5 = k0k0Var.f17472a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
