package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w7c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w7c f38665a;
    private static final ugi0 descriptor;

    static {
        w7c w7cVar = new w7c();
        f38665a = w7cVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.accountchange.sms.CheckSmsRequest", w7cVar, 2);
        zna0Var.j("Data", false);
        zna0Var.j("Auth", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{x7c.f40406a, twp0.f34662a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        z7c z7cVar = null;
        vwp0 vwp0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                z7cVar = (z7c) bldVarA.m(ugi0Var, 0, x7c.f40406a, z7cVar);
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
        return new b8c(i, z7cVar, vwp0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        b8c b8cVar = (b8c) obj;
        b8cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, x7c.f40406a, b8cVar.f2149a);
        cldVarA.m(ugi0Var, 1, twp0.f34662a, b8cVar.b);
        cldVarA.c(ugi0Var);
    }
}
