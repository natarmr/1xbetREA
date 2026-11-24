package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r9e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r9e0 f30076a;
    private static final ugi0 descriptor;

    static {
        r9e0 r9e0Var = new r9e0();
        f30076a = r9e0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.rating.impl.rating_statistic.data.model.RatingValueResponse", r9e0Var, 6);
        zna0Var.j("selectors", true);
        zna0Var.j("totalRowCount", true);
        zna0Var.j("title", true);
        zna0Var.j("competitorType", true);
        zna0Var.j("tableTitles", true);
        zna0Var.j("ratingRows", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = t9e0.g;
        jiy jiyVarJ0 = mrv.j0(k6i0.f17772a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(ysm0.f43175a), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0((jiy) a8zVarArr[5].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = t9e0.g;
        boolean z = true;
        int i = 0;
        o6i0 o6i0Var = null;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    o6i0Var = (o6i0) bldVarA.e(ugi0Var, 0, k6i0.f17772a, o6i0Var);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) bldVarA.e(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new t9e0(i, o6i0Var, num, str, num2, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t9e0 t9e0Var = (t9e0) obj;
        t9e0Var.getClass();
        List list = t9e0Var.f;
        List list2 = t9e0Var.e;
        Integer num = t9e0Var.d;
        String str = t9e0Var.c;
        Integer num2 = t9e0Var.b;
        o6i0 o6i0Var = t9e0Var.f33558a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = t9e0.g;
        if (cldVarA.u(ugi0Var) || o6i0Var != null) {
            cldVarA.p(ugi0Var, 0, k6i0.f17772a, o6i0Var);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 5, (jiy) a8zVarArr[5].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
