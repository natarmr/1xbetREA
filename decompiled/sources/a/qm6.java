package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qm6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qm6 f28967a;
    private static final ugi0 descriptor;

    static {
        qm6 qm6Var = new qm6();
        f28967a = qm6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.game_info.BetBuilderWeatherResponse", qm6Var, 17);
        zna0Var.j("weather", true);
        zna0Var.j("temperature", true);
        zna0Var.j("weatherCode", true);
        zna0Var.j("weatherDescription", true);
        zna0Var.j("weatherWindCode", true);
        zna0Var.j("weatherWindParam", true);
        zna0Var.j("weatherWindDescription", true);
        zna0Var.j("weatherPressure", true);
        zna0Var.j("weatherPressureDescription", true);
        zna0Var.j("weatherHumidity", true);
        zna0Var.j("weatherHumidityDescription", true);
        zna0Var.j("weatherWaveHeight", true);
        zna0Var.j("weatherWaveHeightDescription", true);
        zna0Var.j("weatherWaterTemperature", true);
        zna0Var.j("weatherWaterTemperatureDescription", true);
        zna0Var.j("weatherPrecipitationChance", true);
        zna0Var.j("weatherPrecipitationChanceDescription", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
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
        String str7 = null;
        int i2 = 0;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        boolean z = true;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str16;
                    z = false;
                    str4 = str4;
                    str13 = str13;
                    str16 = str;
                    str3 = str3;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str16);
                    i2 |= 1;
                    str4 = str4;
                    str12 = str12;
                    str13 = str13;
                    str16 = str;
                    str3 = str3;
                    break;
                case 1:
                    str2 = str12;
                    str17 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str17);
                    i2 |= 2;
                    str18 = str18;
                    str12 = str2;
                    str13 = str13;
                    str3 = str3;
                    break;
                case 2:
                    str2 = str12;
                    str18 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str18);
                    i2 |= 4;
                    str12 = str2;
                    str13 = str13;
                    str3 = str3;
                    break;
                case 3:
                    str2 = str12;
                    str19 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str19);
                    i2 |= 8;
                    str12 = str2;
                    str13 = str13;
                    str3 = str3;
                    break;
                case 4:
                    str3 = str3;
                    str13 = str13;
                    str12 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str12);
                    i2 |= 16;
                    str13 = str13;
                    str3 = str3;
                    break;
                case 5:
                    str3 = str3;
                    str13 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str13);
                    i2 |= 32;
                    str12 = str12;
                    str3 = str3;
                    break;
                case 6:
                    str12 = str12;
                    str13 = str13;
                    str14 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str14);
                    i2 |= 64;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 7:
                    str12 = str12;
                    str13 = str13;
                    str15 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str15);
                    i2 |= 128;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 8:
                    str12 = str12;
                    str13 = str13;
                    str7 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str7);
                    i2 |= 256;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 9:
                    str12 = str12;
                    str13 = str13;
                    str5 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str5);
                    i2 |= 512;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 10:
                    str12 = str12;
                    str13 = str13;
                    str4 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str4);
                    i2 |= 1024;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 11:
                    str12 = str12;
                    str13 = str13;
                    str3 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str3);
                    i2 |= 2048;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 12:
                    str12 = str12;
                    str13 = str13;
                    str6 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str6);
                    i2 |= 4096;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 13:
                    str12 = str12;
                    str13 = str13;
                    str8 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str8);
                    i2 |= 8192;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 14:
                    str12 = str12;
                    str13 = str13;
                    str9 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str9);
                    i2 |= 16384;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 15:
                    str10 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str10);
                    i = 32768;
                    i2 |= i;
                    str12 = str12;
                    str13 = str13;
                    break;
                case 16:
                    str11 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str11);
                    i = 65536;
                    i2 |= i;
                    str12 = str12;
                    str13 = str13;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str20 = str3;
        String str21 = str13;
        bldVarA.c(ugi0Var);
        return new sm6(i2, str16, str17, str18, str19, str12, str21, str14, str15, str7, str5, str4, str20, str6, str8, str9, str10, str11);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sm6 sm6Var = (sm6) obj;
        sm6Var.getClass();
        String str = sm6Var.q;
        String str2 = sm6Var.p;
        String str3 = sm6Var.o;
        String str4 = sm6Var.n;
        String str5 = sm6Var.m;
        String str6 = sm6Var.l;
        String str7 = sm6Var.k;
        String str8 = sm6Var.j;
        String str9 = sm6Var.i;
        String str10 = sm6Var.h;
        String str11 = sm6Var.g;
        String str12 = sm6Var.f;
        String str13 = sm6Var.e;
        String str14 = sm6Var.d;
        String str15 = sm6Var.c;
        String str16 = sm6Var.b;
        String str17 = sm6Var.f32429a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str17 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str17);
        }
        if (cldVarA.u(ugi0Var) || str16 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str16);
        }
        if (cldVarA.u(ugi0Var) || str15 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str15);
        }
        if (cldVarA.u(ugi0Var) || str14 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str14);
        }
        if (cldVarA.u(ugi0Var) || str13 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str13);
        }
        if (cldVarA.u(ugi0Var) || str12 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str12);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
