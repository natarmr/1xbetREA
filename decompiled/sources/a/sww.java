package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class sww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32945a;
    public final HistoryMenuItem b;

    public sww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.d;
        this.f32945a = R.drawable.ic_history_dialog_print;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f32945a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sww)) {
            return false;
        }
        sww swwVar = (sww) obj;
        return this.f32945a == swwVar.f32945a && this.b == swwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f32945a) * 31);
    }

    public final String toString() {
        return "Print(icon=" + this.f32945a + ", action=" + this.b + Separators.RPAREN;
    }
}
