package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e4c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e4c f7175a;
    private static final ugi0 descriptor;

    static {
        e4c e4cVar = new e4c();
        f7175a = e4cVar;
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.CheckPasswordRequest", e4cVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{q3c.f28046a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        s3c s3cVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                s3cVar = (s3c) bldVarA.m(ugi0Var, 0, q3c.f28046a, s3cVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new l4c(i, s3cVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l4c l4cVar = (l4c) obj;
        l4cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, q3c.f28046a, l4cVar.f19397a);
        cldVarA.c(ugi0Var);
    }
}
