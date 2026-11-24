package a;

import kotlin.Unit;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.playerstatistics.kills.TeamKillsStatisticView;
import org.xplatform.cyber.dota.impl.presentation.statistic.items.view.DotaItemsHeroesTableView;
import org.xplatform.cyber.dota.impl.presentation.statistic.skills.view.DotaSkillsHeroesTableView;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h5l implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12485a;
    public final /* synthetic */ hlp0 b;

    public /* synthetic */ h5l(hlp0 hlp0Var, byte b) {
        this.f12485a = b;
        this.b = hlp0Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f12485a;
        hlp0 hlp0Var = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        int iIntValue3 = ((Integer) obj3).intValue();
        int iIntValue4 = ((Integer) obj4).intValue();
        switch (b) {
            case 0:
                int i = DotaItemsHeroesTableView.h;
                hlp0Var.a(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            case 1:
                int i2 = DotaSkillsHeroesTableView.j;
                hlp0Var.a(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            case 2:
                int i3 = TeamKillsStatisticView.B;
                hlp0Var.a(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            default:
                int i4 = TeamStatisticView.x;
                hlp0Var.a(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
        }
        return Unit.f46060a;
    }
}
