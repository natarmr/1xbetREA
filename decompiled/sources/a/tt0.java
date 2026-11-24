package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tt0 f34487a;
    private static final ugi0 descriptor;

    static {
        tt0 tt0Var = new tt0();
        f34487a = tt0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorGameCategoryData", tt0Var, 10);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("name", true);
        zna0Var.j("img", true);
        zna0Var.j("sort", true);
        zna0Var.j("partType", true);
        zna0Var.j("gameId", true);
        zna0Var.j("providerId", true);
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
        jiy jiyVarJ3 = mrv.j0(s710Var);
        jiy jiyVarJ4 = mrv.j0(s710Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        Long l = null;
        String str2 = null;
        String str3 = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Boolean bool2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    break;
                case 4:
                    l3 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l3);
                    i |= 16;
                    break;
                case 5:
                    l4 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l4);
                    i |= 32;
                    break;
                case 6:
                    l5 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l5);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool2);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool);
                    i |= 256;
                    break;
                case 9:
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new vt0(i, l, str2, str3, l2, l3, l4, l5, bool2, bool, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vt0 vt0Var = (vt0) obj;
        vt0Var.getClass();
        String str = vt0Var.j;
        Boolean bool = vt0Var.i;
        Boolean bool2 = vt0Var.h;
        Long l = vt0Var.g;
        Long l2 = vt0Var.f;
        Long l3 = vt0Var.e;
        Long l4 = vt0Var.d;
        String str2 = vt0Var.c;
        String str3 = vt0Var.b;
        Long l5 = vt0Var.f37978a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
