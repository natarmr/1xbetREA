package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class it30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final it30 f15336a;
    private static final ugi0 descriptor;

    static {
        it30 it30Var = new it30();
        f15336a = it30Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.memories.data.models.MemoryStartGameRequest", it30Var, 3);
        zna0Var.j("SI", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, ysm0.f43175a, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        String strX = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ2 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new kt30(i, iJ, iJ2, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kt30 kt30Var = (kt30) obj;
        kt30Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, kt30Var.f18844a, ugi0Var);
        cldVarA.z(ugi0Var, 1, kt30Var.b);
        cldVarA.i(2, kt30Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
