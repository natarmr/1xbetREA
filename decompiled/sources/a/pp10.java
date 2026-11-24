package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pp10 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pp10 f27354a;
    private static final ugi0 descriptor;

    static {
        pp10 pp10Var = new pp10();
        f27354a = pp10Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.history.data.model.bethistory.MailHistoryRequest", pp10Var, 6);
        zna0Var.j("DateFrom", false);
        zna0Var.j("DateTo", false);
        zna0Var.j("AccountId", false);
        zna0Var.j("CfView", false);
        zna0Var.j("ByBetSettlingDates", false);
        zna0Var.j("Timezone", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, s710Var, s710Var, okx.f25427a, sm8.f32432a, tbl.f33669a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        boolean zB = false;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        double dT = 0.0d;
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
                    jR3 = bldVarA.r(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    iJ = bldVarA.j(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zB = bldVarA.B(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    dT = bldVarA.t(ugi0Var, 5);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new rp10(i, jR, jR2, jR3, iJ, zB, dT);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rp10 rp10Var = (rp10) obj;
        rp10Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, rp10Var.f30865a);
        cldVarA.n(ugi0Var, 1, rp10Var.b);
        cldVarA.n(ugi0Var, 2, rp10Var.c);
        cldVarA.i(3, rp10Var.d, ugi0Var);
        cldVarA.x(ugi0Var, 4, rp10Var.e);
        cldVarA.j(ugi0Var, 5, rp10Var.f);
        cldVarA.c(ugi0Var);
    }
}
