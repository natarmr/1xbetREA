package a;

import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i8w {
    public static final f8w a(BetHistoryScreenModel betHistoryScreenModel) {
        betHistoryScreenModel.getClass();
        if (betHistoryScreenModel != null) {
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetChampHistory) {
                return f8w.b;
            }
            if (betHistoryScreenModel instanceof BetHistoryScreenModel.BetHistory) {
                return f8w.f9129a;
            }
        }
        t9f.b();
        return null;
    }
}
