package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class whc0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final whc0 f39161a;
    private static final ugi0 descriptor;

    static {
        whc0 whc0Var = new whc0();
        f39161a = whc0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.popular.dashboard.impl.data.models.PromoEntitiesResponse", whc0Var, 4);
        zna0Var.j("promoSlotGame", true);
        zna0Var.j("promoLiveCasinoGame", true);
        zna0Var.j("promoProduct", true);
        zna0Var.j("promoBrand", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        mic0 mic0Var = mic0.f21839a;
        return new jiy[]{mrv.j0(mic0Var), mrv.j0(mic0Var), mrv.j0(hoc0.f13388a), mrv.j0(p7c0.f26499a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        qic0 qic0Var = null;
        qic0 qic0Var2 = null;
        joc0 joc0Var = null;
        t7c0 t7c0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                qic0Var = (qic0) bldVarA.e(ugi0Var, 0, mic0.f21839a, qic0Var);
                i |= 1;
            } else if (iF == 1) {
                qic0Var2 = (qic0) bldVarA.e(ugi0Var, 1, mic0.f21839a, qic0Var2);
                i |= 2;
            } else if (iF == 2) {
                joc0Var = (joc0) bldVarA.e(ugi0Var, 2, hoc0.f13388a, joc0Var);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                t7c0Var = (t7c0) bldVarA.e(ugi0Var, 3, p7c0.f26499a, t7c0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new aic0(i, qic0Var, qic0Var2, joc0Var, t7c0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        aic0 aic0Var = (aic0) obj;
        aic0Var.getClass();
        t7c0 t7c0Var = aic0Var.d;
        joc0 joc0Var = aic0Var.c;
        qic0 qic0Var = aic0Var.b;
        qic0 qic0Var2 = aic0Var.f918a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || qic0Var2 != null) {
            cldVarA.p(ugi0Var, 0, mic0.f21839a, qic0Var2);
        }
        if (cldVarA.u(ugi0Var) || qic0Var != null) {
            cldVarA.p(ugi0Var, 1, mic0.f21839a, qic0Var);
        }
        if (cldVarA.u(ugi0Var) || joc0Var != null) {
            cldVarA.p(ugi0Var, 2, hoc0.f13388a, joc0Var);
        }
        if (cldVarA.u(ugi0Var) || t7c0Var != null) {
            cldVarA.p(ugi0Var, 3, p7c0.f26499a, t7c0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
