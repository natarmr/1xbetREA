package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class azu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final azu0 f1739a;
    private static final ugi0 descriptor;

    static {
        azu0 azu0Var = new azu0();
        f1739a = azu0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.game.impl.wallet.data.models.WalletWithdrawSumResponse", azu0Var, 3);
        zna0Var.j("amountConverted", true);
        zna0Var.j("currency", true);
        zna0Var.j("minTransferAmount", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        String str = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
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
        return new czu0(i, d, d2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        czu0 czu0Var = (czu0) obj;
        czu0Var.getClass();
        Double d = czu0Var.c;
        String str = czu0Var.b;
        Double d2 = czu0Var.f5241a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
