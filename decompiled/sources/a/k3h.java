package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k3h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k3h f17618a;
    private static final ugi0 descriptor;

    static {
        k3h k3hVar = new k3h();
        f17618a = k3hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.lol.CyberLolGoldHistoryResponse", k3hVar, 2);
        zna0Var.j("HG", true);
        zna0Var.j("HT", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
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
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new m3h(i, num, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m3h m3hVar = (m3h) obj;
        m3hVar.getClass();
        Long l = m3hVar.b;
        Integer num = m3hVar.f21115a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
