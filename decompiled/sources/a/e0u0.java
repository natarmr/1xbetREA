package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e0u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0u0 f7007a;
    private static final ugi0 descriptor;

    static {
        e0u0 e0u0Var = new e0u0();
        f7007a = e0u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.valorant.ValorantStatisticMainResponse", e0u0Var, 3);
        zna0Var.j("ValorantStat", true);
        zna0Var.j("Stat1", true);
        zna0Var.j("Stat2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(l1u0.f19277a);
        p1u0 p1u0Var = p1u0.f26222a;
        return new jiy[]{jiyVarJ0, mrv.j0(p1u0Var), mrv.j0(p1u0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        n1u0 n1u0Var = null;
        r1u0 r1u0Var = null;
        r1u0 r1u0Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                n1u0Var = (n1u0) bldVarA.e(ugi0Var, 0, l1u0.f19277a, n1u0Var);
                i |= 1;
            } else if (iF == 1) {
                r1u0Var = (r1u0) bldVarA.e(ugi0Var, 1, p1u0.f26222a, r1u0Var);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                r1u0Var2 = (r1u0) bldVarA.e(ugi0Var, 2, p1u0.f26222a, r1u0Var2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new g0u0(i, n1u0Var, r1u0Var, r1u0Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        g0u0 g0u0Var = (g0u0) obj;
        g0u0Var.getClass();
        r1u0 r1u0Var = g0u0Var.c;
        r1u0 r1u0Var2 = g0u0Var.b;
        n1u0 n1u0Var = g0u0Var.f10478a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || n1u0Var != null) {
            cldVarA.p(ugi0Var, 0, l1u0.f19277a, n1u0Var);
        }
        if (cldVarA.u(ugi0Var) || r1u0Var2 != null) {
            cldVarA.p(ugi0Var, 1, p1u0.f26222a, r1u0Var2);
        }
        if (cldVarA.u(ugi0Var) || r1u0Var != null) {
            cldVarA.p(ugi0Var, 2, p1u0.f26222a, r1u0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
