package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class poa0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final poa0 f27320a;
    private static final ugi0 descriptor;

    static {
        poa0 poa0Var = new poa0();
        f27320a = poa0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.heat_map.impl.data.models.PointResponse", poa0Var, 2);
        zna0Var.j("x", true);
        zna0Var.j("y", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new toa0(i, d, d2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        toa0 toa0Var = (toa0) obj;
        toa0Var.getClass();
        Double d = toa0Var.b;
        Double d2 = toa0Var.f34274a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
