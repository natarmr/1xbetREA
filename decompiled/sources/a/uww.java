package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class uww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36412a;
    public final HistoryMenuItem b;

    public uww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.i;
        this.f36412a = R.drawable.ic_history_dialog_share;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f36412a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uww)) {
            return false;
        }
        uww uwwVar = (uww) obj;
        return this.f36412a == uwwVar.f36412a && this.b == uwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f36412a) * 31);
    }

    public final String toString() {
        return "Share(icon=" + this.f36412a + ", action=" + this.b + Separators.RPAREN;
    }
}
