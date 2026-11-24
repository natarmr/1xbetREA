package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pja0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pja0 f27080a = new pja0(1, oja0.class, "toPlayersStatisticSelectorsBottomSheetUiState", "toPlayersStatisticSelectorsBottomSheetUiState(Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/models/PlayersStatisticSelectorsBottomSheetState;)Lorg/xplatform/statistic/player/impl/player/players_statistic/presentation/ui_state/PlayersStatisticSelectorsBottomSheetUiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mja0 mja0Var = (mja0) obj;
        mja0Var.getClass();
        List list = mja0Var.f21887a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            m5i0 m5i0Var = (m5i0) obj2;
            int i3 = m5i0Var.f21221a;
            String str = m5i0Var.c;
            boolean z = true;
            boolean z2 = i != list.size() - 1;
            if (m5i0Var.f21221a != mja0Var.b) {
                z = false;
            }
            arrayList.add(new ria0(z2, z, str, i3));
            i = i2;
        }
        return new nja0(dyb.o0(arrayList));
    }
}
