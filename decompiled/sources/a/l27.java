package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class l27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryTypeModel f19294a;

    public final boolean equals(Object obj) {
        if (obj instanceof l27) {
            return this.f19294a == ((l27) obj).f19294a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19294a.hashCode();
    }

    public final String toString() {
        return "OnHistoryTypeChange(historyTypeModel=" + this.f19294a + Separators.RPAREN;
    }
}
