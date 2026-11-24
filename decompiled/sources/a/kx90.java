package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kx90 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kx90 f19043a;
    private static final ugi0 descriptor;

    static {
        kx90 kx90Var = new kx90();
        f19043a = kx90Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.treasure.data.models.PlayTreasureRequest", kx90Var, 3);
        zna0Var.j("GT", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a, ysm0.f43175a, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        long jR = 0;
        String strX = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new mx90(strX, i, iJ, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mx90 mx90Var = (mx90) obj;
        mx90Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, mx90Var.f22543a);
        cldVarA.z(ugi0Var, 1, mx90Var.b);
        cldVarA.i(2, mx90Var.c, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
