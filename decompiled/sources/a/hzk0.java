package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hzk0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hzk0 f13911a;
    private static final ugi0 descriptor;

    static {
        hzk0 hzk0Var = new hzk0();
        f13911a = hzk0Var;
        zna0 zna0Var = new zna0("org.xplatform.lucky_wheel.data.requests.SpinWheelRequest", hzk0Var, 2);
        zna0Var.j("WF", false);
        zna0Var.j("BAC", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{sm8.f32432a, s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                zB = bldVarA.B(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                jR = bldVarA.r(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new jzk0(i, jR, zB);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jzk0 jzk0Var = (jzk0) obj;
        jzk0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.x(ugi0Var, 0, jzk0Var.f17418a);
        cldVarA.n(ugi0Var, 1, jzk0Var.b);
        cldVarA.c(ugi0Var);
    }
}
