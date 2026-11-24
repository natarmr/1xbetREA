package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ibr implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ibr f14504a;
    private static final ugi0 descriptor;

    static {
        ibr ibrVar = new ibr();
        f14504a = ibrVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.mainfeed.FullMatchInfoResponse", ibrVar, 9);
        zna0Var.j("tournamentStage", true);
        zna0Var.j("location", true);
        zna0Var.j("matchFormat", true);
        zna0Var.j("seriesScore", true);
        zna0Var.j("seedNum1", true);
        zna0Var.j("seedNum2", true);
        zna0Var.j("locationCity", true);
        zna0Var.j("stadiumId", true);
        zna0Var.j("surface", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str3);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str5);
                    i |= 8;
                    break;
                case 4:
                    str6 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str6);
                    i |= 16;
                    break;
                case 5:
                    str7 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str7);
                    i |= 32;
                    break;
                case 6:
                    str8 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str8);
                    i |= 64;
                    break;
                case 7:
                    str9 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str9);
                    i |= 128;
                    break;
                case 8:
                    str = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return obj;
            }
            obj = null;
        }
        bldVarA.c(ugi0Var);
        return new mbr(i, str2, str3, str4, str5, str6, str7, str8, str9, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mbr mbrVar = (mbr) obj;
        mbrVar.getClass();
        String str = mbrVar.i;
        String str2 = mbrVar.h;
        String str3 = mbrVar.g;
        String str4 = mbrVar.f;
        String str5 = mbrVar.e;
        String str6 = mbrVar.d;
        String str7 = mbrVar.c;
        String str8 = mbrVar.b;
        String str9 = mbrVar.f21521a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
