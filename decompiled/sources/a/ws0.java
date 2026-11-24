package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ws0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ws0 f39670a;
    private static final ugi0 descriptor;

    static {
        ws0 ws0Var = new ws0();
        f39670a = ws0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorGameBrandData", ws0Var, 15);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("providerId", true);
        zna0Var.j("productId", true);
        zna0Var.j("brandId", true);
        zna0Var.j("brandName", true);
        zna0Var.j("name", true);
        zna0Var.j("ribbons", true);
        zna0Var.j("logoUrl", true);
        zna0Var.j("imgWebpPath", true);
        zna0Var.j("imgVerticalPath", true);
        zna0Var.j("imgVerticalWebpPath", true);
        zna0Var.j("categoryIds", true);
        zna0Var.j("isDemoAvailable", true);
        zna0Var.j("bonusWageringBan", true);
        zna0Var.j("needTransfer", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ys0.p;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0((jiy) a8zVarArr[6].getValue());
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0((jiy) a8zVarArr[11].getValue());
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        Long l2;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ys0.p;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        int i = 0;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Long l3 = null;
        Long l4 = null;
        String str5 = null;
        String str6 = null;
        List list2 = null;
        boolean z = true;
        Long l5 = null;
        Long l6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l5;
                    z = false;
                    str = str;
                    l4 = l4;
                    l5 = l;
                    list = list;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l5);
                    i |= 1;
                    str = str;
                    l3 = l3;
                    l4 = l4;
                    l5 = l;
                    list = list;
                    break;
                case 1:
                    l2 = l4;
                    l6 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l6);
                    i |= 2;
                    l3 = l3;
                    l4 = l2;
                    list = list;
                    break;
                case 2:
                    l2 = l4;
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    l4 = l2;
                    list = list;
                    break;
                case 3:
                    list = list;
                    l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                    i |= 8;
                    l3 = l3;
                    list = list;
                    break;
                case 4:
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i |= 16;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 5:
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i |= 32;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 6:
                    list2 = (List) bldVarA.e(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
                    i |= 64;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 7:
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i |= 128;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 8:
                    str3 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str3);
                    i |= 256;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 9:
                    str2 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str2);
                    i |= 512;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 11:
                    list = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
                    i |= 2048;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 12:
                    bool = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool);
                    i |= 4096;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 13:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i |= 8192;
                    l3 = l3;
                    l4 = l4;
                    break;
                case 14:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool3);
                    i |= 16384;
                    l3 = l3;
                    l4 = l4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        List list3 = list;
        Long l7 = l4;
        bldVarA.c(ugi0Var);
        return new ys0(i, l5, l6, l3, l7, str5, str6, list2, str4, str3, str2, str, list3, bool, bool2, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ys0 ys0Var = (ys0) obj;
        ys0Var.getClass();
        Boolean bool = ys0Var.o;
        Boolean bool2 = ys0Var.n;
        Boolean bool3 = ys0Var.m;
        List list = ys0Var.l;
        String str = ys0Var.k;
        String str2 = ys0Var.j;
        String str3 = ys0Var.i;
        String str4 = ys0Var.h;
        List list2 = ys0Var.g;
        String str5 = ys0Var.f;
        String str6 = ys0Var.e;
        Long l = ys0Var.d;
        Long l2 = ys0Var.c;
        Long l3 = ys0Var.b;
        Long l4 = ys0Var.f43145a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ys0.p;
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool3 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
