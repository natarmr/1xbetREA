package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lq1 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lq1 f20465a;
    private static final ugi0 descriptor;

    static {
        lq1 lq1Var = new lq1();
        f20465a = lq1Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.category.data.models.AggregatorSpecialBannerNavigationData.Game", lq1Var, 7);
        zna0Var.j("gameId", true);
        zna0Var.j("partId", true);
        zna0Var.j("productId", true);
        zna0Var.j("nameForUrl", true);
        zna0Var.j("isDemoAvailable", true);
        zna0Var.j("needTransfer", true);
        zna0Var.j("bonusWageringBan", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(ysm0.f43175a);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
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
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    break;
                case 3:
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                    i |= 16;
                    break;
                case 5:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool2);
                    i |= 32;
                    break;
                case 6:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool3);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new nq1(i, l, l2, l3, str, bool, bool2, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nq1 nq1Var = (nq1) obj;
        nq1Var.getClass();
        Boolean bool = nq1Var.g;
        Boolean bool2 = nq1Var.f;
        Boolean bool3 = nq1Var.e;
        String str = nq1Var.d;
        Long l = nq1Var.c;
        Long l2 = nq1Var.b;
        Long l3 = nq1Var.f23936a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
