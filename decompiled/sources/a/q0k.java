package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class q0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BetHistoryScreenModel f27903a;

    public q0k(BetHistoryScreenModel betHistoryScreenModel) {
        this.f27903a = betHistoryScreenModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0k) && this.f27903a.equals(((q0k) obj).f27903a);
    }

    public final int hashCode() {
        return this.f27903a.hashCode();
    }

    public final String toString() {
        return "OnSellClicked(betHistoryScreenModel=" + this.f27903a + Separators.RPAREN;
    }
}
