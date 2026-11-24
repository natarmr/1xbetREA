package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dst0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dst0 f6630a;
    private static final ugi0 descriptor;

    static {
        dst0 dst0Var = new dst0();
        f6630a = dst0Var;
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.register_responses.UserRegisterResponse", dst0Var, 2);
        zna0Var.j("User", true);
        zna0Var.j("Form", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(mrt0.f22290a), mrv.j0(tvq.f34613a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ort0 ort0Var = null;
        vvq vvqVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                ort0Var = (ort0) bldVarA.e(ugi0Var, 0, mrt0.f22290a, ort0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                vvqVar = (vvq) bldVarA.e(ugi0Var, 1, tvq.f34613a, vvqVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new fst0(i, ort0Var, vvqVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fst0 fst0Var = (fst0) obj;
        fst0Var.getClass();
        vvq vvqVar = fst0Var.b;
        ort0 ort0Var = fst0Var.f10082a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ort0Var != null) {
            cldVarA.p(ugi0Var, 0, mrt0.f22290a, ort0Var);
        }
        if (cldVarA.u(ugi0Var) || vvqVar != null) {
            cldVarA.p(ugi0Var, 1, tvq.f34613a, vvqVar);
        }
        cldVarA.c(ugi0Var);
    }
}
