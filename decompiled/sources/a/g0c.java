package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g0c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0c f10452a;
    private static final ugi0 descriptor;

    static {
        g0c g0cVar = new g0c();
        f10452a = g0cVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.accountchange.password.CheckCurrentPasswordRequest", g0cVar, 3);
        zna0Var.j("Data", false);
        zna0Var.j("CaptchaId", false);
        zna0Var.j("ImageText", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{h0c.f12228a, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        j0c j0cVar = null;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                j0cVar = (j0c) bldVarA.m(ugi0Var, 0, h0c.f12228a, j0cVar);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new l0c(i, j0cVar, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l0c l0cVar = (l0c) obj;
        l0cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, h0c.f12228a, l0cVar.f19193a);
        cldVarA.z(ugi0Var, 1, l0cVar.b);
        cldVarA.z(ugi0Var, 2, l0cVar.c);
        cldVarA.c(ugi0Var);
    }
}
