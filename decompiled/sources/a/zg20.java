package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zg20 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zg20 f44324a;
    private static final ugi0 descriptor;

    static {
        zg20 zg20Var = new zg20();
        f44324a = zg20Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.bets.data.models.MakeBetViaConstructorResponse", zg20Var, 3);
        zna0Var.j("Id", true);
        zna0Var.j("Balance", true);
        zna0Var.j("Coupon", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(tbl.f33669a), mrv.j0(j1f.f15731a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Double d = null;
        p1f p1fVar = null;
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
                p1fVar = (p1f) bldVarA.e(ugi0Var, 2, j1f.f15731a, p1fVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new bh20(i, str, d, p1fVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bh20 bh20Var = (bh20) obj;
        bh20Var.getClass();
        p1f p1fVar = bh20Var.c;
        Double d = bh20Var.b;
        String str = bh20Var.f2584a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || p1fVar != null) {
            cldVarA.p(ugi0Var, 2, j1f.f15731a, p1fVar);
        }
        cldVarA.c(ugi0Var);
    }
}
