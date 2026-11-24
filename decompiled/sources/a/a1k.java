package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class a1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryDateFilterTypeModel f74a;

    public a1k(HistoryDateFilterTypeModel historyDateFilterTypeModel) {
        this.f74a = historyDateFilterTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1k) && this.f74a == ((a1k) obj).f74a;
    }

    public final int hashCode() {
        return this.f74a.hashCode();
    }

    public final String toString() {
        return "OnDateTypeSelectedClick(historyDateFilterTypeModel=" + this.f74a + Separators.RPAREN;
    }
}
