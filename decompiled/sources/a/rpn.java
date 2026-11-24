package a;

import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rpn implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rpn f30894a;
    private static final ugi0 descriptor;

    static {
        rpn rpnVar = new rpn();
        f30894a = rpnVar;
        zna0 zna0Var = new zna0("org.xplatform.personal.impl.data.models.EditProfileDataRequest.EditFullProfileRequest", rpnVar, 22);
        zna0Var.j("name", true);
        zna0Var.j("surname", true);
        zna0Var.j("middleName", true);
        zna0Var.j("birthday", true);
        zna0Var.j("birthPlace", true);
        zna0Var.j("regionId", true);
        zna0Var.j("countryId", true);
        zna0Var.j("cityId", true);
        zna0Var.j("vidDoc", true);
        zna0Var.j("passportSeries", true);
        zna0Var.j("passportNumber", true);
        zna0Var.j("passportDt", true);
        zna0Var.j("passportWho", true);
        zna0Var.j("passportSubCode", true);
        zna0Var.j("address", true);
        zna0Var.j("inn", true);
        zna0Var.j("snils", true);
        zna0Var.j("bankAccountNumber", true);
        zna0Var.j("sendToVerification", true);
        zna0Var.j("email", true);
        zna0Var.j("nationality", true);
        zna0Var.j("sex", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        String str2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num = null;
        int i2 = 0;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Boolean bool = null;
        String str12 = null;
        Integer num2 = null;
        boolean z = true;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str13;
                    z = false;
                    str5 = str5;
                    str13 = str;
                    str3 = str3;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str13);
                    i2 |= 1;
                    str14 = str14;
                    str5 = str5;
                    str4 = str4;
                    str13 = str;
                    str3 = str3;
                    break;
                case 1:
                    str2 = str5;
                    str14 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str14);
                    i2 |= 2;
                    str15 = str15;
                    str5 = str2;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 2:
                    str2 = str5;
                    str15 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str15);
                    i2 |= 4;
                    str5 = str2;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 3:
                    str2 = str5;
                    str16 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str16);
                    i2 |= 8;
                    str5 = str2;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 4:
                    str2 = str5;
                    str17 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str17);
                    i2 |= 16;
                    str5 = str2;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 5:
                    str2 = str5;
                    num3 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num3);
                    i2 |= 32;
                    str5 = str2;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 6:
                    str2 = str5;
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
                    i2 |= 64;
                    str5 = str2;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 7:
                    str2 = str5;
                    num5 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num5);
                    i2 |= 128;
                    str5 = str2;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 8:
                    str2 = str5;
                    num6 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num6);
                    i2 |= 256;
                    str5 = str2;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 9:
                    str3 = str3;
                    str4 = str4;
                    str5 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str5);
                    i2 |= 512;
                    str4 = str4;
                    str3 = str3;
                    break;
                case 10:
                    str3 = str3;
                    str4 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str4);
                    i2 |= 1024;
                    str5 = str5;
                    str3 = str3;
                    break;
                case 11:
                    str4 = str4;
                    str5 = str5;
                    str3 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str3);
                    i2 |= 2048;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 12:
                    str4 = str4;
                    str5 = str5;
                    str6 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str6);
                    i2 |= 4096;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 13:
                    str4 = str4;
                    str5 = str5;
                    str7 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str7);
                    i2 |= 8192;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 14:
                    str4 = str4;
                    str5 = str5;
                    str8 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str8);
                    i2 |= 16384;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 15:
                    str9 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str9);
                    i = 32768;
                    i2 |= i;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 16:
                    str10 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str10);
                    i = 65536;
                    i2 |= i;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 17:
                    str11 = (String) bldVarA.e(ugi0Var, 17, ysm0.f43175a, str11);
                    i = 131072;
                    i2 |= i;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 18:
                    bool = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool);
                    i = 262144;
                    i2 |= i;
                    str5 = str5;
                    str4 = str4;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str12 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str12);
                    i = 524288;
                    i2 |= i;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 20:
                    num2 = (Integer) bldVarA.e(ugi0Var, 20, okx.f25427a, num2);
                    i = 1048576;
                    i2 |= i;
                    str5 = str5;
                    str4 = str4;
                    break;
                case 21:
                    num = (Integer) bldVarA.e(ugi0Var, 21, okx.f25427a, num);
                    i = 2097152;
                    i2 |= i;
                    str5 = str5;
                    str4 = str4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str18 = str3;
        String str19 = str5;
        String str20 = str13;
        String str21 = str14;
        String str22 = str15;
        bldVarA.c(ugi0Var);
        String str23 = str12;
        return new tpn(i2, str20, str21, str22, str16, str17, num3, num4, num5, num6, str19, str4, str18, str6, str7, str8, str9, str10, str11, bool, str23, num2, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tpn tpnVar = (tpn) obj;
        tpnVar.getClass();
        Integer num = tpnVar.v;
        Integer num2 = tpnVar.u;
        String str = tpnVar.t;
        Boolean bool = tpnVar.s;
        String str2 = tpnVar.r;
        String str3 = tpnVar.q;
        String str4 = tpnVar.p;
        String str5 = tpnVar.o;
        String str6 = tpnVar.n;
        String str7 = tpnVar.m;
        String str8 = tpnVar.l;
        String str9 = tpnVar.k;
        String str10 = tpnVar.j;
        Integer num3 = tpnVar.i;
        Integer num4 = tpnVar.h;
        Integer num5 = tpnVar.g;
        Integer num6 = tpnVar.f;
        String str11 = tpnVar.e;
        String str12 = tpnVar.d;
        String str13 = tpnVar.c;
        String str14 = tpnVar.b;
        String str15 = tpnVar.f34342a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str15 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str15);
        }
        if (cldVarA.u(ugi0Var) || str14 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str14);
        }
        if (cldVarA.u(ugi0Var) || str13 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str13);
        }
        if (cldVarA.u(ugi0Var) || str12 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str12);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num3);
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
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 20, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 21, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
