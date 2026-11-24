package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h1f implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1f f12281a;
    private static final ugi0 descriptor;

    static {
        h1f h1fVar = new h1f();
        f12281a = h1fVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.CouponResponse", h1fVar, 7);
        zna0Var.j("UserIdBonus", true);
        zna0Var.j("Coef", true);
        zna0Var.j("CoefView", true);
        zna0Var.j("Summ", true);
        zna0Var.j("Vid", true);
        zna0Var.j("Events", true);
        zna0Var.j("BuilderCoupon", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = n1f.h;
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(tblVar), mrv.j0(okx.f25427a), mrv.j0((jiy) a8zVarArr[5].getValue()), mrv.j0(zb9.f44104a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = n1f.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        Long l = null;
        Double d = null;
        String str = null;
        Double d2 = null;
        Integer num = null;
        List list = null;
        bc9 bc9Var = null;
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
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d2);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    break;
                case 5:
                    list = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    bc9Var = (bc9) bldVarA.e(ugi0Var, 6, zb9.f44104a, bc9Var);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new n1f(i, l, d, str, d2, num, list, bc9Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n1f n1fVar = (n1f) obj;
        n1fVar.getClass();
        bc9 bc9Var = n1fVar.g;
        List list = n1fVar.f;
        Integer num = n1fVar.e;
        Double d = n1fVar.d;
        String str = n1fVar.c;
        Double d2 = n1fVar.b;
        Long l = n1fVar.f22748a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = n1f.h;
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bc9Var != null) {
            cldVarA.p(ugi0Var, 6, zb9.f44104a, bc9Var);
        }
        cldVarA.c(ugi0Var);
    }
}
