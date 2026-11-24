package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z3k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z3k f43722a;
    private static final ugi0 descriptor;

    static {
        z3k z3kVar = new z3k();
        f43722a = z3kVar;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.otp_authenticator.models.Delete2FaRequest.HashData", z3kVar, 1);
        zna0Var.j("Hash", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new b4k(i, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b4k b4kVar = (b4k) obj;
        b4kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, b4kVar.f1963a);
        cldVarA.c(ugi0Var);
    }
}
