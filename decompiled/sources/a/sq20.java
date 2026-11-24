package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sq20 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sq20 f32611a;
    private static final ugi0 descriptor;

    static {
        sq20 sq20Var = new sq20();
        f32611a = sq20Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.marble_games.MarbleGamesPeriodResponse", sq20Var, 3);
        zna0Var.j("Period", true);
        zna0Var.j("Sc1", true);
        zna0Var.j("Sc2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
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
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new uq20(i, num, num2, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uq20 uq20Var = (uq20) obj;
        uq20Var.getClass();
        Integer num = uq20Var.c;
        Integer num2 = uq20Var.b;
        Integer num3 = uq20Var.f36097a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
