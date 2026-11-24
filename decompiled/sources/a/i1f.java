package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i1f implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i1f f13994a;
    private static final ugi0 descriptor;

    static {
        i1f i1fVar = new i1f();
        f13994a = i1fVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.fin_bet.impl.data.model.CouponResponse", i1fVar, 3);
        zna0Var.j("CoefView", true);
        zna0Var.j("Coef", true);
        zna0Var.j("Summ", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, mrv.j0(tblVar), mrv.j0(tblVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Double d = null;
        Double d2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new o1f(i, d, d2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o1f o1fVar = (o1f) obj;
        o1fVar.getClass();
        Double d = o1fVar.c;
        Double d2 = o1fVar.b;
        String str = o1fVar.f24476a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
