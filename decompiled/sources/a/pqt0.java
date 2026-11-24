package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pqt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pqt0 f27432a;
    private static final ugi0 descriptor;

    static {
        pqt0 pqt0Var = new pqt0();
        f27432a = pqt0Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.history.data.model.bethistory.UserBetsHideRequest", pqt0Var, 3);
        zna0Var.j("hideInterval", false);
        zna0Var.j("couponId", false);
        zna0Var.j("bonusUserId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(ysm0.f43175a), s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        Long l = null;
        String str = null;
        long jR = 0;
        boolean z = true;
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
                jR = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new rqt0(i, l, str, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rqt0 rqt0Var = (rqt0) obj;
        rqt0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.p(ugi0Var, 0, s710.f31729a, rqt0Var.f30948a);
        cldVarA.p(ugi0Var, 1, ysm0.f43175a, rqt0Var.b);
        cldVarA.n(ugi0Var, 2, rqt0Var.c);
        cldVarA.c(ugi0Var);
    }
}
