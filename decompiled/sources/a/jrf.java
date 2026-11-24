package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jrf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jrf f17000a;
    private static final ugi0 descriptor;

    static {
        jrf jrfVar = new jrf();
        f17000a = jrfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.cs2.Cs2StatisticMainResponse", jrfVar, 3);
        zna0Var.j("CSStat", true);
        zna0Var.j("Stat1", true);
        zna0Var.j("Stat2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(prf.f27462a);
        urf urfVar = urf.f36160a;
        return new jiy[]{jiyVarJ0, mrv.j0(urfVar), mrv.j0(urfVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        rrf rrfVar = null;
        wrf wrfVar = null;
        wrf wrfVar2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                rrfVar = (rrf) bldVarA.e(ugi0Var, 0, prf.f27462a, rrfVar);
                i |= 1;
            } else if (iF == 1) {
                wrfVar = (wrf) bldVarA.e(ugi0Var, 1, urf.f36160a, wrfVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                wrfVar2 = (wrf) bldVarA.e(ugi0Var, 2, urf.f36160a, wrfVar2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new lrf(i, rrfVar, wrfVar, wrfVar2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lrf lrfVar = (lrf) obj;
        lrfVar.getClass();
        wrf wrfVar = lrfVar.c;
        wrf wrfVar2 = lrfVar.b;
        rrf rrfVar = lrfVar.f20529a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || rrfVar != null) {
            cldVarA.p(ugi0Var, 0, prf.f27462a, rrfVar);
        }
        if (cldVarA.u(ugi0Var) || wrfVar2 != null) {
            cldVarA.p(ugi0Var, 1, urf.f36160a, wrfVar2);
        }
        if (cldVarA.u(ugi0Var) || wrfVar != null) {
            cldVarA.p(ugi0Var, 2, urf.f36160a, wrfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
