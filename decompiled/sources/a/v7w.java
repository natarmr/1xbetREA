package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class v7w implements y7w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryTypeModel f36950a;

    public final boolean equals(Object obj) {
        if (obj instanceof v7w) {
            return this.f36950a == ((v7w) obj).f36950a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36950a.hashCode();
    }

    public final String toString() {
        return "CallHistoryType(historyTypeModel=" + this.f36950a + Separators.RPAREN;
    }
}
