package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r3h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r3h0 f29789a;
    private static final ugi0 descriptor;

    static {
        r3h0 r3h0Var = new r3h0();
        f29789a = r3h0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.ScoreResponse", r3h0Var, 15);
        zna0Var.j("fullScore", true);
        zna0Var.j("currentPeriodName", true);
        zna0Var.j("extendedScore", true);
        zna0Var.j("periodScores", true);
        zna0Var.j("scoreOpp1", true);
        zna0Var.j("scoreOpp2", true);
        zna0Var.j("serve", true);
        zna0Var.j("subScore", true);
        zna0Var.j("periodScoresStr", true);
        zna0Var.j("timer", true);
        zna0Var.j(ParameterNames.INFO, true);
        zna0Var.j("statistic", true);
        zna0Var.j("tabloStats", true);
        zna0Var.j("isBreak", true);
        zna0Var.j("points", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = b5h0.p;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(x3h0.f40218a);
        jiy jiyVarJ3 = mrv.j0((jiy) a8zVarArr[3].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(p4h0.f26353a), mrv.j0(ysm0Var), mrv.j0(y4h0.f42002a), mrv.j0(ysm0Var), mrv.j0(m4h0.f21171a), mrv.j0((jiy) a8zVarArr[12].getValue()), mrv.j0(sm8.f32432a), mrv.j0(v4h0.f36779a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = b5h0.p;
        o4h0 o4h0Var = null;
        String str2 = null;
        a5h0 a5h0Var = null;
        String str3 = null;
        Map map = null;
        r4h0 r4h0Var = null;
        int i = 0;
        Boolean bool = null;
        x4h0 x4h0Var = null;
        i4h0 i4h0Var = null;
        List list2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        boolean z = true;
        String str4 = null;
        String str5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str4;
                    z = false;
                    str2 = str2;
                    list2 = list2;
                    str4 = str;
                    o4h0Var = o4h0Var;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i |= 1;
                    str2 = str2;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    str4 = str;
                    o4h0Var = o4h0Var;
                    break;
                case 1:
                    list = list2;
                    str5 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str5);
                    i |= 2;
                    i4h0Var = i4h0Var;
                    list2 = list;
                    o4h0Var = o4h0Var;
                    break;
                case 2:
                    list = list2;
                    i4h0Var = (i4h0) bldVarA.e(ugi0Var, 2, x3h0.f40218a, i4h0Var);
                    i |= 4;
                    list2 = list;
                    o4h0Var = o4h0Var;
                    break;
                case 3:
                    o4h0Var = o4h0Var;
                    list2 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
                    i |= 8;
                    i4h0Var = i4h0Var;
                    o4h0Var = o4h0Var;
                    break;
                case 4:
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 5:
                    num2 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num2);
                    i |= 32;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 6:
                    num3 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num3);
                    i |= 64;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 7:
                    r4h0Var = (r4h0) bldVarA.e(ugi0Var, 7, p4h0.f26353a, r4h0Var);
                    i |= 128;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 8:
                    str3 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str3);
                    i |= 256;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 9:
                    a5h0Var = (a5h0) bldVarA.e(ugi0Var, 9, y4h0.f42002a, a5h0Var);
                    i |= 512;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 10:
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i |= 1024;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 11:
                    o4h0Var = (o4h0) bldVarA.e(ugi0Var, 11, m4h0.f21171a, o4h0Var);
                    i |= 2048;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 12:
                    map = (Map) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), map);
                    i |= 4096;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 13:
                    bool = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool);
                    i |= 8192;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                case 14:
                    x4h0Var = (x4h0) bldVarA.e(ugi0Var, 14, v4h0.f36779a, x4h0Var);
                    i |= 16384;
                    i4h0Var = i4h0Var;
                    list2 = list2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        o4h0 o4h0Var2 = o4h0Var;
        List list3 = list2;
        bldVarA.c(ugi0Var);
        return new b5h0(i, str4, str5, i4h0Var, list3, num, num2, num3, r4h0Var, str3, a5h0Var, str2, o4h0Var2, map, bool, x4h0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b5h0 b5h0Var = (b5h0) obj;
        b5h0Var.getClass();
        x4h0 x4h0Var = b5h0Var.o;
        Boolean bool = b5h0Var.n;
        Map map = b5h0Var.m;
        o4h0 o4h0Var = b5h0Var.l;
        String str = b5h0Var.k;
        a5h0 a5h0Var = b5h0Var.j;
        String str2 = b5h0Var.i;
        r4h0 r4h0Var = b5h0Var.h;
        Integer num = b5h0Var.g;
        Integer num2 = b5h0Var.f;
        Integer num3 = b5h0Var.e;
        List list = b5h0Var.d;
        i4h0 i4h0Var = b5h0Var.c;
        String str3 = b5h0Var.b;
        String str4 = b5h0Var.f2004a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = b5h0.p;
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || i4h0Var != null) {
            cldVarA.p(ugi0Var, 2, x3h0.f40218a, i4h0Var);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || r4h0Var != null) {
            cldVarA.p(ugi0Var, 7, p4h0.f26353a, r4h0Var);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || a5h0Var != null) {
            cldVarA.p(ugi0Var, 9, y4h0.f42002a, a5h0Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || o4h0Var != null) {
            cldVarA.p(ugi0Var, 11, m4h0.f21171a, o4h0Var);
        }
        if (cldVarA.u(ugi0Var) || map != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || bool != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || x4h0Var != null) {
            cldVarA.p(ugi0Var, 14, v4h0.f36779a, x4h0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
