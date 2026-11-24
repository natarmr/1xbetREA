package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vjh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37527a;
    public final /* synthetic */ CyberTournamentBracketMatchParams b;

    public /* synthetic */ vjh(CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams, int i, byte b) {
        this.f37527a = b;
        this.b = cyberTournamentBracketMatchParams;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37527a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ahb.e(this.b, fetVar, x8x.L(9));
                break;
            default:
                gkb.F(this.b, fetVar, x8x.L(9));
                break;
        }
        return Unit.f46060a;
    }
}
