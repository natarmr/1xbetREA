package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q9v0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q9v0 f28367a;
    private static final ugi0 descriptor;

    static {
        q9v0 q9v0Var = new q9v0();
        f28367a = q9v0Var;
        zna0 zna0Var = new zna0("org.xplatform.lucky_wheel.data.responses.WheelBonusResponse", q9v0Var, 5);
        zna0Var.j("BNID", true);
        zna0Var.j("BNTP", true);
        zna0Var.j("GID", true);
        zna0Var.j("BC", true);
        zna0Var.j("FBSE", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(okx.f25427a), mrv.j0(s710Var), mrv.j0(ysm0.f43175a), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Long l2 = null;
        String str = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            } else if (iF == 3) {
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new s9v0(i, l, num, l2, str, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        s9v0 s9v0Var = (s9v0) obj;
        s9v0Var.getClass();
        Double d = s9v0Var.e;
        String str = s9v0Var.d;
        Long l = s9v0Var.c;
        Integer num = s9v0Var.b;
        Long l2 = s9v0Var.f31867a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
