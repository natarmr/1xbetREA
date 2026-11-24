package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class irt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final irt0 f15275a;
    private static final ugi0 descriptor;

    static {
        irt0 irt0Var = new irt0();
        f15275a = irt0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.user.model.UserInfo", irt0Var, 4);
        zna0Var.j("userId", false);
        zna0Var.j("lnC", false);
        zna0Var.j("lvC", false);
        zna0Var.j("userProfit", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{s710.f31729a, sm8Var, sm8Var, tbl.f33669a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        boolean zB = false;
        boolean zB2 = false;
        long jR = 0;
        double dT = 0.0d;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                zB = bldVarA.B(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                zB2 = bldVarA.B(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                dT = bldVarA.t(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new krt0(i, jR, zB, zB2, dT);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        krt0 krt0Var = (krt0) obj;
        krt0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, krt0Var.f18785a);
        cldVarA.x(ugi0Var, 1, krt0Var.b);
        cldVarA.x(ugi0Var, 2, krt0Var.c);
        cldVarA.j(ugi0Var, 3, krt0Var.d);
        cldVarA.c(ugi0Var);
    }
}
