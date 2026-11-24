package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class tww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34670a;
    public final HistoryMenuItem b;

    public tww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.g;
        this.f34670a = R.drawable.ic_history_dialog_sell;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f34670a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tww)) {
            return false;
        }
        tww twwVar = (tww) obj;
        return this.f34670a == twwVar.f34670a && this.b == twwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f34670a) * 31);
    }

    public final String toString() {
        return "Sale(icon=" + this.f34670a + ", action=" + this.b + Separators.RPAREN;
    }
}
