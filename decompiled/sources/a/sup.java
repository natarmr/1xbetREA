package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sup implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sup f32832a;
    private static final ugi0 descriptor;

    static {
        sup supVar = new sup();
        f32832a = supVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.game.data.fight.model.FightStatsResponse", supVar, 2);
        zna0Var.j("red", true);
        zna0Var.j("blue", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        osp ospVar = osp.f25793a;
        return new jiy[]{mrv.j0(ospVar), mrv.j0(ospVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        qsp qspVar = null;
        qsp qspVar2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                qspVar = (qsp) bldVarA.e(ugi0Var, 0, osp.f25793a, qspVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                qspVar2 = (qsp) bldVarA.e(ugi0Var, 1, osp.f25793a, qspVar2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new uup(i, qspVar, qspVar2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        uup uupVar = (uup) obj;
        uupVar.getClass();
        qsp qspVar = uupVar.b;
        qsp qspVar2 = uupVar.f36311a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || qspVar2 != null) {
            cldVarA.p(ugi0Var, 0, osp.f25793a, qspVar2);
        }
        if (cldVarA.u(ugi0Var) || qspVar != null) {
            cldVarA.p(ugi0Var, 1, osp.f25793a, qspVar);
        }
        cldVarA.c(ugi0Var);
    }
}
