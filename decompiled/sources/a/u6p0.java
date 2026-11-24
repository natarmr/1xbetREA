package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u6p0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u6p0 f35149a;
    private static final ugi0 descriptor;

    static {
        u6p0 u6p0Var = new u6p0();
        f35149a = u6p0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.team.impl.team_completed_match.data.model.TeamCompletedMatchResponse", u6p0Var, 3);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        zna0Var.j("teams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = w6p0.d;
        return new jiy[]{mrv.j0((jiy) a8zVarArr[0].getValue()), mrv.j0(s710.f31729a), mrv.j0((jiy) a8zVarArr[2].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = w6p0.d;
        boolean z = true;
        int i = 0;
        List list = null;
        Long l = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                list2 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new w6p0(i, l, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w6p0 w6p0Var = (w6p0) obj;
        w6p0Var.getClass();
        List list = w6p0Var.c;
        Long l = w6p0Var.b;
        List list2 = w6p0Var.f38635a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = w6p0.d;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
