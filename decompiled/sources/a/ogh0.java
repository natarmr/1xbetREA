package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ogh0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ogh0 f25218a;
    private static final ugi0 descriptor;

    static {
        ogh0 ogh0Var = new ogh0();
        f25218a = ogh0Var;
        zna0 zna0Var = new zna0("org.xplatform.results.impl.data.models.SearchResultsResponse.GameSearch", ogh0Var, 17);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("sportId", true);
        zna0Var.j("statId", true);
        zna0Var.j("opp1", true);
        zna0Var.j("opp2", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("score", true);
        zna0Var.j("isSubGame", true);
        zna0Var.j("dateStart", true);
        zna0Var.j("opp1Images", true);
        zna0Var.j("opp2Images", true);
        zna0Var.j("videos", true);
        zna0Var.j("hasSubGame", true);
        zna0Var.j("matchInfosFull", true);
        zna0Var.j("homeAwayFlag", true);
        zna0Var.j("globalChampId", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = qgh0.r;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[9].getValue()), mrv.j0((jiy) a8zVarArr[10].getValue()), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        String str;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = qgh0.r;
        List list = null;
        List list2 = null;
        List list3 = null;
        Long l2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        int i2 = 0;
        String str2 = null;
        Boolean bool3 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z = true;
        Long l3 = null;
        Long l4 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    list2 = list2;
                    str5 = str5;
                    l3 = l;
                    list = list;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i2 |= 1;
                    list2 = list2;
                    str4 = str4;
                    str5 = str5;
                    l3 = l;
                    list = list;
                    break;
                case 1:
                    str = str4;
                    l4 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l4);
                    i2 |= 2;
                    str7 = str7;
                    str4 = str;
                    str5 = str5;
                    list = list;
                    break;
                case 2:
                    str = str4;
                    str7 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str7);
                    i2 |= 4;
                    str4 = str;
                    str5 = str5;
                    list = list;
                    break;
                case 3:
                    str = str4;
                    str8 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str8);
                    i2 |= 8;
                    str4 = str;
                    str5 = str5;
                    list = list;
                    break;
                case 4:
                    list = list;
                    str5 = str5;
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i2 |= 16;
                    str5 = str5;
                    list = list;
                    break;
                case 5:
                    list = list;
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i2 |= 32;
                    str4 = str4;
                    list = list;
                    break;
                case 6:
                    str4 = str4;
                    str5 = str5;
                    str6 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str6);
                    i2 |= 64;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 7:
                    str4 = str4;
                    str5 = str5;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool2);
                    i2 |= 128;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 8:
                    str4 = str4;
                    str5 = str5;
                    l2 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l2);
                    i2 |= 256;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 9:
                    str4 = str4;
                    str5 = str5;
                    list3 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
                    i2 |= 512;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 10:
                    str4 = str4;
                    str5 = str5;
                    list2 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
                    i2 |= 1024;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 11:
                    str4 = str4;
                    str5 = str5;
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i2 |= 2048;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 12:
                    str4 = str4;
                    str5 = str5;
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i2 |= 4096;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 13:
                    str4 = str4;
                    str5 = str5;
                    str2 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str2);
                    i2 |= 8192;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 14:
                    str4 = str4;
                    str5 = str5;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool3);
                    i2 |= 16384;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 15:
                    num = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num);
                    i = 32768;
                    i2 |= i;
                    str4 = str4;
                    str5 = str5;
                    break;
                case 16:
                    str3 = (String) bldVarA.e(ugi0Var, 16, ysm0.f43175a, str3);
                    i = 65536;
                    i2 |= i;
                    str4 = str4;
                    str5 = str5;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list4 = list;
        String str9 = str5;
        bldVarA.c(ugi0Var);
        return new qgh0(i2, l3, l4, str7, str8, str4, str9, str6, bool2, l2, list3, list2, list4, bool, str2, bool3, num, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qgh0 qgh0Var = (qgh0) obj;
        qgh0Var.getClass();
        String str = qgh0Var.q;
        Integer num = qgh0Var.p;
        Boolean bool = qgh0Var.o;
        String str2 = qgh0Var.n;
        Boolean bool2 = qgh0Var.m;
        List list = qgh0Var.l;
        List list2 = qgh0Var.k;
        List list3 = qgh0Var.j;
        Long l = qgh0Var.i;
        Boolean bool3 = qgh0Var.h;
        String str3 = qgh0Var.g;
        String str4 = qgh0Var.f;
        String str5 = qgh0Var.e;
        String str6 = qgh0Var.d;
        String str7 = qgh0Var.c;
        Long l2 = qgh0Var.b;
        Long l3 = qgh0Var.f28684a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = qgh0.r;
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l);
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
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 16, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
