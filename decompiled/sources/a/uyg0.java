package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uyg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uyg0 f36487a;
    private static final ugi0 descriptor;

    static {
        uyg0 uyg0Var = new uyg0();
        f36487a = uyg0Var;
        zna0 zna0Var = new zna0("org.xplatform.analytics.data.model.SaveUserReactionByMessageIdRequest", uyg0Var, 3);
        zna0Var.j("messageId", false);
        zna0Var.j("issuer", false);
        zna0Var.j("reaction", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{ysm0.f43175a, okx.f25427a, iae0.f14435a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
        hae0 hae0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                hae0Var = (hae0) bldVarA.m(ugi0Var, 2, iae0.f14435a, hae0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new wyg0(i, strX, iJ, hae0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        wyg0 wyg0Var = (wyg0) obj;
        wyg0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, wyg0Var.f39972a);
        cldVarA.i(1, wyg0Var.b, ugi0Var);
        cldVarA.m(ugi0Var, 2, iae0.f14435a, wyg0Var.c);
        cldVarA.c(ugi0Var);
    }
}
