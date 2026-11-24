package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hwp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hwp f13777a;
    private static final ugi0 descriptor;

    static {
        hwp hwpVar = new hwp();
        f13777a = hwpVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.common.data.leaderboard.model.FighterRecordResponse", hwpVar, 3);
        zna0Var.j("wins", true);
        zna0Var.j("losses", true);
        zna0Var.j("draws", true);
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
        return new jwp(i, num, num2, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jwp jwpVar = (jwp) obj;
        jwpVar.getClass();
        Integer num = jwpVar.c;
        Integer num2 = jwpVar.b;
        Integer num3 = jwpVar.f17263a;
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
