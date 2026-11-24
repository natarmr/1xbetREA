package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yxb0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yxb0 f43413a;
    private static final ugi0 descriptor;

    static {
        yxb0 yxb0Var = new yxb0();
        f43413a = yxb0Var;
        zna0 zna0Var = new zna0("org.xplatform.lucky_wheel.data.responses.PrizeResponse", yxb0Var, 2);
        zna0Var.j("PR", true);
        zna0Var.j("PC", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(q9v0.f28367a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        s9v0 s9v0Var = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                s9v0Var = (s9v0) bldVarA.e(ugi0Var, 0, q9v0.f28367a, s9v0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ayb0(i, s9v0Var, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ayb0 ayb0Var = (ayb0) obj;
        ayb0Var.getClass();
        Integer num = ayb0Var.b;
        s9v0 s9v0Var = ayb0Var.f1664a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || s9v0Var != null) {
            cldVarA.p(ugi0Var, 0, q9v0.f28367a, s9v0Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
