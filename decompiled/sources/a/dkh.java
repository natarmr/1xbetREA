package a;

import org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchLabelPresetParams;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dkh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dkh f6229a;
    private static final ugi0 descriptor;

    static {
        dkh dkhVar = new dkh();
        f6229a = dkhVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams", dkhVar, 13);
        zna0Var.j("firstTeamIcon", false);
        zna0Var.j("firstTeamName", false);
        zna0Var.j("secondTeamIcon", false);
        zna0Var.j("secondTeamName", false);
        zna0Var.j("firstTeamScore", false);
        zna0Var.j("secondTeamScore", false);
        zna0Var.j("gameStatus", false);
        zna0Var.j("stage", false);
        zna0Var.j("date", false);
        zna0Var.j("matchId", false);
        zna0Var.j("buttonText", false);
        zna0Var.j("globalChampId", false);
        zna0Var.j("subSportId", false);
        descriptor = zna0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = CyberTournamentBracketMatchParams.n;
        ysm0 ysm0Var = ysm0.f43175a;
        okx okxVar = okx.f25427a;
        xjh xjhVar = xjh.f40985a;
        s710 s710Var = s710.f31729a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, ysm0Var, okxVar, okxVar, a8zVarArr[6].getValue(), xjhVar, xjhVar, s710Var, ysm0Var, okxVar, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = CyberTournamentBracketMatchParams.n;
        long jR = 0;
        long jR2 = 0;
        CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams = null;
        boolean z = true;
        CyberTournamentBracketMatchStatusModel cyberTournamentBracketMatchStatusModel = null;
        CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams2 = null;
        int i = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        int iJ = 0;
        int iJ2 = 0;
        String strX5 = null;
        int iJ3 = 0;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strX = bldVarA.x(ugi0Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strX2 = bldVarA.x(ugi0Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strX3 = bldVarA.x(ugi0Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strX4 = bldVarA.x(ugi0Var, 3);
                    i |= 8;
                    break;
                case 4:
                    iJ = bldVarA.j(ugi0Var, 4);
                    i |= 16;
                    break;
                case 5:
                    iJ2 = bldVarA.j(ugi0Var, 5);
                    i |= 32;
                    break;
                case 6:
                    cyberTournamentBracketMatchStatusModel = (CyberTournamentBracketMatchStatusModel) bldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), cyberTournamentBracketMatchStatusModel);
                    i |= 64;
                    break;
                case 7:
                    cyberTournamentBracketMatchLabelPresetParams2 = (CyberTournamentBracketMatchLabelPresetParams) bldVarA.m(ugi0Var, 7, xjh.f40985a, cyberTournamentBracketMatchLabelPresetParams2);
                    i |= 128;
                    break;
                case 8:
                    cyberTournamentBracketMatchLabelPresetParams = (CyberTournamentBracketMatchLabelPresetParams) bldVarA.m(ugi0Var, 8, xjh.f40985a, cyberTournamentBracketMatchLabelPresetParams);
                    i |= 256;
                    break;
                case 9:
                    jR = bldVarA.r(ugi0Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strX5 = bldVarA.x(ugi0Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    iJ3 = bldVarA.j(ugi0Var, 11);
                    i |= 2048;
                    break;
                case 12:
                    jR2 = bldVarA.r(ugi0Var, 12);
                    i |= 4096;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new CyberTournamentBracketMatchParams(i, strX, strX2, strX3, strX4, iJ, iJ2, cyberTournamentBracketMatchStatusModel, cyberTournamentBracketMatchLabelPresetParams2, cyberTournamentBracketMatchLabelPresetParams, jR, strX5, iJ3, jR2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams = (CyberTournamentBracketMatchParams) obj;
        cyberTournamentBracketMatchParams.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = CyberTournamentBracketMatchParams.n;
        cldVarA.z(ugi0Var, 0, cyberTournamentBracketMatchParams.f46615a);
        cldVarA.z(ugi0Var, 1, cyberTournamentBracketMatchParams.b);
        cldVarA.z(ugi0Var, 2, cyberTournamentBracketMatchParams.c);
        cldVarA.z(ugi0Var, 3, cyberTournamentBracketMatchParams.d);
        cldVarA.i(4, cyberTournamentBracketMatchParams.e, ugi0Var);
        cldVarA.i(5, cyberTournamentBracketMatchParams.f, ugi0Var);
        cldVarA.m(ugi0Var, 6, (jiy) a8zVarArr[6].getValue(), cyberTournamentBracketMatchParams.g);
        xjh xjhVar = xjh.f40985a;
        cldVarA.m(ugi0Var, 7, xjhVar, cyberTournamentBracketMatchParams.h);
        cldVarA.m(ugi0Var, 8, xjhVar, cyberTournamentBracketMatchParams.i);
        cldVarA.n(ugi0Var, 9, cyberTournamentBracketMatchParams.j);
        cldVarA.z(ugi0Var, 10, cyberTournamentBracketMatchParams.k);
        cldVarA.i(11, cyberTournamentBracketMatchParams.l, ugi0Var);
        cldVarA.n(ugi0Var, 12, cyberTournamentBracketMatchParams.m);
        cldVarA.c(ugi0Var);
    }
}
