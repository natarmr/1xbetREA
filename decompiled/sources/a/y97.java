package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class y97 implements la7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryMenuItem f42231a;

    public y97(HistoryMenuItem historyMenuItem) {
        this.f42231a = historyMenuItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y97) && this.f42231a == ((y97) obj).f42231a;
    }

    public final int hashCode() {
        return this.f42231a.hashCode();
    }

    public final String toString() {
        return "OnHistoryMenuActionClick(historyMenuItem=" + this.f42231a + Separators.RPAREN;
    }
}
