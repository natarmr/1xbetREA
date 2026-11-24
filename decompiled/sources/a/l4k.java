package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l4k implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l4k f19410a;
    private static final ugi0 descriptor;

    static {
        l4k l4kVar = new l4k();
        f19410a = l4kVar;
        zna0 zna0Var = new zna0("org.xplatform.bets_subscriptions.data.DeleteBetSubscriptionRequest", l4kVar, 1);
        zna0Var.j("BetId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        long jR = 0;
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
                jR = bldVarA.r(ugi0Var, 0);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new n4k(i, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n4k n4kVar = (n4k) obj;
        n4kVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, n4kVar.f22901a);
        cldVarA.c(ugi0Var);
    }
}
