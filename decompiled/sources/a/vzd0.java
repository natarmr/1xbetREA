package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vzd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vzd0 f38293a;
    private static final ugi0 descriptor;

    static {
        vzd0 vzd0Var = new vzd0();
        f38293a = vzd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.rainbow.impl.data.model.matches.match.RainbowStatisticMatchesMatchRoundResponse", vzd0Var, 2);
        zna0Var.j("winnerTeamId", true);
        zna0Var.j("winType", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new xzd0(i, num, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xzd0 xzd0Var = (xzd0) obj;
        xzd0Var.getClass();
        Integer num = xzd0Var.b;
        Integer num2 = xzd0Var.f41750a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
