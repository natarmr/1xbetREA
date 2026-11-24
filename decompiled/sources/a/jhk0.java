package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jhk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jhk0 f16532a;
    private static final ugi0 descriptor;

    static {
        jhk0 jhk0Var = new jhk0();
        f16532a = jhk0Var;
        zna0 zna0Var = new zna0("org.xplatform.auth.process.impl.data.models.SocialLoginRequest", jhk0Var, 16);
        zna0Var.j("Social", false);
        zna0Var.j("SocialToken", true);
        zna0Var.j("SocialTokenSecret", true);
        zna0Var.j("SocialApp", false);
        zna0Var.j("Login", false);
        zna0Var.j("Password", false);
        zna0Var.j("Language", false);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Version", false);
        zna0Var.j("Partner", false);
        zna0Var.j("Whence", false);
        zna0Var.j("Date", false);
        zna0Var.j("Answer", true);
        zna0Var.j("QrCode", true);
        zna0Var.j("OS", false);
        zna0Var.j("OSVersion", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, jiyVarJ0, jiyVarJ1, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, okxVar, okxVar, ysm0Var, jiyVarJ2, jiyVarJ3, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        int iJ = 0;
        String str3 = null;
        String str4 = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        String strX6 = null;
        int iJ2 = 0;
        int iJ3 = 0;
        String strX7 = null;
        String strX8 = null;
        String strX9 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iJ = bldVarA.j(ugi0Var, 0);
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
                    strX = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX2 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX3 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strX4 = bldVarA.x(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strX5 = bldVarA.x(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    strX6 = bldVarA.x(ugi0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iJ2 = bldVarA.j(ugi0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    iJ3 = bldVarA.j(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    strX7 = bldVarA.x(ugi0Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i |= 4096;
                    break;
                case 13:
                    str = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str);
                    i |= 8192;
                    break;
                case 14:
                    strX8 = bldVarA.x(ugi0Var, 14);
                    i |= 16384;
                    break;
                case 15:
                    strX9 = bldVarA.x(ugi0Var, 15);
                    i |= 32768;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new lhk0(i, iJ, str3, str4, strX, strX2, strX3, strX4, strX5, strX6, iJ2, iJ3, strX7, str2, str, strX8, strX9);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lhk0 lhk0Var = (lhk0) obj;
        lhk0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        int i = lhk0Var.f20061a;
        String str = lhk0Var.n;
        String str2 = lhk0Var.m;
        String str3 = lhk0Var.c;
        String str4 = lhk0Var.b;
        cldVarA.i(0, i, ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        cldVarA.z(ugi0Var, 3, lhk0Var.d);
        cldVarA.z(ugi0Var, 4, lhk0Var.e);
        cldVarA.z(ugi0Var, 5, lhk0Var.f);
        cldVarA.z(ugi0Var, 6, lhk0Var.g);
        cldVarA.z(ugi0Var, 7, lhk0Var.h);
        cldVarA.z(ugi0Var, 8, lhk0Var.i);
        cldVarA.i(9, lhk0Var.j, ugi0Var);
        cldVarA.i(10, lhk0Var.k, ugi0Var);
        cldVarA.z(ugi0Var, 11, lhk0Var.l);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str);
        }
        cldVarA.z(ugi0Var, 14, lhk0Var.o);
        cldVarA.z(ugi0Var, 15, lhk0Var.p);
        cldVarA.c(ugi0Var);
    }
}
