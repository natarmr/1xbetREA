package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jyu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jyu0 f17377a;
    private static final ugi0 descriptor;

    static {
        jyu0 jyu0Var = new jyu0();
        f17377a = jyu0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.game.impl.wallet.data.models.WalletSendSmsCodeRequest", jyu0Var, 3);
        zna0Var.j("productId", false);
        zna0Var.j("captchaId", false);
        zna0Var.j("imageText", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{s710.f31729a, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        String strX = null;
        String strX2 = null;
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
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new lyu0(i, jR, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        lyu0 lyu0Var = (lyu0) obj;
        lyu0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, lyu0Var.f20880a);
        cldVarA.z(ugi0Var, 1, lyu0Var.b);
        cldVarA.z(ugi0Var, 2, lyu0Var.c);
        cldVarA.c(ugi0Var);
    }
}
