package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w1u0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w1u0 f38419a;
    private static final ugi0 descriptor;

    static {
        w1u0 w1u0Var = new w1u0();
        f38419a = w1u0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.valorant.impl.data.ValorantTeamStatisticResponse", w1u0Var, 6);
        zna0Var.j("teamId", true);
        zna0Var.j("combatScoreAvg", true);
        zna0Var.j("roundWins", true);
        zna0Var.j("kills", true);
        zna0Var.j("damage", true);
        zna0Var.j("economy", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(klq.f18504a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l2 = null;
        Float f = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    f = (Float) bldVarA.e(ugi0Var, 5, klq.f18504a, f);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new y1u0(i, l, num, num2, num3, l2, f);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y1u0 y1u0Var = (y1u0) obj;
        y1u0Var.getClass();
        Float f = y1u0Var.f;
        Long l = y1u0Var.e;
        Integer num = y1u0Var.d;
        Integer num2 = y1u0Var.c;
        Integer num3 = y1u0Var.b;
        Long l2 = y1u0Var.f41878a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
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
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 5, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
