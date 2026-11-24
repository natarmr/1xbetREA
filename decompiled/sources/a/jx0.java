package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jx0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jx0 f17278a;
    private static final ugi0 descriptor;

    static {
        jx0 jx0Var = new jx0();
        f17278a = jx0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.AggregatorGamesImagesResponse", jx0Var, 8);
        zna0Var.j("imgOverlayPath", true);
        zna0Var.j("imgOverlayWebpPath", true);
        zna0Var.j("imgLogoPath", true);
        zna0Var.j("imgBackgroundImgPath", true);
        zna0Var.j("imgBackgroundImgWebpPath", true);
        zna0Var.j("imgWebpPath", true);
        zna0Var.j("imgVerticalPath", true);
        zna0Var.j("imgVerticalWebpPath", true);
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
        return new lx0(i, str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lx0 lx0Var = (lx0) obj;
        lx0Var.getClass();
        String str = lx0Var.h;
        String str2 = lx0Var.g;
        String str3 = lx0Var.f;
        String str4 = lx0Var.e;
        String str5 = lx0Var.d;
        String str6 = lx0Var.c;
        String str7 = lx0Var.b;
        String str8 = lx0Var.f20789a;
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
