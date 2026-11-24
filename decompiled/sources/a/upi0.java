package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class upi0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final upi0 f36067a;
    private static final ugi0 descriptor;

    static {
        upi0 upi0Var = new upi0();
        f36067a = upi0Var;
        zna0 zna0Var = new zna0("org.xplatform.responsible_game.impl.data.limits.models.gambling_exam.SetLimitsWithExamResponse", upi0Var, 2);
        zna0Var.j("limits", true);
        zna0Var.j("questionData", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(z200.f43648a), mrv.j0(rkd0.f30643a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        p300 p300Var = null;
        vkd0 vkd0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                p300Var = (p300) bldVarA.e(ugi0Var, 0, z200.f43648a, p300Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                vkd0Var = (vkd0) bldVarA.e(ugi0Var, 1, rkd0.f30643a, vkd0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new ypi0(i, p300Var, vkd0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ypi0 ypi0Var = (ypi0) obj;
        ypi0Var.getClass();
        vkd0 vkd0Var = ypi0Var.b;
        p300 p300Var = ypi0Var.f43032a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || p300Var != null) {
            cldVarA.p(ugi0Var, 0, z200.f43648a, p300Var);
        }
        if (cldVarA.u(ugi0Var) || vkd0Var != null) {
            cldVarA.p(ugi0Var, 1, rkd0.f30643a, vkd0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
