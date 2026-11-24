package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class so30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32525a;
    public final HistoryMenuItem b;

    public so30(int i, HistoryMenuItem historyMenuItem) {
        historyMenuItem.getClass();
        this.f32525a = i;
        this.b = historyMenuItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so30)) {
            return false;
        }
        so30 so30Var = (so30) obj;
        return this.f32525a == so30Var.f32525a && this.b == so30Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f32525a) * 31);
    }

    public final String toString() {
        return "MediumActionButtonUiModel(iconRes=" + this.f32525a + ", menuType=" + this.b + Separators.RPAREN;
    }
}
