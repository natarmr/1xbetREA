package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aee0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aee0 f723a;
    private static final ugi0 descriptor;

    static {
        aee0 aee0Var = new aee0();
        f723a = aee0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.core.data.models.RecommendedGameRequest", aee0Var, 5);
        zna0Var.j("onlyDemo", false);
        zna0Var.j("limit", false);
        zna0Var.j("skip", false);
        zna0Var.j("onlyNew", false);
        zna0Var.j("onlyPopular", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        okx okxVar = okx.f25427a;
        return new jiy[]{sm8Var, okxVar, okxVar, sm8Var, sm8Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        boolean zB = false;
        boolean zB2 = false;
        boolean zB3 = false;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                zB = bldVarA.B(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                iJ2 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                zB2 = bldVarA.B(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                zB3 = bldVarA.B(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new cee0(i, iJ, iJ2, zB, zB2, zB3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cee0 cee0Var = (cee0) obj;
        cee0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.x(ugi0Var, 0, cee0Var.f4207a);
        cldVarA.i(1, cee0Var.b, ugi0Var);
        cldVarA.i(2, cee0Var.c, ugi0Var);
        cldVarA.x(ugi0Var, 3, cee0Var.d);
        cldVarA.x(ugi0Var, 4, cee0Var.e);
        cldVarA.c(ugi0Var);
    }
}
