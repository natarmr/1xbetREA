package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zkv0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zkv0 f44553a;
    private static final ugi0 descriptor;

    static {
        zkv0 zkv0Var = new zkv0();
        f44553a = zkv0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.winter_games.impl.winter_game.data.model.WinterGameResponse", zkv0Var, 2);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(clv0.f4578a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        elv0 elv0Var = null;
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
                elv0Var = (elv0) bldVarA.e(ugi0Var, 1, clv0.f4578a, elv0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new blv0(i, l, elv0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        blv0 blv0Var = (blv0) obj;
        blv0Var.getClass();
        elv0 elv0Var = blv0Var.b;
        Long l = blv0Var.f2812a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || elv0Var != null) {
            cldVarA.p(ugi0Var, 1, clv0.f4578a, elv0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
