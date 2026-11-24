package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cwl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cwl0 f5087a;
    private static final ugi0 descriptor;

    static {
        cwl0 cwl0Var = new cwl0();
        f5087a = cwl0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.stadium.impl.core.data.models.StadiumInfoResponse", cwl0Var, 23);
        zna0Var.j("name", true);
        zna0Var.j("architect", true);
        zna0Var.j("covering", true);
        zna0Var.j("address", true);
        zna0Var.j("zipCode", true);
        zna0Var.j("phone", true);
        zna0Var.j("email", true);
        zna0Var.j("website", true);
        zna0Var.j("opened", true);
        zna0Var.j("capacity", true);
        zna0Var.j("owner", true);
        zna0Var.j("developer", true);
        zna0Var.j("homeTeams", true);
        zna0Var.j("cost", true);
        zna0Var.j("category", true);
        zna0Var.j("city", true);
        zna0Var.j("history", true);
        zna0Var.j("oldName", true);
        zna0Var.j("majorEvents", true);
        zna0Var.j("circuits", true);
        zna0Var.j("images", true);
        zna0Var.j("hasInfo", true);
        zna0Var.j("isHideImages", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = lwl0.x;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        jiy jiyVarJ13 = mrv.j0(ysm0Var);
        jiy jiyVarJ14 = mrv.j0(ysm0Var);
        jiy jiyVarJ15 = mrv.j0(ysm0Var);
        jiy jiyVarJ16 = mrv.j0(ysm0Var);
        jiy jiyVarJ17 = mrv.j0(ysm0Var);
        jiy jiyVarJ18 = mrv.j0(ysm0Var);
        jiy jiyVarJ19 = mrv.j0((jiy) a8zVarArr[19].getValue());
        jiy jiyVarJ20 = mrv.j0((jiy) a8zVarArr[20].getValue());
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, jiyVarJ16, jiyVarJ17, jiyVarJ18, jiyVarJ19, jiyVarJ20, mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lwl0.x;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str4 = null;
        List list = null;
        int i2 = 0;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        List list2 = null;
        boolean z = true;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    bool = bool;
                    z = false;
                    str3 = str3;
                    str11 = str11;
                    bool = bool;
                    break;
                case 0:
                    str2 = str2;
                    i2 |= 1;
                    str12 = str12;
                    str3 = str3;
                    bool = bool;
                    str11 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str11);
                    str2 = str2;
                    break;
                case 1:
                    str = str3;
                    str12 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str12);
                    i2 |= 2;
                    str13 = str13;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 2:
                    str = str3;
                    str13 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str13);
                    i2 |= 4;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 3:
                    str = str3;
                    str14 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str14);
                    i2 |= 8;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 4:
                    str = str3;
                    str15 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str15);
                    i2 |= 16;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 5:
                    str = str3;
                    str16 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str16);
                    i2 |= 32;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 6:
                    str = str3;
                    str17 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str17);
                    i2 |= 64;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 7:
                    str = str3;
                    str18 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str18);
                    i2 |= 128;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 8:
                    str = str3;
                    str19 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str19);
                    i2 |= 256;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 9:
                    str = str3;
                    str20 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str20);
                    i2 |= 512;
                    str3 = str;
                    str2 = str2;
                    bool = bool;
                    break;
                case 10:
                    bool = bool;
                    str2 = str2;
                    str3 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str3);
                    i2 |= 1024;
                    str2 = str2;
                    bool = bool;
                    break;
                case 11:
                    bool = bool;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    str3 = str3;
                    bool = bool;
                    break;
                case 12:
                    str2 = str2;
                    str3 = str3;
                    str4 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str4);
                    i2 |= 4096;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 13:
                    str2 = str2;
                    str3 = str3;
                    str5 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str5);
                    i2 |= 8192;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 14:
                    str2 = str2;
                    str3 = str3;
                    str6 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str6);
                    i2 |= 16384;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 15:
                    str7 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str7);
                    i = 32768;
                    i2 |= i;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 16:
                    str8 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str8);
                    i = 65536;
                    i2 |= i;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 17:
                    str9 = (String) bldVarA.e(ugi0Var, 17, ysm0.f43175a, str9);
                    i = 131072;
                    i2 |= i;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 18:
                    str10 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str10);
                    i = 262144;
                    i2 |= i;
                    str3 = str3;
                    str2 = str2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    list2 = (List) bldVarA.e(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list2);
                    i = 524288;
                    i2 |= i;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 20:
                    list = (List) bldVarA.e(ugi0Var, 20, (jiy) a8zVarArr[20].getValue(), list);
                    i = 1048576;
                    i2 |= i;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 21:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 21, sm8.f32432a, bool2);
                    i = 2097152;
                    i2 |= i;
                    str3 = str3;
                    str2 = str2;
                    break;
                case 22:
                    bool = (Boolean) bldVarA.e(ugi0Var, 22, sm8.f32432a, bool);
                    i = 4194304;
                    i2 |= i;
                    str3 = str3;
                    str2 = str2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str21 = str3;
        Boolean bool3 = bool;
        String str22 = str11;
        String str23 = str12;
        String str24 = str13;
        bldVarA.c(ugi0Var);
        String str25 = str20;
        List list3 = list2;
        return new lwl0(i2, str22, str23, str24, str14, str15, str16, str17, str18, str19, str25, str21, str2, str4, str5, str6, str7, str8, str9, str10, list3, list, bool2, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lwl0 lwl0Var = (lwl0) obj;
        lwl0Var.getClass();
        Boolean bool = lwl0Var.w;
        Boolean bool2 = lwl0Var.v;
        List list = lwl0Var.u;
        List list2 = lwl0Var.t;
        String str = lwl0Var.s;
        String str2 = lwl0Var.r;
        String str3 = lwl0Var.q;
        String str4 = lwl0Var.p;
        String str5 = lwl0Var.o;
        String str6 = lwl0Var.n;
        String str7 = lwl0Var.m;
        String str8 = lwl0Var.l;
        String str9 = lwl0Var.k;
        String str10 = lwl0Var.j;
        String str11 = lwl0Var.i;
        String str12 = lwl0Var.h;
        String str13 = lwl0Var.g;
        String str14 = lwl0Var.f;
        String str15 = lwl0Var.e;
        String str16 = lwl0Var.d;
        String str17 = lwl0Var.c;
        String str18 = lwl0Var.b;
        String str19 = lwl0Var.f20770a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lwl0.x;
        if (cldVarA.u(ugi0Var) || str19 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str19);
        }
        if (cldVarA.u(ugi0Var) || str18 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str18);
        }
        if (cldVarA.u(ugi0Var) || str17 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str17);
        }
        if (cldVarA.u(ugi0Var) || str16 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str16);
        }
        if (cldVarA.u(ugi0Var) || str15 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str15);
        }
        if (cldVarA.u(ugi0Var) || str14 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str14);
        }
        if (cldVarA.u(ugi0Var) || str13 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str13);
        }
        if (cldVarA.u(ugi0Var) || str12 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str12);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str7);
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
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 20, (jiy) a8zVarArr[20].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 21, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 22, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
