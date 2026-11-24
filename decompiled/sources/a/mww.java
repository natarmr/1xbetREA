package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class mww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22525a;
    public final HistoryMenuItem b;

    public mww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.k;
        this.f22525a = R.drawable.ic_duplicate_coupon;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f22525a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mww)) {
            return false;
        }
        mww mwwVar = (mww) obj;
        return this.f22525a == mwwVar.f22525a && this.b == mwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f22525a) * 31);
    }

    public final String toString() {
        return "Duplicate(icon=" + this.f22525a + ", action=" + this.b + Separators.RPAREN;
    }
}
