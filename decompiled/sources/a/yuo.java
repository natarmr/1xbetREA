package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yuo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yuo f43276a;
    private static final ugi0 descriptor;

    static {
        yuo yuoVar = new yuo();
        f43276a = yuoVar;
        zna0 zna0Var = new zna0("org.xplatform.core.data.factors.FactorsRequest", yuoVar, 4);
        zna0Var.j("BAC", true);
        zna0Var.j("UI", true);
        zna0Var.j("GID", false);
        zna0Var.j("GT", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var, s710Var, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        long jR4 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jR2 = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                jR3 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                jR4 = bldVarA.r(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new avo(i, jR, jR2, jR3, jR4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        avo avoVar = (avo) obj;
        avoVar.getClass();
        long j = avoVar.c;
        long j2 = avoVar.b;
        long j3 = avoVar.f1535a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || j3 != 0) {
            cldVarA.n(ugi0Var, 0, j3);
        }
        if (cldVarA.u(ugi0Var) || j2 != 0) {
            cldVarA.n(ugi0Var, 1, j2);
        }
        long j4 = avoVar.d;
        cldVarA.n(ugi0Var, 2, j);
        if (cldVarA.u(ugi0Var) || j4 != j) {
            cldVarA.n(ugi0Var, 3, j4);
        }
        cldVarA.c(ugi0Var);
    }
}
