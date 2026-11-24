package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class czk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final czk0 f5229a;
    private static final ugi0 descriptor;

    static {
        czk0 czk0Var = new czk0();
        f5229a = czk0Var;
        zna0 zna0Var = new zna0("org.xplatform.spin_and_win.data.models.responses.SpinAndWinResponse", czk0Var, 7);
        zna0Var.j("AI", true);
        zna0Var.j("CF", true);
        zna0Var.j("NB", true);
        zna0Var.j("RS", true);
        zna0Var.j("SB", true);
        zna0Var.j("SW", true);
        zna0Var.j("GI", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ezk0.h;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(lyk0.f20866a), mrv.j0(tblVar), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ezk0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Double d = null;
        Double d2 = null;
        List list = null;
        kyk0 kyk0Var = null;
        Double d3 = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    kyk0Var = (kyk0) bldVarA.e(ugi0Var, 4, lyk0.f20866a, kyk0Var);
                    i |= 16;
                    break;
                case 5:
                    d3 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d3);
                    i |= 32;
                    break;
                case 6:
                    str = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new ezk0(i, l, d, d2, list, kyk0Var, d3, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ezk0 ezk0Var = (ezk0) obj;
        ezk0Var.getClass();
        String str = ezk0Var.g;
        Double d = ezk0Var.f;
        kyk0 kyk0Var = ezk0Var.e;
        List list = ezk0Var.d;
        Double d2 = ezk0Var.c;
        Double d3 = ezk0Var.b;
        Long l = ezk0Var.f8676a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ezk0.h;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || kyk0Var != null) {
            cldVarA.p(ugi0Var, 4, lyk0.f20866a, kyk0Var);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
