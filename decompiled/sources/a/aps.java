package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aps implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aps f1268a;
    private static final ugi0 descriptor;

    static {
        aps apsVar = new aps();
        f1268a = apsVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.game_details.domain.model.GameRequestState.FindLive", apsVar, 4);
        zna0Var.j("gameId", false);
        zna0Var.j("feedKind", false);
        zna0Var.j("sportId", false);
        zna0Var.j("before", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{zcs.f44180a, cps.e[1].getValue(), s710.f31729a, afn.f786a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = cps.e;
        int i = 0;
        bds bdsVar = null;
        sip sipVar = null;
        wen wenVar = null;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bdsVar = (bds) bldVarA.m(ugi0Var, 0, zcs.f44180a, bdsVar);
                i |= 1;
            } else if (iF == 1) {
                sipVar = (sip) bldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), sipVar);
                i |= 2;
            } else if (iF == 2) {
                jR = bldVarA.r(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                wenVar = (wen) bldVarA.m(ugi0Var, 3, afn.f786a, wenVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new cps(i, bdsVar, sipVar, jR, wenVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cps cpsVar = (cps) obj;
        cpsVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = cps.e;
        cldVarA.m(ugi0Var, 0, zcs.f44180a, new bds(cpsVar.f4763a));
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), cpsVar.b);
        cldVarA.n(ugi0Var, 2, cpsVar.c);
        cldVarA.m(ugi0Var, 3, afn.f786a, new wen(cpsVar.d));
        cldVarA.c(ugi0Var);
    }
}
