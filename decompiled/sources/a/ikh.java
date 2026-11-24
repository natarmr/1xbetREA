package a;

import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ikh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ikh f14925a;
    private static final ugi0 descriptor;

    static {
        ikh ikhVar = new ikh();
        f14925a = ikhVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.tournament_bracket.navigation.CyberTournamentBracketMatchRoute", ikhVar, 1);
        zna0Var.j("params", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{dkh.f6229a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                cyberTournamentBracketMatchParams = (CyberTournamentBracketMatchParams) bldVarA.m(ugi0Var, 0, dkh.f6229a, cyberTournamentBracketMatchParams);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new kkh(i, cyberTournamentBracketMatchParams);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kkh kkhVar = (kkh) obj;
        kkhVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.m(ugi0Var, 0, dkh.f6229a, kkhVar.f18439a);
        cldVarA.c(ugi0Var);
    }
}
