package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w70 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w70 f38647a;
    private static final ugi0 descriptor;

    static {
        w70 w70Var = new w70();
        f38647a = w70Var;
        zna0 zna0Var = new zna0("org.xplatform.african_roulette.data.request.AfricanRouletteBetRequest", w70Var, 2);
        zna0Var.j("BNM", false);
        zna0Var.j("NM", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{tbl.f33669a, c80.f3888a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        double dT = 0.0d;
        boolean z = true;
        int i = 0;
        b80 b80Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                dT = bldVarA.t(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                b80Var = (b80) bldVarA.m(ugi0Var, 1, c80.f3888a, b80Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new y70(i, dT, b80Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y70 y70Var = (y70) obj;
        y70Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.j(ugi0Var, 0, y70Var.f42126a);
        cldVarA.m(ugi0Var, 1, c80.f3888a, y70Var.b);
        cldVarA.c(ugi0Var);
    }
}
