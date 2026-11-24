package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xhc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xhc0 f40884a;
    private static final ugi0 descriptor;

    static {
        xhc0 xhc0Var = new xhc0();
        f40884a = xhc0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.popular.classic.impl.data.models.PromoEntitiesResponse", xhc0Var, 3);
        zna0Var.j("promoSlotGame", true);
        zna0Var.j("promoLiveCasinoGame", true);
        zna0Var.j("promoBrand", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        nic0 nic0Var = nic0.f23579a;
        return new jiy[]{mrv.j0(nic0Var), mrv.j0(nic0Var), mrv.j0(q7c0.f28242a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ric0 ric0Var = null;
        ric0 ric0Var2 = null;
        u7c0 u7c0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                ric0Var = (ric0) bldVarA.e(ugi0Var, 0, nic0.f23579a, ric0Var);
                i |= 1;
            } else if (iF == 1) {
                ric0Var2 = (ric0) bldVarA.e(ugi0Var, 1, nic0.f23579a, ric0Var2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                u7c0Var = (u7c0) bldVarA.e(ugi0Var, 2, q7c0.f28242a, u7c0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new bic0(i, ric0Var, ric0Var2, u7c0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bic0 bic0Var = (bic0) obj;
        bic0Var.getClass();
        u7c0 u7c0Var = bic0Var.c;
        ric0 ric0Var = bic0Var.b;
        ric0 ric0Var2 = bic0Var.f2653a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ric0Var2 != null) {
            cldVarA.p(ugi0Var, 0, nic0.f23579a, ric0Var2);
        }
        if (cldVarA.u(ugi0Var) || ric0Var != null) {
            cldVarA.p(ugi0Var, 1, nic0.f23579a, ric0Var);
        }
        if (cldVarA.u(ugi0Var) || u7c0Var != null) {
            cldVarA.p(ugi0Var, 2, q7c0.f28242a, u7c0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
