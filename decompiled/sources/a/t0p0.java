package a;

import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0p0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0p0 f33130a;
    private static final ugi0 descriptor;

    static {
        t0p0 t0p0Var = new t0p0();
        f33130a = t0p0Var;
        zna0 zna0Var = new zna0("org.xplatform.favorites.impl.data.teambet.models.TeamBetIndicatorsResponse", t0p0Var, 23);
        zna0Var.j("diffGoals", true);
        zna0Var.j("teamsScored", true);
        zna0Var.j("totalGoals3", true);
        zna0Var.j("totalCorners10", true);
        zna0Var.j("totalYellowCards5", true);
        zna0Var.j("goals5", true);
        zna0Var.j("totalGoals2", true);
        zna0Var.j("winFirst", true);
        zna0Var.j("lossFirst", true);
        zna0Var.j("holdServe", true);
        zna0Var.j("twoSetRate", true);
        zna0Var.j("winCount3Set", true);
        zna0Var.j("winCountLossOneSet", true);
        zna0Var.j("countSet9_5", true);
        zna0Var.j("teamRunRate", true);
        zna0Var.j("teamBatAvg", true);
        zna0Var.j("teamBowlAvg", true);
        zna0Var.j("netPro", true);
        zna0Var.j("diffScore", true);
        zna0Var.j("totalAVGQuarter", true);
        zna0Var.j("totalAVGTeamQuarter", true);
        zna0Var.j("winCountHalf1", true);
        zna0Var.j("win3Qplus", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        jiy jiyVarJ9 = mrv.j0(okxVar);
        jiy jiyVarJ10 = mrv.j0(okxVar);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        jiy jiyVarJ13 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        Integer num4 = null;
        int i2 = 0;
        Integer num5 = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        boolean z = true;
        Integer num9 = null;
        String str3 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        String str4 = null;
        String str5 = null;
        Integer num15 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num3 = num3;
                    z = false;
                    num2 = num2;
                    num9 = num9;
                    num3 = num3;
                    break;
                case 0:
                    str = str;
                    i2 |= 1;
                    str3 = str3;
                    num2 = num2;
                    num3 = num3;
                    num9 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num9);
                    str = str;
                    break;
                case 1:
                    num = num2;
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i2 |= 2;
                    num10 = num10;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 2:
                    num = num2;
                    num10 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num10);
                    i2 |= 4;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 3:
                    num = num2;
                    num11 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num11);
                    i2 |= 8;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 4:
                    num = num2;
                    num12 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num12);
                    i2 |= 16;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 5:
                    num = num2;
                    num13 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num13);
                    i2 |= 32;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 6:
                    num = num2;
                    num14 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num14);
                    i2 |= 64;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 7:
                    num = num2;
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i2 |= 128;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 8:
                    num = num2;
                    str5 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str5);
                    i2 |= 256;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 9:
                    num = num2;
                    num15 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num15);
                    i2 |= 512;
                    num2 = num;
                    str = str;
                    num3 = num3;
                    break;
                case 10:
                    num3 = num3;
                    str = str;
                    num2 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num2);
                    i2 |= 1024;
                    str = str;
                    num3 = num3;
                    break;
                case 11:
                    num3 = num3;
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i2 |= 2048;
                    num2 = num2;
                    num3 = num3;
                    break;
                case 12:
                    str = str;
                    num2 = num2;
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i2 |= 4096;
                    num2 = num2;
                    str = str;
                    break;
                case 13:
                    str = str;
                    num2 = num2;
                    num5 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num5);
                    i2 |= 8192;
                    num2 = num2;
                    str = str;
                    break;
                case 14:
                    str = str;
                    num2 = num2;
                    d = (Double) bldVarA.e(ugi0Var, 14, tbl.f33669a, d);
                    i2 |= 16384;
                    num2 = num2;
                    str = str;
                    break;
                case 15:
                    d2 = (Double) bldVarA.e(ugi0Var, 15, tbl.f33669a, d2);
                    i = 32768;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 16:
                    d3 = (Double) bldVarA.e(ugi0Var, 16, tbl.f33669a, d3);
                    i = 65536;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 17:
                    d4 = (Double) bldVarA.e(ugi0Var, 17, tbl.f33669a, d4);
                    i = 131072;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 18:
                    num6 = (Integer) bldVarA.e(ugi0Var, 18, okx.f25427a, num6);
                    i = 262144;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    num7 = (Integer) bldVarA.e(ugi0Var, 19, okx.f25427a, num7);
                    i = 524288;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 20:
                    num8 = (Integer) bldVarA.e(ugi0Var, 20, okx.f25427a, num8);
                    i = 1048576;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 21:
                    num4 = (Integer) bldVarA.e(ugi0Var, 21, okx.f25427a, num4);
                    i = 2097152;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                case 22:
                    num3 = (Integer) bldVarA.e(ugi0Var, 22, okx.f25427a, num3);
                    i = 4194304;
                    i2 |= i;
                    num2 = num2;
                    str = str;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num16 = num2;
        Integer num17 = num3;
        Integer num18 = num9;
        String str6 = str3;
        Integer num19 = num10;
        bldVarA.c(ugi0Var);
        Integer num20 = num15;
        Integer num21 = num7;
        return new v0p0(i2, num18, str6, num19, num11, num12, num13, num14, str4, str5, num20, num16, str, str2, num5, d, d2, d3, d4, num6, num21, num8, num4, num17);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        v0p0 v0p0Var = (v0p0) obj;
        v0p0Var.getClass();
        Integer num = v0p0Var.w;
        Integer num2 = v0p0Var.v;
        Integer num3 = v0p0Var.u;
        Integer num4 = v0p0Var.t;
        Integer num5 = v0p0Var.s;
        Double d = v0p0Var.r;
        Double d2 = v0p0Var.q;
        Double d3 = v0p0Var.p;
        Double d4 = v0p0Var.o;
        Integer num6 = v0p0Var.n;
        String str = v0p0Var.m;
        String str2 = v0p0Var.l;
        Integer num7 = v0p0Var.k;
        Integer num8 = v0p0Var.j;
        String str3 = v0p0Var.i;
        String str4 = v0p0Var.h;
        Integer num9 = v0p0Var.g;
        Integer num10 = v0p0Var.f;
        Integer num11 = v0p0Var.e;
        Integer num12 = v0p0Var.d;
        Integer num13 = v0p0Var.c;
        String str5 = v0p0Var.b;
        Integer num14 = v0p0Var.f36592a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num14 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num14);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || num13 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num13);
        }
        if (cldVarA.u(ugi0Var) || num12 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num12);
        }
        if (cldVarA.u(ugi0Var) || num11 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num11);
        }
        if (cldVarA.u(ugi0Var) || num10 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num10);
        }
        if (cldVarA.u(ugi0Var) || num9 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num9);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num6 != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 14, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 15, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 16, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 17, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 18, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 19, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 20, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 21, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 22, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
