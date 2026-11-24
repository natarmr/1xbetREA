package a;

import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchLabelPresetParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xjh implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xjh f40985a;
    private static final ugi0 descriptor;

    static {
        xjh xjhVar = new xjh();
        f40985a = xjhVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchLabelPresetParams", xjhVar, 2);
        zna0Var.j("label", false);
        zna0Var.j("valueText", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new CyberTournamentBracketMatchLabelPresetParams(i, strX, strX2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        CyberTournamentBracketMatchLabelPresetParams cyberTournamentBracketMatchLabelPresetParams = (CyberTournamentBracketMatchLabelPresetParams) obj;
        cyberTournamentBracketMatchLabelPresetParams.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, cyberTournamentBracketMatchLabelPresetParams.f46614a);
        cldVarA.z(ugi0Var, 1, cyberTournamentBracketMatchLabelPresetParams.b);
        cldVarA.c(ugi0Var);
    }
}
