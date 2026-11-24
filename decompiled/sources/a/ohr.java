package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ohr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ohr f25278a;
    private static final ugi0 descriptor;

    static {
        ohr ohrVar = new ohr();
        f25278a = ohrVar;
        zna0 zna0Var = new zna0("GPWebAppSetUserAccountBalance", ohrVar, 5);
        zna0Var.j("requestId", true);
        zna0Var.j("accountId", false);
        zna0Var.j("balance", false);
        zna0Var.j("totalDemoWinSum", true);
        zna0Var.j("eventName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, ysm0Var, tblVar, mrv.j0(tblVar), ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        String str = null;
        String strX = null;
        Double d = null;
        String strX2 = null;
        double dT = 0.0d;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                dT = bldVarA.t(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new qhr(i, str, strX, dT, d, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qhr qhrVar = (qhr) obj;
        qhrVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        mir.d(qhrVar, cldVarA, ugi0Var);
        String str = qhrVar.c;
        String str2 = qhrVar.f;
        Double d = qhrVar.e;
        cldVarA.z(ugi0Var, 1, str);
        cldVarA.j(ugi0Var, 2, qhrVar.d);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || !Intrinsics.d(str2, "GPWebAppSetUserAccountBalance")) {
            cldVarA.z(ugi0Var, 4, str2);
        }
        cldVarA.c(ugi0Var);
    }
}
