package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zkc implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zkc f44525a;
    private static final ugi0 descriptor;

    static {
        zkc zkcVar = new zkc();
        f44525a = zkcVar;
        zna0 zna0Var = new zna0("org.xplatform.bonuses.impl.data.models.ClaimBonusRequest", zkcVar, 1);
        zna0Var.j("Data", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new blc(i, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        blc blcVar = (blc) obj;
        blcVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.i(0, blcVar.f2789a, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
