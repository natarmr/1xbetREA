package a;

import android.javax.sip.message.Response;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fbp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9272a;
    public final /* synthetic */ g2v b;
    public final /* synthetic */ iqt c;

    public /* synthetic */ fbp(g2v g2vVar, iqt iqtVar, byte b) {
        this.f9272a = b;
        this.b = g2vVar;
        this.c = iqtVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9272a;
        iqt iqtVar = this.c;
        switch (b) {
            case 0:
                pb10 pb10Var = pb10.g;
                g2v g2vVar = this.b;
                mdm mdmVarB = g2v.b(g2vVar, pb10Var, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                pdm pdmVar = pdm.b;
                return new dd80("FavoriteOtherScreen", false, false, false, iqtVar.f15225a.a(), true, false, gc80.f11047a, null, mdmVarB, g2v.b(g2vVar, pb10Var, pdmVar, null, R.drawable.ic_glyph_circle_multievent, R.string.empty_favorites_games_title, R.string.empty_favorites_games, 0, 0, 0L, 0L, 964), g2v.b(g2vVar, pb10Var, pdmVar, null, R.drawable.ic_glyph_circle_favourite, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 980), false);
            case 1:
                iun iunVar = iun.f15405a;
                ot0 ot0Var = ot0.BACKGROUND_L;
                pb10 pb10Var2 = pb10.g;
                g2v g2vVar2 = this.b;
                mdm mdmVarB2 = g2v.b(g2vVar2, pb10Var2, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                pdm pdmVar2 = pdm.b;
                return new e2p("FavoriteAggregatorScreen", false, true, false, iqtVar.f15225a.a(), false, false, false, iunVar, iunVar, ot0Var, mdmVarB2, g2v.b(g2vVar2, pb10Var2, pdmVar2, null, R.drawable.ic_glyph_circle_cards, R.string.empty_favorites_list_aggregator_title, R.string.casino_favorites_empty, 0, 0, 0L, 0L, 964), g2v.b(g2vVar2, pb10Var2, pdmVar2, null, R.drawable.ic_glyph_circle_cards, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 980), false);
            default:
                iun iunVar2 = iun.f15405a;
                pb10 pb10Var3 = pb10.g;
                g2v g2vVar3 = this.b;
                return new i9p(true, true, false, iqtVar.f15225a.a(), false, false, iunVar2, iunVar2, iunVar2, g2v.b(g2vVar3, pb10Var3, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), g2v.b(g2vVar3, pb10Var3, pdm.b, null, R.drawable.ic_glyph_circle_games, R.string.empty_favorites_list_aggregator_title, R.string.casino_favorites_empty, 0, 0, 0L, 0L, 964), g2v.b(g2vVar3, pb10Var3, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), false);
        }
    }
}
