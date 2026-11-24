package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hb9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hb9 f12760a;
    private static final ugi0 descriptor;

    static {
        hb9 hb9Var = new hb9();
        f12760a = hb9Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BuilderCouponEventResponse", hb9Var, 6);
        zna0Var.j("Type", true);
        zna0Var.j("Param", true);
        zna0Var.j("Coef", true);
        zna0Var.j("Player", true);
        zna0Var.j("PlayerName", true);
        zna0Var.j("Blocked", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(tbl.f33669a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Double d = null;
        String str = null;
        Long l2 = null;
        String str2 = null;
        Boolean bool = null;
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
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new jb9(i, l, d, str, l2, str2, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jb9 jb9Var = (jb9) obj;
        jb9Var.getClass();
        Boolean bool = jb9Var.f;
        String str = jb9Var.e;
        Long l = jb9Var.d;
        String str2 = jb9Var.c;
        Double d = jb9Var.b;
        Long l2 = jb9Var.f16227a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
