package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wyk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wyk0 f39977a;
    private static final ugi0 descriptor;

    static {
        wyk0 wyk0Var = new wyk0();
        f39977a = wyk0Var;
        zna0 zna0Var = new zna0("org.xplatform.spin_and_win.data.models.requests.SpinAndWinPlayRequest", wyk0Var, 6);
        zna0Var.j("BV", false);
        zna0Var.j("BS", true);
        zna0Var.j("BINF", true);
        zna0Var.j("BAC", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{yyk0.g[0].getValue(), mrv.j0(tbl.f33669a), mrv.j0(zf8.f44290a), s710.f31729a, ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = yyk0.g;
        Object obj = null;
        int i = 0;
        int iJ = 0;
        bg8 bg8Var = null;
        Double d = null;
        String strX = null;
        long jR = 0;
        boolean z = true;
        List list = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) bldVarA.m(ugi0Var, 0, (jiy) a8zVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    bg8Var = (bg8) bldVarA.e(ugi0Var, 2, zf8.f44290a, bg8Var);
                    i |= 4;
                    break;
                case 3:
                    jR = bldVarA.r(ugi0Var, 3);
                    i |= 8;
                    continue;
                case 4:
                    strX = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    continue;
                case 5:
                    iJ = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    continue;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new yyk0(i, iJ, jR, bg8Var, d, strX, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yyk0 yyk0Var = (yyk0) obj;
        yyk0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        jiy jiyVar = (jiy) yyk0.g[0].getValue();
        List list = yyk0Var.f43471a;
        bg8 bg8Var = yyk0Var.c;
        Double d = yyk0Var.b;
        cldVarA.m(ugi0Var, 0, jiyVar, list);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 2, zf8.f44290a, bg8Var);
        }
        cldVarA.n(ugi0Var, 3, yyk0Var.d);
        cldVarA.z(ugi0Var, 4, yyk0Var.e);
        cldVarA.i(5, yyk0Var.f, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
