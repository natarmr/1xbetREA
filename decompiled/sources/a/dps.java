package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dps implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dps f6481a;
    private static final ugi0 descriptor;

    static {
        dps dpsVar = new dps();
        f6481a = dpsVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.game_details.domain.model.GameRequestState.Stopped", dpsVar, 4);
        zna0Var.j("gameId", false);
        zna0Var.j("feedKind", false);
        zna0Var.j("sportId", false);
        zna0Var.j("entryReason", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = fps.e;
        return new jiy[]{zcs.f44180a, a8zVarArr[1].getValue(), s710.f31729a, a8zVarArr[3].getValue()};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = fps.e;
        int i = 0;
        bds bdsVar = null;
        sip sipVar = null;
        sos sosVar = null;
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
                sosVar = (sos) bldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), sosVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new fps(i, bdsVar, sipVar, jR, sosVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fps fpsVar = (fps) obj;
        fpsVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = fps.e;
        cldVarA.m(ugi0Var, 0, zcs.f44180a, new bds(fpsVar.f9943a));
        cldVarA.m(ugi0Var, 1, (jiy) a8zVarArr[1].getValue(), fpsVar.b);
        cldVarA.n(ugi0Var, 2, fpsVar.c);
        cldVarA.m(ugi0Var, 3, (jiy) a8zVarArr[3].getValue(), fpsVar.d);
        cldVarA.c(ugi0Var);
    }
}
