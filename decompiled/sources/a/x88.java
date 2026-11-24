package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x88 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x88 f40451a;
    private static final ugi0 descriptor;

    static {
        x88 x88Var = new x88();
        f40451a = x88Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.BlockPrizeResponse", x88Var, 8);
        zna0Var.j("blockCount", true);
        zna0Var.j("buttonText", true);
        zna0Var.j("clientDistributionType", true);
        zna0Var.j("clientShowType", true);
        zna0Var.j("crmItems", true);
        zna0Var.j("description", true);
        zna0Var.j("items", true);
        zna0Var.j("title", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = z88.i;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[4].getValue()), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = z88.i;
        Object obj = null;
        boolean z = true;
        String str = null;
        Integer num = null;
        String str2 = null;
        Integer num2 = null;
        Integer num3 = null;
        List list = null;
        String str3 = null;
        List list2 = null;
        int i = 0;
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
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new z88(i, num, str2, num2, num3, list, str3, list2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z88 z88Var = (z88) obj;
        z88Var.getClass();
        String str = z88Var.h;
        List list = z88Var.g;
        String str2 = z88Var.f;
        List list2 = z88Var.e;
        Integer num = z88Var.d;
        Integer num2 = z88Var.c;
        String str3 = z88Var.b;
        Integer num3 = z88Var.f43954a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = z88.i;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
