package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sgp0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sgp0 f32173a;
    private static final ugi0 descriptor;

    static {
        sgp0 sgp0Var = new sgp0();
        f32173a = sgp0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.team.impl.team_rating_chart.data.model.TeamRatingChartBaseResponse", sgp0Var, 3);
        zna0Var.j("sportId", true);
        zna0Var.j("subSportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(nhp0.f23545a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        php0 php0Var = null;
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
                php0Var = (php0) bldVarA.e(ugi0Var, 2, nhp0.f23545a, php0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ugp0(i, num, num2, php0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ugp0 ugp0Var = (ugp0) obj;
        ugp0Var.getClass();
        php0 php0Var = ugp0Var.c;
        Integer num = ugp0Var.b;
        Integer num2 = ugp0Var.f35636a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || php0Var != null) {
            cldVarA.p(ugi0Var, 2, nhp0.f23545a, php0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
