package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jv10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jv10 f17185a;
    private static final ugi0 descriptor;

    static {
        jv10 jv10Var = new jv10();
        f17185a = jv10Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.MainGameScoresResponse", jv10Var, 20);
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
        zna0Var.j("fullScoreDetail", true);
        zna0Var.j("periodsCount", true);
        zna0Var.j("statusLineStr", true);
        zna0Var.j("stageTime", true);
        zna0Var.j("gameStatus", true);
        zna0Var.j("statistic", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = lv10.u;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(dso.f6620a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(kzm0.f19159a);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(fnq0.f9851a);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(obr.f24996a), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(pfm0.f26912a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        qzm0 qzm0Var;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lv10.u;
        String str2 = null;
        pnq0 pnq0Var = null;
        String str3 = null;
        Integer num = null;
        Boolean bool = null;
        qzm0 qzm0Var2 = null;
        int i2 = 0;
        Boolean bool2 = null;
        sbr sbrVar = null;
        Integer num2 = null;
        String str4 = null;
        Integer num3 = null;
        Integer num4 = null;
        vfm0 vfm0Var = null;
        int i3 = 1;
        boolean z = true;
        String str5 = null;
        List list = null;
        hso hsoVar = null;
        Integer num5 = null;
        String str6 = null;
        Integer num6 = null;
        Integer num7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str5;
                    z = false;
                    pnq0Var = pnq0Var;
                    qzm0Var2 = qzm0Var2;
                    i3 = 1;
                    str5 = str;
                    str2 = str2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str5);
                    i2 |= 1;
                    pnq0Var = pnq0Var;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    i3 = 1;
                    str5 = str;
                    str2 = str2;
                    break;
                case 1:
                    str2 = str2;
                    qzm0 qzm0Var3 = qzm0Var2;
                    int i4 = i3;
                    list = (List) bldVarA.e(ugi0Var, i4, (jiy) a8zVarArr[i3].getValue(), list);
                    i2 |= 2;
                    hsoVar = hsoVar;
                    qzm0Var2 = qzm0Var3;
                    num = num;
                    i3 = i4;
                    str2 = str2;
                    break;
                case 2:
                    qzm0Var = qzm0Var2;
                    hsoVar = (hso) bldVarA.e(ugi0Var, 2, dso.f6620a, hsoVar);
                    i2 |= 4;
                    qzm0Var2 = qzm0Var;
                    num = num;
                    str2 = str2;
                    break;
                case 3:
                    qzm0Var = qzm0Var2;
                    num5 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num5);
                    i2 |= 8;
                    qzm0Var2 = qzm0Var;
                    num = num;
                    str2 = str2;
                    break;
                case 4:
                    qzm0Var = qzm0Var2;
                    str6 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str6);
                    i2 |= 16;
                    qzm0Var2 = qzm0Var;
                    num = num;
                    str2 = str2;
                    break;
                case 5:
                    qzm0Var = qzm0Var2;
                    num6 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num6);
                    i2 |= 32;
                    qzm0Var2 = qzm0Var;
                    num = num;
                    str2 = str2;
                    break;
                case 6:
                    qzm0Var = qzm0Var2;
                    num7 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num7);
                    i2 |= 64;
                    qzm0Var2 = qzm0Var;
                    num = num;
                    str2 = str2;
                    break;
                case 7:
                    str2 = str2;
                    num = num;
                    qzm0Var2 = (qzm0) bldVarA.e(ugi0Var, 7, kzm0.f19159a, qzm0Var2);
                    i2 |= 128;
                    num = num;
                    str2 = str2;
                    break;
                case 8:
                    str2 = str2;
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i2 |= 256;
                    qzm0Var2 = qzm0Var2;
                    str2 = str2;
                    break;
                case 9:
                    num = num;
                    qzm0Var2 = qzm0Var2;
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    i2 |= 512;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 10:
                    num = num;
                    qzm0Var2 = qzm0Var2;
                    pnq0Var = (pnq0) bldVarA.e(ugi0Var, 10, fnq0.f9851a, pnq0Var);
                    i2 |= 1024;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 11:
                    num = num;
                    qzm0Var2 = qzm0Var2;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 12:
                    num = num;
                    qzm0Var2 = qzm0Var2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i2 |= 4096;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 13:
                    num = num;
                    qzm0Var2 = qzm0Var2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i2 |= 8192;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 14:
                    num = num;
                    qzm0Var2 = qzm0Var2;
                    sbrVar = (sbr) bldVarA.e(ugi0Var, 14, obr.f24996a, sbrVar);
                    i2 |= 16384;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 15:
                    num2 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num2);
                    i = 32768;
                    i2 |= i;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 16:
                    str4 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str4);
                    i = 65536;
                    i2 |= i;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 17:
                    num3 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num3);
                    i = 131072;
                    i2 |= i;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case 18:
                    num4 = (Integer) bldVarA.e(ugi0Var, 18, okx.f25427a, num4);
                    i = 262144;
                    i2 |= i;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    vfm0Var = (vfm0) bldVarA.e(ugi0Var, 19, pfm0.f26912a, vfm0Var);
                    i = 524288;
                    i2 |= i;
                    qzm0Var2 = qzm0Var2;
                    num = num;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str7 = str2;
        qzm0 qzm0Var4 = qzm0Var2;
        String str8 = str5;
        List list2 = list;
        hso hsoVar2 = hsoVar;
        bldVarA.c(ugi0Var);
        vfm0 vfm0Var2 = vfm0Var;
        return new lv10(i2, str8, list2, hsoVar2, num5, str6, num6, num7, qzm0Var4, num, str3, pnq0Var, str7, bool, bool2, sbrVar, num2, str4, num3, num4, vfm0Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lv10 lv10Var = (lv10) obj;
        lv10Var.getClass();
        vfm0 vfm0Var = lv10Var.t;
        Integer num = lv10Var.s;
        Integer num2 = lv10Var.r;
        String str = lv10Var.q;
        Integer num3 = lv10Var.p;
        sbr sbrVar = lv10Var.o;
        Boolean bool = lv10Var.n;
        Boolean bool2 = lv10Var.m;
        String str2 = lv10Var.l;
        pnq0 pnq0Var = lv10Var.k;
        String str3 = lv10Var.j;
        Integer num4 = lv10Var.i;
        qzm0 qzm0Var = lv10Var.h;
        Integer num5 = lv10Var.g;
        Integer num6 = lv10Var.f;
        String str4 = lv10Var.e;
        Integer num7 = lv10Var.d;
        hso hsoVar = lv10Var.c;
        List list = lv10Var.b;
        String str5 = lv10Var.f20700a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lv10.u;
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || hsoVar != null) {
            cldVarA.p(ugi0Var, 2, dso.f6620a, hsoVar);
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
        if (cldVarA.u(ugi0Var) || qzm0Var != null) {
            cldVarA.p(ugi0Var, 7, kzm0.f19159a, qzm0Var);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || pnq0Var != null) {
            cldVarA.p(ugi0Var, 10, fnq0.f9851a, pnq0Var);
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
        if (cldVarA.u(ugi0Var) || sbrVar != null) {
            cldVarA.p(ugi0Var, 14, obr.f24996a, sbrVar);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 18, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || vfm0Var != null) {
            cldVarA.p(ugi0Var, 19, pfm0.f26912a, vfm0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
