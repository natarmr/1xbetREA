package a;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ci7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ci7 f4398a;
    private static final ugi0 descriptor;

    static {
        ci7 ci7Var = new ci7();
        f4398a = ci7Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BetResultResponse", ci7Var, 8);
        zna0Var.j("AdditionalInfo", true);
        zna0Var.j("Balance", true);
        zna0Var.j("Id", true);
        zna0Var.j("betGUID", true);
        zna0Var.j(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, true);
        zna0Var.j("Coupon", true);
        zna0Var.j("lnC", true);
        zna0Var.j("lvC", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(lwo.f20773a);
        jiy jiyVarJ1 = mrv.j0(tbl.f33669a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(s710.f31729a);
        jiy jiyVarJ5 = mrv.j0(h1f.f12281a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        nwo nwoVar = null;
        Double d = null;
        String str = null;
        String str2 = null;
        Long l = null;
        n1f n1fVar = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    nwoVar = (nwo) bldVarA.e(ugi0Var, 0, lwo.f20773a, nwoVar);
                    i |= 1;
                    break;
                case 1:
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str2);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l);
                    i |= 16;
                    break;
                case 5:
                    n1fVar = (n1f) bldVarA.e(ugi0Var, 5, h1f.f12281a, n1fVar);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool);
                    i |= 64;
                    break;
                case 7:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool2);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new gi7(i, nwoVar, d, str, str2, l, n1fVar, bool, bool2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gi7 gi7Var = (gi7) obj;
        gi7Var.getClass();
        Boolean bool = gi7Var.h;
        Boolean bool2 = gi7Var.g;
        n1f n1fVar = gi7Var.f;
        Long l = gi7Var.e;
        String str = gi7Var.d;
        String str2 = gi7Var.c;
        Double d = gi7Var.b;
        nwo nwoVar = gi7Var.f11331a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || nwoVar != null) {
            cldVarA.p(ugi0Var, 0, lwo.f20773a, nwoVar);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || n1fVar != null) {
            cldVarA.p(ugi0Var, 5, h1f.f12281a, n1fVar);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
