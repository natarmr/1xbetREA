package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y8h implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y8h f42194a;
    private static final ugi0 descriptor;

    static {
        y8h y8hVar = new y8h();
        f42194a = y8hVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.mlbb.CyberMlbbDraftResponse", y8hVar, 3);
        zna0Var.j("DIB", true);
        zna0Var.j("DID", true);
        zna0Var.j("DTN", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(sm8.f32432a), mrv.j0(s710.f31729a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Long l = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else if (iF == 1) {
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new a9h(i, bool, num, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        a9h a9hVar = (a9h) obj;
        a9hVar.getClass();
        Integer num = a9hVar.c;
        Long l = a9hVar.b;
        Boolean bool = a9hVar.f476a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
