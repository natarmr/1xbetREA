package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f7a implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f7a f9051a;
    private static final ugi0 descriptor;

    static {
        f7a f7aVar = new f7a();
        f9051a = f7aVar;
        zna0 zna0Var = new zna0("org.xplatform.auth.process.impl.data.models.CaptchaSocialLoginRequest", f7aVar, 17);
        zna0Var.j("Captcha", false);
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
        return new jiy[]{e6a.f7271a, okxVar, jiyVarJ0, jiyVarJ1, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, okxVar, okxVar, ysm0Var, jiyVarJ2, jiyVarJ3, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        boolean z = true;
        String str2 = null;
        int i2 = 0;
        g6a g6aVar = null;
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
                    continue;
                case 0:
                    g6aVar = (g6a) bldVarA.m(ugi0Var, 0, e6a.f7271a, g6aVar);
                    i2 |= 1;
                    continue;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i2 |= 4;
                    continue;
                case 3:
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i2 |= 8;
                    continue;
                case 4:
                    strX = bldVarA.x(ugi0Var, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    strX2 = bldVarA.x(ugi0Var, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    strX3 = bldVarA.x(ugi0Var, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    strX4 = bldVarA.x(ugi0Var, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    strX5 = bldVarA.x(ugi0Var, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    strX6 = bldVarA.x(ugi0Var, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    iJ2 = bldVarA.j(ugi0Var, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    iJ3 = bldVarA.j(ugi0Var, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    strX7 = bldVarA.x(ugi0Var, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    str2 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str2);
                    i2 |= 8192;
                    continue;
                case 14:
                    str = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str);
                    i2 |= 16384;
                    continue;
                case 15:
                    strX8 = bldVarA.x(ugi0Var, 15);
                    i = 32768;
                    break;
                case 16:
                    strX9 = bldVarA.x(ugi0Var, 16);
                    i = 65536;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            i2 |= i;
        }
        bldVarA.c(ugi0Var);
        return new h7a(i2, g6aVar, iJ, str3, str4, strX, strX2, strX3, strX4, strX5, strX6, iJ2, iJ3, strX7, str2, str, strX8, strX9);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        h7a h7aVar = (h7a) obj;
        h7aVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        e6a e6aVar = e6a.f7271a;
        g6a g6aVar = h7aVar.f12566a;
        String str = h7aVar.o;
        String str2 = h7aVar.n;
        String str3 = h7aVar.d;
        String str4 = h7aVar.c;
        cldVarA.m(ugi0Var, 0, e6aVar, g6aVar);
        cldVarA.i(1, h7aVar.b, ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str3);
        }
        cldVarA.z(ugi0Var, 4, h7aVar.e);
        cldVarA.z(ugi0Var, 5, h7aVar.f);
        cldVarA.z(ugi0Var, 6, h7aVar.g);
        cldVarA.z(ugi0Var, 7, h7aVar.h);
        cldVarA.z(ugi0Var, 8, h7aVar.i);
        cldVarA.z(ugi0Var, 9, h7aVar.j);
        cldVarA.i(10, h7aVar.k, ugi0Var);
        cldVarA.i(11, h7aVar.l, ugi0Var);
        cldVarA.z(ugi0Var, 12, h7aVar.m);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str);
        }
        cldVarA.z(ugi0Var, 15, h7aVar.p);
        cldVarA.z(ugi0Var, 16, h7aVar.q);
        cldVarA.c(ugi0Var);
    }
}
