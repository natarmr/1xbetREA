package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pwp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pwp f27722a;
    private static final ugi0 descriptor;

    static {
        pwp pwpVar = new pwp();
        f27722a = pwpVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.fighter.data.results.model.FighterResultsItemResponse", pwpVar, 24);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("champName", true);
        zna0Var.j("opp1", true);
        zna0Var.j("opp2", true);
        zna0Var.j("opp1Images", true);
        zna0Var.j("opp2Images", true);
        zna0Var.j("opp1Ids", true);
        zna0Var.j("opp2Ids", true);
        zna0Var.j("scoreBase", true);
        zna0Var.j("scoreAdd", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("videos", true);
        zna0Var.j("dateStart", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("matchInfos", true);
        zna0Var.j("stadiumId", true);
        zna0Var.j("globalChampId", true);
        zna0Var.j("statId", true);
        zna0Var.j("homeAwayFlag", true);
        zna0Var.j("matchStatus", true);
        zna0Var.j("subGame", true);
        zna0Var.j("countSubGame", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = rwp.y;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0((jiy) a8zVarArr[6].getValue());
        jiy jiyVarJ7 = mrv.j0((jiy) a8zVarArr[7].getValue());
        jiy jiyVarJ8 = mrv.j0((jiy) a8zVarArr[8].getValue());
        jiy jiyVarJ9 = mrv.j0((jiy) a8zVarArr[9].getValue());
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        jiy jiyVarJ13 = mrv.j0((jiy) a8zVarArr[13].getValue());
        jiy jiyVarJ14 = mrv.j0(s710Var);
        jiy jiyVarJ15 = mrv.j0(ysm0Var);
        jiy jiyVarJ16 = mrv.j0((jiy) a8zVarArr[16].getValue());
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, jiyVarJ16, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[22].getValue()), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = rwp.y;
        String str2 = null;
        Integer num = null;
        List list = null;
        Integer num2 = null;
        String str3 = null;
        Boolean bool = null;
        int i2 = 0;
        List list2 = null;
        Long l = null;
        String str4 = null;
        Map map = null;
        Integer num3 = null;
        Integer num4 = null;
        String str5 = null;
        boolean z = true;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        String str9 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num;
                    z = false;
                    list = list;
                    str3 = str3;
                    l2 = l2;
                    num = num;
                    break;
                case 0:
                    String str10 = str2;
                    i2 |= 1;
                    list = list;
                    str3 = str3;
                    num = num;
                    l2 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    str2 = str10;
                    break;
                case 1:
                    str = str2;
                    l3 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l3);
                    i2 |= 2;
                    l4 = l4;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 2:
                    str = str2;
                    l4 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l4);
                    i2 |= 4;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 3:
                    str = str2;
                    str6 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str6);
                    i2 |= 8;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 4:
                    str = str2;
                    str7 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str7);
                    i2 |= 16;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 5:
                    str = str2;
                    str8 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str8);
                    i2 |= 32;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 6:
                    str = str2;
                    list3 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list3);
                    i2 |= 64;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 7:
                    str = str2;
                    list4 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list4);
                    i2 |= 128;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 8:
                    str = str2;
                    list5 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list5);
                    i2 |= 256;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 9:
                    str = str2;
                    list6 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list6);
                    i2 |= 512;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 10:
                    str = str2;
                    str9 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str9);
                    i2 |= 1024;
                    str2 = str;
                    str3 = str3;
                    num = num;
                    break;
                case 11:
                    num = num;
                    str3 = str3;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    str3 = str3;
                    num = num;
                    break;
                case 12:
                    num = num;
                    str3 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str3);
                    i2 |= 4096;
                    str2 = str2;
                    num = num;
                    break;
                case 13:
                    str2 = str2;
                    str3 = str3;
                    list2 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
                    i2 |= 8192;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 14:
                    str2 = str2;
                    str3 = str3;
                    l = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l);
                    i2 |= 16384;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 15:
                    str4 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str4);
                    i = 32768;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 16:
                    map = (Map) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), map);
                    i = 65536;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 17:
                    num3 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num3);
                    i = 131072;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 18:
                    num4 = (Integer) bldVarA.e(ugi0Var, 18, okx.f25427a, num4);
                    i = 262144;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str5 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str5);
                    i = 524288;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 20:
                    bool = (Boolean) bldVarA.e(ugi0Var, 20, sm8.f32432a, bool);
                    i = 1048576;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 21:
                    num2 = (Integer) bldVarA.e(ugi0Var, 21, okx.f25427a, num2);
                    i = 2097152;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 22:
                    list = (List) bldVarA.e(ugi0Var, 22, (jiy) a8zVarArr[22].getValue(), list);
                    i = 4194304;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                case 23:
                    num = (Integer) bldVarA.e(ugi0Var, 23, okx.f25427a, num);
                    i = 8388608;
                    i2 |= i;
                    str2 = str2;
                    str3 = str3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num5 = num;
        String str11 = str3;
        Long l5 = l2;
        Long l6 = l3;
        Long l7 = l4;
        bldVarA.c(ugi0Var);
        List list7 = list6;
        String str12 = str5;
        return new rwp(i2, l5, l6, l7, str6, str7, str8, list3, list4, list5, list7, str9, str2, str11, list2, l, str4, map, num3, num4, str12, bool, num2, list, num5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rwp rwpVar = (rwp) obj;
        rwpVar.getClass();
        Integer num = rwpVar.x;
        List list = rwpVar.w;
        Integer num2 = rwpVar.v;
        Boolean bool = rwpVar.u;
        String str = rwpVar.t;
        Integer num3 = rwpVar.s;
        Integer num4 = rwpVar.r;
        Map map = rwpVar.q;
        String str2 = rwpVar.p;
        Long l = rwpVar.o;
        List list2 = rwpVar.n;
        String str3 = rwpVar.m;
        String str4 = rwpVar.l;
        String str5 = rwpVar.k;
        List list3 = rwpVar.j;
        List list4 = rwpVar.i;
        List list5 = rwpVar.h;
        List list6 = rwpVar.g;
        String str6 = rwpVar.f;
        String str7 = rwpVar.e;
        String str8 = rwpVar.d;
        Long l2 = rwpVar.c;
        Long l3 = rwpVar.b;
        Long l4 = rwpVar.f31226a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = rwp.y;
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || list6 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list6);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
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
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 18, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 20, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 21, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 22, (jiy) a8zVarArr[22].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 23, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
