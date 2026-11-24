package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z8c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z8c f43960a;
    private static final ugi0 descriptor;

    static {
        z8c z8cVar = new z8c();
        f43960a = z8cVar;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.restore_password.CheckTokenResponse", z8cVar, 1);
        zna0Var.j("Auth", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(wwp0.f39896a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ywp0 ywp0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                ywp0Var = (ywp0) bldVarA.e(ugi0Var, 0, wwp0.f39896a, ywp0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new b9c(i, ywp0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b9c b9cVar = (b9c) obj;
        b9cVar.getClass();
        ywp0 ywp0Var = b9cVar.f2202a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ywp0Var != null) {
            cldVarA.p(ugi0Var, 0, wwp0.f39896a, ywp0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
