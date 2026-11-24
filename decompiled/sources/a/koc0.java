package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class koc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final koc0 f18626a;
    private static final ugi0 descriptor;

    static {
        koc0 koc0Var = new koc0();
        f18626a = koc0Var;
        zna0 zna0Var = new zna0("org.xplatform.promo.impl.promocodes.data.models.PromoRequest", koc0Var, 2);
        zna0Var.j("sum", false);
        zna0Var.j("promoId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ooc0(i, iJ, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ooc0 ooc0Var = (ooc0) obj;
        ooc0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, ooc0Var.f25590a, ugi0Var);
        cldVarA.n(ugi0Var, 1, ooc0Var.b);
        cldVarA.c(ugi0Var);
    }
}
