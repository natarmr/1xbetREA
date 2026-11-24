package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x3h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3h0 f40218a;
    private static final ugi0 descriptor;

    static {
        x3h0 x3h0Var = new x3h0();
        f40218a = x3h0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.ScoreResponse.CricketScore", x3h0Var, 2);
        zna0Var.j("innsStats", true);
        zna0Var.j("cricketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(z3h0.f43718a), mrv.j0(c4h0.f3726a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        b4h0 b4h0Var = null;
        h4h0 h4h0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                b4h0Var = (b4h0) bldVarA.e(ugi0Var, 0, z3h0.f43718a, b4h0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                h4h0Var = (h4h0) bldVarA.e(ugi0Var, 1, c4h0.f3726a, h4h0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new i4h0(i, b4h0Var, h4h0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        i4h0 i4h0Var = (i4h0) obj;
        i4h0Var.getClass();
        h4h0 h4h0Var = i4h0Var.b;
        b4h0 b4h0Var = i4h0Var.f14146a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || b4h0Var != null) {
            cldVarA.p(ugi0Var, 0, z3h0.f43718a, b4h0Var);
        }
        if (cldVarA.u(ugi0Var) || h4h0Var != null) {
            cldVarA.p(ugi0Var, 1, c4h0.f3726a, h4h0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
