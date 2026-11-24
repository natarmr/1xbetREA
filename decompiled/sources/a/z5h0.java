package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z5h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5h0 f43816a;
    private static final ugi0 descriptor;

    static {
        z5h0 z5h0Var = new z5h0();
        f43816a = z5h0Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.common.models.games_by_champ.ScoresResponse", z5h0Var, 20);
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
        zna0Var.j("statistic", true);
        zna0Var.j("fullScoreDetail", true);
        zna0Var.j("periodsCount", true);
        zna0Var.j("points", true);
        zna0Var.j("gameStatus", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = h6h0.u;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(eso.f8339a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(k380.f17606a);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(hnq0.f13361a);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ12 = mrv.j0(sm8Var);
        jiy jiyVarJ13 = mrv.j0(sm8Var);
        jiy jiyVarJ14 = mrv.j0((jiy) a8zVarArr[14].getValue());
        jiy jiyVarJ15 = mrv.j0(rfm0.f30396a);
        o3h0 o3h0Var = o3h0.f24585a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, mrv.j0(o3h0Var), mrv.j0(okxVar), mrv.j0(o3h0Var), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        m380 m380Var;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = h6h0.u;
        String str2 = null;
        rnq0 rnq0Var = null;
        String str3 = null;
        Integer num = null;
        Boolean bool = null;
        m380 m380Var2 = null;
        int i2 = 0;
        Boolean bool2 = null;
        Map map = null;
        xfm0 xfm0Var = null;
        q3h0 q3h0Var = null;
        Integer num2 = null;
        q3h0 q3h0Var2 = null;
        Integer num3 = null;
        int i3 = 1;
        boolean z = true;
        String str4 = null;
        List list = null;
        iso isoVar = null;
        Integer num4 = null;
        String str5 = null;
        Integer num5 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str4;
                    z = false;
                    rnq0Var = rnq0Var;
                    m380Var2 = m380Var2;
                    i3 = 1;
                    str4 = str;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i2 |= 1;
                    rnq0Var = rnq0Var;
                    m380Var2 = m380Var2;
                    num = num;
                    i3 = 1;
                    str4 = str;
                    str2 = str2;
                    break;
                case 1:
                    str2 = str2;
                    m380 m380Var3 = m380Var2;
                    int i4 = i3;
                    list = (List) bldVarA.e(ugi0Var, i4, (jiy) a8zVarArr[i3].getValue(), list);
                    i2 |= 2;
                    isoVar = isoVar;
                    m380Var2 = m380Var3;
                    num = num;
                    i3 = i4;
                    str2 = str2;
                    break;
                case 2:
                    m380Var = m380Var2;
                    isoVar = (iso) bldVarA.e(ugi0Var, 2, eso.f8339a, isoVar);
                    i2 |= 4;
                    m380Var2 = m380Var;
                    num = num;
                    str2 = str2;
                    break;
                case 3:
                    m380Var = m380Var2;
                    num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                    i2 |= 8;
                    m380Var2 = m380Var;
                    num = num;
                    str2 = str2;
                    break;
                case 4:
                    m380Var = m380Var2;
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i2 |= 16;
                    m380Var2 = m380Var;
                    num = num;
                    str2 = str2;
                    break;
                case 5:
                    m380Var = m380Var2;
                    num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                    i2 |= 32;
                    m380Var2 = m380Var;
                    num = num;
                    str2 = str2;
                    break;
                case 6:
                    m380Var = m380Var2;
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i2 |= 64;
                    m380Var2 = m380Var;
                    num = num;
                    str2 = str2;
                    break;
                case 7:
                    str2 = str2;
                    num = num;
                    m380Var2 = (m380) bldVarA.e(ugi0Var, 7, k380.f17606a, m380Var2);
                    i2 |= 128;
                    num = num;
                    str2 = str2;
                    break;
                case 8:
                    str2 = str2;
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i2 |= 256;
                    m380Var2 = m380Var2;
                    str2 = str2;
                    break;
                case 9:
                    num = num;
                    m380Var2 = m380Var2;
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    i2 |= 512;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 10:
                    num = num;
                    m380Var2 = m380Var2;
                    rnq0Var = (rnq0) bldVarA.e(ugi0Var, 10, hnq0.f13361a, rnq0Var);
                    i2 |= 1024;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 11:
                    num = num;
                    m380Var2 = m380Var2;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 12:
                    num = num;
                    m380Var2 = m380Var2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i2 |= 4096;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 13:
                    num = num;
                    m380Var2 = m380Var2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i2 |= 8192;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 14:
                    num = num;
                    m380Var2 = m380Var2;
                    map = (Map) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), map);
                    i2 |= 16384;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 15:
                    xfm0Var = (xfm0) bldVarA.e(ugi0Var, 15, rfm0.f30396a, xfm0Var);
                    i = 32768;
                    i2 |= i;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 16:
                    q3h0Var = (q3h0) bldVarA.e(ugi0Var, 16, o3h0.f24585a, q3h0Var);
                    i = 65536;
                    i2 |= i;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 17:
                    num2 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num2);
                    i = 131072;
                    i2 |= i;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case 18:
                    q3h0Var2 = (q3h0) bldVarA.e(ugi0Var, 18, o3h0.f24585a, q3h0Var2);
                    i = 262144;
                    i2 |= i;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    num3 = (Integer) bldVarA.e(ugi0Var, 19, okx.f25427a, num3);
                    i = 524288;
                    i2 |= i;
                    m380Var2 = m380Var2;
                    num = num;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str6 = str2;
        m380 m380Var4 = m380Var2;
        String str7 = str4;
        List list2 = list;
        iso isoVar2 = isoVar;
        bldVarA.c(ugi0Var);
        Integer num7 = num3;
        return new h6h0(i2, str7, list2, isoVar2, num4, str5, num5, num6, m380Var4, num, str3, rnq0Var, str6, bool, bool2, map, xfm0Var, q3h0Var, num2, q3h0Var2, num7);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h6h0 h6h0Var = (h6h0) obj;
        h6h0Var.getClass();
        Integer num = h6h0Var.t;
        q3h0 q3h0Var = h6h0Var.s;
        Integer num2 = h6h0Var.r;
        q3h0 q3h0Var2 = h6h0Var.q;
        xfm0 xfm0Var = h6h0Var.p;
        Map map = h6h0Var.o;
        Boolean bool = h6h0Var.n;
        Boolean bool2 = h6h0Var.m;
        String str = h6h0Var.l;
        rnq0 rnq0Var = h6h0Var.k;
        String str2 = h6h0Var.j;
        Integer num3 = h6h0Var.i;
        m380 m380Var = h6h0Var.h;
        Integer num4 = h6h0Var.g;
        Integer num5 = h6h0Var.f;
        String str3 = h6h0Var.e;
        Integer num6 = h6h0Var.d;
        iso isoVar = h6h0Var.c;
        List list = h6h0Var.b;
        String str4 = h6h0Var.f12529a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = h6h0.u;
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || isoVar != null) {
            cldVarA.p(ugi0Var, 2, eso.f8339a, isoVar);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || m380Var != null) {
            cldVarA.p(ugi0Var, 7, k380.f17606a, m380Var);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || rnq0Var != null) {
            cldVarA.p(ugi0Var, 10, hnq0.f13361a, rnq0Var);
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
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || xfm0Var != null) {
            cldVarA.p(ugi0Var, 15, rfm0.f30396a, xfm0Var);
        }
        if (cldVarA.u(ugi0Var) || q3h0Var2 != null) {
            cldVarA.p(ugi0Var, 16, o3h0.f24585a, q3h0Var2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || q3h0Var != null) {
            cldVarA.p(ugi0Var, 18, o3h0.f24585a, q3h0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 19, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
