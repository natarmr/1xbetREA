package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q8v0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q8v0 f28318a;
    private static final ugi0 descriptor;

    static {
        q8v0 q8v0Var = new q8v0();
        f28318a = q8v0Var;
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.WelcomeBonusChangeRequest", q8v0Var, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new s8v0(i, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        s8v0 s8v0Var = (s8v0) obj;
        s8v0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, s8v0Var.f31822a, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
