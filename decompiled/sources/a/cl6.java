package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cl6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cl6 f4541a;
    private static final ugi0 descriptor;

    static {
        cl6 cl6Var = new cl6();
        f4541a = cl6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.game_info.BetBuilderScoreResponse", cl6Var, 24);
        zna0Var.j("fullScore", true);
        zna0Var.j("periodScores", true);
        zna0Var.j("extendedScore", true);
        zna0Var.j("currentPeriod", true);
        zna0Var.j("currentPeriodName", true);
        zna0Var.j("scoreOpp1", true);
        zna0Var.j("scoreOpp2", true);
        zna0Var.j("subScore", true);
        zna0Var.j("serve", true);
        zna0Var.j("periodScoresStr", true);
        zna0Var.j("timer", true);
        zna0Var.j(ParameterNames.INFO, true);
        zna0Var.j("isBreak", true);
        zna0Var.j("hasCourseOfPlay", true);
        zna0Var.j("tabloStats", true);
        zna0Var.j("fullScoreDetail", true);
        zna0Var.j("periodsCount", true);
        zna0Var.j("points", true);
        zna0Var.j("penalty", true);
        zna0Var.j("statistic", true);
        zna0Var.j("statusLineStr", true);
        zna0Var.j("stageTime", true);
        zna0Var.j("gameStatus", true);
        zna0Var.j("inningsStat", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = el6.y;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(fh6.f9526a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(vl6.f37607a);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(em6.f8032a);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ12 = mrv.j0(sm8Var);
        jiy jiyVarJ13 = mrv.j0(sm8Var);
        jiy jiyVarJ14 = mrv.j0((jiy) a8zVarArr[14].getValue());
        ih6 ih6Var = ih6.f14767a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, mrv.j0(ih6Var), mrv.j0(okxVar), mrv.j0(ih6Var), mrv.j0(pk6.f27120a), mrv.j0(sl6.f32382a), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[23].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        int i;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = el6.y;
        String str2 = null;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        String str3 = null;
        int i2 = 0;
        Boolean bool2 = null;
        Map map = null;
        kh6 kh6Var = null;
        Integer num3 = null;
        kh6 kh6Var2 = null;
        rk6 rk6Var = null;
        ul6 ul6Var = null;
        int i3 = 1;
        boolean z = true;
        String str4 = null;
        List list2 = null;
        hh6 hh6Var = null;
        Integer num4 = null;
        String str5 = null;
        Integer num5 = null;
        Integer num6 = null;
        xl6 xl6Var = null;
        Integer num7 = null;
        String str6 = null;
        gm6 gm6Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    num = num;
                    bool = bool;
                    i3 = 1;
                    str4 = str4;
                    list = list;
                    break;
                case 0:
                    String str7 = str2;
                    i2 |= 1;
                    num = num;
                    list = list;
                    bool = bool;
                    i3 = 1;
                    str4 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    str2 = str7;
                    break;
                case 1:
                    Boolean bool3 = bool;
                    int i4 = i3;
                    list2 = (List) bldVarA.e(ugi0Var, i4, (jiy) a8zVarArr[i3].getValue(), list2);
                    i2 |= 2;
                    hh6Var = hh6Var;
                    str2 = str2;
                    bool = bool3;
                    i3 = i4;
                    list = list;
                    break;
                case 2:
                    str = str2;
                    hh6Var = (hh6) bldVarA.e(ugi0Var, 2, fh6.f9526a, hh6Var);
                    i2 |= 4;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 3:
                    str = str2;
                    num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                    i2 |= 8;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 4:
                    str = str2;
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i2 |= 16;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 5:
                    str = str2;
                    num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                    i2 |= 32;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 6:
                    str = str2;
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i2 |= 64;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 7:
                    str = str2;
                    xl6Var = (xl6) bldVarA.e(ugi0Var, 7, vl6.f37607a, xl6Var);
                    i2 |= 128;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 8:
                    str = str2;
                    num7 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num7);
                    i2 |= 256;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 9:
                    str = str2;
                    str6 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str6);
                    i2 |= 512;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 10:
                    str = str2;
                    gm6Var = (gm6) bldVarA.e(ugi0Var, 10, em6.f8032a, gm6Var);
                    i2 |= 1024;
                    str2 = str;
                    list = list;
                    bool = bool;
                    break;
                case 11:
                    list = list;
                    bool = bool;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    list = list;
                    bool = bool;
                    break;
                case 12:
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i2 |= 4096;
                    str2 = str2;
                    list = list;
                    break;
                case 13:
                    str2 = str2;
                    bool = bool;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i2 |= 8192;
                    str2 = str2;
                    bool = bool;
                    break;
                case 14:
                    str2 = str2;
                    bool = bool;
                    map = (Map) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), map);
                    i2 |= 16384;
                    str2 = str2;
                    bool = bool;
                    break;
                case 15:
                    kh6Var = (kh6) bldVarA.e(ugi0Var, 15, ih6.f14767a, kh6Var);
                    i = 32768;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                case 16:
                    num3 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num3);
                    i = 65536;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                case 17:
                    kh6Var2 = (kh6) bldVarA.e(ugi0Var, 17, ih6.f14767a, kh6Var2);
                    i = 131072;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                case 18:
                    rk6Var = (rk6) bldVarA.e(ugi0Var, 18, pk6.f27120a, rk6Var);
                    i = 262144;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    ul6Var = (ul6) bldVarA.e(ugi0Var, 19, sl6.f32382a, ul6Var);
                    i = 524288;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                case 20:
                    str3 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str3);
                    i = 1048576;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                case 21:
                    num2 = (Integer) bldVarA.e(ugi0Var, 21, okx.f25427a, num2);
                    i = 2097152;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                case 22:
                    num = (Integer) bldVarA.e(ugi0Var, 22, okx.f25427a, num);
                    i = 4194304;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                case 23:
                    list = (List) bldVarA.e(ugi0Var, 23, (jiy) a8zVarArr[23].getValue(), list);
                    i = 8388608;
                    i2 |= i;
                    str2 = str2;
                    bool = bool;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list3 = list;
        Boolean bool4 = bool;
        String str8 = str4;
        List list4 = list2;
        hh6 hh6Var2 = hh6Var;
        bldVarA.c(ugi0Var);
        String str9 = str6;
        ul6 ul6Var2 = ul6Var;
        return new el6(i2, str8, list4, hh6Var2, num4, str5, num5, num6, xl6Var, num7, str9, gm6Var, str2, bool4, bool2, map, kh6Var, num3, kh6Var2, rk6Var, ul6Var2, str3, num2, num, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        el6 el6Var = (el6) obj;
        el6Var.getClass();
        List list = el6Var.x;
        Integer num = el6Var.w;
        Integer num2 = el6Var.v;
        String str = el6Var.u;
        ul6 ul6Var = el6Var.t;
        rk6 rk6Var = el6Var.s;
        kh6 kh6Var = el6Var.r;
        Integer num3 = el6Var.q;
        kh6 kh6Var2 = el6Var.p;
        Map map = el6Var.o;
        Boolean bool = el6Var.n;
        Boolean bool2 = el6Var.m;
        String str2 = el6Var.l;
        gm6 gm6Var = el6Var.k;
        String str3 = el6Var.j;
        Integer num4 = el6Var.i;
        xl6 xl6Var = el6Var.h;
        Integer num5 = el6Var.g;
        Integer num6 = el6Var.f;
        String str4 = el6Var.e;
        Integer num7 = el6Var.d;
        hh6 hh6Var = el6Var.c;
        List list2 = el6Var.b;
        String str5 = el6Var.f7982a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = el6.y;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || hh6Var != null) {
            cldVarA.p(ugi0Var, 2, fh6.f9526a, hh6Var);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || xl6Var != null) {
            cldVarA.p(ugi0Var, 7, vl6.f37607a, xl6Var);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || gm6Var != null) {
            cldVarA.p(ugi0Var, 10, em6.f8032a, gm6Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || kh6Var2 != null) {
            cldVarA.p(ugi0Var, 15, ih6.f14767a, kh6Var2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 16, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || kh6Var != null) {
            cldVarA.p(ugi0Var, 17, ih6.f14767a, kh6Var);
        }
        if (cldVarA.u(ugi0Var) || rk6Var != null) {
            cldVarA.p(ugi0Var, 18, pk6.f27120a, rk6Var);
        }
        if (cldVarA.u(ugi0Var) || ul6Var != null) {
            cldVarA.p(ugi0Var, 19, sl6.f32382a, ul6Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 21, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 22, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 23, (jiy) a8zVarArr[23].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
