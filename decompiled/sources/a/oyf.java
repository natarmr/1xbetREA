package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oyf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oyf f26057a;
    private static final ugi0 descriptor;

    static {
        oyf oyfVar = new oyf();
        f26057a = oyfVar;
        zna0 zna0Var = new zna0("org.xplatform.customer_io.impl.data.request.CustomerIODeviceRequest", oyfVar, 1);
        zna0Var.j("device", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{lyf.f20859a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        nyf nyfVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                nyfVar = (nyf) bldVarA.m(ugi0Var, 0, lyf.f20859a, nyfVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new qyf(i, nyfVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qyf qyfVar = (qyf) obj;
        qyfVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, lyf.f20859a, qyfVar.f29530a);
        cldVarA.c(ugi0Var);
    }
}
