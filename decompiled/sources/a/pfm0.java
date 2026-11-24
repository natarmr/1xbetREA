package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pfm0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pfm0 f26912a;
    private static final ugi0 descriptor;

    static {
        pfm0 pfm0Var = new pfm0();
        f26912a = pfm0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.StatisticResponse", pfm0Var, 1);
        zna0Var.j("main", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(gz10.f12158a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        iz10 iz10Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                iz10Var = (iz10) bldVarA.e(ugi0Var, 0, gz10.f12158a, iz10Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new vfm0(i, iz10Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vfm0 vfm0Var = (vfm0) obj;
        vfm0Var.getClass();
        iz10 iz10Var = vfm0Var.f37340a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || iz10Var != null) {
            cldVarA.p(ugi0Var, 0, gz10.f12158a, iz10Var);
        }
        cldVarA.c(ugi0Var);
    }
}
