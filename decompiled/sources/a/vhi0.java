package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vhi0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vhi0 f37431a;
    private static final ugi0 descriptor;

    static {
        vhi0 vhi0Var = new vhi0();
        f37431a = vhi0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexcore.ServerErrorInterceptor.ServerErrorResponse", vhi0Var, 1);
        zna0Var.j("error", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(shi0.f32214a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        uhi0 uhi0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                uhi0Var = (uhi0) bldVarA.e(ugi0Var, 0, shi0.f32214a, uhi0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new xhi0(i, uhi0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        xhi0 xhi0Var = (xhi0) obj;
        xhi0Var.getClass();
        uhi0 uhi0Var = xhi0Var.f40894a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || uhi0Var != null) {
            cldVarA.p(ugi0Var, 0, shi0.f32214a, uhi0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
