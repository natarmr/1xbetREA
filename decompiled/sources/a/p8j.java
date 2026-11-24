package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p8j implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8j f26556a;
    private static final ugi0 descriptor;

    static {
        p8j p8jVar = new p8j();
        f26556a = p8jVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.darts.DartsLiveResponse", p8jVar, 5);
        zna0Var.j("RN", true);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("RG", true);
        zna0Var.j("WM", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(okx.f25427a);
        d4a0 d4a0Var = d4a0.f5445a;
        return new jiy[]{jiyVarJ0, mrv.j0(d4a0Var), mrv.j0(d4a0Var), mrv.j0(q9j.f28350a), mrv.j0(m9j.f21411a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        h4a0 h4a0Var = null;
        h4a0 h4a0Var2 = null;
        p9j p9jVar = null;
        l9j l9jVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                h4a0Var = (h4a0) bldVarA.e(ugi0Var, 1, d4a0.f5445a, h4a0Var);
                i |= 2;
            } else if (iF == 2) {
                h4a0Var2 = (h4a0) bldVarA.e(ugi0Var, 2, d4a0.f5445a, h4a0Var2);
                i |= 4;
            } else if (iF == 3) {
                p9jVar = (p9j) bldVarA.e(ugi0Var, 3, q9j.f28350a, p9jVar);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                l9jVar = (l9j) bldVarA.e(ugi0Var, 4, m9j.f21411a, l9jVar);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new r8j(i, num, h4a0Var, h4a0Var2, p9jVar, l9jVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        r8j r8jVar = (r8j) obj;
        r8jVar.getClass();
        l9j l9jVar = r8jVar.e;
        p9j p9jVar = r8jVar.d;
        h4a0 h4a0Var = r8jVar.c;
        h4a0 h4a0Var2 = r8jVar.b;
        Integer num = r8jVar.f30029a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || h4a0Var2 != null) {
            cldVarA.p(ugi0Var, 1, d4a0.f5445a, h4a0Var2);
        }
        if (cldVarA.u(ugi0Var) || h4a0Var != null) {
            cldVarA.p(ugi0Var, 2, d4a0.f5445a, h4a0Var);
        }
        if (cldVarA.u(ugi0Var) || p9jVar != null) {
            cldVarA.p(ugi0Var, 3, q9j.f28350a, p9jVar);
        }
        if (cldVarA.u(ugi0Var) || l9jVar != null) {
            cldVarA.p(ugi0Var, 4, m9j.f21411a, l9jVar);
        }
        cldVarA.c(ugi0Var);
    }
}
