package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tyd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tyd0 f34749a;
    private static final ugi0 descriptor;

    static {
        tyd0 tyd0Var = new tyd0();
        f34749a = tyd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.rainbow.impl.data.model.matches.comparison.RainbowStatisticMatchesComparisonResponse", tyd0Var, 2);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        fzd0 fzd0Var = fzd0.f10403a;
        return new jiy[]{mrv.j0(fzd0Var), mrv.j0(fzd0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        hzd0 hzd0Var = null;
        hzd0 hzd0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                hzd0Var = (hzd0) bldVarA.e(ugi0Var, 0, fzd0.f10403a, hzd0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                hzd0Var2 = (hzd0) bldVarA.e(ugi0Var, 1, fzd0.f10403a, hzd0Var2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new vyd0(i, hzd0Var, hzd0Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vyd0 vyd0Var = (vyd0) obj;
        vyd0Var.getClass();
        hzd0 hzd0Var = vyd0Var.b;
        hzd0 hzd0Var2 = vyd0Var.f38243a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || hzd0Var2 != null) {
            cldVarA.p(ugi0Var, 0, fzd0.f10403a, hzd0Var2);
        }
        if (cldVarA.u(ugi0Var) || hzd0Var != null) {
            cldVarA.p(ugi0Var, 1, fzd0.f10403a, hzd0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
