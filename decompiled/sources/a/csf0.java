package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class csf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final csf0 f4886a;
    private static final ugi0 descriptor;

    static {
        csf0 csf0Var = new csf0();
        f4886a = csf0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.response.ResidentSubjectResponse", csf0Var, 3);
        zna0Var.j("Money", true);
        zna0Var.j("Position", true);
        zna0Var.j("Subject", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(tbl.f33669a), mrv.j0(okx.f25427a), mrv.j0(prf0.f27463a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        Integer num = null;
        orf0 orf0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                orf0Var = (orf0) bldVarA.e(ugi0Var, 2, prf0.f27463a, orf0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new esf0(i, d, num, orf0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        esf0 esf0Var = (esf0) obj;
        esf0Var.getClass();
        orf0 orf0Var = esf0Var.c;
        Integer num = esf0Var.b;
        Double d = esf0Var.f8325a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || orf0Var != null) {
            cldVarA.p(ugi0Var, 2, prf0.f27463a, orf0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
