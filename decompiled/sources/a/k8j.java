package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k8j implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k8j f17874a;
    private static final ugi0 descriptor;

    static {
        k8j k8jVar = new k8j();
        f17874a = k8jVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.darts.DartsLiveGameInfoResponse", k8jVar, 1);
        zna0Var.j("GameInfo", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(p8j.f26556a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        r8j r8jVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                r8jVar = (r8j) bldVarA.e(ugi0Var, 0, p8j.f26556a, r8jVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new m8j(i, r8jVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m8j m8jVar = (m8j) obj;
        m8jVar.getClass();
        r8j r8jVar = m8jVar.f21373a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || r8jVar != null) {
            cldVarA.p(ugi0Var, 0, p8j.f26556a, r8jVar);
        }
        cldVarA.c(ugi0Var);
    }
}
