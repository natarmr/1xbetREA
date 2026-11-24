package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class n17 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryDateFilterTypeModel f22735a;

    public n17(HistoryDateFilterTypeModel historyDateFilterTypeModel) {
        this.f22735a = historyDateFilterTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n17) && this.f22735a == ((n17) obj).f22735a;
    }

    public final int hashCode() {
        return this.f22735a.hashCode();
    }

    public final String toString() {
        return "OnDateFilterChange(historyDateFilterTypeModel=" + this.f22735a + Separators.RPAREN;
    }
}
