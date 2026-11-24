package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z5k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5k f43821a;
    private static final ugi0 descriptor;

    static {
        z5k z5kVar = new z5k();
        f43821a = z5kVar;
        zna0 zna0Var = new zna0("org.xplatform.callback.impl.data.model.request.DeleteRequestedCallbackRequestWithGuid", z5kVar, 1);
        zna0Var.j("Data", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(b6k.f2058a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        d6k d6kVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                d6kVar = (d6k) bldVarA.e(ugi0Var, 0, b6k.f2058a, d6kVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new e6k(i, d6kVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e6k e6kVar = (e6k) obj;
        e6kVar.getClass();
        d6k d6kVar = e6kVar.f7288a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d6kVar != null) {
            cldVarA.p(ugi0Var, 0, b6k.f2058a, d6kVar);
        }
        cldVarA.c(ugi0Var);
    }
}
