package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class nww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24255a;
    public final HistoryMenuItem b;

    public nww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.e;
        this.f24255a = R.drawable.ic_history_dialog_edit;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f24255a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nww)) {
            return false;
        }
        nww nwwVar = (nww) obj;
        return this.f24255a == nwwVar.f24255a && this.b == nwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f24255a) * 31);
    }

    public final String toString() {
        return "Edit(icon=" + this.f24255a + ", action=" + this.b + Separators.RPAREN;
    }
}
