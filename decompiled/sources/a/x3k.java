package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x3k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3k f40223a;
    private static final ugi0 descriptor;

    static {
        x3k x3kVar = new x3k();
        f40223a = x3kVar;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.otp_authenticator.models.Delete2FaRequest", x3kVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{z3k.f43722a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        b4k b4kVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                b4kVar = (b4k) bldVarA.m(ugi0Var, 0, z3k.f43722a, b4kVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new c4k(i, b4kVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c4k c4kVar = (c4k) obj;
        c4kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, z3k.f43722a, c4kVar.f3729a);
        cldVarA.c(ugi0Var);
    }
}
