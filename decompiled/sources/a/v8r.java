package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v8r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v8r f37001a;
    private static final ugi0 descriptor;

    static {
        v8r v8rVar = new v8r();
        f37001a = v8rVar;
        zna0 zna0Var = new zna0("org.xplatform.tile_matching.data.request.FruitBlastActionRequest", v8rVar, 4);
        zna0Var.j("BAC", false);
        zna0Var.j("AN", false);
        zna0Var.j("CX", false);
        zna0Var.j("CY", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{s710.f31729a, okxVar, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        long jR = 0;
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
            } else if (iF == 2) {
                iJ2 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                iJ3 = bldVarA.j(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new x8r(i, jR, iJ, iJ2, iJ3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x8r x8rVar = (x8r) obj;
        x8rVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, x8rVar.f40474a);
        cldVarA.i(1, x8rVar.b, ugi0Var);
        cldVarA.i(2, x8rVar.c, ugi0Var);
        cldVarA.i(3, x8rVar.d, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
