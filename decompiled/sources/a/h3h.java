package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h3h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3h f12385a;
    private static final ugi0 descriptor;

    static {
        h3h h3hVar = new h3h();
        f12385a = h3hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.lol.CyberLolGameStatusResponse", h3hVar, 2);
        zna0Var.j("GD", true);
        zna0Var.j("GS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new j3h(i, num, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j3h j3hVar = (j3h) obj;
        j3hVar.getClass();
        Integer num = j3hVar.b;
        Long l = j3hVar.f15832a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
