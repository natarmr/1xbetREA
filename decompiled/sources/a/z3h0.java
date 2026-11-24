package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z3h0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z3h0 f43718a;
    private static final ugi0 descriptor;

    static {
        z3h0 z3h0Var = new z3h0();
        f43718a = z3h0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.ScoreResponse.CricketScore.InnsStatistic", z3h0Var, 3);
        zna0Var.j("team", true);
        zna0Var.j("wickets", true);
        zna0Var.j("overStr", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        String str = null;
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
                str = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new b4h0(i, num, num2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b4h0 b4h0Var = (b4h0) obj;
        b4h0Var.getClass();
        String str = b4h0Var.c;
        Integer num = b4h0Var.b;
        Integer num2 = b4h0Var.f1958a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
