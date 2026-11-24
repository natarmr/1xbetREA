package a;

import org.xbet.client1.R;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g47 {
    public static final UiText.ByRes a(s77 s77Var, String str, sys0 sys0Var) {
        s77Var.getClass();
        str.getClass();
        switch (s77Var.ordinal()) {
            case 0:
                return sys0Var == sys0.c ? new UiText.ByRes(R.string.special_events_my_bets, new CharSequence[0]) : new UiText.ByRes(R.string.history_bet, new CharSequence[0]);
            case 1:
                return new UiText.ByRes(R.string.toto_history_without_name_v2, str);
            case 2:
                return new UiText.ByRes(R.string.history_autobet, new CharSequence[0]);
            case 3:
                return new UiText.ByRes(R.string.unreleased_bets, new CharSequence[0]);
            case 4:
                return new UiText.ByRes(R.string.history_sale, new CharSequence[0]);
            case 5:
                return new UiText.ByRes(R.string.history_casino, new CharSequence[0]);
            case 6:
                return new UiText.ByRes(R.string.jackpot_history_name, new CharSequence[0]);
            case 7:
                return new UiText.ByRes(R.string.lotto_history_title, new CharSequence[0]);
            default:
                t9f.b();
                return null;
        }
    }
}
