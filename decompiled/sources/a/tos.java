package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tos implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tos f34299a;
    private static final ugi0 descriptor;

    static {
        tos tosVar = new tos();
        f34299a = tosVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.GameRequestPartition", tosVar, 6);
        zna0Var.j("onlyDemo", true);
        zna0Var.j("limit", true);
        zna0Var.j("skip", true);
        zna0Var.j("onlyNew", true);
        zna0Var.j("onlyPopular", true);
        zna0Var.j("partId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        sm8 sm8Var = sm8.f32432a;
        okx okxVar = okx.f25427a;
        return new jiy[]{sm8Var, okxVar, okxVar, sm8Var, sm8Var, jiyVarJ0};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        boolean zB = false;
        int iJ = 0;
        int iJ2 = 0;
        boolean zB2 = false;
        boolean zB3 = false;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zB = bldVarA.B(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    iJ = bldVarA.j(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iJ2 = bldVarA.j(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    zB2 = bldVarA.B(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zB3 = bldVarA.B(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new vos(i, zB, iJ, iJ2, zB2, zB3, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vos vosVar = (vos) obj;
        vosVar.getClass();
        Long l = vosVar.f;
        boolean z = vosVar.e;
        boolean z2 = vosVar.d;
        int i = vosVar.c;
        int i2 = vosVar.b;
        boolean z3 = vosVar.f37781a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || z3) {
            cldVarA.x(ugi0Var, 0, z3);
        }
        if (cldVarA.u(ugi0Var) || i2 != 0) {
            cldVarA.i(1, i2, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || i != 0) {
            cldVarA.i(2, i, ugi0Var);
        }
        if (cldVarA.u(ugi0Var) || z2) {
            cldVarA.x(ugi0Var, 3, z2);
        }
        if (cldVarA.u(ugi0Var) || z) {
            cldVarA.x(ugi0Var, 4, z);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
