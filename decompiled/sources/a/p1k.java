package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class p1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryTypeModel f26205a;

    public final boolean equals(Object obj) {
        if (obj instanceof p1k) {
            return this.f26205a == ((p1k) obj).f26205a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26205a.hashCode();
    }

    public final String toString() {
        return "OnStatusFilterClick(historyTypeModel=" + this.f26205a + Separators.RPAREN;
    }
}
