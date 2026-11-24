package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bwa implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bwa f3315a;
    private static final ugi0 descriptor;

    static {
        bwa bwaVar = new bwa();
        f3315a = bwaVar;
        zna0 zna0Var = new zna0("org.xplatform.coinplay_sport_cashback_impl.data.responses.CashbackBalanceResponse", bwaVar, 1);
        zna0Var.j("UB", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new dwa(i, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dwa dwaVar = (dwa) obj;
        dwaVar.getClass();
        Double d = dwaVar.f6787a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
