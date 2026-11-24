package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class et20 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final et20 f8356a;
    private static final ugi0 descriptor;

    static {
        et20 et20Var = new et20();
        f8356a = et20Var;
        zna0 zna0Var = new zna0("org.xplatform.market_statistic.data.model.MarketChartPointResponse", et20Var, 3);
        zna0Var.j("cf", true);
        zna0Var.j("cfView", true);
        zna0Var.j("ts", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(klq.f18504a), mrv.j0(ysm0.f43175a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Float f = null;
        String str = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                f = (Float) bldVarA.e(ugi0Var, 0, klq.f18504a, f);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new gt20(i, f, str, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gt20 gt20Var = (gt20) obj;
        gt20Var.getClass();
        Long l = gt20Var.c;
        String str = gt20Var.b;
        Float f = gt20Var.f11860a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 0, klq.f18504a, f);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
