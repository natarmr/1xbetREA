package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xrh0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xrh0 f41370a;
    private static final ugi0 descriptor;

    static {
        xrh0 xrh0Var = new xrh0();
        f41370a = xrh0Var;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.models.SecurityLevelSetRequest", xrh0Var, 2);
        zna0Var.j("Language", false);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, zrh0.f44853a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        bsh0 bsh0Var = null;
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
                bsh0Var = (bsh0) bldVarA.m(ugi0Var, 1, zrh0.f44853a, bsh0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new csh0(i, strX, bsh0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        csh0 csh0Var = (csh0) obj;
        csh0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, csh0Var.f4888a);
        cldVarA.m(ugi0Var, 1, zrh0.f44853a, csh0Var.b);
        cldVarA.c(ugi0Var);
    }
}
