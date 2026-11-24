package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ssj implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ssj f32729a;
    private static final ugi0 descriptor;

    static {
        ssj ssjVar = new ssj();
        f32729a = ssjVar;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.DefaultBetSumDataSourceModel", ssjVar, 2);
        zna0Var.j("balanceId", true);
        zna0Var.j("defaultSum", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new usj(i, l, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        usj usjVar = (usj) obj;
        usjVar.getClass();
        Double d = usjVar.b;
        Long l = usjVar.f36214a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
