package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hq40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hq40 f13469a;
    private static final ugi0 descriptor;

    static {
        hq40 hq40Var = new hq40();
        f13469a = hq40Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.game.impl.wallet.data.models.MoneyTransferWithSmsRequest", hq40Var, 5);
        zna0Var.j("guid", false);
        zna0Var.j("codePlaceholder", false);
        zna0Var.j("amount", false);
        zna0Var.j("currencyPlayerId", false);
        zna0Var.j("productId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, s710Var, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX3 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                jR = bldVarA.r(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new jq40(i, strX, strX2, strX3, jR, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jq40 jq40Var = (jq40) obj;
        jq40Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, jq40Var.f16932a);
        cldVarA.z(ugi0Var, 1, jq40Var.b);
        cldVarA.z(ugi0Var, 2, jq40Var.c);
        cldVarA.n(ugi0Var, 3, jq40Var.d);
        cldVarA.n(ugi0Var, 4, jq40Var.e);
        cldVarA.c(ugi0Var);
    }
}
