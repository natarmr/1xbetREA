package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kar0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kar0 f17979a = new kar0(1, jar0.class, "toTopPlayersInfoUiState", "toTopPlayersInfoUiState(Lorg/xplatform/special_event/impl/top_players/presentation/dialog/model/TopPlayersInfoState;)Lorg/xplatform/special_event/impl/top_players/presentation/dialog/model/TopPlayersInfoUiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        far0 far0Var = (far0) obj;
        far0Var.getClass();
        List<c3r0> list = far0Var.f9224a;
        if (list.isEmpty()) {
            return har0.f12738a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (c3r0 c3r0Var : list) {
            arrayList.add(new ear0(c3r0Var.b, c3r0Var.c));
        }
        return new gar0(dyb.o0(arrayList));
    }
}
