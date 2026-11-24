package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bq40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bq40 f3011a;
    private static final ugi0 descriptor;

    static {
        bq40 bq40Var = new bq40();
        f3011a = bq40Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.game.impl.wallet.data.models.MoneyTransferRequest", bq40Var, 3);
        zna0Var.j("productId", false);
        zna0Var.j("amount", false);
        zna0Var.j("currencyPlayerId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, ysm0.f43175a, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        long jR2 = 0;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new dq40(strX, jR, jR2, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dq40 dq40Var = (dq40) obj;
        dq40Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, dq40Var.f6496a);
        cldVarA.z(ugi0Var, 1, dq40Var.b);
        cldVarA.n(ugi0Var, 2, dq40Var.c);
        cldVarA.c(ugi0Var);
    }
}
