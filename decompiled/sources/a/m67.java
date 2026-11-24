package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.presentation.dialog.bet_summary.BetsSummaryInfoUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class m67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BetsSummaryInfoUiModel f21254a;

    public m67(BetsSummaryInfoUiModel betsSummaryInfoUiModel) {
        this.f21254a = betsSummaryInfoUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m67) && this.f21254a.equals(((m67) obj).f21254a);
    }

    public final int hashCode() {
        return this.f21254a.hashCode();
    }

    public final String toString() {
        return "ShowBetsSummaryInfo(betsSummaryInfoUiModel=" + this.f21254a + Separators.RPAREN;
    }
}
