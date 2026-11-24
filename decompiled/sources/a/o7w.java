package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o7w implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o7w f24804a;
    private static final ugi0 descriptor;

    static {
        o7w o7wVar = new o7w();
        f24804a = o7wVar;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.transation_history.data.HistoryTransactionsResponse", o7wVar, 3);
        zna0Var.j("dt", true);
        zna0Var.j("sumCut", true);
        zna0Var.j("sumOut", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, mrv.j0(tblVar), mrv.j0(tblVar)};
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
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new q7w(i, l, d, d2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        q7w q7wVar = (q7w) obj;
        q7wVar.getClass();
        Double d = q7wVar.c;
        Double d2 = q7wVar.b;
        Long l = q7wVar.f28271a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
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
