package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zbp0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zbp0 f44127a;
    private static final ugi0 descriptor;

    static {
        zbp0 zbp0Var = new zbp0();
        f44127a = zbp0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.team_details.events.data.models.TeamEventItemResultsResponse", zbp0Var, 20);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("champId", true);
        zna0Var.j("champName", true);
        zna0Var.j("champImage", true);
        zna0Var.j("opp1", true);
        zna0Var.j("opp2", true);
        zna0Var.j("opp1Images", true);
        zna0Var.j("opp2Images", true);
        zna0Var.j("opp1Ids", true);
        zna0Var.j("opp2Ids", true);
        zna0Var.j("score", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("dateStart", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("matchInfos", true);
        zna0Var.j("stadiumId", true);
        zna0Var.j("statId", true);
        zna0Var.j("globalChampId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = bcp0.u;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0((jiy) a8zVarArr[8].getValue());
        jiy jiyVarJ9 = mrv.j0((jiy) a8zVarArr[9].getValue());
        jiy jiyVarJ10 = mrv.j0((jiy) a8zVarArr[10].getValue());
        jiy jiyVarJ11 = mrv.j0((jiy) a8zVarArr[11].getValue());
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        jiy jiyVarJ13 = mrv.j0(ysm0Var);
        jiy jiyVarJ14 = mrv.j0(s710Var);
        jiy jiyVarJ15 = mrv.j0(ysm0Var);
        jiy jiyVarJ16 = mrv.j0((jiy) a8zVarArr[16].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, jiyVarJ16, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = bcp0.u;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        String str4 = null;
        Long l2 = null;
        String str5 = null;
        Map map = null;
        Integer num = null;
        String str6 = null;
        Integer num2 = null;
        boolean z = true;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    list2 = list2;
                    str3 = str3;
                    l3 = l;
                    list = list;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i2 |= 1;
                    list2 = list2;
                    str3 = str3;
                    list4 = list4;
                    l3 = l;
                    list = list;
                    break;
                case 1:
                    str = str3;
                    l4 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l4);
                    i2 |= 2;
                    l5 = l5;
                    str3 = str;
                    list4 = list4;
                    list = list;
                    break;
                case 2:
                    str = str3;
                    l5 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l5);
                    i2 |= 4;
                    str3 = str;
                    list4 = list4;
                    list = list;
                    break;
                case 3:
                    str = str3;
                    l6 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l6);
                    i2 |= 8;
                    str3 = str;
                    list4 = list4;
                    list = list;
                    break;
                case 4:
                    str = str3;
                    str7 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str7);
                    i2 |= 16;
                    str3 = str;
                    list4 = list4;
                    list = list;
                    break;
                case 5:
                    str = str3;
                    str8 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str8);
                    i2 |= 32;
                    str3 = str;
                    list4 = list4;
                    list = list;
                    break;
                case 6:
                    str = str3;
                    str9 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str9);
                    i2 |= 64;
                    str3 = str;
                    list4 = list4;
                    list = list;
                    break;
                case 7:
                    list = list;
                    list4 = list4;
                    str3 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str3);
                    i2 |= 128;
                    list4 = list4;
                    list = list;
                    break;
                case 8:
                    list = list;
                    list4 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list4);
                    i2 |= 256;
                    str3 = str3;
                    list = list;
                    break;
                case 9:
                    list4 = list4;
                    str3 = str3;
                    list3 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
                    i2 |= 512;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 10:
                    list4 = list4;
                    str3 = str3;
                    list2 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
                    i2 |= 1024;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 11:
                    list4 = list4;
                    str3 = str3;
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i2 |= 2048;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 12:
                    list4 = list4;
                    str3 = str3;
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i2 |= 4096;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 13:
                    list4 = list4;
                    str3 = str3;
                    str4 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str4);
                    i2 |= 8192;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 14:
                    list4 = list4;
                    str3 = str3;
                    l2 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l2);
                    i2 |= 16384;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 15:
                    str5 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str5);
                    i = 32768;
                    i2 |= i;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 16:
                    map = (Map) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), map);
                    i = 65536;
                    i2 |= i;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 17:
                    num = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num);
                    i = 131072;
                    i2 |= i;
                    str3 = str3;
                    list4 = list4;
                    break;
                case 18:
                    str6 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str6);
                    i = 262144;
                    i2 |= i;
                    str3 = str3;
                    list4 = list4;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    num2 = (Integer) bldVarA.e(ugi0Var, 19, okx.f25427a, num2);
                    i = 524288;
                    i2 |= i;
                    str3 = str3;
                    list4 = list4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list5 = list;
        String str10 = str3;
        Long l7 = l3;
        Long l8 = l4;
        Long l9 = l5;
        bldVarA.c(ugi0Var);
        Integer num3 = num2;
        return new bcp0(i2, l7, l8, l9, l6, str7, str8, str9, str10, list4, list3, list2, list5, str2, str4, l2, str5, map, num, str6, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bcp0 bcp0Var = (bcp0) obj;
        bcp0Var.getClass();
        Integer num = bcp0Var.t;
        String str = bcp0Var.s;
        Integer num2 = bcp0Var.r;
        Map map = bcp0Var.q;
        String str2 = bcp0Var.p;
        Long l = bcp0Var.o;
        String str3 = bcp0Var.n;
        String str4 = bcp0Var.m;
        List list = bcp0Var.l;
        List list2 = bcp0Var.k;
        List list3 = bcp0Var.j;
        List list4 = bcp0Var.i;
        String str5 = bcp0Var.h;
        String str6 = bcp0Var.g;
        String str7 = bcp0Var.f;
        String str8 = bcp0Var.e;
        Long l2 = bcp0Var.d;
        Long l3 = bcp0Var.c;
        Long l4 = bcp0Var.b;
        Long l5 = bcp0Var.f2364a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = bcp0.u;
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str4 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num2);
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
