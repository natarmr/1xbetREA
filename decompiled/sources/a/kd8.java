package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kd8 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd8 f18093a = new kd8(1, jd8.class, "toBonusAgreementsUiState", "toBonusAgreementsUiState(Lorg/xplatform/bonus_agreements/impl/presentation/model/BonusAgreementsStateModel;)Lorg/xplatform/bonus_agreements/impl/presentation/model/BonusAgreementsUiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        hd8 hd8Var = (hd8) obj;
        hd8Var.getClass();
        boolean z = hd8Var.b;
        boolean z2 = hd8Var.c;
        boolean z3 = hd8Var.d;
        mdm mdmVar = hd8Var.e;
        ic8 ic8Var = hd8Var.f12857a;
        String str = ic8Var.f14523a;
        String str2 = ic8Var.b;
        List<rb8> list = ic8Var.c;
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (rb8 rb8Var : list) {
            rb8Var.getClass();
            int i2 = rb8Var.f30171a;
            boolean z4 = rb8Var.e;
            if (i2 == 0) {
                i = R.drawable.ic_glyph_cancel;
            } else if (i2 != 1) {
                i = i2 != 2 ? R.drawable.ic_glyph_gift : R.drawable.ic_glyph_cards;
            } else {
                i = R.drawable.ic_glyph_football_1;
            }
            arrayList.add(new rd8(i2, i, rb8Var.c, rb8Var.d, z4));
        }
        return new id8(z, z2, z3, mdmVar, str, str2, arrayList);
    }
}
