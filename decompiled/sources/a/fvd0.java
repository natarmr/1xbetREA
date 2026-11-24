package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fvd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fvd0 f10209a;
    private static final ugi0 descriptor;

    static {
        fvd0 fvd0Var = new fvd0();
        f10209a = fvd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.rainbow.RainbowGameStatisticMainResponse", fvd0Var, 3);
        zna0Var.j("Stat1", true);
        zna0Var.j("Stat2", true);
        zna0Var.j("RainbowSixStat", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ovd0 ovd0Var = ovd0.f25920a;
        return new jiy[]{mrv.j0(ovd0Var), mrv.j0(ovd0Var), mrv.j0(nyd0.f24325a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        qvd0 qvd0Var = null;
        qvd0 qvd0Var2 = null;
        pyd0 pyd0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                qvd0Var = (qvd0) bldVarA.e(ugi0Var, 0, ovd0.f25920a, qvd0Var);
                i |= 1;
            } else if (iF == 1) {
                qvd0Var2 = (qvd0) bldVarA.e(ugi0Var, 1, ovd0.f25920a, qvd0Var2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                pyd0Var = (pyd0) bldVarA.e(ugi0Var, 2, nyd0.f24325a, pyd0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new hvd0(i, qvd0Var, qvd0Var2, pyd0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        hvd0 hvd0Var = (hvd0) obj;
        hvd0Var.getClass();
        pyd0 pyd0Var = hvd0Var.c;
        qvd0 qvd0Var = hvd0Var.b;
        qvd0 qvd0Var2 = hvd0Var.f13722a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || qvd0Var2 != null) {
            cldVarA.p(ugi0Var, 0, ovd0.f25920a, qvd0Var2);
        }
        if (cldVarA.u(ugi0Var) || qvd0Var != null) {
            cldVarA.p(ugi0Var, 1, ovd0.f25920a, qvd0Var);
        }
        if (cldVarA.u(ugi0Var) || pyd0Var != null) {
            cldVarA.p(ugi0Var, 2, nyd0.f24325a, pyd0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
