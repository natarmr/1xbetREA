package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class g1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryTypeModel f10516a;

    public final boolean equals(Object obj) {
        if (obj instanceof g1k) {
            return this.f10516a == ((g1k) obj).f10516a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10516a.hashCode();
    }

    public final String toString() {
        return "OnHistoryTypeClick(historyTypeModel=" + this.f10516a + Separators.RPAREN;
    }
}
