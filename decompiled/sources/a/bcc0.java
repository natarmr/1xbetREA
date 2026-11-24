package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bcc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bcc0 f2351a;
    private static final ugi0 descriptor;

    static {
        bcc0 bcc0Var = new bcc0();
        f2351a = bcc0Var;
        zna0 zna0Var = new zna0("org.xplatform.promotions.news.impl.data.models.PromoCmsGetPromotionUserDataResponse", bcc0Var, 2);
        zna0Var.j("isConfirmed", true);
        zna0Var.j("confirmationDate", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(sm8.f32432a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new dcc0(i, bool, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dcc0 dcc0Var = (dcc0) obj;
        dcc0Var.getClass();
        Long l = dcc0Var.b;
        Boolean bool = dcc0Var.f5844a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
