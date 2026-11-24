package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zn40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zn40 f44657a;
    private static final ugi0 descriptor;

    static {
        zn40 zn40Var = new zn40();
        f44657a = zn40Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.ie.impl.data.models.responses.MoneyLimitResponse", zn40Var, 18);
        zna0Var.j("limitType", true);
        zna0Var.j("currency", true);
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
        a8z[] a8zVarArr = lo40.s;
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ2 = mrv.j0(tblVar);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ3 = mrv.j0(sm8Var);
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        jiy jiyVarJ5 = mrv.j0(sm8Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(tblVar), mrv.j0(sm8Var), mrv.j0(tblVar), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[15].getValue()), mrv.j0(vl.f37598a), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        Boolean bool;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lo40.s;
        Double d = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Boolean bool2 = null;
        Long l4 = null;
        int i2 = 0;
        Double d2 = null;
        Long l5 = null;
        List list = null;
        zl zlVar = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str = null;
        boolean z = true;
        Integer num2 = null;
        String str2 = null;
        Double d3 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num2;
                    z = false;
                    l = l;
                    str = str;
                    num2 = num;
                    d = d;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num2);
                    i2 |= 1;
                    l = l;
                    bool4 = bool4;
                    str = str;
                    num2 = num;
                    d = d;
                    break;
                case 1:
                    bool = bool4;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i2 |= 2;
                    d3 = d3;
                    bool4 = bool;
                    str = str;
                    d = d;
                    break;
                case 2:
                    bool = bool4;
                    d3 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d3);
                    i2 |= 4;
                    bool4 = bool;
                    str = str;
                    d = d;
                    break;
                case 3:
                    bool = bool4;
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool5);
                    i2 |= 8;
                    bool4 = bool;
                    str = str;
                    d = d;
                    break;
                case 4:
                    bool = bool4;
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool6);
                    i2 |= 16;
                    bool4 = bool;
                    str = str;
                    d = d;
                    break;
                case 5:
                    d = d;
                    str = str;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool4);
                    i2 |= 32;
                    str = str;
                    d = d;
                    break;
                case 6:
                    d = d;
                    str = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str);
                    i2 |= 64;
                    bool4 = bool4;
                    d = d;
                    break;
                case 7:
                    bool4 = bool4;
                    str = str;
                    l4 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l4);
                    i2 |= 128;
                    bool4 = bool4;
                    str = str;
                    break;
                case 8:
                    bool4 = bool4;
                    str = str;
                    l3 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l3);
                    i2 |= 256;
                    bool4 = bool4;
                    str = str;
                    break;
                case 9:
                    bool4 = bool4;
                    str = str;
                    l2 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l2);
                    i2 |= 512;
                    bool4 = bool4;
                    str = str;
                    break;
                case 10:
                    bool4 = bool4;
                    str = str;
                    l = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l);
                    i2 |= 1024;
                    bool4 = bool4;
                    str = str;
                    break;
                case 11:
                    bool4 = bool4;
                    str = str;
                    d = (Double) bldVarA.e(ugi0Var, 11, tbl.f33669a, d);
                    i2 |= 2048;
                    bool4 = bool4;
                    str = str;
                    break;
                case 12:
                    bool4 = bool4;
                    str = str;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool2);
                    i2 |= 4096;
                    bool4 = bool4;
                    str = str;
                    break;
                case 13:
                    bool4 = bool4;
                    str = str;
                    d2 = (Double) bldVarA.e(ugi0Var, 13, tbl.f33669a, d2);
                    i2 |= 8192;
                    bool4 = bool4;
                    str = str;
                    break;
                case 14:
                    bool4 = bool4;
                    str = str;
                    l5 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l5);
                    i2 |= 16384;
                    bool4 = bool4;
                    str = str;
                    break;
                case 15:
                    list = (List) bldVarA.e(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list);
                    i = 32768;
                    i2 |= i;
                    bool4 = bool4;
                    str = str;
                    break;
                case 16:
                    zlVar = (zl) bldVarA.e(ugi0Var, 16, vl.f37598a, zlVar);
                    i = 65536;
                    i2 |= i;
                    bool4 = bool4;
                    str = str;
                    break;
                case 17:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 17, sm8.f32432a, bool3);
                    i = 131072;
                    i2 |= i;
                    bool4 = bool4;
                    str = str;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Double d4 = d;
        String str3 = str;
        bldVarA.c(ugi0Var);
        return new lo40(i2, num2, str2, d3, bool5, bool6, bool4, str3, l4, l3, l2, l, d4, bool2, d2, l5, list, zlVar, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lo40 lo40Var = (lo40) obj;
        lo40Var.getClass();
        Boolean bool = lo40Var.r;
        zl zlVar = lo40Var.q;
        List list = lo40Var.p;
        Long l = lo40Var.o;
        Double d = lo40Var.n;
        Boolean bool2 = lo40Var.m;
        Double d2 = lo40Var.l;
        Long l2 = lo40Var.k;
        Long l3 = lo40Var.j;
        Long l4 = lo40Var.i;
        Long l5 = lo40Var.h;
        String str = lo40Var.g;
        Boolean bool3 = lo40Var.f;
        Boolean bool4 = lo40Var.e;
        Boolean bool5 = lo40Var.d;
        Double d3 = lo40Var.c;
        String str2 = lo40Var.b;
        Integer num = lo40Var.f20374a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lo40.s;
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d3);
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
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 11, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || d != 0) {
            cldVarA.p(ugi0Var, 13, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || zlVar != null) {
            cldVarA.p(ugi0Var, 16, vl.f37598a, zlVar);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 17, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
