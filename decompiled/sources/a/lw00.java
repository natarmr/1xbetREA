package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lw00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lw00 f20738a;
    private static final ugi0 descriptor;

    static {
        lw00 lw00Var = new lw00();
        f20738a = lw00Var;
        zna0 zna0Var = new zna0("org.xplatform.auth.process.impl.data.models.LoginResponse", lw00Var, 6);
        zna0Var.j("RefreshToken", true);
        zna0Var.j("RefreshExpiry", true);
        zna0Var.j("Token", true);
        zna0Var.j("TokenExpiry", true);
        zna0Var.j("UserData", true);
        zna0Var.j("Question", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(nw00.f24213a), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Long l = null;
        String str2 = null;
        Long l2 = null;
        pw00 pw00Var = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                    i |= 4;
                    break;
                case 3:
                    l2 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l2);
                    i |= 8;
                    break;
                case 4:
                    pw00Var = (pw00) bldVarA.e(ugi0Var, 4, nw00.f24213a, pw00Var);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str3);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new qw00(i, str, l, str2, l2, pw00Var, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qw00 qw00Var = (qw00) obj;
        qw00Var.getClass();
        String str = qw00Var.f;
        pw00 pw00Var = qw00Var.e;
        Long l = qw00Var.d;
        String str2 = qw00Var.c;
        Long l2 = qw00Var.b;
        String str3 = qw00Var.f29413a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || pw00Var != null) {
            cldVarA.p(ugi0Var, 4, nw00.f24213a, pw00Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
