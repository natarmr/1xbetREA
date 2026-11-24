package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p7t implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p7t f26523a;
    private static final ugi0 descriptor;

    static {
        p7t p7tVar = new p7t();
        f26523a = p7tVar;
        zna0 zna0Var = new zna0("org.xplatform.games_mania.data.models.GamesManiaForPlayResponse", p7tVar, 6);
        zna0Var.j("AI", true);
        zna0Var.k(new iy(new String[]{"BAC"}, (byte) 18));
        zna0Var.j("BL", true);
        zna0Var.k(new iy(new String[]{"NB", "BA", "Balanse"}, (byte) 18));
        zna0Var.j("CF", true);
        zna0Var.j("JS", true);
        zna0Var.j("SW", true);
        zna0Var.j("RS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(f9t.f9171a), mrv.j0(tblVar), mrv.j0(aat.f546a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Double d = null;
        Double d2 = null;
        h9t h9tVar = null;
        Double d3 = null;
        cat catVar = null;
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
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                    i |= 4;
                    break;
                case 3:
                    h9tVar = (h9t) bldVarA.e(ugi0Var, 3, f9t.f9171a, h9tVar);
                    i |= 8;
                    break;
                case 4:
                    d3 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d3);
                    i |= 16;
                    break;
                case 5:
                    catVar = (cat) bldVarA.e(ugi0Var, 5, aat.f546a, catVar);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new r7t(i, l, d, d2, h9tVar, d3, catVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        r7t r7tVar = (r7t) obj;
        r7tVar.getClass();
        cat catVar = r7tVar.f;
        Double d = r7tVar.e;
        h9t h9tVar = r7tVar.d;
        Double d2 = r7tVar.c;
        Double d3 = r7tVar.b;
        Long l = r7tVar.f29994a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || h9tVar != null) {
            cldVarA.p(ugi0Var, 3, f9t.f9171a, h9tVar);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || catVar != null) {
            cldVarA.p(ugi0Var, 5, aat.f546a, catVar);
        }
        cldVarA.c(ugi0Var);
    }
}
