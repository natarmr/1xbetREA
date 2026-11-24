package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fj8 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fj8 f9625a = new fj8(1, dj8.class, "toUiState", "toUiState(Lorg/xplatform/games_section/feature/bonuses_info/presentation/dialog/models/BonusesInfoBottomSheetState;)Lorg/xplatform/games_section/feature/bonuses_info/presentation/dialog/models/BonusesInfoBottomSheetUiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zi8 zi8Var = (zi8) obj;
        zi8Var.getClass();
        if (zi8Var.f44429a) {
            return bj8.f2693a;
        }
        List<xi8> list = zi8Var.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (xi8 xi8Var : list) {
            String str = xi8Var.f40932a;
            String str2 = xi8Var.b;
            String str3 = xi8Var.c;
            m0x m0xVar = new m0x(xi8Var.d, null, 6);
            d4d d4dVar = d4d.PRIMARY;
            arrayList.add(new yi8(str, new nan(str2, str3, m0xVar, new mt90())));
        }
        return new aj8(dyb.o0(arrayList));
    }
}
