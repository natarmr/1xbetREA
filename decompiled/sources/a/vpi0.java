package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vpi0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vpi0 f37807a;
    private static final ugi0 descriptor;

    static {
        vpi0 vpi0Var = new vpi0();
        f37807a = vpi0Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.ie.impl.data.models.responses.gambling_exam.SetLimitsWithExamResponse", vpi0Var, 1);
        zna0Var.j("questionData", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(skd0.f32342a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        wkd0 wkd0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                wkd0Var = (wkd0) bldVarA.e(ugi0Var, 0, skd0.f32342a, wkd0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new zpi0(i, wkd0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zpi0 zpi0Var = (zpi0) obj;
        zpi0Var.getClass();
        wkd0 wkd0Var = zpi0Var.f44762a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || wkd0Var != null) {
            cldVarA.p(ugi0Var, 0, skd0.f32342a, wkd0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
