package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t5k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t5k f33372a;
    private static final ugi0 descriptor;

    static {
        t5k t5kVar = new t5k();
        f33372a = t5kVar;
        zna0 zna0Var = new zna0("org.xplatform.callback.impl.data.model.request.DeleteRequestedCallbackRequest", t5kVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{v5k.f36828a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        x5k x5kVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                x5kVar = (x5k) bldVarA.m(ugi0Var, 0, v5k.f36828a, x5kVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new y5k(i, x5kVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y5k y5kVar = (y5k) obj;
        y5kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, v5k.f36828a, y5kVar.f42051a);
        cldVarA.c(ugi0Var);
    }
}
