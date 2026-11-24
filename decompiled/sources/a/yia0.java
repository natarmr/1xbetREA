package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yia0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yia0 f42679a = new yia0(1, xia0.class, "toPlayersStatisticInfoBottomSheetUiState", "toPlayersStatisticInfoBottomSheetUiState(Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/models/PlayersStatisticInfoBottomSheetState;)Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/ui_state/PlayersStatisticInfoBottomSheetUiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        via0 via0Var = (via0) obj;
        via0Var.getClass();
        List<t2u0> list = via0Var.f37470a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (t2u0 t2u0Var : list) {
            arrayList.add(new dja0(t2u0Var.b, t2u0Var.c));
        }
        return new wia0(dyb.o0(arrayList));
    }
}
