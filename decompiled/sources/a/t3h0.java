package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t3h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t3h0 f33267a;
    private static final ugi0 descriptor;

    static {
        t3h0 t3h0Var = new t3h0();
        f33267a = t3h0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.mainfeed.ScoreResponse", t3h0Var, 19);
        zna0Var.j("fullScore", true);
        zna0Var.j("periodScores", true);
        zna0Var.j("currentPeriod", true);
        zna0Var.j("currentPeriodName", true);
        zna0Var.j("scoreOpp1", true);
        zna0Var.j("scoreOpp2", true);
        zna0Var.j("serve", true);
        zna0Var.j("subScore", true);
        zna0Var.j("periodScoresStr", true);
        zna0Var.j("timer", true);
        zna0Var.j("fullScoreDetail", true);
        zna0Var.j(ParameterNames.INFO, true);
        zna0Var.j("isBreak", true);
        zna0Var.j("hasCourseOfPlay", true);
        zna0Var.j("periodsCount", true);
        zna0Var.j("statistic", true);
        zna0Var.j("tabloStats", true);
        zna0Var.j("extendedScore", true);
        zna0Var.j("gameStatus", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = d5h0.t;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        okx okxVar = okx.f25427a;
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(mzm0.f22661a);
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        jiy jiyVarJ9 = mrv.j0(dnq0.f6383a);
        jiy jiyVarJ10 = mrv.j0(pbr.f26721a);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(h5h0.f12479a), mrv.j0((jiy) a8zVarArr[16].getValue()), mrv.j0(eso.f8339a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = d5h0.t;
        String str2 = null;
        tbr tbrVar = null;
        nnq0 nnq0Var = null;
        String str3 = null;
        Boolean bool = null;
        szm0 szm0Var = null;
        int i2 = 0;
        Boolean bool2 = null;
        Integer num2 = null;
        l5h0 l5h0Var = null;
        Map map = null;
        iso isoVar = null;
        Integer num3 = null;
        Integer num4 = null;
        int i3 = 1;
        boolean z = true;
        String str4 = null;
        List list = null;
        Integer num5 = null;
        String str5 = null;
        Integer num6 = null;
        Integer num7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str4;
                    z = false;
                    tbrVar = tbrVar;
                    num4 = num4;
                    i3 = 1;
                    str4 = str;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i2 |= 1;
                    tbrVar = tbrVar;
                    num4 = num4;
                    szm0Var = szm0Var;
                    i3 = 1;
                    str4 = str;
                    str2 = str2;
                    break;
                case 1:
                    str2 = str2;
                    Integer num8 = num4;
                    int i4 = i3;
                    list = (List) bldVarA.e(ugi0Var, i4, (jiy) a8zVarArr[i3].getValue(), list);
                    i2 |= 2;
                    num5 = num5;
                    num4 = num8;
                    szm0Var = szm0Var;
                    i3 = i4;
                    str2 = str2;
                    break;
                case 2:
                    num = num4;
                    num5 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num5);
                    i2 |= 4;
                    num4 = num;
                    szm0Var = szm0Var;
                    str2 = str2;
                    break;
                case 3:
                    num = num4;
                    str5 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str5);
                    i2 |= 8;
                    num4 = num;
                    szm0Var = szm0Var;
                    str2 = str2;
                    break;
                case 4:
                    num = num4;
                    num6 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num6);
                    i2 |= 16;
                    num4 = num;
                    szm0Var = szm0Var;
                    str2 = str2;
                    break;
                case 5:
                    num = num4;
                    num7 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num7);
                    i2 |= 32;
                    num4 = num;
                    szm0Var = szm0Var;
                    str2 = str2;
                    break;
                case 6:
                    str2 = str2;
                    szm0Var = szm0Var;
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
                    i2 |= 64;
                    szm0Var = szm0Var;
                    str2 = str2;
                    break;
                case 7:
                    str2 = str2;
                    szm0Var = (szm0) bldVarA.e(ugi0Var, 7, mzm0.f22661a, szm0Var);
                    i2 |= 128;
                    num4 = num4;
                    str2 = str2;
                    break;
                case 8:
                    szm0Var = szm0Var;
                    num4 = num4;
                    str3 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str3);
                    i2 |= 256;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 9:
                    szm0Var = szm0Var;
                    num4 = num4;
                    nnq0Var = (nnq0) bldVarA.e(ugi0Var, 9, dnq0.f6383a, nnq0Var);
                    i2 |= 512;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 10:
                    szm0Var = szm0Var;
                    num4 = num4;
                    tbrVar = (tbr) bldVarA.e(ugi0Var, 10, pbr.f26721a, tbrVar);
                    i2 |= 1024;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 11:
                    szm0Var = szm0Var;
                    num4 = num4;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 12:
                    szm0Var = szm0Var;
                    num4 = num4;
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i2 |= 4096;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 13:
                    szm0Var = szm0Var;
                    num4 = num4;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i2 |= 8192;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 14:
                    szm0Var = szm0Var;
                    num4 = num4;
                    num2 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num2);
                    i2 |= 16384;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 15:
                    l5h0Var = (l5h0) bldVarA.e(ugi0Var, 15, h5h0.f12479a, l5h0Var);
                    i = 32768;
                    i2 |= i;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 16:
                    map = (Map) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), map);
                    i = 65536;
                    i2 |= i;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 17:
                    isoVar = (iso) bldVarA.e(ugi0Var, 17, eso.f8339a, isoVar);
                    i = 131072;
                    i2 |= i;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                case 18:
                    num3 = (Integer) bldVarA.e(ugi0Var, 18, okx.f25427a, num3);
                    i = 262144;
                    i2 |= i;
                    num4 = num4;
                    szm0Var = szm0Var;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str6 = str2;
        Integer num9 = num4;
        String str7 = str4;
        List list2 = list;
        Integer num10 = num5;
        bldVarA.c(ugi0Var);
        return new d5h0(i2, str7, list2, num10, str5, num6, num7, num9, szm0Var, str3, nnq0Var, tbrVar, str6, bool, bool2, num2, l5h0Var, map, isoVar, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d5h0 d5h0Var = (d5h0) obj;
        d5h0Var.getClass();
        Integer num = d5h0Var.s;
        iso isoVar = d5h0Var.r;
        Map map = d5h0Var.q;
        l5h0 l5h0Var = d5h0Var.p;
        Integer num2 = d5h0Var.o;
        Boolean bool = d5h0Var.n;
        Boolean bool2 = d5h0Var.m;
        String str = d5h0Var.l;
        tbr tbrVar = d5h0Var.k;
        nnq0 nnq0Var = d5h0Var.j;
        String str2 = d5h0Var.i;
        szm0 szm0Var = d5h0Var.h;
        Integer num3 = d5h0Var.g;
        Integer num4 = d5h0Var.f;
        Integer num5 = d5h0Var.e;
        String str3 = d5h0Var.d;
        Integer num6 = d5h0Var.c;
        List list = d5h0Var.b;
        String str4 = d5h0Var.f5506a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = d5h0.t;
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || szm0Var != null) {
            cldVarA.p(ugi0Var, 7, mzm0.f22661a, szm0Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || nnq0Var != null) {
            cldVarA.p(ugi0Var, 9, dnq0.f6383a, nnq0Var);
        }
        if (cldVarA.u(ugi0Var) || tbrVar != null) {
            cldVarA.p(ugi0Var, 10, pbr.f26721a, tbrVar);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l5h0Var != null) {
            cldVarA.p(ugi0Var, 15, h5h0.f12479a, l5h0Var);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || isoVar != null) {
            cldVarA.p(ugi0Var, 17, eso.f8339a, isoVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 18, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
