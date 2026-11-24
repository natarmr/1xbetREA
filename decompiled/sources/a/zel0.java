package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zel0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zel0 f44258a;
    private static final ugi0 descriptor;

    static {
        zel0 zel0Var = new zel0();
        f44258a = zel0Var;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.sport.SportImageResponse", zel0Var, 13);
        zna0Var.j("small", true);
        zna0Var.j("popular", true);
        zna0Var.j("background", true);
        zna0Var.j("backgroundIpad", true);
        zna0Var.j("defaultChampions", true);
        zna0Var.j("defaultChampTablet", true);
        zna0Var.j("defaultChampHeader", true);
        zna0Var.j("defaultChampHeaderTablet", true);
        zna0Var.j("gameBackground", true);
        zna0Var.j("smallBw", true);
        zna0Var.j("feedImageVertical", true);
        zna0Var.j("feedImageHorizontal", true);
        zna0Var.j("feedImageSquare", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str2 = str2;
                    str = str;
                    break;
                case 0:
                    str6 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str6);
                    i |= 1;
                    str2 = str2;
                    str = str;
                    break;
                case 1:
                    str = str;
                    str7 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str7);
                    i |= 2;
                    str6 = str6;
                    str = str;
                    break;
                case 2:
                    str8 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str8);
                    i |= 4;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 3:
                    str9 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str9);
                    i |= 8;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 4:
                    str10 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str10);
                    i |= 16;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 5:
                    str11 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str11);
                    i |= 32;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 6:
                    str12 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str12);
                    i |= 64;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 7:
                    str13 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str13);
                    i |= 128;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 8:
                    str5 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str5);
                    i |= 256;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 9:
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    i |= 512;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 10:
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i |= 1024;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    str6 = str6;
                    str7 = str7;
                    break;
                case 12:
                    str4 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str4);
                    i |= 4096;
                    str6 = str6;
                    str7 = str7;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str14 = str2;
        bldVarA.c(ugi0Var);
        return new dfl0(i, str6, str7, str8, str9, str10, str11, str12, str13, str5, str3, str14, str, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dfl0 dfl0Var = (dfl0) obj;
        dfl0Var.getClass();
        String str = dfl0Var.m;
        String str2 = dfl0Var.l;
        String str3 = dfl0Var.k;
        String str4 = dfl0Var.j;
        String str5 = dfl0Var.i;
        String str6 = dfl0Var.h;
        String str7 = dfl0Var.g;
        String str8 = dfl0Var.f;
        String str9 = dfl0Var.e;
        String str10 = dfl0Var.d;
        String str11 = dfl0Var.c;
        String str12 = dfl0Var.b;
        String str13 = dfl0Var.f6006a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str13 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str13);
        }
        if (cldVarA.u(ugi0Var) || str12 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str12);
        }
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
