package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class www extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39905a;
    public final HistoryMenuItem b;

    public www() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.j;
        this.f39905a = R.drawable.ic_history_dialog_transaction_history;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f39905a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof www)) {
            return false;
        }
        www wwwVar = (www) obj;
        return this.f39905a == wwwVar.f39905a && this.b == wwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f39905a) * 31);
    }

    public final String toString() {
        return "Transaction(icon=" + this.f39905a + ", action=" + this.b + Separators.RPAREN;
    }
}
