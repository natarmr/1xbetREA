package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class un40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final un40 f35943a;
    private static final ugi0 descriptor;

    static {
        un40 un40Var = new un40();
        f35943a = un40Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.rs.impl.data.models.responses.MoneyLimitResponse", un40Var, 19);
        zna0Var.j("limitType", true);
        zna0Var.j("currency", true);
        zna0Var.j("limitMeasure", true);
        zna0Var.j("limitBalance", true);
        zna0Var.j("freeValue", true);
        zna0Var.j("changeAvailable", true);
        zna0Var.j("deleteAvailable", true);
        zna0Var.j("limitState", true);
        zna0Var.j("startedAt", true);
        zna0Var.j("endsAt", true);
        zna0Var.j("expiresAt", true);
        zna0Var.j("createdAt", true);
        zna0Var.j("limitValue", true);
        zna0Var.j("needApprove", true);
        zna0Var.j("pendingValue", true);
        zna0Var.j("pendingEndsAt", true);
        zna0Var.j("availableValues", true);
        zna0Var.j("activeLimitValue", true);
        zna0Var.j("setWithoutValue", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = go40.t;
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(tbl.f33669a);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        jiy jiyVarJ5 = mrv.j0(sm8Var);
        jiy jiyVarJ6 = mrv.j0(sm8Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[16].getValue()), mrv.j0(ul.f35850a), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        Boolean bool;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = go40.t;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        String str = null;
        int i2 = 0;
        Boolean bool2 = null;
        Long l6 = null;
        Long l7 = null;
        List list = null;
        yl ylVar = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        boolean z = true;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num2;
                    z = false;
                    l2 = l2;
                    bool4 = bool4;
                    num2 = num;
                    l = l;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i2 |= 1;
                    l2 = l2;
                    bool4 = bool4;
                    str = str;
                    num2 = num;
                    l = l;
                    break;
                case 1:
                    bool = bool4;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i2 |= 2;
                    str3 = str3;
                    bool4 = bool;
                    str = str;
                    l = l;
                    break;
                case 2:
                    bool = bool4;
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i2 |= 4;
                    bool4 = bool;
                    str = str;
                    l = l;
                    break;
                case 3:
                    bool = bool4;
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i2 |= 8;
                    bool4 = bool;
                    str = str;
                    l = l;
                    break;
                case 4:
                    bool = bool4;
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool5);
                    i2 |= 16;
                    bool4 = bool;
                    str = str;
                    l = l;
                    break;
                case 5:
                    bool = bool4;
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool6);
                    i2 |= 32;
                    bool4 = bool;
                    str = str;
                    l = l;
                    break;
                case 6:
                    l = l;
                    str = str;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool4);
                    i2 |= 64;
                    str = str;
                    l = l;
                    break;
                case 7:
                    l = l;
                    str = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str);
                    i2 |= 128;
                    bool4 = bool4;
                    l = l;
                    break;
                case 8:
                    str = str;
                    bool4 = bool4;
                    l4 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l4);
                    i2 |= 256;
                    bool4 = bool4;
                    str = str;
                    break;
                case 9:
                    str = str;
                    bool4 = bool4;
                    l3 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l3);
                    i2 |= 512;
                    bool4 = bool4;
                    str = str;
                    break;
                case 10:
                    str = str;
                    bool4 = bool4;
                    l2 = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l2);
                    i2 |= 1024;
                    bool4 = bool4;
                    str = str;
                    break;
                case 11:
                    str = str;
                    bool4 = bool4;
                    l = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l);
                    i2 |= 2048;
                    bool4 = bool4;
                    str = str;
                    break;
                case 12:
                    str = str;
                    bool4 = bool4;
                    l5 = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l5);
                    i2 |= 4096;
                    bool4 = bool4;
                    str = str;
                    break;
                case 13:
                    str = str;
                    bool4 = bool4;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i2 |= 8192;
                    bool4 = bool4;
                    str = str;
                    break;
                case 14:
                    str = str;
                    bool4 = bool4;
                    l6 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l6);
                    i2 |= 16384;
                    bool4 = bool4;
                    str = str;
                    break;
                case 15:
                    l7 = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l7);
                    i = 32768;
                    i2 |= i;
                    bool4 = bool4;
                    str = str;
                    break;
                case 16:
                    list = (List) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    bool4 = bool4;
                    str = str;
                    break;
                case 17:
                    ylVar = (yl) bldVarA.e(ugi0Var, 17, ul.f35850a, ylVar);
                    i = 131072;
                    i2 |= i;
                    bool4 = bool4;
                    str = str;
                    break;
                case 18:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool3);
                    i = 262144;
                    i2 |= i;
                    bool4 = bool4;
                    str = str;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l8 = l;
        Boolean bool7 = bool4;
        Integer num3 = num2;
        String str4 = str2;
        String str5 = str3;
        bldVarA.c(ugi0Var);
        return new go40(i2, num3, str4, str5, d, bool5, bool6, bool7, str, l4, l3, l2, l8, l5, bool2, l6, l7, list, ylVar, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        go40 go40Var = (go40) obj;
        go40Var.getClass();
        Boolean bool = go40Var.s;
        yl ylVar = go40Var.r;
        List list = go40Var.q;
        Long l = go40Var.p;
        Long l2 = go40Var.o;
        Boolean bool2 = go40Var.n;
        Long l3 = go40Var.m;
        Long l4 = go40Var.l;
        Long l5 = go40Var.k;
        Long l6 = go40Var.j;
        Long l7 = go40Var.i;
        String str = go40Var.h;
        Boolean bool3 = go40Var.g;
        Boolean bool4 = go40Var.f;
        Boolean bool5 = go40Var.e;
        Double d = go40Var.d;
        String str2 = go40Var.c;
        String str3 = go40Var.b;
        Integer num = go40Var.f11612a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = go40.t;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || ylVar != null) {
            cldVarA.p(ugi0Var, 17, ul.f35850a, ylVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
