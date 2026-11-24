package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ejf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ejf f7906a;
    private static final ugi0 descriptor;

    static {
        ejf ejfVar = new ejf();
        f7906a = ejfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.counterstrike.impl.data.model.composition.Cs2CompositionStatisticInfoResponse", ejfVar, 6);
        zna0Var.j("CybersportRating", true);
        zna0Var.j("CybersportKPR", true);
        zna0Var.j("CybersportDPR", true);
        zna0Var.j("CybersportKAST", true);
        zna0Var.j("CybersportRoundSwing", true);
        zna0Var.j("CybersportADR", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        klq klqVar = klq.f18504a;
        return new jiy[]{mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        Float f5 = null;
        Float f6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    f = (Float) bldVarA.e(ugi0Var, 0, klq.f18504a, f);
                    i |= 1;
                    break;
                case 1:
                    f2 = (Float) bldVarA.e(ugi0Var, 1, klq.f18504a, f2);
                    i |= 2;
                    break;
                case 2:
                    f3 = (Float) bldVarA.e(ugi0Var, 2, klq.f18504a, f3);
                    i |= 4;
                    break;
                case 3:
                    f4 = (Float) bldVarA.e(ugi0Var, 3, klq.f18504a, f4);
                    i |= 8;
                    break;
                case 4:
                    f5 = (Float) bldVarA.e(ugi0Var, 4, klq.f18504a, f5);
                    i |= 16;
                    break;
                case 5:
                    f6 = (Float) bldVarA.e(ugi0Var, 5, klq.f18504a, f6);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new gjf(i, f, f2, f3, f4, f5, f6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gjf gjfVar = (gjf) obj;
        gjfVar.getClass();
        Float f = gjfVar.f;
        Float f2 = gjfVar.e;
        Float f3 = gjfVar.d;
        Float f4 = gjfVar.c;
        Float f5 = gjfVar.b;
        Float f6 = gjfVar.f11393a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || f6 != null) {
            cldVarA.p(ugi0Var, 0, klq.f18504a, f6);
        }
        if (cldVarA.u(ugi0Var) || f5 != null) {
            cldVarA.p(ugi0Var, 1, klq.f18504a, f5);
        }
        if (cldVarA.u(ugi0Var) || f4 != null) {
            cldVarA.p(ugi0Var, 2, klq.f18504a, f4);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 3, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 4, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 5, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
