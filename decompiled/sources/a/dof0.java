package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dof0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dof0 f6412a;
    private static final ugi0 descriptor;

    static {
        dof0 dof0Var = new dof0();
        f6412a = dof0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.security.ResetAllSessionsRequest", dof0Var, 1);
        zna0Var.j("ExceptAuthenticator", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{sm8.f32432a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        boolean zB = false;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                zB = bldVarA.B(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new fof0(i, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fof0 fof0Var = (fof0) obj;
        fof0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.x(ugi0Var, 0, fof0Var.f9879a);
        cldVarA.c(ugi0Var);
    }
}
