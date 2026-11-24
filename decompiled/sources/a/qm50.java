package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qm50 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qm50 f28966a;
    private static final ugi0 descriptor;

    static {
        qm50 qm50Var = new qm50();
        f28966a = qm50Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.NewPasswordRequest", qm50Var, 2);
        zna0Var.j("Auth", false);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{rm50.f30730a, vm50.f37662a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        tm50 tm50Var = null;
        xm50 xm50Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                tm50Var = (tm50) bldVarA.m(ugi0Var, 0, rm50.f30730a, tm50Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                xm50Var = (xm50) bldVarA.m(ugi0Var, 1, vm50.f37662a, xm50Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ym50(i, tm50Var, xm50Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ym50 ym50Var = (ym50) obj;
        ym50Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, rm50.f30730a, ym50Var.f42871a);
        cldVarA.m(ugi0Var, 1, vm50.f37662a, ym50Var.b);
        cldVarA.c(ugi0Var);
    }
}
