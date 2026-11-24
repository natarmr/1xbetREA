package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class x0k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryMenuItem f40074a;
    public final HistoryTypeModel b;
    public final e4f c;

    public x0k(HistoryMenuItem historyMenuItem, HistoryTypeModel historyTypeModel, e4f e4fVar) {
        historyMenuItem.getClass();
        this.f40074a = historyMenuItem;
        this.b = historyTypeModel;
        this.c = e4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0k)) {
            return false;
        }
        x0k x0kVar = (x0k) obj;
        return this.f40074a == x0kVar.f40074a && this.b == x0kVar.b && this.c == x0kVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f40074a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OnBetActionClickOld(historyMenuItem=" + this.f40074a + ", historyTypeModel=" + this.b + ", status=" + this.c + Separators.RPAREN;
    }
}
