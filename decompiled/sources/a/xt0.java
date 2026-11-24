package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xt0 f41441a;
    private static final ugi0 descriptor;

    static {
        xt0 xt0Var = new xt0();
        f41441a = xt0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorGameData", xt0Var, 25);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("productId", true);
        zna0Var.j("providerId", true);
        zna0Var.j("productName", true);
        zna0Var.j("brandId", true);
        zna0Var.j("brandName", true);
        zna0Var.j("name", true);
        zna0Var.j("popular", true);
        zna0Var.j("promo", true);
        zna0Var.j("new", true);
        zna0Var.j("hot", true);
        zna0Var.j("sort", true);
        zna0Var.j("origSort", true);
        zna0Var.j("flags", true);
        zna0Var.j("limits", true);
        zna0Var.j("xImg", true);
        zna0Var.j("overlay", true);
        zna0Var.j("logoUrl", true);
        zna0Var.j("imgWebpPath", true);
        zna0Var.j("categories", true);
        zna0Var.j("demoNotExists", true);
        zna0Var.j("noLoyalty", true);
        zna0Var.j("bonusWageringBan", true);
        zna0Var.j("needTransfer", true);
        zna0Var.j("useSmartSearch", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = zt0.z;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(s710Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ7 = mrv.j0(sm8Var);
        jiy jiyVarJ8 = mrv.j0(sm8Var);
        jiy jiyVarJ9 = mrv.j0(sm8Var);
        jiy jiyVarJ10 = mrv.j0(sm8Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[19].getValue()), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = zt0.z;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num2 = null;
        Boolean bool5 = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        boolean z = true;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str7 = null;
        Long l5 = null;
        String str8 = null;
        String str9 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Integer num3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l2;
                    z = false;
                    bool2 = bool2;
                    str = str;
                    l2 = l;
                    bool = bool;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    i2 |= 1;
                    bool2 = bool2;
                    num2 = num2;
                    str = str;
                    l2 = l;
                    bool = bool;
                    break;
                case 1:
                    num = num2;
                    l3 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l3);
                    i2 |= 2;
                    l4 = l4;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 2:
                    num = num2;
                    l4 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l4);
                    i2 |= 4;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 3:
                    num = num2;
                    str7 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str7);
                    i2 |= 8;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 4:
                    num = num2;
                    l5 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l5);
                    i2 |= 16;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 5:
                    num = num2;
                    str8 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str8);
                    i2 |= 32;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 6:
                    num = num2;
                    str9 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str9);
                    i2 |= 64;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 7:
                    num = num2;
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool6);
                    i2 |= 128;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 8:
                    num = num2;
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool7);
                    i2 |= 256;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 9:
                    num = num2;
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool8);
                    i2 |= 512;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 10:
                    num = num2;
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool9);
                    i2 |= 1024;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 11:
                    num = num2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num3);
                    i2 |= 2048;
                    num2 = num;
                    str = str;
                    bool = bool;
                    break;
                case 12:
                    bool = bool;
                    str = str;
                    num2 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num2);
                    i2 |= 4096;
                    str = str;
                    bool = bool;
                    break;
                case 13:
                    bool = bool;
                    str = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str);
                    i2 |= 8192;
                    num2 = num2;
                    bool = bool;
                    break;
                case 14:
                    num2 = num2;
                    str = str;
                    str2 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str2);
                    i2 |= 16384;
                    num2 = num2;
                    str = str;
                    break;
                case 15:
                    str3 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str3);
                    i = 32768;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 16:
                    str4 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str4);
                    i = 65536;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 17:
                    str5 = (String) bldVarA.e(ugi0Var, 17, ysm0.f43175a, str5);
                    i = 131072;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 18:
                    str6 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str6);
                    i = 262144;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    list = (List) bldVarA.e(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list);
                    i = 524288;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 20:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 20, sm8.f32432a, bool5);
                    i = 1048576;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 21:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 21, sm8.f32432a, bool4);
                    i = 2097152;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 22:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 22, sm8.f32432a, bool3);
                    i = 4194304;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 23:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 23, sm8.f32432a, bool2);
                    i = 8388608;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 24:
                    bool = (Boolean) bldVarA.e(ugi0Var, 24, sm8.f32432a, bool);
                    i = 16777216;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool10 = bool;
        String str10 = str;
        Long l6 = l2;
        Long l7 = l3;
        Long l8 = l4;
        bldVarA.c(ugi0Var);
        Boolean bool11 = bool8;
        List list2 = list;
        return new zt0(i2, l6, l7, l8, str7, l5, str8, str9, bool6, bool7, bool11, bool9, num3, num2, str10, str2, str3, str4, str5, str6, list2, bool5, bool4, bool3, bool2, bool10);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zt0 zt0Var = (zt0) obj;
        zt0Var.getClass();
        Boolean bool = zt0Var.y;
        Boolean bool2 = zt0Var.x;
        Boolean bool3 = zt0Var.w;
        Boolean bool4 = zt0Var.v;
        Boolean bool5 = zt0Var.u;
        List list = zt0Var.t;
        String str = zt0Var.s;
        String str2 = zt0Var.r;
        String str3 = zt0Var.q;
        String str4 = zt0Var.p;
        String str5 = zt0Var.o;
        String str6 = zt0Var.n;
        Integer num = zt0Var.m;
        Integer num2 = zt0Var.l;
        Boolean bool6 = zt0Var.k;
        Boolean bool7 = zt0Var.j;
        Boolean bool8 = zt0Var.i;
        Boolean bool9 = zt0Var.h;
        String str7 = zt0Var.g;
        String str8 = zt0Var.f;
        Long l = zt0Var.e;
        String str9 = zt0Var.d;
        Long l2 = zt0Var.c;
        Long l3 = zt0Var.b;
        Long l4 = zt0Var.f44932a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = zt0.z;
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || bool9 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool9);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str6 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 17, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 20, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 21, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 22, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 23, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 24, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
