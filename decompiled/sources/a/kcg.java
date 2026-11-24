package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kcg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kcg f18057a;
    private static final ugi0 descriptor;

    static {
        kcg kcgVar = new kcg();
        f18057a = kcgVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.regular.data.model.CyberChampGameResultResponse", kcgVar, 21);
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
        zna0Var.j("score", true);
        zna0Var.j("scoreBase", true);
        zna0Var.j("scoreAdd", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("videos", true);
        zna0Var.j("dateStart", true);
        zna0Var.j("matchInfos", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j("statId", true);
        zna0Var.j("matchStatus", true);
        zna0Var.j("globalChampId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mcg.v;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[6].getValue()), mrv.j0((jiy) a8zVarArr[7].getValue()), mrv.j0((jiy) a8zVarArr[8].getValue()), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[16].getValue()), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(fg30.f9473a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mcg.v;
        String str = null;
        String str2 = null;
        List list2 = null;
        List list3 = null;
        String str3 = null;
        Integer num = null;
        int i2 = 0;
        String str4 = null;
        List list4 = null;
        Long l2 = null;
        Map map = null;
        String str5 = null;
        String str6 = null;
        eg30 eg30Var = null;
        boolean z = true;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        List list5 = null;
        List list6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    str2 = str2;
                    list3 = list3;
                    l3 = l;
                    str = str;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i2 |= 1;
                    str2 = str2;
                    list3 = list3;
                    list2 = list2;
                    l3 = l;
                    str = str;
                    break;
                case 1:
                    list = list3;
                    l4 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l4);
                    i2 |= 2;
                    l5 = l5;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 2:
                    list = list3;
                    l5 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l5);
                    i2 |= 4;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 3:
                    list = list3;
                    str7 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str7);
                    i2 |= 8;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 4:
                    list = list3;
                    str8 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str8);
                    i2 |= 16;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 5:
                    list = list3;
                    str9 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str9);
                    i2 |= 32;
                    list3 = list;
                    list2 = list2;
                    str = str;
                    break;
                case 6:
                    list = list3;
                    list5 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list5);
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
                    str = str;
                    list2 = list2;
                    list3 = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list3);
                    i2 |= 256;
                    list2 = list2;
                    str = str;
                    break;
                case 9:
                    str = str;
                    list2 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
                    i2 |= 512;
                    list3 = list3;
                    str = str;
                    break;
                case 10:
                    list2 = list2;
                    list3 = list3;
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i2 |= 1024;
                    list3 = list3;
                    list2 = list2;
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
                    str3 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str3);
                    i2 |= 4096;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 13:
                    list2 = list2;
                    list3 = list3;
                    str4 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str4);
                    i2 |= 8192;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 14:
                    list2 = list2;
                    list3 = list3;
                    list4 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list4);
                    i2 |= 16384;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 15:
                    l2 = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l2);
                    i = 32768;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 16:
                    map = (Map) bldVarA.e(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), map);
                    i = 65536;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 17:
                    str5 = (String) bldVarA.e(ugi0Var, 17, ysm0.f43175a, str5);
                    i = 131072;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 18:
                    str6 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str6);
                    i = 262144;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    eg30Var = (eg30) bldVarA.e(ugi0Var, 19, fg30.f9473a, eg30Var);
                    i = 524288;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                case 20:
                    num = (Integer) bldVarA.e(ugi0Var, 20, okx.f25427a, num);
                    i = 1048576;
                    i2 |= i;
                    list3 = list3;
                    list2 = list2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str10 = str;
        List list7 = list3;
        Long l6 = l3;
        Long l7 = l4;
        Long l8 = l5;
        bldVarA.c(ugi0Var);
        eg30 eg30Var2 = eg30Var;
        return new mcg(i2, l6, l7, l8, str7, str8, str9, list5, list6, list7, list2, str2, str10, str3, str4, list4, l2, map, str5, str6, eg30Var2, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mcg mcgVar = (mcg) obj;
        mcgVar.getClass();
        Integer num = mcgVar.u;
        eg30 eg30Var = mcgVar.t;
        String str = mcgVar.s;
        String str2 = mcgVar.r;
        Map map = mcgVar.q;
        Long l = mcgVar.p;
        List list = mcgVar.o;
        String str3 = mcgVar.n;
        String str4 = mcgVar.m;
        String str5 = mcgVar.l;
        String str6 = mcgVar.k;
        List list2 = mcgVar.j;
        List list3 = mcgVar.i;
        List list4 = mcgVar.h;
        List list5 = mcgVar.g;
        String str7 = mcgVar.f;
        String str8 = mcgVar.e;
        String str9 = mcgVar.d;
        Long l2 = mcgVar.c;
        Long l3 = mcgVar.b;
        Long l4 = mcgVar.f21549a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mcg.v;
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || map != null) {
            cldVarA.p(ugi0Var, 16, (jiy) a8zVarArr[16].getValue(), map);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 17, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || eg30Var != null) {
            cldVarA.p(ugi0Var, 19, fg30.f9473a, eg30Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 20, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
