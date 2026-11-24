package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gw00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gw00 f12001a;
    private static final ugi0 descriptor;

    static {
        gw00 gw00Var = new gw00();
        f12001a = gw00Var;
        zna0 zna0Var = new zna0("org.xplatform.auth.process.impl.data.models.LoginRequest", gw00Var, 12);
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
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, ysm0Var, ysm0Var, okxVar, okxVar, ysm0Var, jiyVarJ0, jiyVarJ1, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
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
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX2 = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX3 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX4 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strX5 = bldVarA.x(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iJ = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iJ2 = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    strX6 = bldVarA.x(ugi0Var, 7);
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
                case 10:
                    strX7 = bldVarA.x(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    strX8 = bldVarA.x(ugi0Var, 11);
                    i |= 2048;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new iw00(i, strX, strX2, strX3, strX4, strX5, iJ, iJ2, strX6, str2, str, strX7, strX8);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iw00 iw00Var = (iw00) obj;
        iw00Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        String str = iw00Var.f15466a;
        String str2 = iw00Var.j;
        String str3 = iw00Var.i;
        cldVarA.z(ugi0Var, 0, str);
        cldVarA.z(ugi0Var, 1, iw00Var.b);
        cldVarA.z(ugi0Var, 2, iw00Var.c);
        cldVarA.z(ugi0Var, 3, iw00Var.d);
        cldVarA.z(ugi0Var, 4, iw00Var.e);
        cldVarA.i(5, iw00Var.f, ugi0Var);
        cldVarA.i(6, iw00Var.g, ugi0Var);
        cldVarA.z(ugi0Var, 7, iw00Var.h);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str2);
        }
        cldVarA.z(ugi0Var, 10, iw00Var.k);
        cldVarA.z(ugi0Var, 11, iw00Var.l);
        cldVarA.c(ugi0Var);
    }
}
