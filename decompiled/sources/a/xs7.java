package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xs7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xs7 f41402a;
    private static final ugi0 descriptor;

    static {
        xs7 xs7Var = new xs7();
        f41402a = xs7Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.request.BetsHistoryHideUserBetsRequest", xs7Var, 3);
        zna0Var.j("hideInterval", false);
        zna0Var.j("couponId", false);
        zna0Var.j("bonusUserId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(ysm0.f43175a), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        Long l2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new zs7(i, l, l2, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zs7 zs7Var = (zs7) obj;
        zs7Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        s710 s710Var = s710.f31729a;
        cldVarA.p(ugi0Var, 0, s710Var, zs7Var.f44893a);
        cldVarA.p(ugi0Var, 1, ysm0.f43175a, zs7Var.b);
        cldVarA.p(ugi0Var, 2, s710Var, zs7Var.c);
        cldVarA.c(ugi0Var);
    }
}
