package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zxg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zxg0 f45157a;
    private static final ugi0 descriptor;

    static {
        zxg0 zxg0Var = new zxg0();
        f45157a = zxg0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.SaveCouponWithoutUserIdRequest", zxg0Var, 13);
        zna0Var.j("AppGuid", true);
        zna0Var.j("Lng", true);
        zna0Var.j("Events", true);
        zna0Var.j("partner", true);
        zna0Var.j("Source", true);
        zna0Var.j("expressNum", true);
        zna0Var.j("Vid", true);
        zna0Var.j("CfView", true);
        zna0Var.j("CheckCf", true);
        zna0Var.j("AntiExpressCoef", true);
        zna0Var.j("WithLobby", true);
        zna0Var.j("EventsIndexes", true);
        zna0Var.j("MinBetSystems", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = byg0.n;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0((jiy) a8zVarArr[2].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710.f31729a), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(tbl.f33669a), mrv.j0(sm8.f32432a), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0((jiy) a8zVarArr[12].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = byg0.n;
        List list = null;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        List list2 = null;
        Integer num2 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        List list3 = null;
        Integer num3 = null;
        Integer num4 = null;
        Long l = null;
        Integer num5 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    bool = bool;
                    list = list;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    bool = bool;
                    list = list;
                    break;
                case 1:
                    list = list;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    str = str;
                    list = list;
                    break;
                case 2:
                    list3 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
                    i |= 4;
                    str = str;
                    str2 = str2;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    str = str;
                    str2 = str2;
                    break;
                case 4:
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i |= 16;
                    str = str;
                    str2 = str2;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    str = str;
                    str2 = str2;
                    break;
                case 6:
                    num5 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num5);
                    i |= 64;
                    str = str;
                    str2 = str2;
                    break;
                case 7:
                    num2 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num2);
                    i |= 128;
                    str = str;
                    str2 = str2;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    str = str;
                    str2 = str2;
                    break;
                case 9:
                    d = (Double) bldVarA.e(ugi0Var, 9, tbl.f33669a, d);
                    i |= 512;
                    str = str;
                    str2 = str2;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    str = str;
                    str2 = str2;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    str = str;
                    str2 = str2;
                    break;
                case 12:
                    list2 = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
                    i |= 4096;
                    str = str;
                    str2 = str2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool2 = bool;
        bldVarA.c(ugi0Var);
        return new byg0(i, str, str2, list3, num3, num4, l, num5, num2, num, d, bool2, list, list2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        byg0 byg0Var = (byg0) obj;
        byg0Var.getClass();
        List list = byg0Var.m;
        List list2 = byg0Var.l;
        Boolean bool = byg0Var.k;
        Double d = byg0Var.j;
        Integer num = byg0Var.i;
        Integer num2 = byg0Var.h;
        Integer num3 = byg0Var.g;
        Long l = byg0Var.f;
        Integer num4 = byg0Var.e;
        Integer num5 = byg0Var.d;
        List list3 = byg0Var.c;
        String str = byg0Var.b;
        String str2 = byg0Var.f3416a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = byg0.n;
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 9, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
