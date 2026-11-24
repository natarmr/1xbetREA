package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c0h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0h f3523a;
    private static final ugi0 descriptor;

    static {
        c0h c0hVar = new c0h();
        f3523a = c0hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.leaderboard.data.model.CyberGamesRankingLeaderBoardResponse", c0hVar, 5);
        zna0Var.j("mixed", true);
        zna0Var.j("offline", true);
        zna0Var.j("online", true);
        zna0Var.j("total", true);
        zna0Var.j("year", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else if (iF == 2) {
                l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                i |= 4;
            } else if (iF == 3) {
                l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new e0h(i, l, l2, l3, l4, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e0h e0hVar = (e0h) obj;
        e0hVar.getClass();
        Integer num = e0hVar.e;
        Long l = e0hVar.d;
        Long l2 = e0hVar.c;
        Long l3 = e0hVar.b;
        Long l4 = e0hVar.f6988a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
