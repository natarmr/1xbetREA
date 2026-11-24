package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j1f implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1f f15731a;
    private static final ugi0 descriptor;

    static {
        j1f j1fVar = new j1f();
        f15731a = j1fVar;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.bets.data.models.CouponResponse", j1fVar, 4);
        zna0Var.j("UserIdBonus", true);
        zna0Var.j("CoefView", true);
        zna0Var.j("Coef", true);
        zna0Var.j("Summ", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(tblVar), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        Double d = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else if (iF == 2) {
                d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                d2 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d2);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new p1f(i, l, str, d, d2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p1f p1fVar = (p1f) obj;
        p1fVar.getClass();
        Double d = p1fVar.d;
        Double d2 = p1fVar.c;
        String str = p1fVar.b;
        Long l = p1fVar.f26198a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
