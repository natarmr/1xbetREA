package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a300 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a300 f149a;
    private static final ugi0 descriptor;

    static {
        a300 a300Var = new a300();
        f149a = a300Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.factors.LimitsResponse", a300Var, 3);
        zna0Var.j("RS", true);
        zna0Var.j("RE", true);
        zna0Var.j("RBS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                d3 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d3);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new q300(i, d, d2, d3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q300 q300Var = (q300) obj;
        q300Var.getClass();
        Double d = q300Var.c;
        Double d2 = q300Var.b;
        Double d3 = q300Var.f28026a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
