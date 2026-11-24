package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f4c implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f4c f8907a;
    private static final ugi0 descriptor;

    static {
        f4c f4cVar = new f4c();
        f8907a = f4cVar;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.CheckPasswordRequest", f4cVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{i4c.f14141a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        k4c k4cVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                k4cVar = (k4c) bldVarA.m(ugi0Var, 0, i4c.f14141a, k4cVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new m4c(i, k4cVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m4c m4cVar = (m4c) obj;
        m4cVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, i4c.f14141a, m4cVar.f21161a);
        cldVarA.c(ugi0Var);
    }
}
