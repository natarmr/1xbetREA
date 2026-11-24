package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class pww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27729a;
    public final HistoryMenuItem b;

    public pww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.b;
        this.f27729a = R.drawable.ic_history_dialog_hide;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f27729a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pww)) {
            return false;
        }
        pww pwwVar = (pww) obj;
        return this.f27729a == pwwVar.f27729a && this.b == pwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27729a) * 31);
    }

    public final String toString() {
        return "Hide(icon=" + this.f27729a + ", action=" + this.b + Separators.RPAREN;
    }
}
