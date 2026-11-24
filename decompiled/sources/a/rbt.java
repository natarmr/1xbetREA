package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rbt implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rbt f30205a;
    private static final ugi0 descriptor;

    static {
        rbt rbtVar = new rbt();
        f30205a = rbtVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.championship.data.results.model.GamesResultItemResponse", rbtVar, 23);
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
        zna0Var.j("scoreBase", true);
        zna0Var.j("scoreAdd", true);
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
        a8z[] a8zVarArr = tbt.x;
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
        jiy jiyVarJ13 = mrv.j0(ysm0Var);
        jiy jiyVarJ14 = mrv.j0((jiy) a8zVarArr[14].getValue());
        jiy jiyVarJ15 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, mrv.j0(okxVar), mrv.j0((jiy) a8zVarArr[17].getValue()), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[19].getValue()), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = tbt.x;
        String str = null;
        List list2 = null;
        Integer num = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        String str4 = null;
        List list3 = null;
        Long l = null;
        Integer num2 = null;
        List list4 = null;
        Long l2 = null;
        HashMap map = null;
        boolean z = true;
        Long l3 = null;
        Long l4 = null;
        String str5 = null;
        Long l5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num;
                    z = false;
                    list2 = list2;
                    l3 = l3;
                    num = num;
                    break;
                case 0:
                    str = str;
                    i2 |= 1;
                    l4 = l4;
                    list2 = list2;
                    num = num;
                    l3 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    str = str;
                    break;
                case 1:
                    list = list2;
                    l4 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l4);
                    i2 |= 2;
                    str5 = str5;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 2:
                    list = list2;
                    str5 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str5);
                    i2 |= 4;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 3:
                    list = list2;
                    l5 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l5);
                    i2 |= 8;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 4:
                    list = list2;
                    str6 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str6);
                    i2 |= 16;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 5:
                    list = list2;
                    str7 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str7);
                    i2 |= 32;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 6:
                    list = list2;
                    str8 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str8);
                    i2 |= 64;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 7:
                    list = list2;
                    list5 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list5);
                    i2 |= 128;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 8:
                    list = list2;
                    list6 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list6);
                    i2 |= 256;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 9:
                    list = list2;
                    list7 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list7);
                    i2 |= 512;
                    list2 = list;
                    str = str;
                    num = num;
                    break;
                case 10:
                    num = num;
                    str = str;
                    list2 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
                    i2 |= 1024;
                    str = str;
                    num = num;
                    break;
                case 11:
                    num = num;
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i2 |= 2048;
                    list2 = list2;
                    num = num;
                    break;
                case 12:
                    str = str;
                    list2 = list2;
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i2 |= 4096;
                    list2 = list2;
                    str = str;
                    break;
                case 13:
                    str = str;
                    list2 = list2;
                    str4 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str4);
                    i2 |= 8192;
                    list2 = list2;
                    str = str;
                    break;
                case 14:
                    str = str;
                    list2 = list2;
                    list3 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list3);
                    i2 |= 16384;
                    list2 = list2;
                    str = str;
                    break;
                case 15:
                    l = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l);
                    i = 32768;
                    i2 |= i;
                    list2 = list2;
                    str = str;
                    break;
                case 16:
                    num2 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num2);
                    i = 65536;
                    i2 |= i;
                    list2 = list2;
                    str = str;
                    break;
                case 17:
                    list4 = (List) bldVarA.e(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list4);
                    i = 131072;
                    i2 |= i;
                    list2 = list2;
                    str = str;
                    break;
                case 18:
                    l2 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l2);
                    i = 262144;
                    i2 |= i;
                    list2 = list2;
                    str = str;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    map = (HashMap) bldVarA.e(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), map);
                    i = 524288;
                    i2 |= i;
                    list2 = list2;
                    str = str;
                    break;
                case 20:
                    str3 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str3);
                    i = 1048576;
                    i2 |= i;
                    list2 = list2;
                    str = str;
                    break;
                case 21:
                    bool = (Boolean) bldVarA.e(ugi0Var, 21, sm8.f32432a, bool);
                    i = 2097152;
                    i2 |= i;
                    list2 = list2;
                    str = str;
                    break;
                case 22:
                    num = (Integer) bldVarA.e(ugi0Var, 22, okx.f25427a, num);
                    i = 4194304;
                    i2 |= i;
                    list2 = list2;
                    str = str;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list8 = list2;
        Integer num3 = num;
        Long l6 = l3;
        Long l7 = l4;
        String str9 = str5;
        bldVarA.c(ugi0Var);
        List list9 = list7;
        HashMap map2 = map;
        return new tbt(i2, l6, l7, str9, l5, str6, str7, str8, list5, list6, list9, list8, str, str2, str4, list3, l, num2, list4, l2, map2, str3, bool, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tbt tbtVar = (tbt) obj;
        tbtVar.getClass();
        Integer num = tbtVar.w;
        Boolean bool = tbtVar.v;
        String str = tbtVar.u;
        HashMap map = tbtVar.t;
        Long l = tbtVar.s;
        List list = tbtVar.r;
        Integer num2 = tbtVar.q;
        Long l2 = tbtVar.p;
        List list2 = tbtVar.o;
        String str2 = tbtVar.n;
        String str3 = tbtVar.m;
        String str4 = tbtVar.l;
        List list3 = tbtVar.k;
        List list4 = tbtVar.j;
        List list5 = tbtVar.i;
        List list6 = tbtVar.h;
        String str5 = tbtVar.g;
        String str6 = tbtVar.f;
        String str7 = tbtVar.e;
        Long l3 = tbtVar.d;
        String str8 = tbtVar.c;
        Long l4 = tbtVar.b;
        Long l5 = tbtVar.f33683a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = tbt.x;
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str5);
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
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 16, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 21, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 22, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
