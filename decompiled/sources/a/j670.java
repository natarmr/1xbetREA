package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j670 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j670 f15971a;
    private static final ugi0 descriptor;

    static {
        j670 j670Var = new j670();
        f15971a = j670Var;
        zna0 zna0Var = new zna0("org.xplatform.web.impl.domain.models.OneXGamesWebClientError.Error", j670Var, 1);
        zna0Var.j("title", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new l670(i, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        l670 l670Var = (l670) obj;
        l670Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.p(ugi0Var, 0, ysm0.f43175a, l670Var.f19493a);
        cldVarA.c(ugi0Var);
    }
}
