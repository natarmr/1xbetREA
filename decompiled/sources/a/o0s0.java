package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0s0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0s0 f24444a;
    private static final ugi0 descriptor;

    static {
        o0s0 o0s0Var = new o0s0();
        f24444a = o0s0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.championships.universal.data.model.feed_statistic.cs.TournamentCsFeedStatisticTopPlayerScoreResponse", o0s0Var, 2);
        zna0Var.j("rating", true);
        zna0Var.j("maps", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(klq.f18504a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Float f = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                f = (Float) bldVarA.e(ugi0Var, 0, klq.f18504a, f);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new q0s0(i, f, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q0s0 q0s0Var = (q0s0) obj;
        q0s0Var.getClass();
        Integer num = q0s0Var.b;
        Float f = q0s0Var.f27919a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 0, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
