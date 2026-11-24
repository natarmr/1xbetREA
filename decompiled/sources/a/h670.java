package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h670 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h670 f12517a;
    private static final ugi0 descriptor;

    static {
        h670 h670Var = new h670();
        f12517a = h670Var;
        zna0 zna0Var = new zna0("org.xplatform.web.impl.domain.models.OneXGamesWebClientError", h670Var, 2);
        zna0Var.j("title", false);
        zna0Var.j("error", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(j670.f15971a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        l670 l670Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                l670Var = (l670) bldVarA.e(ugi0Var, 1, j670.f15971a, l670Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new m670(i, str, l670Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m670 m670Var = (m670) obj;
        m670Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.p(ugi0Var, 0, ysm0.f43175a, m670Var.f21255a);
        cldVarA.p(ugi0Var, 1, j670.f15971a, m670Var.b);
        cldVarA.c(ugi0Var);
    }
}
