package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c4h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c4h0 f3726a;
    private static final ugi0 descriptor;

    static {
        c4h0 c4h0Var = new c4h0();
        f3726a = c4h0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.ScoreResponse.CricketScore.Score", c4h0Var, 1);
        zna0Var.j("wicketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(e4h0.f7182a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        g4h0 g4h0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                g4h0Var = (g4h0) bldVarA.e(ugi0Var, 0, e4h0.f7182a, g4h0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new h4h0(i, g4h0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h4h0 h4h0Var = (h4h0) obj;
        h4h0Var.getClass();
        g4h0 g4h0Var = h4h0Var.f12432a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || g4h0Var != null) {
            cldVarA.p(ugi0Var, 0, e4h0.f7182a, g4h0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
