package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mgq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mgq0 f21756a;
    private static final ugi0 descriptor;

    static {
        mgq0 mgq0Var = new mgq0();
        f21756a = mgq0Var;
        zna0 zna0Var = new zna0("com.google.firebase.sessions.Time", mgq0Var, 3);
        zna0Var.j("ms", false);
        zna0Var.j("us", true);
        zna0Var.j("seconds", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jR3 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new pgq0(i, jR, jR2, jR3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pgq0 pgq0Var = (pgq0) obj;
        pgq0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        long j = pgq0Var.f26964a;
        long j2 = pgq0Var.c;
        long j3 = pgq0Var.b;
        cldVarA.n(ugi0Var, 0, j);
        if (cldVarA.u(ugi0Var) || j3 != j * 1000) {
            cldVarA.n(ugi0Var, 1, j3);
        }
        if (cldVarA.u(ugi0Var) || j2 != j / 1000) {
            cldVarA.n(ugi0Var, 2, j2);
        }
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
