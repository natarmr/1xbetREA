package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v3a0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v3a0 f36725a;
    private static final ugi0 descriptor;

    static {
        v3a0 v3a0Var = new v3a0();
        f36725a = v3a0Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.bets.data.models.PlayerGroupRequest", v3a0Var, 3);
        zna0Var.j("gameId", false);
        zna0Var.j("player", false);
        zna0Var.j("group", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{okxVar, okxVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ2 = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ3 = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new x3a0(i, iJ, iJ2, iJ3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        x3a0 x3a0Var = (x3a0) obj;
        x3a0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, x3a0Var.f40209a, ugi0Var);
        cldVarA.i(1, x3a0Var.b, ugi0Var);
        cldVarA.i(2, x3a0Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
