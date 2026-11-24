package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class jv30 implements lv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryMenuItem f17188a;

    public jv30(HistoryMenuItem historyMenuItem) {
        this.f17188a = historyMenuItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jv30) && this.f17188a == ((jv30) obj).f17188a;
    }

    public final int hashCode() {
        return this.f17188a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemClicked(historyMenuItem=" + this.f17188a + Separators.RPAREN;
    }
}
