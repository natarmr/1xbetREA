package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ru40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ru40 f31107a;
    private static final ugi0 descriptor;

    static {
        ru40 ru40Var = new ru40();
        f31107a = ru40Var;
        zna0 zna0Var = new zna0("org.xplatform.referral.impl.data.model.MoveMoneyRequest", ru40Var, 1);
        zna0Var.j("transferAmount", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{tbl.f33669a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        double dT = 0.0d;
        boolean z = true;
        int i = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                dT = bldVarA.t(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new tu40(dT, i);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        tu40 tu40Var = (tu40) obj;
        tu40Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.j(ugi0Var, 0, tu40Var.f34534a);
        cldVarA.c(ugi0Var);
    }
}
