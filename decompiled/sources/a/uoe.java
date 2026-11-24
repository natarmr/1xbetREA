package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uoe implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uoe f36010a;
    private static final ugi0 descriptor;

    static {
        uoe uoeVar = new uoe();
        f36010a = uoeVar;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.promo.data.models.responses.CountResponse", uoeVar, 1);
        zna0Var.j("count", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new woe(i, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        woe woeVar = (woe) obj;
        woeVar.getClass();
        Integer num = woeVar.f39492a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
