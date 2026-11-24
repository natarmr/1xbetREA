package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ibq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ibq f14502a;
    private static final ugi0 descriptor;

    static {
        ibq ibqVar = new ibq();
        f14502a = ibqVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.fin_bet.impl.data.model.FinanceBetDataRequest", ibqVar, 10);
        zna0Var.j("Seconds", false);
        zna0Var.j("Expired", false);
        zna0Var.j("Coef", false);
        zna0Var.j("InstrumentId", false);
        zna0Var.j("Price", false);
        zna0Var.j("GameId", false);
        zna0Var.j("Type", false);
        zna0Var.j("Kind", false);
        zna0Var.j("Param", false);
        zna0Var.j("PlayerId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        tbl tblVar = tbl.f33669a;
        okx okxVar = okx.f25427a;
        return new jiy[]{s710Var, s710Var, tblVar, s710Var, tblVar, s710Var, okxVar, s710Var, tblVar, okxVar};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        int iJ2 = 0;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        long jR4 = 0;
        long jR5 = 0;
        double dT = 0.0d;
        double dT2 = 0.0d;
        double dT3 = 0.0d;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jR = bldVarA.r(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    jR2 = bldVarA.r(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    dT = bldVarA.t(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    jR3 = bldVarA.r(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    dT2 = bldVarA.t(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jR4 = bldVarA.r(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iJ = bldVarA.j(ugi0Var, 6);
                    i |= 64;
                    break;
                case 7:
                    jR5 = bldVarA.r(ugi0Var, 7);
                    i |= 128;
                    break;
                case 8:
                    dT3 = bldVarA.t(ugi0Var, 8);
                    i |= 256;
                    break;
                case 9:
                    iJ2 = bldVarA.j(ugi0Var, 9);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new kbq(i, jR, jR2, dT, jR3, dT2, jR4, iJ, jR5, dT3, iJ2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kbq kbqVar = (kbq) obj;
        kbqVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, kbqVar.f18026a);
        cldVarA.n(ugi0Var, 1, kbqVar.b);
        cldVarA.j(ugi0Var, 2, kbqVar.c);
        cldVarA.n(ugi0Var, 3, kbqVar.d);
        cldVarA.j(ugi0Var, 4, kbqVar.e);
        cldVarA.n(ugi0Var, 5, kbqVar.f);
        cldVarA.i(6, kbqVar.g, ugi0Var);
        cldVarA.n(ugi0Var, 7, kbqVar.h);
        cldVarA.j(ugi0Var, 8, kbqVar.i);
        cldVarA.i(9, kbqVar.j, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
