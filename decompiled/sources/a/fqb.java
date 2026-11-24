package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fqb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fqb f9966a;
    private static final ugi0 descriptor;

    static {
        fqb fqbVar = new fqb();
        f9966a = fqbVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.accountchange.password.ChangePasswordStep2Request", fqbVar, 2);
        zna0Var.j("Data", false);
        zna0Var.j("Auth", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{gqb.f11724a, twp0.f34662a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        iqb iqbVar = null;
        vwp0 vwp0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iqbVar = (iqb) bldVarA.m(ugi0Var, 0, gqb.f11724a, iqbVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                vwp0Var = (vwp0) bldVarA.m(ugi0Var, 1, twp0.f34662a, vwp0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new kqb(i, iqbVar, vwp0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kqb kqbVar = (kqb) obj;
        kqbVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, gqb.f11724a, kqbVar.f18714a);
        cldVarA.m(ugi0Var, 1, twp0.f34662a, kqbVar.b);
        cldVarA.c(ugi0Var);
    }
}
