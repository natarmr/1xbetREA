package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tc5 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tc5 f33703a;
    private static final ugi0 descriptor;

    static {
        tc5 tc5Var = new tc5();
        f33703a = tc5Var;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.background.BackgroundResourcesResponse", tc5Var, 11);
        zna0Var.j("$SMALL_VIDEO", true);
        zna0Var.j("$SMALL_PREVIEW", true);
        zna0Var.j("$SMALL_IMAGE", true);
        zna0Var.j("$MEDIUM_VIDEO", true);
        zna0Var.j("$MEDIUM_PREVIEW", true);
        zna0Var.j("$MEDIUM_IMAGE", true);
        zna0Var.j("$LARGE_VIDEO", true);
        zna0Var.j("$LARGE_PREVIEW", true);
        zna0Var.j("$LARGE_IMAGE", true);
        zna0Var.j("$LOGO", true);
        zna0Var.j("$PARTNERS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        String str2 = null;
        boolean z = true;
        String str3 = null;
        int i = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str4 = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str4);
                    i |= 1;
                    break;
                case 1:
                    str5 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str5);
                    i |= 2;
                    break;
                case 2:
                    str6 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str6);
                    i |= 4;
                    break;
                case 3:
                    str7 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str7);
                    i |= 8;
                    break;
                case 4:
                    str8 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str8);
                    i |= 16;
                    break;
                case 5:
                    str9 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str9);
                    i |= 32;
                    break;
                case 6:
                    str10 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str10);
                    i |= 64;
                    break;
                case 7:
                    str11 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str11);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str3);
                    i |= 256;
                    break;
                case 9:
                    str2 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str2);
                    i |= 512;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            z = z;
        }
        bldVarA.c(ugi0Var);
        return new vc5(i, str4, str5, str6, str7, str8, str9, str10, str11, str3, str2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vc5 vc5Var = (vc5) obj;
        vc5Var.getClass();
        String str = vc5Var.k;
        String str2 = vc5Var.j;
        String str3 = vc5Var.i;
        String str4 = vc5Var.h;
        String str5 = vc5Var.g;
        String str6 = vc5Var.f;
        String str7 = vc5Var.e;
        String str8 = vc5Var.d;
        String str9 = vc5Var.c;
        String str10 = vc5Var.b;
        String str11 = vc5Var.f37171a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str11 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str11);
        }
        if (cldVarA.u(ugi0Var) || str10 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str10);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
