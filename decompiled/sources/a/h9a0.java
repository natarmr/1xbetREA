package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h9a0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h9a0 f12664a;
    private static final ugi0 descriptor;

    static {
        h9a0 h9a0Var = new h9a0();
        f12664a = h9a0Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.bets.data.models.PlayerRequest", h9a0Var, 3);
        zna0Var.j("GameId", false);
        zna0Var.j("Player", false);
        zna0Var.j("Group", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{okx.f25427a, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        String strX = null;
        String strX2 = null;
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
                strX2 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new j9a0(i, strX, iJ, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        j9a0 j9a0Var = (j9a0) obj;
        j9a0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, j9a0Var.f16129a, ugi0Var);
        cldVarA.z(ugi0Var, 1, j9a0Var.b);
        cldVarA.z(ugi0Var, 2, j9a0Var.c);
        cldVarA.c(ugi0Var);
    }
}
