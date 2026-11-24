package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ztg0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ztg0 f44958a;
    private static final ugi0 descriptor;

    static {
        ztg0 ztg0Var = new ztg0();
        f44958a = ztg0Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.request.SaleBetSumRequest", ztg0Var, 4);
        zna0Var.j("UserId", false);
        zna0Var.j("UserIdBonus", false);
        zna0Var.j("BetId", false);
        zna0Var.j("Lng", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{s710Var, s710Var, ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        long jR2 = 0;
        String strX = null;
        String strX2 = null;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                jR2 = bldVarA.r(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new bug0(i, jR, jR2, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bug0 bug0Var = (bug0) obj;
        bug0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, bug0Var.f3230a);
        cldVarA.n(ugi0Var, 1, bug0Var.b);
        cldVarA.z(ugi0Var, 2, bug0Var.c);
        cldVarA.z(ugi0Var, 3, bug0Var.d);
        cldVarA.c(ugi0Var);
    }
}
