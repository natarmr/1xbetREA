package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r490 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r490 f29826a;
    private static final ugi0 descriptor;

    static {
        r490 r490Var = new r490();
        f29826a = r490Var;
        zna0 zna0Var = new zna0("org.xplatform.remoteconfig.data.PaymentConfig", r490Var, 21);
        zna0Var.j("paymentHost", true);
        zna0Var.j("popularSportsCount", true);
        zna0Var.j("popularTab", true);
        zna0Var.j("popularCategories", true);
        zna0Var.j("ReferalLink", true);
        zna0Var.j("RegistrationAgreements", true);
        zna0Var.j("xGamesName", true);
        zna0Var.j("RestorePasswordAllowedCountries", true);
        zna0Var.j("RestorePasswordForbiddenCountries", true);
        zna0Var.j("redirectToPaymentAfterLogin", true);
        zna0Var.j("hasPaymentRequests", true);
        zna0Var.j("hasPaymentAccountNumberKz", true);
        zna0Var.j("hasExpressBoost", true);
        zna0Var.j("hasBetsOnFavorite", true);
        zna0Var.j("isNewPromotions", true);
        zna0Var.j("hasCheckPushAlert", true);
        zna0Var.j("isAutomaticSubscriptionFavorite", true);
        zna0Var.j("consultantURL", true);
        zna0Var.j("hasSportCustomBanner", true);
        zna0Var.j("SwipeStakeMustBeSet", true);
        zna0Var.j("mlPopularAllowedGeo", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = t490.v;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(okx.f25427a);
        jiy jiyVarJ2 = mrv.j0((jiy) a8zVarArr[2].getValue());
        jiy jiyVarJ3 = mrv.j0((jiy) a8zVarArr[3].getValue());
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0((jiy) a8zVarArr[7].getValue());
        jiy jiyVarJ8 = mrv.j0((jiy) a8zVarArr[8].getValue());
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[20].getValue())};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Integer, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ?? r1;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = t490.v;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        List list = null;
        Boolean bool4 = null;
        int i = 0;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        String str = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        List list2 = null;
        boolean z = true;
        String str2 = null;
        Integer num = null;
        List list3 = null;
        List list4 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    bool9 = bool9;
                    list5 = list5;
                    str = str;
                    str5 = str5;
                    bool8 = bool8;
                    str4 = str4;
                    bool7 = bool7;
                    str3 = str3;
                    bool6 = bool6;
                    z = false;
                    list = list;
                    bool = bool;
                    bool5 = bool5;
                    bool10 = bool10;
                    list2 = list2;
                    str2 = str2;
                    list4 = list4;
                    bool4 = bool4;
                    bool6 = bool6;
                    str3 = str3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    str5 = str5;
                    str = str;
                    list5 = list5;
                    bool9 = bool9;
                    break;
                case 0:
                    Boolean bool11 = bool3;
                    i |= 1;
                    list = list;
                    bool4 = bool4;
                    bool = bool;
                    bool5 = bool5;
                    bool10 = bool10;
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    list4 = list4;
                    bool3 = bool11;
                    bool6 = bool6;
                    list2 = list2;
                    str3 = str3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    str5 = str5;
                    str = str;
                    list5 = list5;
                    bool9 = bool9;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    list = list;
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    bool10 = bool10;
                    list2 = list2;
                    list4 = list4;
                    bool6 = bool6;
                    str3 = str3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    str5 = str5;
                    str = str;
                    list5 = list5;
                    bool9 = bool9;
                    break;
                case 2:
                    list3 = (List) bldVarA.e(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list3);
                    i |= 4;
                    list = list;
                    bool3 = bool3;
                    bool5 = bool5;
                    bool10 = bool10;
                    list2 = list2;
                    list4 = list4;
                    bool6 = bool6;
                    str3 = str3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    str5 = str5;
                    str = str;
                    list5 = list5;
                    bool9 = bool9;
                    break;
                case 3:
                    list4 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list4);
                    i |= 8;
                    list = list;
                    bool3 = bool3;
                    bool6 = bool6;
                    bool10 = bool10;
                    list2 = list2;
                    str3 = str3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    str5 = str5;
                    str = str;
                    list5 = list5;
                    bool9 = bool9;
                    break;
                case 4:
                    bool9 = bool9;
                    list5 = list5;
                    str = str;
                    str5 = str5;
                    bool8 = bool8;
                    str4 = str4;
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    list = list;
                    bool3 = bool3;
                    bool7 = bool7;
                    bool10 = bool10;
                    list2 = list2;
                    str4 = str4;
                    bool8 = bool8;
                    str5 = str5;
                    str = str;
                    list5 = list5;
                    bool9 = bool9;
                    break;
                case 5:
                    bool9 = bool9;
                    list5 = list5;
                    str = str;
                    str5 = str5;
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    list = list;
                    bool3 = bool3;
                    bool8 = bool8;
                    bool10 = bool10;
                    list2 = list2;
                    str5 = str5;
                    str = str;
                    list5 = list5;
                    bool9 = bool9;
                    break;
                case 6:
                    bool9 = bool9;
                    list5 = list5;
                    str5 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str5);
                    i |= 64;
                    list = list;
                    bool3 = bool3;
                    str = str;
                    bool10 = bool10;
                    list2 = list2;
                    list5 = list5;
                    bool9 = bool9;
                    break;
                case 7:
                    list5 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list5);
                    i |= 128;
                    list = list;
                    bool3 = bool3;
                    bool9 = bool9;
                    bool10 = bool10;
                    list2 = list2;
                    break;
                case 8:
                    list = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    bool3 = bool3;
                    bool10 = bool10;
                    list2 = list2;
                    break;
                case 9:
                    list2 = list2;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool3);
                    i |= 512;
                    list = list;
                    list2 = list2;
                    break;
                case 10:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool2);
                    i |= 1024;
                    list = list;
                    bool3 = bool3;
                    break;
                case 11:
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i |= 2048;
                    list = list;
                    bool3 = bool3;
                    break;
                case 12:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool4);
                    i |= 4096;
                    list = list;
                    bool3 = bool3;
                    break;
                case 13:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool5);
                    i |= 8192;
                    list = list;
                    bool3 = bool3;
                    break;
                case 14:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool6);
                    i |= 16384;
                    list = list;
                    bool3 = bool3;
                    break;
                case 15:
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool7);
                    i |= 32768;
                    list = list;
                    bool3 = bool3;
                    break;
                case 16:
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 16, sm8.f32432a, bool8);
                    i |= 65536;
                    list = list;
                    bool3 = bool3;
                    break;
                case 17:
                    str = (String) bldVarA.e(ugi0Var, 17, ysm0.f43175a, str);
                    i |= 131072;
                    list = list;
                    bool3 = bool3;
                    break;
                case 18:
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool9);
                    i |= 262144;
                    list = list;
                    bool3 = bool3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    bool10 = (Boolean) bldVarA.e(ugi0Var, 19, sm8.f32432a, bool10);
                    i |= 524288;
                    list = list;
                    bool3 = bool3;
                    break;
                case 20:
                    list2 = (List) bldVarA.e(ugi0Var, 20, (jiy) a8zVarArr[20].getValue(), list2);
                    i |= 1048576;
                    list = list;
                    bool3 = bool3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool12 = bool4;
        Boolean bool13 = bool9;
        Boolean bool14 = bool10;
        List list6 = list2;
        String str6 = str2;
        List list7 = list5;
        Boolean bool15 = bool;
        Boolean bool16 = bool3;
        List list8 = list;
        String str7 = str;
        Integer num2 = num;
        String str8 = str5;
        Boolean bool17 = bool8;
        String str9 = str4;
        Boolean bool18 = bool7;
        String str10 = str3;
        Boolean bool19 = bool6;
        List list9 = list4;
        Boolean bool20 = bool5;
        List list10 = list3;
        bldVarA.c(ugi0Var);
        t490 t490Var = new t490();
        if ((i & 1) == 0) {
            r1 = 0;
            t490Var.f33309a = null;
        } else {
            r1 = 0;
            t490Var.f33309a = str6;
        }
        if ((i & 2) == 0) {
            t490Var.b = r1;
        } else {
            t490Var.b = num2;
        }
        if ((i & 4) == 0) {
            t490Var.c = r1;
        } else {
            t490Var.c = list10;
        }
        if ((i & 8) == 0) {
            t490Var.d = r1;
        } else {
            t490Var.d = list9;
        }
        if ((i & 16) == 0) {
            t490Var.e = r1;
        } else {
            t490Var.e = str10;
        }
        if ((i & 32) == 0) {
            t490Var.f = r1;
        } else {
            t490Var.f = str9;
        }
        if ((i & 64) == 0) {
            t490Var.g = r1;
        } else {
            t490Var.g = str8;
        }
        if ((i & 128) == 0) {
            t490Var.h = r1;
        } else {
            t490Var.h = list7;
        }
        if ((i & 256) == 0) {
            t490Var.i = r1;
        } else {
            t490Var.i = list8;
        }
        if ((i & 512) == 0) {
            t490Var.j = r1;
        } else {
            t490Var.j = bool16;
        }
        if ((i & 1024) == 0) {
            t490Var.k = r1;
        } else {
            t490Var.k = bool2;
        }
        if ((i & 2048) == 0) {
            t490Var.l = r1;
        } else {
            t490Var.l = bool15;
        }
        if ((i & 4096) == 0) {
            t490Var.m = r1;
        } else {
            t490Var.m = bool12;
        }
        if ((i & 8192) == 0) {
            t490Var.n = r1;
        } else {
            t490Var.n = bool20;
        }
        if ((i & 16384) == 0) {
            t490Var.o = r1;
        } else {
            t490Var.o = bool19;
        }
        if ((i & 32768) == 0) {
            t490Var.p = r1;
        } else {
            t490Var.p = bool18;
        }
        if ((i & 65536) == 0) {
            t490Var.q = r1;
        } else {
            t490Var.q = bool17;
        }
        if ((i & 131072) == 0) {
            t490Var.r = r1;
        } else {
            t490Var.r = str7;
        }
        if ((i & 262144) == 0) {
            t490Var.s = r1;
        } else {
            t490Var.s = bool13;
        }
        if ((i & 524288) == 0) {
            t490Var.t = r1;
        } else {
            t490Var.t = bool14;
        }
        if ((i & 1048576) == 0) {
            t490Var.u = r1;
            return t490Var;
        }
        t490Var.u = list6;
        return t490Var;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t490 t490Var = (t490) obj;
        t490Var.getClass();
        List list = t490Var.u;
        Boolean bool = t490Var.t;
        Boolean bool2 = t490Var.s;
        String str = t490Var.r;
        Boolean bool3 = t490Var.q;
        Boolean bool4 = t490Var.p;
        Boolean bool5 = t490Var.o;
        Boolean bool6 = t490Var.n;
        Boolean bool7 = t490Var.m;
        Boolean bool8 = t490Var.l;
        Boolean bool9 = t490Var.k;
        Boolean bool10 = t490Var.j;
        List list2 = t490Var.i;
        List list3 = t490Var.h;
        String str2 = t490Var.g;
        String str3 = t490Var.f;
        String str4 = t490Var.e;
        List list4 = t490Var.d;
        List list5 = t490Var.c;
        Integer num = t490Var.b;
        String str5 = t490Var.f33309a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = t490.v;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 2, (jiy) a8zVarArr[2].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || bool10 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool10);
        }
        if (cldVarA.u(ugi0Var) || bool9 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool9);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 16, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 17, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 19, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 20, (jiy) a8zVarArr[20].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
