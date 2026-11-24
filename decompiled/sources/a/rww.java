package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class rww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31234a;
    public final HistoryMenuItem b;

    public rww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.h;
        this.f31234a = R.drawable.ic_history_dialog_powerbet;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f31234a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rww)) {
            return false;
        }
        rww rwwVar = (rww) obj;
        return this.f31234a == rwwVar.f31234a && this.b == rwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f31234a) * 31);
    }

    public final String toString() {
        return "PowerBet(icon=" + this.f31234a + ", action=" + this.b + Separators.RPAREN;
    }
}
