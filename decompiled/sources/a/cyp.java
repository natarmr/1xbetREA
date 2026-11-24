package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cyp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cyp f5188a;
    private static final ugi0 descriptor;

    static {
        cyp cypVar = new cyp();
        f5188a = cypVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.common.data.fighter.model.FighterStatisticValueResponse", cypVar, 2);
        zna0Var.j("count", true);
        zna0Var.j("percent", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(klq.f18504a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Float f = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                f = (Float) bldVarA.e(ugi0Var, 1, klq.f18504a, f);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new eyp(i, f, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        eyp eypVar = (eyp) obj;
        eypVar.getClass();
        Float f = eypVar.b;
        Integer num = eypVar.f8637a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 1, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
