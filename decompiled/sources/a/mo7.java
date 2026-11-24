package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mo7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mo7 f22121a;
    private static final ugi0 descriptor;

    static {
        mo7 mo7Var = new mo7();
        f22121a = mo7Var;
        zna0 zna0Var = new zna0("org.xplatform.spin_and_win.data.models.requests.BetUserRequest", mo7Var, 2);
        zna0Var.j("NM", false);
        zna0Var.j("BNM", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, tbl.f33669a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        double dT = 0.0d;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                dT = bldVarA.t(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new oo7(dT, i, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        oo7 oo7Var = (oo7) obj;
        oo7Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, oo7Var.f25580a, ugi0Var);
        cldVarA.j(ugi0Var, 1, oo7Var.b);
        cldVarA.c(ugi0Var);
    }
}
