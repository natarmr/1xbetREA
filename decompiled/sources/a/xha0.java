package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xha0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xha0 f40881a = new xha0(1, wha0.class, "toPlayersStatisticCricketInfoBottomSheetUiState", "toPlayersStatisticCricketInfoBottomSheetUiState(Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/info_dialog/PlayersStatisticCricketInfoBottomSheetState;)Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/info_dialog/PlayersStatisticCricketInfoBottomSheetUiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uha0 uha0Var = (uha0) obj;
        uha0Var.getClass();
        List<cjo0> list = uha0Var.f35668a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (cjo0 cjo0Var : list) {
            arrayList.add(new cia0(cjo0Var.f4471a, cjo0Var.b));
        }
        return new vha0(dyb.o0(arrayList));
    }
}
