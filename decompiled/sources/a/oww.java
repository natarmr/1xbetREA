package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes2.dex */
public final class oww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25986a;
    public final HistoryMenuItem b;

    public oww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.b;
        this.f25986a = R.drawable.ic_glyph_more_vertically;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f25986a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oww)) {
            return false;
        }
        oww owwVar = (oww) obj;
        return this.f25986a == owwVar.f25986a && this.b == owwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f25986a) * 31);
    }

    public final String toString() {
        return "Empty(icon=" + this.f25986a + ", action=" + this.b + Separators.RPAREN;
    }
}
