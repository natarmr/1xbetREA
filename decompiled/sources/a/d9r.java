package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d9r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d9r f5715a;
    private static final ugi0 descriptor;

    static {
        d9r d9rVar = new d9r();
        f5715a = d9rVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.response.fruit_blast.FruitBlastCoefInfoResponse", d9rVar, 6);
        zna0Var.j("1", true);
        zna0Var.j("2", true);
        zna0Var.j("3", true);
        zna0Var.j("4", true);
        zna0Var.j("5", true);
        zna0Var.j("6", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar)};
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
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                    i |= 1;
                    break;
                case 1:
                    d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                    i |= 2;
                    break;
                case 2:
                    d3 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d3);
                    i |= 4;
                    break;
                case 3:
                    d4 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d4);
                    i |= 8;
                    break;
                case 4:
                    d5 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d5);
                    i |= 16;
                    break;
                case 5:
                    d6 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d6);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new f9r(i, d, d2, d3, d4, d5, d6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f9r f9rVar = (f9r) obj;
        f9rVar.getClass();
        Double d = f9rVar.f;
        Double d2 = f9rVar.e;
        Double d3 = f9rVar.d;
        Double d4 = f9rVar.c;
        Double d5 = f9rVar.b;
        Double d6 = f9rVar.f9168a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d6 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d6);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d4);
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
        cldVarA.c(ugi0Var);
    }
}
