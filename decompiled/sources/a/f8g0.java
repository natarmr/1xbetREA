package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f8g0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f8g0 f9102a;
    private static final ugi0 descriptor;

    static {
        f8g0 f8g0Var = new f8g0();
        f9102a = f8g0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stat_results.impl.results_grid.data.model.ResultsGridValueResponse", f8g0Var, 4);
        zna0Var.j("title", true);
        zna0Var.j("logo", true);
        zna0Var.j("table", true);
        zna0Var.j("tableFooter", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = h8g0.e;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(p7g0.f26504a), mrv.j0((jiy) a8zVarArr[3].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = h8g0.e;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        r7g0 r7g0Var = null;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                r7g0Var = (r7g0) bldVarA.e(ugi0Var, 2, p7g0.f26504a, r7g0Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new h8g0(i, str, str2, r7g0Var, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h8g0 h8g0Var = (h8g0) obj;
        h8g0Var.getClass();
        List list = h8g0Var.d;
        r7g0 r7g0Var = h8g0Var.c;
        String str = h8g0Var.b;
        String str2 = h8g0Var.f12624a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = h8g0.e;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || r7g0Var != null) {
            cldVarA.p(ugi0Var, 2, p7g0.f26504a, r7g0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
