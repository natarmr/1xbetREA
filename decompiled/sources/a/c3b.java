package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c3b implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c3b f3665a;
    private static final ugi0 descriptor;

    static {
        c3b c3bVar = new c3b();
        f3665a = c3bVar;
        zna0 zna0Var = new zna0("org.xplatform.toto_bet.tiragecategoryresult.data.model.CategoriesResponse", c3bVar, 7);
        zna0Var.j("CategoryNumber", true);
        zna0Var.j("Guessed", true);
        zna0Var.j("GuessedInCurr", true);
        zna0Var.j("PayoutOn1CurrUnit", true);
        zna0Var.j("Percent", true);
        zna0Var.j("PrizeFund", true);
        zna0Var.j("PointsSum", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(tblVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Double d = null;
        Double d2 = null;
        String str2 = null;
        Double d3 = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
                    i |= 16;
                    break;
                case 5:
                    d3 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d3);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new e3b(i, str, num, d, d2, str2, d3, num2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        e3b e3bVar = (e3b) obj;
        e3bVar.getClass();
        Integer num = e3bVar.g;
        Double d = e3bVar.f;
        String str = e3bVar.e;
        Double d2 = e3bVar.d;
        Double d3 = e3bVar.c;
        Integer num2 = e3bVar.b;
        String str2 = e3bVar.f7125a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
