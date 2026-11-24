package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class udq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final udq0 f35492a;
    private static final ugi0 descriptor;

    static {
        udq0 udq0Var = new udq0();
        f35492a = udq0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.match_progress.match_progress_main.data.models.TieBreakResponse", udq0Var, 6);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("server", true);
        zna0Var.j("isLostServe", true);
        zna0Var.j("isSetPoint", true);
        zna0Var.j("isMatchPoint", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
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
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                    i |= 8;
                    break;
                case 4:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool2);
                    i |= 16;
                    break;
                case 5:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool3);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new wdq0(i, num, num2, num3, bool, bool2, bool3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wdq0 wdq0Var = (wdq0) obj;
        wdq0Var.getClass();
        Boolean bool = wdq0Var.f;
        Boolean bool2 = wdq0Var.e;
        Boolean bool3 = wdq0Var.d;
        Integer num = wdq0Var.c;
        Integer num2 = wdq0Var.b;
        Integer num3 = wdq0Var.f38986a;
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
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
