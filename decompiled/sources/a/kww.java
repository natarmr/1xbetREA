package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class kww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19023a;
    public final HistoryMenuItem b;

    public kww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.f;
        this.f19023a = R.drawable.ic_history_dialog_autosale;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f19023a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kww)) {
            return false;
        }
        kww kwwVar = (kww) obj;
        return this.f19023a == kwwVar.f19023a && this.b == kwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f19023a) * 31);
    }

    public final String toString() {
        return "AutoSale(icon=" + this.f19023a + ", action=" + this.b + Separators.RPAREN;
    }
}
