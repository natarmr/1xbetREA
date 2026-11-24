package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ax90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ax90 f1613a;
    private static final ugi0 descriptor;

    static {
        ax90 ax90Var = new ax90();
        f1613a = ax90Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.lottery.data.models.PlayLotteryRequest", ax90Var, 3);
        zna0Var.j("LT", false);
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
        return new cx90(i, iJ, iJ2, strX);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        cx90 cx90Var = (cx90) obj;
        cx90Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, cx90Var.f5113a, ugi0Var);
        cldVarA.z(ugi0Var, 1, cx90Var.b);
        cldVarA.i(2, cx90Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
