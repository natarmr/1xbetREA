package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ati0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ati0 f1435a;
    private static final ugi0 descriptor;

    static {
        ati0 ati0Var = new ati0();
        f1435a = ati0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.requests.SetStatusBonusRequest", ati0Var, 3);
        zna0Var.j("AccId", false);
        zna0Var.j("BonusId", false);
        zna0Var.j("Status", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{s710.f31729a, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new cti0(i, iJ, iJ2, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cti0 cti0Var = (cti0) obj;
        cti0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, cti0Var.f4938a);
        cldVarA.i(1, cti0Var.b, ugi0Var);
        cldVarA.i(2, cti0Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
