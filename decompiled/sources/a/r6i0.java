package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r6i0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r6i0 f29934a;
    private static final ugi0 descriptor;

    static {
        r6i0 r6i0Var = new r6i0();
        f29934a = r6i0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits_ee.impl.data.models.requests.SelfExcludeLimitsValue", r6i0Var, 3);
        zna0Var.j("limitValue", false);
        zna0Var.j("limitType", false);
        zna0Var.j("limitMeasure", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, okx.f25427a, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        long jR = 0;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new z6i0(strX, i, iJ, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z6i0 z6i0Var = (z6i0) obj;
        z6i0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, z6i0Var.f43869a);
        cldVarA.i(1, z6i0Var.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, z6i0Var.c);
        cldVarA.c(ugi0Var);
    }
}
