package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kag0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kag0 f17962a;
    private static final ugi0 descriptor;

    static {
        kag0 kag0Var = new kag0();
        f17962a = kag0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.tennis.impl.summary.data.models.ReturnStatsResponse", kag0Var, 8);
        zna0Var.j("1stServeReturnPointsWon", true);
        zna0Var.j("2ndServeReturnPointsWon", true);
        zna0Var.j("breakPointsOpportunities", true);
        zna0Var.j("breakPointsConverted", true);
        zna0Var.j("returnGamesPlayed", true);
        zna0Var.j("returnGamesWon", true);
        zna0Var.j("returnPointsWon", true);
        zna0Var.j("totalPointsWon", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
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
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str8);
                    i |= 128;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new mag0(i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mag0 mag0Var = (mag0) obj;
        mag0Var.getClass();
        String str = mag0Var.h;
        String str2 = mag0Var.g;
        String str3 = mag0Var.f;
        String str4 = mag0Var.e;
        String str5 = mag0Var.d;
        String str6 = mag0Var.c;
        String str7 = mag0Var.b;
        String str8 = mag0Var.f21456a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
