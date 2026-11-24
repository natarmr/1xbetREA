package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zi40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi40 f44424a;
    private static final ugi0 descriptor;

    static {
        zi40 zi40Var = new zi40();
        f44424a = zi40Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.mlbb.MlbbMainStatisticResponse", zi40Var, 1);
        zna0Var.j("MLBBStat", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(r9h.f30081a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        t9h t9hVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                t9hVar = (t9h) bldVarA.e(ugi0Var, 0, r9h.f30081a, t9hVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new bj40(i, t9hVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bj40 bj40Var = (bj40) obj;
        bj40Var.getClass();
        t9h t9hVar = bj40Var.f2688a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || t9hVar != null) {
            cldVarA.p(ugi0Var, 0, r9h.f30081a, t9hVar);
        }
        cldVarA.c(ugi0Var);
    }
}
