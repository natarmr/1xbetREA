package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wpt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wpt0 f39558a;
    private static final ugi0 descriptor;

    static {
        wpt0 wpt0Var = new wpt0();
        f39558a = wpt0Var;
        zna0 zna0Var = new zna0("org.xplatform.feature.promo_aggregator.impl.data.models.UsePromoCodeRequest", wpt0Var, 2);
        zna0Var.j("promocode", false);
        zna0Var.j("accId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
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
        return new ypt0(strX, i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ypt0 ypt0Var = (ypt0) obj;
        ypt0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, ypt0Var.f43048a);
        cldVarA.n(ugi0Var, 1, ypt0Var.b);
        cldVarA.c(ugi0Var);
    }
}
