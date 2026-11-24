package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gro implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gro f11789a;
    private static final ugi0 descriptor;

    static {
        gro groVar = new gro();
        f11789a = groVar;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.ExpressHighlightRequest.SelectedMarketRequest", groVar, 3);
        zna0Var.j("GI", false);
        zna0Var.j("GT", false);
        zna0Var.j("ET", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, okx.f25427a, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new iro(i, iJ, jR, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        iro iroVar = (iro) obj;
        iroVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, iroVar.f15268a);
        cldVarA.i(1, iroVar.b, ugi0Var);
        cldVarA.n(ugi0Var, 2, iroVar.c);
        cldVarA.c(ugi0Var);
    }
}
