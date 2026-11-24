package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xn40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xn40 f41155a;
    private static final ugi0 descriptor;

    static {
        xn40 xn40Var = new xn40();
        f41155a = xn40Var;
        zna0 zna0Var = new zna0("org.xplatform.limits_kenya.impl.data.models.responses.MoneyLimitResponse", xn40Var, 16);
        zna0Var.j("limitType", true);
        zna0Var.j("currency", true);
        zna0Var.j("limitBalance", true);
        zna0Var.j("freeValue", true);
        zna0Var.j("changeAvailable", true);
        zna0Var.j("deleteAvailable", true);
        zna0Var.j("limitState", true);
        zna0Var.j("startedAt", true);
        zna0Var.j("endsAt", true);
        zna0Var.j("createdAt", true);
        zna0Var.j("limitValue", true);
        zna0Var.j("needApprove", true);
        zna0Var.j("pendingValue", true);
        zna0Var.j("pendingEndsAt", true);
        zna0Var.j("availableValues", true);
        zna0Var.j("setWithoutValue", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jo40.q;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(tbl.f33669a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ3 = mrv.j0(sm8Var);
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        jiy jiyVarJ5 = mrv.j0(sm8Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        Boolean bool;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jo40.q;
        Boolean bool2 = null;
        Integer num2 = null;
        Long l = null;
        Long l2 = null;
        Integer num3 = null;
        Long l3 = null;
        int i = 0;
        Long l4 = null;
        List list = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str = null;
        boolean z = true;
        Integer num4 = null;
        String str2 = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num4;
                    z = false;
                    num2 = num2;
                    bool5 = bool5;
                    num4 = num;
                    bool2 = bool2;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num4);
                    i |= 1;
                    num2 = num2;
                    bool4 = bool4;
                    bool5 = bool5;
                    num4 = num;
                    bool2 = bool2;
                    break;
                case 1:
                    bool = bool4;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    d = d;
                    bool4 = bool;
                    bool5 = bool5;
                    bool2 = bool2;
                    break;
                case 2:
                    bool = bool4;
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    bool4 = bool;
                    bool5 = bool5;
                    bool2 = bool2;
                    break;
                case 3:
                    bool2 = bool2;
                    bool5 = bool5;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool4);
                    i |= 8;
                    bool5 = bool5;
                    bool2 = bool2;
                    break;
                case 4:
                    bool2 = bool2;
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool5);
                    i |= 16;
                    bool4 = bool4;
                    bool2 = bool2;
                    break;
                case 5:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool6);
                    i |= 32;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 6:
                    str = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str);
                    i |= 64;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 7:
                    l3 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l3);
                    i |= 128;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 8:
                    l2 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l2);
                    i |= 256;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 9:
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i |= 512;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 10:
                    num2 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num2);
                    i |= 1024;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 11:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool2);
                    i |= 2048;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 12:
                    num3 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num3);
                    i |= 4096;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 13:
                    l4 = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l4);
                    i |= 8192;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 14:
                    list = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
                    i |= 16384;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                case 15:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool3);
                    i |= 32768;
                    bool4 = bool4;
                    bool5 = bool5;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool7 = bool2;
        Boolean bool8 = bool5;
        Integer num5 = num4;
        String str3 = str2;
        Double d2 = d;
        bldVarA.c(ugi0Var);
        return new jo40(i, num5, str3, d2, bool4, bool8, bool6, str, l3, l2, l, num2, bool7, num3, l4, list, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jo40 jo40Var = (jo40) obj;
        jo40Var.getClass();
        Boolean bool = jo40Var.p;
        List list = jo40Var.o;
        Long l = jo40Var.n;
        Integer num = jo40Var.m;
        Boolean bool2 = jo40Var.l;
        Integer num2 = jo40Var.k;
        Long l2 = jo40Var.j;
        Long l3 = jo40Var.i;
        Long l4 = jo40Var.h;
        String str = jo40Var.g;
        Boolean bool3 = jo40Var.f;
        Boolean bool4 = jo40Var.e;
        Boolean bool5 = jo40Var.d;
        Double d = jo40Var.c;
        String str2 = jo40Var.b;
        Integer num3 = jo40Var.f16841a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jo40.q;
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
