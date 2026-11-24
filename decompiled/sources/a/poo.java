package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class poo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final poo f27339a;
    private static final ugi0 descriptor;

    static {
        poo pooVar = new poo();
        f27339a = pooVar;
        zna0 zna0Var = new zna0("org.xplatform.swipex.impl.presentation.models.ExpandedSportsModel", pooVar, 2);
        zna0Var.j("sportId", false);
        zna0Var.j("subSportId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
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
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new roo(i, jR, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        roo rooVar = (roo) obj;
        rooVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, rooVar.f30849a);
        cldVarA.n(ugi0Var, 1, rooVar.b);
        cldVarA.c(ugi0Var);
    }
}
