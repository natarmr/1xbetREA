package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xgf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xgf f40836a;
    private static final ugi0 descriptor;

    static {
        xgf xgfVar = new xgf();
        f40836a = xgfVar;
        zna0 zna0Var = new zna0("org.xplatform.crystal.data.models.responses.CrystalResponse", xgfVar, 7);
        zna0Var.j("AI", true);
        zna0Var.j("BNINF", true);
        zna0Var.j("SB", true);
        zna0Var.j("CF", true);
        zna0Var.j("SW", true);
        zna0Var.j("NB", true);
        zna0Var.j("RS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        jiy jiyVarJ1 = mrv.j0(ok10.f25385a);
        jiy jiyVarJ2 = mrv.j0(off.f25165a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(hhf.f13061a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        rk10 rk10Var = null;
        nff nffVar = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        jhf jhfVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    rk10Var = (rk10) bldVarA.e(ugi0Var, 1, ok10.f25385a, rk10Var);
                    i |= 2;
                    break;
                case 2:
                    nffVar = (nff) bldVarA.e(ugi0Var, 2, off.f25165a, nffVar);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    break;
                case 4:
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i |= 16;
                    break;
                case 5:
                    d3 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d3);
                    i |= 32;
                    break;
                case 6:
                    jhfVar = (jhf) bldVarA.e(ugi0Var, 6, hhf.f13061a, jhfVar);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new bhf(i, l, rk10Var, nffVar, d, d2, d3, jhfVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bhf bhfVar = (bhf) obj;
        bhfVar.getClass();
        jhf jhfVar = bhfVar.g;
        Double d = bhfVar.f;
        Double d2 = bhfVar.e;
        Double d3 = bhfVar.d;
        nff nffVar = bhfVar.c;
        rk10 rk10Var = bhfVar.b;
        Long l = bhfVar.f2603a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || rk10Var != null) {
            cldVarA.p(ugi0Var, 1, ok10.f25385a, rk10Var);
        }
        if (cldVarA.u(ugi0Var) || nffVar != null) {
            cldVarA.p(ugi0Var, 2, off.f25165a, nffVar);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || jhfVar != null) {
            cldVarA.p(ugi0Var, 6, hhf.f13061a, jhfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
