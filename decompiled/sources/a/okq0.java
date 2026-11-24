package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class okq0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okq0 f25417a;
    private static final ugi0 descriptor;

    static {
        okq0 okq0Var = new okq0();
        f25417a = okq0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.ie.impl.data.models.requests.TimeLimitsValue", okq0Var, 3);
        zna0Var.j("limitValue", false);
        zna0Var.j("limitType", false);
        zna0Var.j("limitMeasure", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{tbl.f33669a, okx.f25427a, ysm0.f43175a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        double dT = 0.0d;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                dT = bldVarA.t(ugi0Var, 0);
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
        return new ukq0(dT, i, iJ, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ukq0 ukq0Var = (ukq0) obj;
        ukq0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.j(ugi0Var, 0, ukq0Var.f35842a);
        cldVarA.i(1, ukq0Var.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, ukq0Var.c);
        cldVarA.c(ugi0Var);
    }
}
