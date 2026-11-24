package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nbu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nbu0 f23259a;
    private static final ugi0 descriptor;

    static {
        nbu0 nbu0Var = new nbu0();
        f23259a = nbu0Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.registration.VerifyAuthenticatorRequest", nbu0Var, 4);
        zna0Var.j("registrationGuid", false);
        zna0Var.j("signedSecret", false);
        zna0Var.j("smsCode", false);
        zna0Var.j("oneTimeToken", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX3 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                strX4 = bldVarA.x(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new pbu0(i, strX, strX2, strX3, strX4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pbu0 pbu0Var = (pbu0) obj;
        pbu0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, pbu0Var.f26727a);
        cldVarA.z(ugi0Var, 1, pbu0Var.b);
        cldVarA.z(ugi0Var, 2, pbu0Var.c);
        cldVarA.z(ugi0Var, 3, pbu0Var.d);
        cldVarA.c(ugi0Var);
    }
}
