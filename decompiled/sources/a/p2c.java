package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p2c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2c f26242a;
    private static final ugi0 descriptor;

    static {
        p2c p2cVar = new p2c();
        f26242a = p2cVar;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.restore.models.CheckFormRequest", p2cVar, 2);
        zna0Var.j("Data", false);
        zna0Var.j("Auth", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{r2c.f29724a, twp0.f34662a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        t2c t2cVar = null;
        vwp0 vwp0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                t2cVar = (t2c) bldVarA.m(ugi0Var, 0, r2c.f29724a, t2cVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                vwp0Var = (vwp0) bldVarA.m(ugi0Var, 1, twp0.f34662a, vwp0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new a3c(i, t2cVar, vwp0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a3c a3cVar = (a3c) obj;
        a3cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, r2c.f29724a, a3cVar.f165a);
        cldVarA.m(ugi0Var, 1, twp0.f34662a, a3cVar.b);
        cldVarA.c(ugi0Var);
    }
}
