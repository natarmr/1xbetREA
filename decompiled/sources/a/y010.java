package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y010 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y010 f41782a;
    private static final ugi0 descriptor;

    static {
        y010 y010Var = new y010();
        f41782a = y010Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.lol.LolMainStatisticResponse", y010Var, 1);
        zna0Var.j("LoLStat", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(n4h.f22898a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        p4h p4hVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                p4hVar = (p4h) bldVarA.e(ugi0Var, 0, n4h.f22898a, p4hVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new a110(i, p4hVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a110 a110Var = (a110) obj;
        a110Var.getClass();
        p4h p4hVar = a110Var.f48a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || p4hVar != null) {
            cldVarA.p(ugi0Var, 0, n4h.f22898a, p4hVar);
        }
        cldVarA.c(ugi0Var);
    }
}
