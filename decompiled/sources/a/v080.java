package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v080 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v080 f36569a;
    private static final ugi0 descriptor;

    static {
        v080 v080Var = new v080();
        f36569a = v080Var;
        zna0 zna0Var = new zna0("org.xplatform.authenticator.impl.data.models.socket.OperationRequest.RequestPayload", v080Var, 1);
        zna0Var.j("OperationType", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new x080(i, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x080 x080Var = (x080) obj;
        x080Var.getClass();
        Integer num = x080Var.f40060a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
