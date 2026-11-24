package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cce0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cce0 f4107a;
    private static final ugi0 descriptor;

    static {
        cce0 cce0Var = new cce0();
        f4107a = cce0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.ie.impl.data.models.requests.RealityLimitActionRequest", cce0Var, 2);
        zna0Var.j("openTs", false);
        zna0Var.j("actionTypeId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        int iJ = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new gce0(i, iJ, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gce0 gce0Var = (gce0) obj;
        gce0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, gce0Var.f11057a);
        cldVarA.i(1, gce0Var.b, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
