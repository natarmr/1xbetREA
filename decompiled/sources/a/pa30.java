package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pa30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pa30 f26636a;
    private static final ugi0 descriptor;

    static {
        pa30 pa30Var = new pa30();
        f26636a = pa30Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.MatchInfoResponse", pa30Var, 27);
        zna0Var.j("tournamentStage", true);
        zna0Var.j("location", true);
        zna0Var.j("matchFormat", true);
        zna0Var.j("seriesScore", true);
        zna0Var.j("seedNum1", true);
        zna0Var.j("seedNum2", true);
        zna0Var.j("locationCity", true);
        zna0Var.j("weather", true);
        zna0Var.j("temperature", true);
        zna0Var.j("surface", true);
        zna0Var.j("locationCountry", true);
        zna0Var.j("locationCityId", true);
        zna0Var.j("stadiumId", true);
        zna0Var.j("h2HLastScore", true);
        zna0Var.j("weatherCode", true);
        zna0Var.j("weatherDescription", true);
        zna0Var.j("weatherWindCode", true);
        zna0Var.j("weatherWindParam", true);
        zna0Var.j("weatherWindDescription", true);
        zna0Var.j("weatherPressure", true);
        zna0Var.j("weatherPressureDescription", true);
        zna0Var.j("weatherHumidity", true);
        zna0Var.j("weatherHumidityDescription", true);
        zna0Var.j("unplayedBalls", true);
        zna0Var.j("weatherPrecipitationChance", true);
        zna0Var.j("weatherPrecipitationChanceDescription", true);
        zna0Var.j("tennisSetsCountDescription", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i2 = 0;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        boolean z = true;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        String str28 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str4 = str4;
                    str8 = str8;
                    str15 = str15;
                    str3 = str3;
                    break;
                case 0:
                    str2 = str2;
                    i2 |= 1;
                    str4 = str4;
                    str3 = str3;
                    str8 = str8;
                    str15 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str15);
                    str2 = str2;
                    break;
                case 1:
                    str = str8;
                    str16 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str16);
                    i2 |= 2;
                    str17 = str17;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 2:
                    str = str8;
                    str17 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str17);
                    i2 |= 4;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 3:
                    str = str8;
                    str18 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str18);
                    i2 |= 8;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 4:
                    str = str8;
                    str19 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str19);
                    i2 |= 16;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 5:
                    str = str8;
                    str20 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str20);
                    i2 |= 32;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 6:
                    str = str8;
                    str21 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str21);
                    i2 |= 64;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 7:
                    str = str8;
                    str22 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str22);
                    i2 |= 128;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 8:
                    str = str8;
                    str23 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str23);
                    i2 |= 256;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 9:
                    str = str8;
                    str24 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str24);
                    i2 |= 512;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 10:
                    str = str8;
                    str25 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str25);
                    i2 |= 1024;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 11:
                    str = str8;
                    str26 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str26);
                    i2 |= 2048;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 12:
                    str = str8;
                    str27 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str27);
                    i2 |= 4096;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 13:
                    str = str8;
                    str28 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str28);
                    i2 |= 8192;
                    str3 = str3;
                    str8 = str;
                    str2 = str2;
                    break;
                case 14:
                    str2 = str2;
                    str8 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str8);
                    i2 |= 16384;
                    str2 = str2;
                    break;
                case 15:
                    str9 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str9);
                    i = 32768;
                    i2 |= i;
                    str8 = str8;
                    break;
                case 16:
                    str10 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str10);
                    i = 65536;
                    i2 |= i;
                    str8 = str8;
                    break;
                case 17:
                    str11 = (String) bldVarA.e(ugi0Var, 17, ysm0.f43175a, str11);
                    i = 131072;
                    i2 |= i;
                    str8 = str8;
                    break;
                case 18:
                    str12 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str12);
                    i = 262144;
                    i2 |= i;
                    str8 = str8;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str13 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str13);
                    i = 524288;
                    i2 |= i;
                    str8 = str8;
                    break;
                case 20:
                    str14 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str14);
                    i = 1048576;
                    i2 |= i;
                    str8 = str8;
                    break;
                case 21:
                    str6 = (String) bldVarA.e(ugi0Var, 21, ysm0.f43175a, str6);
                    i = 2097152;
                    i2 |= i;
                    str8 = str8;
                    break;
                case 22:
                    str4 = (String) bldVarA.e(ugi0Var, 22, ysm0.f43175a, str4);
                    i = 4194304;
                    i2 |= i;
                    str8 = str8;
                    break;
                case 23:
                    str3 = (String) bldVarA.e(ugi0Var, 23, ysm0.f43175a, str3);
                    i = 8388608;
                    i2 |= i;
                    str8 = str8;
                    break;
                case 24:
                    str2 = (String) bldVarA.e(ugi0Var, 24, ysm0.f43175a, str2);
                    i = 16777216;
                    i2 |= i;
                    str8 = str8;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    str5 = (String) bldVarA.e(ugi0Var, 25, ysm0.f43175a, str5);
                    i = 33554432;
                    i2 |= i;
                    str8 = str8;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    str7 = (String) bldVarA.e(ugi0Var, 26, ysm0.f43175a, str7);
                    i = 67108864;
                    i2 |= i;
                    str8 = str8;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str29 = str3;
        String str30 = str8;
        String str31 = str15;
        String str32 = str16;
        String str33 = str17;
        String str34 = str4;
        bldVarA.c(ugi0Var);
        String str35 = str24;
        String str36 = str13;
        String str37 = str25;
        String str38 = str14;
        return new ta30(i2, str31, str32, str33, str18, str19, str20, str21, str22, str23, str35, str37, str26, str27, str28, str30, str9, str10, str11, str12, str36, str38, str6, str34, str29, str2, str5, str7);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ta30 ta30Var = (ta30) obj;
        ta30Var.getClass();
        String str = ta30Var.A;
        String str2 = ta30Var.z;
        String str3 = ta30Var.y;
        String str4 = ta30Var.x;
        String str5 = ta30Var.w;
        String str6 = ta30Var.v;
        String str7 = ta30Var.u;
        String str8 = ta30Var.t;
        String str9 = ta30Var.s;
        String str10 = ta30Var.r;
        String str11 = ta30Var.q;
        String str12 = ta30Var.p;
        String str13 = ta30Var.o;
        String str14 = ta30Var.n;
        String str15 = ta30Var.m;
        String str16 = ta30Var.l;
        String str17 = ta30Var.k;
        String str18 = ta30Var.j;
        String str19 = ta30Var.i;
        String str20 = ta30Var.h;
        String str21 = ta30Var.g;
        String str22 = ta30Var.f;
        String str23 = ta30Var.e;
        String str24 = ta30Var.d;
        String str25 = ta30Var.c;
        String str26 = ta30Var.b;
        String str27 = ta30Var.f33596a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str27 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str27);
        }
        if (cldVarA.u(ugi0Var) || str26 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str26);
        }
        if (cldVarA.u(ugi0Var) || str25 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str25);
        }
        if (cldVarA.u(ugi0Var) || str24 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str24);
        }
        if (cldVarA.u(ugi0Var) || str23 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str23);
        }
        if (cldVarA.u(ugi0Var) || str22 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str22);
        }
        if (cldVarA.u(ugi0Var) || str21 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str21);
        }
        if (cldVarA.u(ugi0Var) || str20 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str20);
        }
        if (cldVarA.u(ugi0Var) || str19 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str19);
        }
        if (cldVarA.u(ugi0Var) || str18 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str18);
        }
        if (cldVarA.u(ugi0Var) || str17 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str17);
        }
        if (cldVarA.u(ugi0Var) || str16 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str16);
        }
        if (cldVarA.u(ugi0Var) || str15 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str15);
        }
        if (cldVarA.u(ugi0Var) || str14 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str14);
        }
        if (cldVarA.u(ugi0Var) || str13 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str13);
        }
        if (cldVarA.u(ugi0Var) || str12 != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str12);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 17, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 21, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 22, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 23, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 24, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 25, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 26, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
