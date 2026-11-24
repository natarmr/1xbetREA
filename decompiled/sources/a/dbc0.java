package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dbc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dbc0 f5797a;
    private static final ugi0 descriptor;

    static {
        dbc0 dbc0Var = new dbc0();
        f5797a = dbc0Var;
        zna0 zna0Var = new zna0("org.xplatform.promotions.news.impl.data.models.PromoCmsGetPromotionDrawResponse", dbc0Var, 6);
        zna0Var.j("drawId", true);
        zna0Var.j("date", true);
        zna0Var.j("unitId", true);
        zna0Var.j("unitTypeIds", true);
        zna0Var.j("isRating", true);
        zna0Var.j("isResultDraw", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = fbc0.g;
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(s710.f31729a), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[3].getValue()), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fbc0.g;
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        List list = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num4);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new fbc0(i, num, l, num2, list, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fbc0 fbc0Var = (fbc0) obj;
        fbc0Var.getClass();
        Integer num = fbc0Var.f;
        Integer num2 = fbc0Var.e;
        List list = fbc0Var.d;
        Integer num3 = fbc0Var.c;
        Long l = fbc0Var.b;
        Integer num4 = fbc0Var.f9250a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fbc0.g;
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
