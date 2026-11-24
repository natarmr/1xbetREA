package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0q0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0q0 f19215a;
    private static final ugi0 descriptor;

    static {
        l0q0 l0q0Var = new l0q0();
        f19215a = l0q0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.tennis.impl.wins_and_losses.data.model.TennisWinLossResponse", l0q0Var, 3);
        zna0Var.j("players", true);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0((jiy) n0q0.d[0].getValue()), mrv.j0(okx.f25427a), mrv.j0(e0q0.f7001a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = n0q0.d;
        boolean z = true;
        int i = 0;
        List list = null;
        Integer num = null;
        g0q0 g0q0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                g0q0Var = (g0q0) bldVarA.e(ugi0Var, 2, e0q0.f7001a, g0q0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new n0q0(i, list, num, g0q0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n0q0 n0q0Var = (n0q0) obj;
        n0q0Var.getClass();
        g0q0 g0q0Var = n0q0Var.c;
        Integer num = n0q0Var.b;
        List list = n0q0Var.f22712a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = n0q0.d;
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || g0q0Var != null) {
            cldVarA.p(ugi0Var, 2, e0q0.f7001a, g0q0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
