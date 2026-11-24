package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lg7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lg7 f19993a;
    private static final ugi0 descriptor;

    static {
        lg7 lg7Var = new lg7();
        f19993a = lg7Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.core.data.models.response.BetNewHistoryResponse.BetsSummaryInfo", lg7Var, 6);
        zna0Var.j("Count", true);
        zna0Var.j("PeriodStart", true);
        zna0Var.j("PeriodEnd", true);
        zna0Var.j("BetSum", true);
        zna0Var.j("PayoutWithSellSum", true);
        zna0Var.j("UnsettledSum", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
        Long l2 = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
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
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new ng7(i, num, l, l2, d, d2, d3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ng7 ng7Var = (ng7) obj;
        ng7Var.getClass();
        Double d = ng7Var.f;
        Double d2 = ng7Var.e;
        Double d3 = ng7Var.d;
        Long l = ng7Var.c;
        Long l2 = ng7Var.b;
        Integer num = ng7Var.f23470a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
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
