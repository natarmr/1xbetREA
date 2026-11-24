package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bhs implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bhs f2623a;
    private static final ugi0 descriptor;

    static {
        bhs bhsVar = new bhs();
        f2623a = bhsVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.GameItemResponse", bhsVar, 9);
        zna0Var.j("gameId", true);
        zna0Var.j("name", true);
        zna0Var.j("img", true);
        zna0Var.j("productId", true);
        zna0Var.j("productName", true);
        zna0Var.j("productImg", true);
        zna0Var.j("noLoyalty", true);
        zna0Var.j("needTransfer", true);
        zna0Var.j("isDemoAvailable", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(okx.f25427a);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        Boolean bool = null;
        Long l = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        int i = 0;
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
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str4);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool2);
                    i |= 64;
                    break;
                case 7:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 7, sm8.f32432a, bool3);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) bldVarA.e(ugi0Var, 8, sm8.f32432a, bool);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new dhs(i, l, str, str2, num, str3, str4, bool2, bool3, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dhs dhsVar = (dhs) obj;
        dhsVar.getClass();
        Boolean bool = dhsVar.i;
        Boolean bool2 = dhsVar.h;
        Boolean bool3 = dhsVar.g;
        String str = dhsVar.f;
        String str2 = dhsVar.e;
        Integer num = dhsVar.d;
        String str3 = dhsVar.c;
        String str4 = dhsVar.b;
        Long l = dhsVar.f6105a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 7, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 8, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
