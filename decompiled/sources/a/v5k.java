package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v5k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5k f36828a;
    private static final ugi0 descriptor;

    static {
        v5k v5kVar = new v5k();
        f36828a = v5kVar;
        zna0 zna0Var = new zna0("org.xplatform.callback.impl.data.model.request.DeleteRequestedCallbackRequest.Data", v5kVar, 1);
        zna0Var.j("Id", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new x5k(i, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x5k x5kVar = (x5k) obj;
        x5kVar.getClass();
        Long l = x5kVar.f40322a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
