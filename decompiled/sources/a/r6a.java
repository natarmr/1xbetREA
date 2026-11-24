package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r6a implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r6a f29925a;
    private static final ugi0 descriptor;

    static {
        r6a r6aVar = new r6a();
        f29925a = r6aVar;
        zna0 zna0Var = new zna0("org.xplatform.auth.process.impl.data.models.CaptchaQrLoginRequest", r6aVar, 13);
        zna0Var.j("Captcha", false);
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
        okx okxVar = okx.f25427a;
        return new jiy[]{e6a.f7271a, ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, okxVar, okxVar, ysm0Var, jiyVarJ0, jiyVarJ1, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        g6a g6aVar = null;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        String strX5 = null;
        int iJ = 0;
        int iJ2 = 0;
        String strX6 = null;
        String strX7 = null;
        String strX8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    g6aVar = (g6a) bldVarA.m(ugi0Var, 0, e6a.f7271a, g6aVar);
                    i |= 1;
                    break;
                case 1:
                    strX = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX2 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX3 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX4 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strX5 = bldVarA.x(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iJ = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iJ2 = bldVarA.j(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    strX6 = bldVarA.x(ugi0Var, 8);
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
                case 11:
                    strX7 = bldVarA.x(ugi0Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    strX8 = bldVarA.x(ugi0Var, 12);
                    i |= 4096;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new t6a(i, g6aVar, strX, strX2, strX3, strX4, strX5, iJ, iJ2, strX6, str2, str, strX7, strX8);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t6a t6aVar = (t6a) obj;
        t6aVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        e6a e6aVar = e6a.f7271a;
        g6a g6aVar = t6aVar.f33407a;
        String str = t6aVar.k;
        String str2 = t6aVar.j;
        cldVarA.m(ugi0Var, 0, e6aVar, g6aVar);
        cldVarA.z(ugi0Var, 1, t6aVar.b);
        cldVarA.z(ugi0Var, 2, t6aVar.c);
        cldVarA.z(ugi0Var, 3, t6aVar.d);
        cldVarA.z(ugi0Var, 4, t6aVar.e);
        cldVarA.z(ugi0Var, 5, t6aVar.f);
        cldVarA.i(6, t6aVar.g, ugi0Var);
        cldVarA.i(7, t6aVar.h, ugi0Var);
        cldVarA.z(ugi0Var, 8, t6aVar.i);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str);
        }
        cldVarA.z(ugi0Var, 11, t6aVar.l);
        cldVarA.z(ugi0Var, 12, t6aVar.m);
        cldVarA.c(ugi0Var);
    }
}
