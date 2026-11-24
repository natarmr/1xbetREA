package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class lww extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20783a;
    public final HistoryMenuItem b;

    public lww() {
        HistoryMenuItem historyMenuItem = HistoryMenuItem.l;
        this.f20783a = R.drawable.ic_glyph_cancel;
        this.b = historyMenuItem;
    }

    @Override // a.xww
    public final HistoryMenuItem C() {
        return this.b;
    }

    @Override // a.xww
    public final int G() {
        return this.f20783a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lww)) {
            return false;
        }
        lww lwwVar = (lww) obj;
        return this.f20783a == lwwVar.f20783a && this.b == lwwVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f20783a) * 31);
    }

    public final String toString() {
        return "Cancel(icon=" + this.f20783a + ", action=" + this.b + Separators.RPAREN;
    }
}
