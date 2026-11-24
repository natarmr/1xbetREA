package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hex implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hex f12946a;
    private static final ugi0 descriptor;

    static {
        hex hexVar = new hex();
        f12946a = hexVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.common.models.games_by_champ.InnsStatsResponse", hexVar, 3);
        zna0Var.j("team", true);
        zna0Var.j("wickets", true);
        zna0Var.j("over", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(klq.f18504a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Float f = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                f = (Float) bldVarA.e(ugi0Var, 2, klq.f18504a, f);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new jex(i, num, num2, f);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jex jexVar = (jex) obj;
        jexVar.getClass();
        Float f = jexVar.c;
        Integer num = jexVar.b;
        Integer num2 = jexVar.f16398a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 2, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
