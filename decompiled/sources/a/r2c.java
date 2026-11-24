package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r2c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r2c f29724a;
    private static final ugi0 descriptor;

    static {
        r2c r2cVar = new r2c();
        f29724a = r2cVar;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.restore.models.CheckFormRequest.DataRequest", r2cVar, 1);
        zna0Var.j("Form", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{x2c.f40158a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        z2c z2cVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                z2cVar = (z2c) bldVarA.m(ugi0Var, 0, x2c.f40158a, z2cVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new t2c(i, z2cVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        t2c t2cVar = (t2c) obj;
        t2cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, x2c.f40158a, t2cVar.f33207a);
        cldVarA.c(ugi0Var);
    }
}
