package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bu0 f3207a;
    private static final ugi0 descriptor;

    static {
        bu0 bu0Var = new bu0();
        f3207a = bu0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.favorite.data.models.AggregatorGameFavoriteRequest", bu0Var, 3);
        zna0Var.j("gameId", false);
        zna0Var.j("subCategoryId", false);
        zna0Var.j("metrics", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(okx.f25427a), mrv.j0(mu0.f22390a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        ou0 ou0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                ou0Var = (ou0) bldVarA.e(ugi0Var, 2, mu0.f22390a, ou0Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new du0(i, l, num, ou0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        du0 du0Var = (du0) obj;
        du0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.p(ugi0Var, 0, s710.f31729a, du0Var.f6677a);
        cldVarA.p(ugi0Var, 1, okx.f25427a, du0Var.b);
        cldVarA.p(ugi0Var, 2, mu0.f22390a, du0Var.c);
        cldVarA.c(ugi0Var);
    }
}
