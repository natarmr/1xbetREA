package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q8c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q8c f28292a;
    private static final ugi0 descriptor;

    static {
        q8c q8cVar = new q8c();
        f28292a = q8cVar;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.restore_password.CheckTokenRequest", q8cVar, 2);
        zna0Var.j("Auth", false);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{r8c.f30018a, v8c.f36974a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        t8c t8cVar = null;
        x8c x8cVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                t8cVar = (t8c) bldVarA.m(ugi0Var, 0, r8c.f30018a, t8cVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                x8cVar = (x8c) bldVarA.m(ugi0Var, 1, v8c.f36974a, x8cVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new y8c(i, t8cVar, x8cVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y8c y8cVar = (y8c) obj;
        y8cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, r8c.f30018a, y8cVar.f42188a);
        cldVarA.m(ugi0Var, 1, v8c.f36974a, y8cVar.b);
        cldVarA.c(ugi0Var);
    }
}
