package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ase0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ase0 f1388a;
    private static final ugi0 descriptor;

    static {
        ase0 ase0Var = new ase0();
        f1388a = ase0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.authorization.RefreshTokenRequest", ase0Var, 2);
        zna0Var.j("RefreshToken", false);
        zna0Var.j("Language", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new cse0(i, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cse0 cse0Var = (cse0) obj;
        cse0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, cse0Var.f4884a);
        cldVarA.z(ugi0Var, 1, cse0Var.b);
        cldVarA.c(ugi0Var);
    }
}
