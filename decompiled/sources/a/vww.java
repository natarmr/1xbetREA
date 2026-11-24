package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class vww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38174a;
    public final HistoryMenuItem b;

    public vww(int i) {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.f46392a;
        this.f38174a = i;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f38174a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vww)) {
            return false;
        }
        vww vwwVar = (vww) obj;
        return this.f38174a == vwwVar.f38174a && this.b == vwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f38174a) * 31);
    }

    public final String toString() {
        return "Subscribe(icon=" + this.f38174a + ", action=" + this.b + Separators.RPAREN;
    }
}
