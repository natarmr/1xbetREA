package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ypk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ypk0 f43035a;
    private static final ugi0 descriptor;

    static {
        ypk0 ypk0Var = new ypk0();
        f43035a = ypk0Var;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.main.data.eventinfo.model.SpecialEventResponse", ypk0Var, 21);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("title", true);
        zna0Var.j("dateStart", true);
        zna0Var.j("dateEnd", true);
        zna0Var.j("eventStyle", true);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j(Payload.TYPE, true);
        zna0Var.j("hasFinals", true);
        zna0Var.j("tab1", true);
        zna0Var.j("tab2", true);
        zna0Var.j("tab3", true);
        zna0Var.j("tab4", true);
        zna0Var.j("customSportIcon", true);
        zna0Var.j("customChampIcon", true);
        zna0Var.j("topIcon", true);
        zna0Var.j("bannerCategoryId", true);
        zna0Var.j("timer", true);
        zna0Var.j("socialNets", true);
        zna0Var.j("location", true);
        zna0Var.j("overrideImagesId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = aqk0.v;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        jiy jiyVarJ7 = mrv.j0(okxVar);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0((jiy) a8zVarArr[9].getValue());
        jiy jiyVarJ10 = mrv.j0((jiy) a8zVarArr[10].getValue());
        jiy jiyVarJ11 = mrv.j0((jiy) a8zVarArr[11].getValue());
        jiy jiyVarJ12 = mrv.j0((jiy) a8zVarArr[12].getValue());
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[18].getValue()), mrv.j0((jiy) a8zVarArr[19].getValue()), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        Integer num2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = aqk0.v;
        List list = null;
        List list2 = null;
        List list3 = null;
        Integer num3 = null;
        List list4 = null;
        String str = null;
        int i2 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num4 = null;
        Boolean bool4 = null;
        List list5 = null;
        List list6 = null;
        boolean z = true;
        Integer num5 = null;
        String str2 = null;
        Long l = null;
        Long l2 = null;
        String str3 = null;
        Long l3 = null;
        Long l4 = null;
        Integer num6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num = num5;
                    z = false;
                    list2 = list2;
                    num3 = num3;
                    num5 = num;
                    list = list;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num5);
                    i2 |= 1;
                    list2 = list2;
                    num3 = num3;
                    list3 = list3;
                    num5 = num;
                    list = list;
                    break;
                case 1:
                    num2 = num3;
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i2 |= 2;
                    l = l;
                    num3 = num2;
                    list3 = list3;
                    list = list;
                    break;
                case 2:
                    num2 = num3;
                    l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                    i2 |= 4;
                    num3 = num2;
                    list3 = list3;
                    list = list;
                    break;
                case 3:
                    num2 = num3;
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i2 |= 8;
                    num3 = num2;
                    list3 = list3;
                    list = list;
                    break;
                case 4:
                    num2 = num3;
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i2 |= 16;
                    num3 = num2;
                    list3 = list3;
                    list = list;
                    break;
                case 5:
                    num2 = num3;
                    l3 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l3);
                    i2 |= 32;
                    num3 = num2;
                    list3 = list3;
                    list = list;
                    break;
                case 6:
                    num2 = num3;
                    l4 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l4);
                    i2 |= 64;
                    num3 = num2;
                    list3 = list3;
                    list = list;
                    break;
                case 7:
                    num2 = num3;
                    num6 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num6);
                    i2 |= 128;
                    num3 = num2;
                    list3 = list3;
                    list = list;
                    break;
                case 8:
                    list = list;
                    list3 = list3;
                    num3 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num3);
                    i2 |= 256;
                    list3 = list3;
                    list = list;
                    break;
                case 9:
                    list = list;
                    list3 = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list3);
                    i2 |= 512;
                    num3 = num3;
                    list = list;
                    break;
                case 10:
                    list3 = list3;
                    num3 = num3;
                    list2 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list2);
                    i2 |= 1024;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 11:
                    list3 = list3;
                    num3 = num3;
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i2 |= 2048;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 12:
                    list3 = list3;
                    num3 = num3;
                    list4 = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list4);
                    i2 |= 4096;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 13:
                    list3 = list3;
                    num3 = num3;
                    bool = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool);
                    i2 |= 8192;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 14:
                    list3 = list3;
                    num3 = num3;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool2);
                    i2 |= 16384;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 15:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool3);
                    i = 32768;
                    i2 |= i;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 16:
                    num4 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num4);
                    i = 65536;
                    i2 |= i;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 17:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 17, sm8.f32432a, bool4);
                    i = 131072;
                    i2 |= i;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 18:
                    list5 = (List) bldVarA.e(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), list5);
                    i = 262144;
                    i2 |= i;
                    num3 = num3;
                    list3 = list3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    list6 = (List) bldVarA.e(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list6);
                    i = 524288;
                    i2 |= i;
                    num3 = num3;
                    list3 = list3;
                    break;
                case 20:
                    str = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str);
                    i = 1048576;
                    i2 |= i;
                    num3 = num3;
                    list3 = list3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list7 = list;
        Integer num7 = num3;
        Integer num8 = num5;
        String str4 = str2;
        Long l5 = l;
        bldVarA.c(ugi0Var);
        List list8 = list6;
        return new aqk0(i2, num8, str4, l5, l2, str3, l3, l4, num6, num7, list3, list2, list7, list4, bool, bool2, bool3, num4, bool4, list5, list8, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        aqk0 aqk0Var = (aqk0) obj;
        aqk0Var.getClass();
        String str = aqk0Var.u;
        List list = aqk0Var.t;
        List list2 = aqk0Var.s;
        Boolean bool = aqk0Var.r;
        Integer num = aqk0Var.q;
        Boolean bool2 = aqk0Var.p;
        Boolean bool3 = aqk0Var.o;
        Boolean bool4 = aqk0Var.n;
        List list3 = aqk0Var.m;
        List list4 = aqk0Var.l;
        List list5 = aqk0Var.k;
        List list6 = aqk0Var.j;
        Integer num2 = aqk0Var.i;
        Integer num3 = aqk0Var.h;
        Long l = aqk0Var.g;
        Long l2 = aqk0Var.f;
        String str2 = aqk0Var.e;
        Long l3 = aqk0Var.d;
        Long l4 = aqk0Var.c;
        String str3 = aqk0Var.b;
        Integer num4 = aqk0Var.f1300a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = aqk0.v;
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || list6 != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list6);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || list3 != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || bool4 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 16, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 17, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 18, (jiy) a8zVarArr[18].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 19, (jiy) a8zVarArr[19].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
