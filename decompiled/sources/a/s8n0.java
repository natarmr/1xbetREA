package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s8n0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s8n0 f31811a;
    private static final ugi0 descriptor;

    static {
        s8n0 s8n0Var = new s8n0();
        f31811a = s8n0Var;
        zna0 zna0Var = new zna0("org.xplatform.feed.subscriptions.data.models.SubscriptionScoresResponse", s8n0Var, 20);
        zna0Var.j("fullScore", true);
        zna0Var.j("periodScores", true);
        zna0Var.j("currentPeriod", true);
        zna0Var.j("currentPeriodName", true);
        zna0Var.j("scoreOpp1", true);
        zna0Var.j("scoreOpp2", true);
        zna0Var.j("serve", true);
        zna0Var.j("extendedScore", true);
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
        zna0Var.j("statusLineStr", true);
        zna0Var.j("gameStatus", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = u8n0.u;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        okx okxVar = okx.f25427a;
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(eso.f8339a);
        jiy jiyVarJ8 = mrv.j0(o9n0.f24887a);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(ban0.f2268a);
        jiy jiyVarJ11 = mrv.j0(m7n0.f21329a);
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(h5h0.f12479a), mrv.j0((jiy) a8zVarArr[17].getValue()), mrv.j0(ysm0Var), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        iso isoVar;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = u8n0.u;
        o7n0 o7n0Var = null;
        dan0 dan0Var = null;
        String str2 = null;
        q9n0 q9n0Var = null;
        String str3 = null;
        iso isoVar2 = null;
        int i2 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        l5h0 l5h0Var = null;
        Map map = null;
        String str4 = null;
        Integer num2 = null;
        int i3 = 1;
        boolean z = true;
        String str5 = null;
        List list = null;
        Integer num3 = null;
        String str6 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str5;
                    z = false;
                    dan0Var = dan0Var;
                    isoVar2 = isoVar2;
                    i3 = 1;
                    str5 = str;
                    o7n0Var = o7n0Var;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str5);
                    i2 |= 1;
                    dan0Var = dan0Var;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    i3 = 1;
                    str5 = str;
                    o7n0Var = o7n0Var;
                    break;
                case 1:
                    o7n0Var = o7n0Var;
                    iso isoVar3 = isoVar2;
                    int i4 = i3;
                    list = (List) bldVarA.e(ugi0Var, i4, (jiy) a8zVarArr[i3].getValue(), list);
                    i2 |= 2;
                    num3 = num3;
                    isoVar2 = isoVar3;
                    q9n0Var = q9n0Var;
                    i3 = i4;
                    o7n0Var = o7n0Var;
                    break;
                case 2:
                    isoVar = isoVar2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i2 |= 4;
                    isoVar2 = isoVar;
                    q9n0Var = q9n0Var;
                    o7n0Var = o7n0Var;
                    break;
                case 3:
                    isoVar = isoVar2;
                    str6 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str6);
                    i2 |= 8;
                    isoVar2 = isoVar;
                    q9n0Var = q9n0Var;
                    o7n0Var = o7n0Var;
                    break;
                case 4:
                    isoVar = isoVar2;
                    num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                    i2 |= 16;
                    isoVar2 = isoVar;
                    q9n0Var = q9n0Var;
                    o7n0Var = o7n0Var;
                    break;
                case 5:
                    isoVar = isoVar2;
                    num5 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num5);
                    i2 |= 32;
                    isoVar2 = isoVar;
                    q9n0Var = q9n0Var;
                    o7n0Var = o7n0Var;
                    break;
                case 6:
                    isoVar = isoVar2;
                    num6 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num6);
                    i2 |= 64;
                    isoVar2 = isoVar;
                    q9n0Var = q9n0Var;
                    o7n0Var = o7n0Var;
                    break;
                case 7:
                    o7n0Var = o7n0Var;
                    q9n0Var = q9n0Var;
                    isoVar2 = (iso) bldVarA.e(ugi0Var, 7, eso.f8339a, isoVar2);
                    i2 |= 128;
                    q9n0Var = q9n0Var;
                    o7n0Var = o7n0Var;
                    break;
                case 8:
                    o7n0Var = o7n0Var;
                    q9n0Var = (q9n0) bldVarA.e(ugi0Var, 8, o9n0.f24887a, q9n0Var);
                    i2 |= 256;
                    isoVar2 = isoVar2;
                    o7n0Var = o7n0Var;
                    break;
                case 9:
                    q9n0Var = q9n0Var;
                    isoVar2 = isoVar2;
                    str2 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str2);
                    i2 |= 512;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 10:
                    q9n0Var = q9n0Var;
                    isoVar2 = isoVar2;
                    dan0Var = (dan0) bldVarA.e(ugi0Var, 10, ban0.f2268a, dan0Var);
                    i2 |= 1024;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 11:
                    q9n0Var = q9n0Var;
                    isoVar2 = isoVar2;
                    o7n0Var = (o7n0) bldVarA.e(ugi0Var, 11, m7n0.f21329a, o7n0Var);
                    i2 |= 2048;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 12:
                    q9n0Var = q9n0Var;
                    isoVar2 = isoVar2;
                    str3 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str3);
                    i2 |= 4096;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 13:
                    q9n0Var = q9n0Var;
                    isoVar2 = isoVar2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool);
                    i2 |= 8192;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 14:
                    q9n0Var = q9n0Var;
                    isoVar2 = isoVar2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool2);
                    i2 |= 16384;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 15:
                    num = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num);
                    i = 32768;
                    i2 |= i;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 16:
                    l5h0Var = (l5h0) bldVarA.e(ugi0Var, 16, h5h0.f12479a, l5h0Var);
                    i = 65536;
                    i2 |= i;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 17:
                    map = (Map) bldVarA.e(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), map);
                    i = 131072;
                    i2 |= i;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case 18:
                    str4 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str4);
                    i = 262144;
                    i2 |= i;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    num2 = (Integer) bldVarA.e(ugi0Var, 19, okx.f25427a, num2);
                    i = 524288;
                    i2 |= i;
                    isoVar2 = isoVar2;
                    q9n0Var = q9n0Var;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        o7n0 o7n0Var2 = o7n0Var;
        iso isoVar4 = isoVar2;
        String str7 = str5;
        List list2 = list;
        Integer num7 = num3;
        bldVarA.c(ugi0Var);
        Integer num8 = num2;
        return new u8n0(i2, str7, list2, num7, str6, num4, num5, num6, isoVar4, q9n0Var, str2, dan0Var, o7n0Var2, str3, bool, bool2, num, l5h0Var, map, str4, num8);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        u8n0 u8n0Var = (u8n0) obj;
        u8n0Var.getClass();
        Integer num = u8n0Var.t;
        String str = u8n0Var.s;
        Map map = u8n0Var.r;
        l5h0 l5h0Var = u8n0Var.q;
        Integer num2 = u8n0Var.p;
        Boolean bool = u8n0Var.o;
        Boolean bool2 = u8n0Var.n;
        String str2 = u8n0Var.m;
        o7n0 o7n0Var = u8n0Var.l;
        dan0 dan0Var = u8n0Var.k;
        String str3 = u8n0Var.j;
        q9n0 q9n0Var = u8n0Var.i;
        iso isoVar = u8n0Var.h;
        Integer num3 = u8n0Var.g;
        Integer num4 = u8n0Var.f;
        Integer num5 = u8n0Var.e;
        String str4 = u8n0Var.d;
        Integer num6 = u8n0Var.c;
        List list = u8n0Var.b;
        String str5 = u8n0Var.f35239a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = u8n0.u;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
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
        if (cldVarA.u(ugi0Var) || isoVar != null) {
            cldVarA.p(ugi0Var, 7, eso.f8339a, isoVar);
        }
        if (cldVarA.u(ugi0Var) || q9n0Var != null) {
            cldVarA.p(ugi0Var, 8, o9n0.f24887a, q9n0Var);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || dan0Var != null) {
            cldVarA.p(ugi0Var, 10, ban0.f2268a, dan0Var);
        }
        if (cldVarA.u(ugi0Var) || o7n0Var != null) {
            cldVarA.p(ugi0Var, 11, m7n0.f21329a, o7n0Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l5h0Var != null) {
            cldVarA.p(ugi0Var, 16, h5h0.f12479a, l5h0Var);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 19, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
