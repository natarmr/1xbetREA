package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class t7w implements u7w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryTypeModel f33486a;

    public final boolean equals(Object obj) {
        if (obj instanceof t7w) {
            return this.f33486a == ((t7w) obj).f33486a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33486a.hashCode();
    }

    public final String toString() {
        return "OnHistoryTypeModelClick(historyTypeModel=" + this.f33486a + Separators.RPAREN;
    }
}
