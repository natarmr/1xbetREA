package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ooa0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ooa0 f25587a;
    private static final ugi0 descriptor;

    static {
        ooa0 ooa0Var = new ooa0();
        f25587a = ooa0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.match_progress.match_progress_main.data.models.PointResponse", ooa0Var, 7);
        zna0Var.j("score1", true);
        zna0Var.j("score2", true);
        zna0Var.j("isBreakPoint", true);
        zna0Var.j("isSetPoint", true);
        zna0Var.j("isMatchPoint", true);
        zna0Var.j("isDarts140", true);
        zna0Var.j("isDarts180", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                    i |= 4;
                    break;
                case 3:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool2);
                    i |= 8;
                    break;
                case 4:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool3);
                    i |= 16;
                    break;
                case 5:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool4);
                    i |= 32;
                    break;
                case 6:
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool5);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new soa0(i, str, str2, bool, bool2, bool3, bool4, bool5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        soa0 soa0Var = (soa0) obj;
        soa0Var.getClass();
        Boolean bool = soa0Var.g;
        Boolean bool2 = soa0Var.f;
        Boolean bool3 = soa0Var.e;
        Boolean bool4 = soa0Var.d;
        Boolean bool5 = soa0Var.c;
        String str = soa0Var.b;
        String str2 = soa0Var.f32537a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
