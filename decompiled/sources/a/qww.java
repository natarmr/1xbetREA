package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class qww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29455a;
    public final HistoryMenuItem b;

    public qww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.m;
        this.f29455a = R.drawable.ic_glyph_more_vertically;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f29455a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qww)) {
            return false;
        }
        qww qwwVar = (qww) obj;
        return this.f29455a == qwwVar.f29455a && this.b == qwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f29455a) * 31);
    }

    public final String toString() {
        return "More(icon=" + this.f29455a + ", action=" + this.b + Separators.RPAREN;
    }
}
