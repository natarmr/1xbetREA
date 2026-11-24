package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cte0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cte0 f4932a;
    private static final ugi0 descriptor;

    static {
        cte0 cte0Var = new cte0();
        f4932a = cte0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.registration.RegisterAuthenticatorResponse", cte0Var, 3);
        zna0Var.j("registrationGuid", true);
        zna0Var.j("secret", true);
        zna0Var.j("canUseAuthenticator", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ete0(i, bool, str, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ete0 ete0Var = (ete0) obj;
        ete0Var.getClass();
        Boolean bool = ete0Var.c;
        String str = ete0Var.b;
        String str2 = ete0Var.f8373a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
