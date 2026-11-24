package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v6a implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v6a f36866a;
    public static final zna0 b;

    static {
        v6a v6aVar = new v6a();
        f36866a = v6aVar;
        zna0 zna0Var = new zna0("org.xplatform.captcha.impl.data.model.CaptchaRequest", v6aVar, 5);
        zna0Var.j("AppGuid", false);
        zna0Var.j("Language", false);
        zna0Var.j("Method", false);
        zna0Var.j("VersionGen", false);
        zna0Var.j("Login", false);
        b = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, okx.f25427a, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        zna0 zna0Var = b;
        bld bldVarA = rkjVar.a(zna0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        while (z) {
            int iF = bldVarA.f(zna0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(zna0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(zna0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX3 = bldVarA.x(zna0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                iJ = bldVarA.j(zna0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                strX4 = bldVarA.x(zna0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(zna0Var);
        return new x6a(i, iJ, strX, strX2, strX3, strX4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x6a x6aVar = (x6a) obj;
        x6aVar.getClass();
        zna0 zna0Var = b;
        cld cldVarA = bwnVar.a(zna0Var);
        cldVarA.z(zna0Var, 0, x6aVar.f40353a);
        cldVarA.z(zna0Var, 1, x6aVar.b);
        cldVarA.z(zna0Var, 2, x6aVar.c);
        cldVarA.i(3, x6aVar.d, zna0Var);
        cldVarA.z(zna0Var, 4, x6aVar.e);
        cldVarA.c(zna0Var);
    }
}
