package a;

import kotlin.Unit;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.playerstatistics.kills.TeamKillsStatisticView;
import org.xplatform.cyber.cyberstatistic.impl.presentation.stagetable.view.CyberStageView;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pfh implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26905a;
    public final /* synthetic */ s1g b;

    public /* synthetic */ pfh(s1g s1gVar, byte b) {
        this.f26905a = b;
        this.b = s1gVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.f26905a;
        s1g s1gVar = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        int iIntValue3 = ((Integer) obj3).intValue();
        int iIntValue4 = ((Integer) obj4).intValue();
        switch (b) {
            case 0:
                int i = CyberStageView.l1;
                s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            case 1:
                int i2 = CyberStageView.l1;
                s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            case 2:
                int i3 = CyberStageView.l1;
                s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            case 3:
                int i4 = CyberStageView.l1;
                s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            case 4:
                int i5 = TeamKillsStatisticView.B;
                s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            case 5:
                int i6 = TeamStatisticView.x;
                s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
            default:
                int i7 = TeamStatisticView.x;
                s1gVar.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                break;
        }
        return Unit.f46060a;
    }
}
