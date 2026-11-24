package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.bet_history.TimeTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class k27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeTypeModel f17559a;

    public final boolean equals(Object obj) {
        if (obj instanceof k27) {
            return this.f17559a == ((k27) obj).f17559a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17559a.hashCode();
    }

    public final String toString() {
        return "OnHideHistoryChange(timeTypeModel=" + this.f17559a + Separators.RPAREN;
    }
}
