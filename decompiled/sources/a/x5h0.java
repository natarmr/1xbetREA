package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x5h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x5h0 f40317a;
    private static final ugi0 descriptor;

    static {
        x5h0 x5h0Var = new x5h0();
        f40317a = x5h0Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.linelive.data.models.ScoresResponse", x5h0Var, 19);
        zna0Var.j("fullScore", true);
        zna0Var.j("periodScores", true);
        zna0Var.j("extendedScore", true);
        zna0Var.j("currentPeriod", true);
        zna0Var.j("currentPeriodName", true);
        zna0Var.j("scoreOpp1", true);
        zna0Var.j("serve", true);
        zna0Var.j("subScore", true);
        zna0Var.j("scoreOpp2", true);
        zna0Var.j("periodScoresStr", true);
        zna0Var.j(ParameterNames.INFO, true);
        zna0Var.j("isBreak", true);
        zna0Var.j("timer", true);
        zna0Var.j("hasCourseOfPlay", true);
        zna0Var.j("tabloStats", true);
        zna0Var.j("fullScoreDetail", true);
        zna0Var.j("statistic", true);
        zna0Var.j("periodsCount", true);
        zna0Var.j("statusLineStr", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = f6h0.t;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(eso.f8339a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(lzm0.f20914a);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, mrv.j0(sm8Var), mrv.j0(hnq0.f13361a), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0(o3h0.f24585a), mrv.j0(g5h0.f10718a), mrv.j0(okxVar), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = f6h0.t;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        rnq0 rnq0Var = null;
        rzm0 rzm0Var = null;
        int i2 = 0;
        Boolean bool2 = null;
        Map map = null;
        q3h0 q3h0Var = null;
        k5h0 k5h0Var = null;
        Integer num3 = null;
        String str4 = null;
        Integer num4 = null;
        int i3 = 1;
        boolean z = true;
        String str5 = null;
        List list = null;
        iso isoVar = null;
        Integer num5 = null;
        String str6 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str5;
                    z = false;
                    str2 = str2;
                    num4 = num4;
                    i3 = 1;
                    str5 = str;
                    bool = bool;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str5);
                    i2 |= 1;
                    str2 = str2;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    i3 = 1;
                    str5 = str;
                    bool = bool;
                    break;
                case 1:
                    bool = bool;
                    Integer num7 = num4;
                    int i4 = i3;
                    list = (List) bldVarA.e(ugi0Var, i4, (jiy) a8zVarArr[i3].getValue(), list);
                    i2 |= 2;
                    isoVar = isoVar;
                    num4 = num7;
                    rzm0Var = rzm0Var;
                    i3 = i4;
                    bool = bool;
                    break;
                case 2:
                    num = num4;
                    isoVar = (iso) bldVarA.e(ugi0Var, 2, eso.f8339a, isoVar);
                    i2 |= 4;
                    num4 = num;
                    rzm0Var = rzm0Var;
                    bool = bool;
                    break;
                case 3:
                    num = num4;
                    num5 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num5);
                    i2 |= 8;
                    num4 = num;
                    rzm0Var = rzm0Var;
                    bool = bool;
                    break;
                case 4:
                    num = num4;
                    str6 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str6);
                    i2 |= 16;
                    num4 = num;
                    rzm0Var = rzm0Var;
                    bool = bool;
                    break;
                case 5:
                    num = num4;
                    num6 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num6);
                    i2 |= 32;
                    num4 = num;
                    rzm0Var = rzm0Var;
                    bool = bool;
                    break;
                case 6:
                    bool = bool;
                    rzm0Var = rzm0Var;
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
                    i2 |= 64;
                    rzm0Var = rzm0Var;
                    bool = bool;
                    break;
                case 7:
                    bool = bool;
                    rzm0Var = (rzm0) bldVarA.e(ugi0Var, 7, lzm0.f20914a, rzm0Var);
                    i2 |= 128;
                    num4 = num4;
                    bool = bool;
                    break;
                case 8:
                    rzm0Var = rzm0Var;
                    num4 = num4;
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i2 |= 256;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 9:
                    rzm0Var = rzm0Var;
                    num4 = num4;
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    i2 |= 512;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 10:
                    rzm0Var = rzm0Var;
                    num4 = num4;
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i2 |= 1024;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 11:
                    rzm0Var = rzm0Var;
                    num4 = num4;
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i2 |= 2048;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 12:
                    rzm0Var = rzm0Var;
                    num4 = num4;
                    rnq0Var = (rnq0) bldVarA.e(ugi0Var, 12, hnq0.f13361a, rnq0Var);
                    i2 |= 4096;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 13:
                    rzm0Var = rzm0Var;
                    num4 = num4;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i2 |= 8192;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 14:
                    rzm0Var = rzm0Var;
                    num4 = num4;
                    map = (Map) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), map);
                    i2 |= 16384;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 15:
                    q3h0Var = (q3h0) bldVarA.e(ugi0Var, 15, o3h0.f24585a, q3h0Var);
                    i = 32768;
                    i2 |= i;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 16:
                    k5h0Var = (k5h0) bldVarA.e(ugi0Var, 16, g5h0.f10718a, k5h0Var);
                    i = 65536;
                    i2 |= i;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 17:
                    num3 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num3);
                    i = 131072;
                    i2 |= i;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                case 18:
                    str4 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str4);
                    i = 262144;
                    i2 |= i;
                    num4 = num4;
                    rzm0Var = rzm0Var;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool3 = bool;
        Integer num8 = num4;
        String str7 = str5;
        List list2 = list;
        iso isoVar2 = isoVar;
        bldVarA.c(ugi0Var);
        return new f6h0(i2, str7, list2, isoVar2, num5, str6, num6, num8, rzm0Var, num2, str3, str2, bool3, rnq0Var, bool2, map, q3h0Var, k5h0Var, num3, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f6h0 f6h0Var = (f6h0) obj;
        f6h0Var.getClass();
        String str = f6h0Var.s;
        Integer num = f6h0Var.r;
        k5h0 k5h0Var = f6h0Var.q;
        q3h0 q3h0Var = f6h0Var.p;
        Map map = f6h0Var.o;
        Boolean bool = f6h0Var.n;
        rnq0 rnq0Var = f6h0Var.m;
        Boolean bool2 = f6h0Var.l;
        String str2 = f6h0Var.k;
        String str3 = f6h0Var.j;
        Integer num2 = f6h0Var.i;
        rzm0 rzm0Var = f6h0Var.h;
        Integer num3 = f6h0Var.g;
        Integer num4 = f6h0Var.f;
        String str4 = f6h0Var.e;
        Integer num5 = f6h0Var.d;
        iso isoVar = f6h0Var.c;
        List list = f6h0Var.b;
        String str5 = f6h0Var.f9010a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = f6h0.t;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || isoVar != null) {
            cldVarA.p(ugi0Var, 2, eso.f8339a, isoVar);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || rzm0Var != null) {
            cldVarA.p(ugi0Var, 7, lzm0.f20914a, rzm0Var);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || rnq0Var != 0) {
            cldVarA.p(ugi0Var, 12, hnq0.f13361a, rnq0Var);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || q3h0Var != null) {
            cldVarA.p(ugi0Var, 15, o3h0.f24585a, q3h0Var);
        }
        if (cldVarA.u(ugi0Var) || k5h0Var != null) {
            cldVarA.p(ugi0Var, 16, g5h0.f10718a, k5h0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
