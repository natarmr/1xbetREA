package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fn7 f9819a;
    private static final ugi0 descriptor;

    static {
        fn7 fn7Var = new fn7();
        f9819a = fn7Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.BetSystemRequest", fn7Var, 4);
        zna0Var.j("b", false);
        zna0Var.j("c", false);
        zna0Var.j("p", false);
        zna0Var.j("s", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new jn7(i, num, num2, num3, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jn7 jn7Var = (jn7) obj;
        jn7Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        okx okxVar = okx.f25427a;
        cldVarA.p(ugi0Var, 0, okxVar, jn7Var.f16799a);
        cldVarA.p(ugi0Var, 1, okxVar, jn7Var.b);
        cldVarA.p(ugi0Var, 2, okxVar, jn7Var.c);
        cldVarA.p(ugi0Var, 3, tbl.f33669a, jn7Var.d);
        cldVarA.c(ugi0Var);
    }
}
