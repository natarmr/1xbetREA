package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tqj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tqj0 f34383a;
    private static final ugi0 descriptor;

    static {
        tqj0 tqj0Var = new tqj0();
        f34383a = tqj0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.statistic_core.data.models.ShortGameInfoResponse", tqj0Var, 21);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("gameStatistic", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("subScore1", true);
        zna0Var.j("subScore2", true);
        zna0Var.j("redCards1", true);
        zna0Var.j("redCards2", true);
        zna0Var.j("dateStart", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("subStatus", true);
        zna0Var.j("referees", true);
        zna0Var.j("winner", true);
        zna0Var.j("periods", true);
        zna0Var.j("tournamentTitle", true);
        zna0Var.j("champId", true);
        zna0Var.j("globalChampID", true);
        zna0Var.j("stringScore1", true);
        zna0Var.j("stringScore2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = vqj0.v;
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0((jiy) a8zVarArr[1].getValue());
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ4 = mrv.j0(okxVar);
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(okxVar);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[15].getValue()), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = vqj0.v;
        Integer num2 = null;
        Long l = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str2 = null;
        int i2 = 0;
        List list = null;
        Integer num6 = null;
        List list2 = null;
        String str3 = null;
        Long l2 = null;
        Long l3 = null;
        String str4 = null;
        int i3 = 1;
        boolean z = true;
        String str5 = null;
        List list3 = null;
        String str6 = null;
        String str7 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    str = str5;
                    z = false;
                    l = l;
                    num4 = num4;
                    i3 = 1;
                    str5 = str;
                    num2 = num2;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str5);
                    i2 |= 1;
                    l = l;
                    num4 = num4;
                    num3 = num3;
                    i3 = 1;
                    str5 = str;
                    num2 = num2;
                    break;
                case 1:
                    num2 = num2;
                    Integer num11 = num4;
                    int i4 = i3;
                    list3 = (List) bldVarA.e(ugi0Var, i4, (jiy) a8zVarArr[i3].getValue(), list3);
                    i2 |= 2;
                    str6 = str6;
                    num4 = num11;
                    num3 = num3;
                    i3 = i4;
                    num2 = num2;
                    break;
                case 2:
                    num = num4;
                    str6 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str6);
                    i2 |= 4;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 3:
                    num = num4;
                    str7 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str7);
                    i2 |= 8;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 4:
                    num = num4;
                    num7 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num7);
                    i2 |= 16;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 5:
                    num = num4;
                    num8 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num8);
                    i2 |= 32;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 6:
                    num = num4;
                    num9 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num9);
                    i2 |= 64;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 7:
                    num = num4;
                    num10 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num10);
                    i2 |= 128;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 8:
                    num2 = num2;
                    num3 = num3;
                    num4 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num4);
                    i2 |= 256;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 9:
                    num2 = num2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num3);
                    i2 |= 512;
                    num4 = num4;
                    num2 = num2;
                    break;
                case 10:
                    num3 = num3;
                    num4 = num4;
                    l = (Long) bldVarA.e(ugi0Var, 10, s710.f31729a, l);
                    i2 |= 1024;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 11:
                    num3 = num3;
                    num4 = num4;
                    num2 = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num2);
                    i2 |= 2048;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 12:
                    num3 = num3;
                    num4 = num4;
                    num5 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num5);
                    i2 |= 4096;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 13:
                    num3 = num3;
                    num4 = num4;
                    list = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
                    i2 |= 8192;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 14:
                    num3 = num3;
                    num4 = num4;
                    num6 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num6);
                    i2 |= 16384;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 15:
                    list2 = (List) bldVarA.e(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list2);
                    i = 32768;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 16:
                    str3 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str3);
                    i = 65536;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 17:
                    l2 = (Long) bldVarA.e(ugi0Var, 17, s710.f31729a, l2);
                    i = 131072;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 18:
                    l3 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l3);
                    i = 262144;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str4 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str4);
                    i = 524288;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 20:
                    str2 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str2);
                    i = 1048576;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num12 = num2;
        Integer num13 = num4;
        String str8 = str5;
        List list4 = list3;
        String str9 = str6;
        bldVarA.c(ugi0Var);
        String str10 = str4;
        return new vqj0(i2, str8, list4, str9, str7, num7, num8, num9, num10, num13, num3, l, num12, num5, list, num6, list2, str3, l2, l3, str10, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vqj0 vqj0Var = (vqj0) obj;
        vqj0Var.getClass();
        String str = vqj0Var.u;
        String str2 = vqj0Var.t;
        Long l = vqj0Var.s;
        Long l2 = vqj0Var.r;
        String str3 = vqj0Var.q;
        List list = vqj0Var.p;
        Integer num = vqj0Var.o;
        List list2 = vqj0Var.n;
        Integer num2 = vqj0Var.m;
        Integer num3 = vqj0Var.l;
        Long l3 = vqj0Var.k;
        Integer num4 = vqj0Var.j;
        Integer num5 = vqj0Var.i;
        Integer num6 = vqj0Var.h;
        Integer num7 = vqj0Var.g;
        Integer num8 = vqj0Var.f;
        Integer num9 = vqj0Var.e;
        String str4 = vqj0Var.d;
        String str5 = vqj0Var.c;
        List list3 = vqj0Var.b;
        String str6 = vqj0Var.f37858a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = vqj0.v;
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num9 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num9);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 10, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 17, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
