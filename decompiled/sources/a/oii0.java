package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oii0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oii0 f25313a;
    private static final ugi0 descriptor;

    static {
        oii0 oii0Var = new oii0();
        f25313a = oii0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.tennis.impl.summary.data.models.ServiceStatsResponse", oii0Var, 10);
        zna0Var.j("aces", true);
        zna0Var.j("doubleFaults", true);
        zna0Var.j("1stServe", true);
        zna0Var.j("1stServePointsWon", true);
        zna0Var.j("2ndServePointsWon", true);
        zna0Var.j("breakPointsFaced", true);
        zna0Var.j("breakPointsSaved", true);
        zna0Var.j("serviceGamesPlayed", true);
        zna0Var.j("serviceGamesWon", true);
        zna0Var.j("totalServicePointsWon", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str3 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str3);
                    i |= 1;
                    break;
                case 1:
                    str4 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str4);
                    i |= 2;
                    break;
                case 2:
                    str5 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str5);
                    i |= 4;
                    break;
                case 3:
                    str6 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str6);
                    i |= 8;
                    break;
                case 4:
                    str7 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str7);
                    i |= 16;
                    break;
                case 5:
                    str8 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str8);
                    i |= 32;
                    break;
                case 6:
                    str9 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str9);
                    i |= 64;
                    break;
                case 7:
                    str10 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str10);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i |= 256;
                    break;
                case 9:
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new qii0(i, str3, str4, str5, str6, str7, str8, str9, str10, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qii0 qii0Var = (qii0) obj;
        qii0Var.getClass();
        String str = qii0Var.j;
        String str2 = qii0Var.i;
        String str3 = qii0Var.h;
        String str4 = qii0Var.g;
        String str5 = qii0Var.f;
        String str6 = qii0Var.e;
        String str7 = qii0Var.d;
        String str8 = qii0Var.c;
        String str9 = qii0Var.b;
        String str10 = qii0Var.f28795a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
