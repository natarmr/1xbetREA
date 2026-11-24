package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k6g0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k6g0 f17768a;
    private static final ugi0 descriptor;

    static {
        k6g0 k6g0Var = new k6g0();
        f17768a = k6g0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stat_results.impl.results_grid.data.model.ResultsGridBaseResponse", k6g0Var, 5);
        zna0Var.j("teams", true);
        zna0Var.j("players", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = m6g0.f;
        jiy jiyVarJ0 = mrv.j0((jiy) a8zVarArr[0].getValue());
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(f8g0.f9102a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = m6g0.f;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        Integer num = null;
        Integer num2 = null;
        h8g0 h8g0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                list = (List) bldVarA.e(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                i |= 1;
            } else if (iF == 1) {
                list2 = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else if (iF == 3) {
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                h8g0Var = (h8g0) bldVarA.e(ugi0Var, 4, f8g0.f9102a, h8g0Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new m6g0(i, list, list2, num, num2, h8g0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m6g0 m6g0Var = (m6g0) obj;
        m6g0Var.getClass();
        h8g0 h8g0Var = m6g0Var.e;
        Integer num = m6g0Var.d;
        Integer num2 = m6g0Var.c;
        List list = m6g0Var.b;
        List list2 = m6g0Var.f21269a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = m6g0.f;
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || h8g0Var != null) {
            cldVarA.p(ugi0Var, 4, f8g0.f9102a, h8g0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
