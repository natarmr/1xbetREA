package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class urf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final urf0 f36161a;
    private static final ugi0 descriptor;

    static {
        urf0 urf0Var = new urf0();
        f36161a = urf0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.response.ResidentSecondLifeResponse", urf0Var, 1);
        zna0Var.j("BT", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new wrf0(i, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wrf0 wrf0Var = (wrf0) obj;
        wrf0Var.getClass();
        Double d = wrf0Var.f39640a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
