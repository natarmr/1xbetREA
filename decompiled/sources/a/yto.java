package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes6.dex */
public final class yto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryMenuItem f43229a;
    public final wul b;

    public yto(HistoryMenuItem historyMenuItem, wul wulVar) {
        historyMenuItem.getClass();
        this.f43229a = historyMenuItem;
        this.b = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yto)) {
            return false;
        }
        yto ytoVar = (yto) obj;
        return this.f43229a == ytoVar.f43229a && this.b.equals(ytoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43229a.hashCode() * 31);
    }

    public final String toString() {
        return "ExtraSmallActionButtonUiModel(menuType=" + this.f43229a + ", buttonUiModel=" + this.b + Separators.RPAREN;
    }
}
