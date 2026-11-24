package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u6i0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u6i0 f35138a;
    private static final ugi0 descriptor;

    static {
        u6i0 u6i0Var = new u6i0();
        f35138a = u6i0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits_africa.impl.data.models.requests.SelfExcludeLimitsValue", u6i0Var, 4);
        zna0Var.j("limitValue", false);
        zna0Var.j("limitType", false);
        zna0Var.j("limitMeasure", false);
        zna0Var.j("selfExcludeReason", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, okxVar, ysm0.f43175a, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ2 = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                iJ3 = bldVarA.j(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new c7i0(i, iJ, iJ2, iJ3, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        c7i0 c7i0Var = (c7i0) obj;
        c7i0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, c7i0Var.f3864a, ugi0Var);
        cldVarA.i(1, c7i0Var.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, c7i0Var.c);
        cldVarA.i(3, c7i0Var.d, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
