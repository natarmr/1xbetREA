package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jcp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jcp f16287a;
    private static final ugi0 descriptor;

    static {
        jcp jcpVar = new jcp();
        f16287a = jcpVar;
        zna0 zna0Var = new zna0("org.xplatform.favorites.core.data.model.games.FavoriteResultGameResponse", jcpVar, 24);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("constId", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("countryId", true);
        zna0Var.j("champName", true);
        zna0Var.j("champId", true);
        zna0Var.j("champImage", true);
        zna0Var.j("opp1Ids", true);
        zna0Var.j("opp2Ids", true);
        zna0Var.j("opp1", true);
        zna0Var.j("opp2", true);
        zna0Var.j("opp1Images", true);
        zna0Var.j("opp2Images", true);
        zna0Var.j("score", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("dateStart", true);
        zna0Var.j("matchInfos", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("homeAwayFlag", true);
        zna0Var.j("statId", true);
        zna0Var.j("globalChampId", true);
        zna0Var.j("countSubGame", true);
        zna0Var.j("subGame", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = lcp.y;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0((jiy) a8zVarArr[8].getValue());
        jiy jiyVarJ9 = mrv.j0((jiy) a8zVarArr[9].getValue());
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        jiy jiyVarJ12 = mrv.j0((jiy) a8zVarArr[12].getValue());
        jiy jiyVarJ13 = mrv.j0((jiy) a8zVarArr[13].getValue());
        jiy jiyVarJ14 = mrv.j0(ysm0Var);
        jiy jiyVarJ15 = mrv.j0(ysm0Var);
        jiy jiyVarJ16 = mrv.j0(s710Var);
        jiy jiyVarJ17 = mrv.j0((jiy) a8zVarArr[17].getValue());
        jiy jiyVarJ18 = mrv.j0(ysm0Var);
        jiy jiyVarJ19 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ20 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, jiyVarJ16, jiyVarJ17, jiyVarJ18, jiyVarJ19, jiyVarJ20, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[23].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        String str;
        int i;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = lcp.y;
        String str2 = null;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        List list2 = null;
        String str3 = null;
        int i2 = 0;
        List list3 = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
        Map map = null;
        String str6 = null;
        Boolean bool = null;
        boolean z = true;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        String str7 = null;
        Long l7 = null;
        String str8 = null;
        List list4 = null;
        List list5 = null;
        String str9 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    num = num;
                    list2 = list2;
                    l2 = l2;
                    list = list;
                    break;
                case 0:
                    String str10 = str2;
                    i2 |= 1;
                    num = num;
                    list = list;
                    list2 = list2;
                    l2 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    str2 = str10;
                    break;
                case 1:
                    str = str2;
                    l3 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l3);
                    i2 |= 2;
                    l4 = l4;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 2:
                    str = str2;
                    l4 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l4);
                    i2 |= 4;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 3:
                    str = str2;
                    l5 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l5);
                    i2 |= 8;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 4:
                    str = str2;
                    l6 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l6);
                    i2 |= 16;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 5:
                    str = str2;
                    str7 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str7);
                    i2 |= 32;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 6:
                    str = str2;
                    l7 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l7);
                    i2 |= 64;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 7:
                    str = str2;
                    str8 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str8);
                    i2 |= 128;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 8:
                    str = str2;
                    list4 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list4);
                    i2 |= 256;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 9:
                    str = str2;
                    list5 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list5);
                    i2 |= 512;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 10:
                    str = str2;
                    str9 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str9);
                    i2 |= 1024;
                    str2 = str;
                    list = list;
                    list2 = list2;
                    break;
                case 11:
                    list = list;
                    list2 = list2;
                    str2 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str2);
                    i2 |= 2048;
                    list = list;
                    list2 = list2;
                    break;
                case 12:
                    list2 = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
                    i2 |= 4096;
                    str2 = str2;
                    list = list;
                    break;
                case 13:
                    str2 = str2;
                    list2 = list2;
                    list3 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list3);
                    i2 |= 8192;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 14:
                    str2 = str2;
                    list2 = list2;
                    str4 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str4);
                    i2 |= 16384;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 15:
                    str5 = (String) bldVarA.e(ugi0Var, 15, ysm0.f43175a, str5);
                    i = 32768;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 16:
                    l = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l);
                    i = 65536;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 17:
                    map = (Map) bldVarA.e(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), map);
                    i = 131072;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 18:
                    str6 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str6);
                    i = 262144;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    bool = (Boolean) bldVarA.e(ugi0Var, 19, sm8.f32432a, bool);
                    i = 524288;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 20:
                    str3 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str3);
                    i = 1048576;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 21:
                    num2 = (Integer) bldVarA.e(ugi0Var, 21, okx.f25427a, num2);
                    i = 2097152;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 22:
                    num = (Integer) bldVarA.e(ugi0Var, 22, okx.f25427a, num);
                    i = 4194304;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                case 23:
                    list = (List) bldVarA.e(ugi0Var, 23, (jiy) a8zVarArr[23].getValue(), list);
                    i = 8388608;
                    i2 |= i;
                    str2 = str2;
                    list2 = list2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list6 = list;
        List list7 = list2;
        Long l8 = l2;
        Long l9 = l3;
        Long l10 = l4;
        bldVarA.c(ugi0Var);
        List list8 = list5;
        Boolean bool2 = bool;
        return new lcp(i2, l8, l9, l10, l5, l6, str7, l7, str8, list4, list8, str9, str2, list7, list3, str4, str5, l, map, str6, bool2, str3, num2, num, list6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lcp lcpVar = (lcp) obj;
        lcpVar.getClass();
        List list = lcpVar.x;
        Integer num = lcpVar.w;
        Integer num2 = lcpVar.v;
        String str = lcpVar.u;
        Boolean bool = lcpVar.t;
        String str2 = lcpVar.s;
        Map map = lcpVar.r;
        Long l = lcpVar.q;
        String str3 = lcpVar.p;
        String str4 = lcpVar.o;
        List list2 = lcpVar.n;
        List list3 = lcpVar.m;
        String str5 = lcpVar.l;
        String str6 = lcpVar.k;
        List list4 = lcpVar.j;
        List list5 = lcpVar.i;
        String str7 = lcpVar.h;
        Long l2 = lcpVar.g;
        String str8 = lcpVar.f;
        Long l3 = lcpVar.e;
        Long l4 = lcpVar.d;
        Long l5 = lcpVar.c;
        Long l6 = lcpVar.b;
        Long l7 = lcpVar.f19809a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = lcp.y;
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list3 != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 15, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 19, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 21, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 22, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 23, (jiy) a8zVarArr[23].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
