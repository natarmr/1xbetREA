package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mic0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mic0 f21839a;
    private static final ugi0 descriptor;

    static {
        mic0 mic0Var = new mic0();
        f21839a = mic0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.popular.dashboard.impl.data.models.PromoGameResponse", mic0Var, 11);
        zna0Var.j("imgPathDefault", true);
        zna0Var.j("imgPathDarkTheme", true);
        zna0Var.j("imgPathLightTheme", true);
        zna0Var.j("error", true);
        zna0Var.j("gameId", true);
        zna0Var.j("gameName", true);
        zna0Var.j("providerId", true);
        zna0Var.j("productId", true);
        zna0Var.j("needTransfer", true);
        zna0Var.j("isDemoAvailable", true);
        zna0Var.j("bonusWageringBan", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ3 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ4 = mrv.j0(s710Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Boolean bool2 = null;
        boolean z = true;
        Boolean bool3 = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Long l = null;
        String str4 = null;
        Integer num2 = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
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
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    break;
                case 7:
                    l2 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l2);
                    i |= 128;
                    break;
                case 8:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool3);
                    i |= 256;
                    break;
                case 9:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool2);
                    i |= 512;
                    break;
                case 10:
                    bool = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new qic0(i, str, str2, str3, num, l, str4, num2, l2, bool3, bool2, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qic0 qic0Var = (qic0) obj;
        qic0Var.getClass();
        Boolean bool = qic0Var.k;
        Boolean bool2 = qic0Var.j;
        Boolean bool3 = qic0Var.i;
        Long l = qic0Var.h;
        Integer num = qic0Var.g;
        String str = qic0Var.f;
        Long l2 = qic0Var.e;
        Integer num2 = qic0Var.d;
        String str2 = qic0Var.c;
        String str3 = qic0Var.b;
        String str4 = qic0Var.f28785a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
