package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hch implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hch f12824a;
    private static final ugi0 descriptor;

    static {
        hch hchVar = new hch();
        f12824a = hchVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.feed.CyberScoreResponse", hchVar, 19);
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
        zna0Var.j("stageTime", true);
        zna0Var.j("statisticJson", true);
        zna0Var.j("statistic", true);
        zna0Var.j("tabloStats", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = jch.t;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        okx okxVar = okx.f25427a;
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(tgh.f33912a);
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        jiy jiyVarJ9 = mrv.j0(zhh.f44393a);
        jiy jiyVarJ10 = mrv.j0(hog.f13391a);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(s710.f31729a), mrv.j0(gdy.f11125a), mrv.j0(h5h0.f12479a), mrv.j0((jiy) a8zVarArr[18].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        int i;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = jch.t;
        String str2 = null;
        jog jogVar = null;
        bih bihVar = null;
        String str3 = null;
        Boolean bool = null;
        vgh vghVar = null;
        int i2 = 0;
        Boolean bool2 = null;
        Integer num2 = null;
        Long l = null;
        edy edyVar = null;
        l5h0 l5h0Var = null;
        Map map = null;
        Integer num3 = null;
        int i3 = 1;
        boolean z = true;
        String str4 = null;
        List list = null;
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
                    jogVar = jogVar;
                    num3 = num3;
                    i3 = 1;
                    str4 = str;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i2 |= 1;
                    jogVar = jogVar;
                    num3 = num3;
                    vghVar = vghVar;
                    i3 = 1;
                    str4 = str;
                    str2 = str2;
                    break;
                case 1:
                    str2 = str2;
                    Integer num7 = num3;
                    int i4 = i3;
                    list = (List) bldVarA.e(ugi0Var, i4, (jiy) a8zVarArr[i3].getValue(), list);
                    i2 |= 2;
                    num4 = num4;
                    num3 = num7;
                    vghVar = vghVar;
                    i3 = i4;
                    str2 = str2;
                    break;
                case 2:
                    num = num3;
                    num4 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num4);
                    i2 |= 4;
                    num3 = num;
                    str2 = str2;
                    vghVar = vghVar;
                    break;
                case 3:
                    num = num3;
                    str5 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str5);
                    i2 |= 8;
                    num3 = num;
                    str2 = str2;
                    vghVar = vghVar;
                    break;
                case 4:
                    num = num3;
                    num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                    i2 |= 16;
                    num3 = num;
                    str2 = str2;
                    vghVar = vghVar;
                    break;
                case 5:
                    num = num3;
                    num6 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num6);
                    i2 |= 32;
                    num3 = num;
                    str2 = str2;
                    vghVar = vghVar;
                    break;
                case 6:
                    str2 = str2;
                    vghVar = vghVar;
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i2 |= 64;
                    str2 = str2;
                    vghVar = vghVar;
                    break;
                case 7:
                    str2 = str2;
                    vghVar = (vgh) bldVarA.e(ugi0Var, 7, tgh.f33912a, vghVar);
                    i2 |= 128;
                    num3 = num3;
                    str2 = str2;
                    break;
                case 8:
                    vghVar = vghVar;
                    num3 = num3;
                    str3 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str3);
                    i2 |= 256;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 9:
                    vghVar = vghVar;
                    num3 = num3;
                    bihVar = (bih) bldVarA.e(ugi0Var, 9, zhh.f44393a, bihVar);
                    i2 |= 512;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 10:
                    vghVar = vghVar;
                    num3 = num3;
                    jogVar = (jog) bldVarA.e(ugi0Var, 10, hog.f13391a, jogVar);
                    i2 |= 1024;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 11:
                    vghVar = vghVar;
                    num3 = num3;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 12:
                    vghVar = vghVar;
                    num3 = num3;
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i2 |= 4096;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 13:
                    vghVar = vghVar;
                    num3 = num3;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i2 |= 8192;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 14:
                    vghVar = vghVar;
                    num3 = num3;
                    num2 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num2);
                    i2 |= 16384;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 15:
                    l = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l);
                    i = 32768;
                    i2 |= i;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 16:
                    edyVar = (edy) bldVarA.e(ugi0Var, 16, gdy.f11125a, edyVar);
                    i = 65536;
                    i2 |= i;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 17:
                    l5h0Var = (l5h0) bldVarA.e(ugi0Var, 17, h5h0.f12479a, l5h0Var);
                    i = 131072;
                    i2 |= i;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                case 18:
                    map = (Map) bldVarA.e(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), map);
                    i = 262144;
                    i2 |= i;
                    num3 = num3;
                    vghVar = vghVar;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str6 = str2;
        Integer num8 = num3;
        String str7 = str4;
        List list2 = list;
        Integer num9 = num4;
        bldVarA.c(ugi0Var);
        return new jch(i2, str7, list2, num9, str5, num5, num6, num8, vghVar, str3, bihVar, jogVar, str6, bool, bool2, num2, l, edyVar, l5h0Var, map);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jch jchVar = (jch) obj;
        jchVar.getClass();
        Map map = jchVar.s;
        l5h0 l5h0Var = jchVar.r;
        edy edyVar = jchVar.q;
        Long l = jchVar.p;
        Integer num = jchVar.o;
        Boolean bool = jchVar.n;
        Boolean bool2 = jchVar.m;
        String str = jchVar.l;
        jog jogVar = jchVar.k;
        bih bihVar = jchVar.j;
        String str2 = jchVar.i;
        vgh vghVar = jchVar.h;
        Integer num2 = jchVar.g;
        Integer num3 = jchVar.f;
        Integer num4 = jchVar.e;
        String str3 = jchVar.d;
        Integer num5 = jchVar.c;
        List list = jchVar.b;
        String str4 = jchVar.f16276a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = jch.t;
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || vghVar != null) {
            cldVarA.p(ugi0Var, 7, tgh.f33912a, vghVar);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bihVar != null) {
            cldVarA.p(ugi0Var, 9, zhh.f44393a, bihVar);
        }
        if (cldVarA.u(ugi0Var) || jogVar != null) {
            cldVarA.p(ugi0Var, 10, hog.f13391a, jogVar);
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
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || edyVar != null) {
            cldVarA.p(ugi0Var, 16, gdy.f11125a, edyVar);
        }
        if (cldVarA.u(ugi0Var) || l5h0Var != null) {
            cldVarA.p(ugi0Var, 17, h5h0.f12479a, l5h0Var);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), map);
        }
        cldVarA.c(ugi0Var);
    }
}
