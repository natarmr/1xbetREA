package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ek6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ek6 f7938a;
    private static final ugi0 descriptor;

    static {
        ek6 ek6Var = new ek6();
        f7938a = ek6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.game_info.BetBuilderMatchInfoDetailResponse", ek6Var, 8);
        zna0Var.j("tournamentStage", true);
        zna0Var.j("matchFormat", true);
        zna0Var.j("seriesScore", true);
        zna0Var.j("unplayedBalls", true);
        zna0Var.j("tennisSetsCountDescription", true);
        zna0Var.j("seeds", true);
        zna0Var.j("location", true);
        zna0Var.j("weather", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(fl6.f9723a), mrv.j0(bi6.f2644a), mrv.j0(qm6.f28967a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        hl6 hl6Var = null;
        di6 di6Var = null;
        sm6 sm6Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i |= 16;
                    break;
                case 5:
                    hl6Var = (hl6) bldVarA.e(ugi0Var, 5, fl6.f9723a, hl6Var);
                    i |= 32;
                    break;
                case 6:
                    di6Var = (di6) bldVarA.e(ugi0Var, 6, bi6.f2644a, di6Var);
                    i |= 64;
                    break;
                case 7:
                    sm6Var = (sm6) bldVarA.e(ugi0Var, 7, qm6.f28967a, sm6Var);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new gk6(i, str, str2, str3, str4, str5, hl6Var, di6Var, sm6Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gk6 gk6Var = (gk6) obj;
        gk6Var.getClass();
        sm6 sm6Var = gk6Var.h;
        di6 di6Var = gk6Var.g;
        hl6 hl6Var = gk6Var.f;
        String str = gk6Var.e;
        String str2 = gk6Var.d;
        String str3 = gk6Var.c;
        String str4 = gk6Var.b;
        String str5 = gk6Var.f11430a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || hl6Var != null) {
            cldVarA.p(ugi0Var, 5, fl6.f9723a, hl6Var);
        }
        if (cldVarA.u(ugi0Var) || di6Var != null) {
            cldVarA.p(ugi0Var, 6, bi6.f2644a, di6Var);
        }
        if (cldVarA.u(ugi0Var) || sm6Var != null) {
            cldVarA.p(ugi0Var, 7, qm6.f28967a, sm6Var);
        }
        cldVarA.c(ugi0Var);
    }
}
