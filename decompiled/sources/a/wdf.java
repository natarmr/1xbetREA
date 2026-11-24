package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wdf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wdf f38970a;
    private static final ugi0 descriptor;

    static {
        wdf wdfVar = new wdf();
        f38970a = wdfVar;
        zna0 zna0Var = new zna0("org.xplatform.config.data.models.CriticalConfigDto", wdfVar, 5);
        zna0Var.j("hasSectionToto", true);
        zna0Var.j("hasBetConstructor", true);
        zna0Var.j("hasFinancial", true);
        zna0Var.j("hasSectionXGames", true);
        zna0Var.j("hasSectionAggregator", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else if (iF == 1) {
                bool2 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool2);
                i |= 2;
            } else if (iF == 2) {
                bool3 = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool3);
                i |= 4;
            } else if (iF == 3) {
                bool4 = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool4);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                bool5 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool5);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new ydf(i, bool, bool2, bool3, bool4, bool5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ydf ydfVar = (ydf) obj;
        ydfVar.getClass();
        Boolean bool = ydfVar.e;
        Boolean bool2 = ydfVar.d;
        Boolean bool3 = ydfVar.c;
        Boolean bool4 = ydfVar.b;
        Boolean bool5 = ydfVar.f42433a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
