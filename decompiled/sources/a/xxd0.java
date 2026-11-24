package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xxd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xxd0 f41653a;
    private static final ugi0 descriptor;

    static {
        xxd0 xxd0Var = new xxd0();
        f41653a = xxd0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.rainbowsix.RainbowSixPlayersStatsResponse", xxd0Var, 5);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("maps", true);
        zna0Var.j("eps", true);
        zna0Var.j("kost", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(klq.f18504a)};
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
                num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                f = (Float) bldVarA.e(ugi0Var, 4, klq.f18504a, f);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new zxd0(i, f, num, num2, num3, num4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zxd0 zxd0Var = (zxd0) obj;
        zxd0Var.getClass();
        Float f = zxd0Var.e;
        Integer num = zxd0Var.d;
        Integer num2 = zxd0Var.c;
        Integer num3 = zxd0Var.b;
        Integer num4 = zxd0Var.f45152a;
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
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 4, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
