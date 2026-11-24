package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u9l implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u9l f35288a;
    private static final ugi0 descriptor;

    static {
        u9l u9lVar = new u9l();
        f35288a = u9lVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.DotaStatisticMainResponse", u9lVar, 3);
        zna0Var.j("DotaStatistic", true);
        zna0Var.j("Stat1", true);
        zna0Var.j("Stat2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ang.f1150a);
        nhh nhhVar = nhh.f23532a;
        return new jiy[]{jiyVarJ0, mrv.j0(nhhVar), mrv.j0(nhhVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        cng cngVar = null;
        phh phhVar = null;
        phh phhVar2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                cngVar = (cng) bldVarA.e(ugi0Var, 0, ang.f1150a, cngVar);
                i |= 1;
            } else if (iF == 1) {
                phhVar = (phh) bldVarA.e(ugi0Var, 1, nhh.f23532a, phhVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                phhVar2 = (phh) bldVarA.e(ugi0Var, 2, nhh.f23532a, phhVar2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new w9l(i, cngVar, phhVar, phhVar2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w9l w9lVar = (w9l) obj;
        w9lVar.getClass();
        phh phhVar = w9lVar.c;
        phh phhVar2 = w9lVar.b;
        cng cngVar = w9lVar.f38785a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || cngVar != null) {
            cldVarA.p(ugi0Var, 0, ang.f1150a, cngVar);
        }
        if (cldVarA.u(ugi0Var) || phhVar2 != null) {
            cldVarA.p(ugi0Var, 1, nhh.f23532a, phhVar2);
        }
        if (cldVarA.u(ugi0Var) || phhVar != null) {
            cldVarA.p(ugi0Var, 2, nhh.f23532a, phhVar);
        }
        cldVarA.c(ugi0Var);
    }
}
