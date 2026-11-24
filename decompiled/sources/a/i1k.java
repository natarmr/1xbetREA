package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class i1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n3w f14002a;
    public final HistoryTypeModel b;

    public i1k(n3w n3wVar, HistoryTypeModel historyTypeModel) {
        this.f14002a = n3wVar;
        this.b = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1k)) {
            return false;
        }
        i1k i1kVar = (i1k) obj;
        return this.f14002a.equals(i1kVar.f14002a) && this.b == i1kVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14002a.hashCode() * 31);
    }

    public final String toString() {
        return "OnItemClickedOld(historyItemModel=" + this.f14002a + ", historyTypeModel=" + this.b + Separators.RPAREN;
    }
}
