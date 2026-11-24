package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sxp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sxp f32988a;
    private static final ugi0 descriptor;

    static {
        sxp sxpVar = new sxp();
        f32988a = sxpVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.common.data.fighter.model.FighterStatisticStrikePositionResponse", sxpVar, 3);
        zna0Var.j("distance", true);
        zna0Var.j("clinch", true);
        zna0Var.j("ground", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        cyp cypVar = cyp.f5188a;
        return new jiy[]{mrv.j0(cypVar), mrv.j0(cypVar), mrv.j0(cypVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        eyp eypVar = null;
        eyp eypVar2 = null;
        eyp eypVar3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                eypVar = (eyp) bldVarA.e(ugi0Var, 0, cyp.f5188a, eypVar);
                i |= 1;
            } else if (iF == 1) {
                eypVar2 = (eyp) bldVarA.e(ugi0Var, 1, cyp.f5188a, eypVar2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                eypVar3 = (eyp) bldVarA.e(ugi0Var, 2, cyp.f5188a, eypVar3);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new uxp(i, eypVar, eypVar2, eypVar3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uxp uxpVar = (uxp) obj;
        uxpVar.getClass();
        eyp eypVar = uxpVar.c;
        eyp eypVar2 = uxpVar.b;
        eyp eypVar3 = uxpVar.f36452a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || eypVar3 != null) {
            cldVarA.p(ugi0Var, 0, cyp.f5188a, eypVar3);
        }
        if (cldVarA.u(ugi0Var) || eypVar2 != null) {
            cldVarA.p(ugi0Var, 1, cyp.f5188a, eypVar2);
        }
        if (cldVarA.u(ugi0Var) || eypVar != null) {
            cldVarA.p(ugi0Var, 2, cyp.f5188a, eypVar);
        }
        cldVarA.c(ugi0Var);
    }
}
