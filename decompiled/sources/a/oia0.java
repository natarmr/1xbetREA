package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oia0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oia0 f25301a = new oia0(1, nia0.class, "toPlayersStatisticCricketSelectorsBottomSheetUiState", "toPlayersStatisticCricketSelectorsBottomSheetUiState(Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/selector_dialog/PlayersStatisticCricketSelectorsBottomSheetState;)Lorg/xplatform/statistic/player/impl/player/players_statistic_cricket/presentation/selector_dialog/PlayersStatisticCricketSelectorsBottomSheetUiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lia0 lia0Var = (lia0) obj;
        lia0Var.getClass();
        List<ljo0> list = lia0Var.f20094a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (ljo0 ljo0Var : list) {
            int i = ljo0Var.b.f18397a;
            arrayList.add(new sha0(ljo0Var.f20162a, i, i == lia0Var.b));
        }
        return new mia0(dyb.o0(arrayList));
    }
}
