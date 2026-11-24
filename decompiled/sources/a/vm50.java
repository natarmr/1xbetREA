package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vm50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vm50 f37662a;
    private static final ugi0 descriptor;

    static {
        vm50 vm50Var = new vm50();
        f37662a = vm50Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.NewPasswordRequest.DataRequest", vm50Var, 3);
        zna0Var.j("Password", false);
        zna0Var.j("Date", false);
        zna0Var.j("UserId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{ysm0.f43175a, s710Var, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        String strX = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new xm50(strX, jR, jR2, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xm50 xm50Var = (xm50) obj;
        xm50Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, xm50Var.f41106a);
        cldVarA.n(ugi0Var, 1, xm50Var.b);
        cldVarA.n(ugi0Var, 2, xm50Var.c);
        cldVarA.c(ugi0Var);
    }
}
