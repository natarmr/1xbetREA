package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qv0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qv0 f29366a;
    private static final ugi0 descriptor;

    static {
        qv0 qv0Var = new qv0();
        f29366a = qv0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorGameRawResponse", qv0Var, 16);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("logoUrl", true);
        zna0Var.j("categoryIds", true);
        zna0Var.j("isDemoAvailable", true);
        zna0Var.j("needTransfer", true);
        zna0Var.j("productId", true);
        zna0Var.j("productName", true);
        zna0Var.j("providerId", true);
        zna0Var.j("brandId", true);
        zna0Var.j("brandName", true);
        zna0Var.j("test", true);
        zna0Var.j("partId", true);
        zna0Var.j("bonusWageringBan", true);
        zna0Var.j("ribbons", true);
        zna0Var.j("useSmartSearch", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = sv0.q;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0((jiy) a8zVarArr[3].getValue());
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        jiy jiyVarJ5 = mrv.j0(sm8Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = sv0.q;
        Boolean bool = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        int i = 0;
        Boolean bool2 = null;
        List list2 = null;
        Boolean bool3 = null;
        List list3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Long l2 = null;
        boolean z = true;
        Long l3 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    str = str;
                    bool4 = bool4;
                    l3 = l;
                    bool = bool;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i |= 1;
                    str = str;
                    list3 = list3;
                    bool4 = bool4;
                    l3 = l;
                    bool = bool;
                    break;
                case 1:
                    list = list3;
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i |= 2;
                    str4 = str4;
                    list3 = list;
                    bool4 = bool4;
                    bool = bool;
                    break;
                case 2:
                    list = list3;
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i |= 4;
                    list3 = list;
                    bool4 = bool4;
                    bool = bool;
                    break;
                case 3:
                    bool = bool;
                    bool4 = bool4;
                    list3 = (List) bldVarA.e(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list3);
                    i |= 8;
                    bool4 = bool4;
                    bool = bool;
                    break;
                case 4:
                    bool = bool;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool4);
                    i |= 16;
                    list3 = list3;
                    bool = bool;
                    break;
                case 5:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool5);
                    i |= 32;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 6:
                    l2 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l2);
                    i |= 64;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 7:
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
                    i |= 128;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 8:
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 11:
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i |= 2048;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 12:
                    num3 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num3);
                    i |= 4096;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 13:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool2);
                    i |= 8192;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 14:
                    list2 = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list2);
                    i |= 16384;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                case 15:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool3);
                    i |= 32768;
                    list3 = list3;
                    bool4 = bool4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool6 = bool;
        Boolean bool7 = bool4;
        Long l4 = l3;
        String str5 = str3;
        String str6 = str4;
        bldVarA.c(ugi0Var);
        return new sv0(i, l4, str5, str6, list3, bool7, bool5, l2, str2, num2, num, str, bool6, num3, bool2, list2, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sv0 sv0Var = (sv0) obj;
        sv0Var.getClass();
        Boolean bool = sv0Var.p;
        List list = sv0Var.o;
        Boolean bool2 = sv0Var.n;
        Integer num = sv0Var.m;
        Boolean bool3 = sv0Var.l;
        String str = sv0Var.k;
        Integer num2 = sv0Var.j;
        Integer num3 = sv0Var.i;
        String str2 = sv0Var.h;
        Long l = sv0Var.g;
        Boolean bool4 = sv0Var.f;
        Boolean bool5 = sv0Var.e;
        List list2 = sv0Var.d;
        String str3 = sv0Var.c;
        String str4 = sv0Var.b;
        Long l2 = sv0Var.f32844a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = sv0.q;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
