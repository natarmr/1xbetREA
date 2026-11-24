package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wh0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wh0 f39141a;
    private static final ugi0 descriptor;

    static {
        wh0 wh0Var = new wh0();
        f39141a = wh0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.category.data.models.AggregatorCategoryResponse", wh0Var, 12);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("img", true);
        zna0Var.j("imgBanner", true);
        zna0Var.j("sort", true);
        zna0Var.j("partType", true);
        zna0Var.j("gameId", true);
        zna0Var.j("productId", true);
        zna0Var.j("brandId", true);
        zna0Var.j("needTransfer", true);
        zna0Var.j("noLoyalty", true);
        zna0Var.j(ParameterNames.TEXT, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(okx.f25427a);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        jiy jiyVarJ7 = mrv.j0(s710Var);
        jiy jiyVarJ8 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z = true;
        Long l = null;
        int i = 0;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str = str;
                    break;
                case 0:
                    l2 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    i |= 1;
                    z = z;
                    str = str;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    z = z;
                    l2 = l2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    z = z;
                    l2 = l2;
                    break;
                case 3:
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i |= 8;
                    z = z;
                    l2 = l2;
                    break;
                case 4:
                    num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                    i |= 16;
                    z = z;
                    l2 = l2;
                    break;
                case 5:
                    l3 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l3);
                    i |= 32;
                    z = z;
                    l2 = l2;
                    break;
                case 6:
                    l4 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l4);
                    i |= 64;
                    z = z;
                    l2 = l2;
                    break;
                case 7:
                    l5 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l5);
                    i |= 128;
                    z = z;
                    l2 = l2;
                    break;
                case 8:
                    l = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l);
                    i |= 256;
                    z = z;
                    l2 = l2;
                    break;
                case 9:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool2);
                    i |= 512;
                    z = z;
                    l2 = l2;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    z = z;
                    l2 = l2;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    z = z;
                    l2 = l2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new yh0(i, l2, str2, str3, str4, num, l3, l4, l5, l, bool2, bool, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yh0 yh0Var = (yh0) obj;
        yh0Var.getClass();
        String str = yh0Var.l;
        Boolean bool = yh0Var.k;
        Boolean bool2 = yh0Var.j;
        Long l = yh0Var.i;
        Long l2 = yh0Var.h;
        Long l3 = yh0Var.g;
        Long l4 = yh0Var.f;
        Integer num = yh0Var.e;
        String str2 = yh0Var.d;
        String str3 = yh0Var.c;
        String str4 = yh0Var.b;
        Long l5 = yh0Var.f42611a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
