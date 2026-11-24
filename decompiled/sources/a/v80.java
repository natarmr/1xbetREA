package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v80 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v80 f36956a;
    private static final ugi0 descriptor;

    static {
        v80 v80Var = new v80();
        f36956a = v80Var;
        zna0 zna0Var = new zna0("org.xplatform.african_roulette.data.response.AfricanRouletteSpinResponse", v80Var, 7);
        zna0Var.j("CF", true);
        zna0Var.j("RS", true);
        zna0Var.j("SB", true);
        zna0Var.j("SW", true);
        zna0Var.j("WL", true);
        zna0Var.j("AI", true);
        zna0Var.k(new iy(new String[]{"BAC"}, (byte) 1));
        zna0Var.j("BL", true);
        zna0Var.k(new iy(new String[]{"NB", "BA", "Balanse"}, (byte) 1));
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = x80.h;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0(s710.f31729a), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = x80.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        Double d = null;
        List list2 = null;
        Long l = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    list = (List) bldVarA.e(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                case 6:
                    d2 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d2);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new x80(i, num, list, num2, d, list2, l, d2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x80 x80Var = (x80) obj;
        x80Var.getClass();
        Double d = x80Var.g;
        Long l = x80Var.f;
        List list = x80Var.e;
        Double d2 = x80Var.d;
        Integer num = x80Var.c;
        List list2 = x80Var.b;
        Integer num2 = x80Var.f40439a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = x80.h;
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
