package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ewl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ewl0 f8533a;
    private static final ugi0 descriptor;

    static {
        ewl0 ewl0Var = new ewl0();
        f8533a = ewl0Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.StadiumInfoResponse", ewl0Var, 1);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(iwl0.f15495a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        kwl0 kwl0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                kwl0Var = (kwl0) bldVarA.e(ugi0Var, 0, iwl0.f15495a, kwl0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new nwl0(i, kwl0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nwl0 nwl0Var = (nwl0) obj;
        nwl0Var.getClass();
        kwl0 kwl0Var = nwl0Var.f24239a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || kwl0Var != null) {
            cldVarA.p(ugi0Var, 0, iwl0.f15495a, kwl0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
