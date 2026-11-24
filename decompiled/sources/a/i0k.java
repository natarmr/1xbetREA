package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class i0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryTypeModel f13951a;

    public final boolean equals(Object obj) {
        if (obj instanceof i0k) {
            return this.f13951a == ((i0k) obj).f13951a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13951a.hashCode();
    }

    public final String toString() {
        return "OnMakeBetClicked(historyTypeModel=" + this.f13951a + Separators.RPAREN;
    }
}
