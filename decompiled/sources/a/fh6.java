package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fh6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fh6 f9526a;
    private static final ugi0 descriptor;

    static {
        fh6 fh6Var = new fh6();
        f9526a = fh6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.game_info.BetBuilderExtendedScoreResponse", fh6Var, 2);
        zna0Var.j("innsStats", true);
        zna0Var.j("cricketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(vh6.f37414a), mrv.j0(uf6.f35563a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        xh6 xh6Var = null;
        wf6 wf6Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                xh6Var = (xh6) bldVarA.e(ugi0Var, 0, vh6.f37414a, xh6Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                wf6Var = (wf6) bldVarA.e(ugi0Var, 1, uf6.f35563a, wf6Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new hh6(i, xh6Var, wf6Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hh6 hh6Var = (hh6) obj;
        hh6Var.getClass();
        wf6 wf6Var = hh6Var.b;
        xh6 xh6Var = hh6Var.f13047a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || xh6Var != null) {
            cldVarA.p(ugi0Var, 0, vh6.f37414a, xh6Var);
        }
        if (cldVarA.u(ugi0Var) || wf6Var != null) {
            cldVarA.p(ugi0Var, 1, uf6.f35563a, wf6Var);
        }
        cldVarA.c(ugi0Var);
    }
}
