package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0e0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0e0 f24421a;
    private static final ugi0 descriptor;

    static {
        o0e0 o0e0Var = new o0e0();
        f24421a = o0e0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.rainbow.impl.data.model.matches.team.RainbowStatisticMatchesTeamPlayerStatsResponse", o0e0Var, 5);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("maps", true);
        zna0Var.j("kost", true);
        zna0Var.j("eps", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(klq.f18504a), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            } else if (iF == 3) {
                f = (Float) bldVarA.e(ugi0Var, 3, klq.f18504a, f);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num4 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new q0e0(i, f, num, num2, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q0e0 q0e0Var = (q0e0) obj;
        q0e0Var.getClass();
        Integer num = q0e0Var.e;
        Float f = q0e0Var.d;
        Integer num2 = q0e0Var.c;
        Integer num3 = q0e0Var.b;
        Integer num4 = q0e0Var.f27893a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 3, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
