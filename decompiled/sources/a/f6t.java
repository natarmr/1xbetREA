package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f6t implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f6t f9029a;
    private static final ugi0 descriptor;

    static {
        f6t f6tVar = new f6t();
        f9029a = f6tVar;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.data.eventgames.history.model.response.GamesHistoryResponse.Game", f6tVar, 22);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("sportId", true);
        zna0Var.j("champName", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("statId", true);
        zna0Var.j("opp1", true);
        zna0Var.j("opp2", true);
        zna0Var.j("opp1Images", true);
        zna0Var.j("opp2Images", true);
        zna0Var.j("opp1Ids", true);
        zna0Var.j("opp2Ids", true);
        zna0Var.j("score", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("videos", true);
        zna0Var.j("dateStart", true);
        zna0Var.j("countSubGame", true);
        zna0Var.j("subGame", true);
        zna0Var.j("stadiumId", true);
        zna0Var.j("matchInfos", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("homeAwayFlag", true);
        zna0Var.j("globalChampId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = h6t.w;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0((jiy) a8zVarArr[7].getValue());
        jiy jiyVarJ8 = mrv.j0((jiy) a8zVarArr[8].getValue());
        jiy jiyVarJ9 = mrv.j0((jiy) a8zVarArr[9].getValue());
        jiy jiyVarJ10 = mrv.j0((jiy) a8zVarArr[10].getValue());
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        jiy jiyVarJ13 = mrv.j0((jiy) a8zVarArr[13].getValue());
        jiy jiyVarJ14 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[16].getValue()), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[18].getValue()), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = h6t.w;
        String str = null;
        List list2 = null;
        List list3 = null;
        Integer num = null;
        String str2 = null;
        Boolean bool = null;
        int i2 = 0;
        List list4 = null;
        Long l2 = null;
        Integer num2 = null;
        List list5 = null;
        Long l3 = null;
        HashMap map = null;
        String str3 = null;
        boolean z = true;
        Long l4 = null;
        Long l5 = null;
        String str4 = null;
        Long l6 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list6 = null;
        List list7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l4;
                    z = false;
                    list3 = list3;
                    l4 = l;
                    str = str;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l4);
                    i2 |= 1;
                    l5 = l5;
                    list3 = list3;
                    list2 = list2;
                    l4 = l;
                    str = str;
                    break;
                case 1:
                    list = list3;
                    l5 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l5);
                    i2 |= 2;
                    str4 = str4;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 2:
                    list = list3;
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i2 |= 4;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 3:
                    list = list3;
                    l6 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l6);
                    i2 |= 8;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 4:
                    list = list3;
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i2 |= 16;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 5:
                    list = list3;
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i2 |= 32;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 6:
                    list = list3;
                    str7 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str7);
                    i2 |= 64;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 7:
                    list = list3;
                    list6 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list6);
                    i2 |= 128;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 8:
                    list = list3;
                    list7 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list7);
                    i2 |= 256;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 9:
                    str = str;
                    list2 = list2;
                    list3 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
                    i2 |= 512;
                    list2 = list2;
                    str = str;
                    break;
                case 10:
                    str = str;
                    list2 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
                    i2 |= 1024;
                    list3 = list3;
                    str = str;
                    break;
                case 11:
                    list2 = list2;
                    list3 = list3;
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i2 |= 2048;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 12:
                    list2 = list2;
                    list3 = list3;
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i2 |= 4096;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 13:
                    list2 = list2;
                    list3 = list3;
                    list4 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list4);
                    i2 |= 8192;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 14:
                    list2 = list2;
                    list3 = list3;
                    l2 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l2);
                    i2 |= 16384;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 15:
                    num2 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num2);
                    i = 32768;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 16:
                    list5 = (List) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list5);
                    i = 65536;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 17:
                    l3 = (Long) bldVarA.e(ugi0Var, 17, s710.f31729a, l3);
                    i = 131072;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 18:
                    map = (HashMap) bldVarA.e(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), map);
                    i = 262144;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str3 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str3);
                    i = 524288;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 20:
                    bool = (Boolean) bldVarA.e(ugi0Var, 20, sm8.f32432a, bool);
                    i = 1048576;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 21:
                    num = (Integer) bldVarA.e(ugi0Var, 21, okx.f25427a, num);
                    i = 2097152;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str8 = str;
        List list8 = list3;
        Long l7 = l4;
        Long l8 = l5;
        String str9 = str4;
        bldVarA.c(ugi0Var);
        String str10 = str3;
        return new h6t(i2, l7, l8, str9, l6, str5, str6, str7, list6, list7, list8, list2, str8, str2, list4, l2, num2, list5, l3, map, str10, bool, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h6t h6tVar = (h6t) obj;
        h6tVar.getClass();
        Integer num = h6tVar.v;
        Boolean bool = h6tVar.u;
        String str = h6tVar.t;
        HashMap map = h6tVar.s;
        Long l = h6tVar.r;
        List list = h6tVar.q;
        Integer num2 = h6tVar.p;
        Long l2 = h6tVar.o;
        List list2 = h6tVar.n;
        String str2 = h6tVar.m;
        String str3 = h6tVar.l;
        List list3 = h6tVar.k;
        List list4 = h6tVar.j;
        List list5 = h6tVar.i;
        List list6 = h6tVar.h;
        String str4 = h6tVar.g;
        String str5 = h6tVar.f;
        String str6 = h6tVar.e;
        Long l3 = h6tVar.d;
        String str7 = h6tVar.c;
        Long l4 = h6tVar.b;
        Long l5 = h6tVar.f12544a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = h6t.w;
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || list6 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list6);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 17, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 20, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 21, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
