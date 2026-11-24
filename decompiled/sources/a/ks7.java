package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ks7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ks7 f18799a;
    private static final ugi0 descriptor;

    static {
        ks7 ks7Var = new ks7();
        f18799a = ks7Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.bets_on_players.impl.data.model.BetsByPlayersResponse", ks7Var, 3);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("sportId", true);
        zna0Var.j("statisticLineUpData", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        return new jiy[]{mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ms7.f22305a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Long l2 = null;
        vs7 vs7Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                vs7Var = (vs7) bldVarA.e(ugi0Var, 2, ms7.f22305a, vs7Var);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new ws7(i, l, l2, vs7Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ws7 ws7Var = (ws7) obj;
        ws7Var.getClass();
        vs7 vs7Var = ws7Var.c;
        Long l = ws7Var.b;
        Long l2 = ws7Var.f39678a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || vs7Var != null) {
            cldVarA.p(ugi0Var, 2, ms7.f22305a, vs7Var);
        }
        cldVarA.c(ugi0Var);
    }
}
