package a;

import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hg6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hg6 f13003a;
    private static final ugi0 descriptor;

    static {
        hg6 hg6Var = new hg6();
        f13003a = hg6Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.betbuilder.BetBuilderEventsRequest.MarketSelectionRequest", hg6Var, 3);
        zna0Var.j(Payload.TYPE, false);
        zna0Var.j("parameter", false);
        zna0Var.j("playerId", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{s710Var, tbl.f33669a, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        long jR = 0;
        long jR2 = 0;
        double dT = 0.0d;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jR = bldVarA.r(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                dT = bldVarA.t(ugi0Var, 1);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new jg6(i, jR, dT, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jg6 jg6Var = (jg6) obj;
        jg6Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.n(ugi0Var, 0, jg6Var.f16465a);
        cldVarA.j(ugi0Var, 1, jg6Var.b);
        cldVarA.n(ugi0Var, 2, jg6Var.c);
        cldVarA.c(ugi0Var);
    }
}
