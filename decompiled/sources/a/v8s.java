package a;

import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.dashboard.api.SportGameDashboardScreenParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v8s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37003a = 0;
    public final /* synthetic */ g9s b;
    public final /* synthetic */ fsr c;

    public /* synthetic */ v8s(fsr fsrVar, g9s g9sVar) {
        this.c = fsrVar;
        this.b = g9sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer numValueOf;
        byte b = this.f37003a;
        g9s g9sVar = this.b;
        switch (b) {
            case 0:
                r7s r7sVarA = r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, this.c, false, false, true, false, false, false, 0, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, 1996488703, 1048575);
                g9sVar.o.e("KEY_BROADCASTING_INDEX", r7sVarA.F);
                return r7sVarA;
            default:
                r7s r7sVar = (r7s) obj2;
                SportGameDashboardScreenParams sportGameDashboardScreenParams = g9sVar.p;
                int iOrdinal = sportGameDashboardScreenParams.d.ordinal();
                fsr fsrVar = this.c;
                if (iOrdinal == 0) {
                    numValueOf = 0;
                } else if (iOrdinal != 1) {
                    numValueOf = null;
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                } else {
                    numValueOf = Integer.valueOf(fsrVar.b ? 1 : 0);
                }
                Integer num = numValueOf;
                GameBroadcastType gameBroadcastType = sportGameDashboardScreenParams.d;
                r7s r7sVarA2 = r7s.a(r7sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, fsrVar, false, false, gameBroadcastType == GameBroadcastType.f47186a, gameBroadcastType == GameBroadcastType.b, false, false, num, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, 1728053247, 1048575);
                g9sVar.o.e("KEY_BROADCASTING_INDEX", r7sVarA2.F);
                return r7sVarA2;
        }
    }

    public /* synthetic */ v8s(g9s g9sVar, fsr fsrVar) {
        this.b = g9sVar;
        this.c = fsrVar;
    }
}
