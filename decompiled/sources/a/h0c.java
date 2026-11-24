package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h0c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0c f12228a;
    private static final ugi0 descriptor;

    static {
        h0c h0cVar = new h0c();
        f12228a = h0cVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.accountchange.password.CheckCurrentPasswordRequest.CheckPasswordDataRequest", h0cVar, 2);
        zna0Var.j("Date", false);
        zna0Var.j("OldPassword", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new j0c(strX, i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j0c j0cVar = (j0c) obj;
        j0cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, j0cVar.f15676a);
        cldVarA.z(ugi0Var, 1, j0cVar.b);
        cldVarA.c(ugi0Var);
    }
}
