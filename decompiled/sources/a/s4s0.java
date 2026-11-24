package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s4s0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s4s0 f31623a;
    private static final ugi0 descriptor;

    static {
        s4s0 s4s0Var = new s4s0();
        f31623a = s4s0Var;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.championship.data.tournament.model.TournamentResponse", s4s0Var, 1);
        zna0Var.j("tournament", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s1s0.f31472a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        u1s0 u1s0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                u1s0Var = (u1s0) bldVarA.e(ugi0Var, 0, s1s0.f31472a, u1s0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new c5s0(i, u1s0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c5s0 c5s0Var = (c5s0) obj;
        c5s0Var.getClass();
        u1s0 u1s0Var = c5s0Var.f3788a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || u1s0Var != null) {
            cldVarA.p(ugi0Var, 0, s1s0.f31472a, u1s0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
