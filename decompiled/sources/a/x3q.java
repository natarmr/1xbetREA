package a;

import android.gov.nist.core.Separators;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;

/* JADX INFO: loaded from: classes3.dex */
public final class x3q implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BetHistoryFilterItemModel f40232a;
    public final int b;

    public x3q(BetHistoryFilterItemModel betHistoryFilterItemModel, int i) {
        this.f40232a = betHistoryFilterItemModel;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3q)) {
            return false;
        }
        x3q x3qVar = (x3q) obj;
        return this.f40232a.equals(x3qVar.f40232a) && this.b == x3qVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f40232a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterUiModel(filter=" + this.f40232a + ", gravity=" + this.b + Separators.RPAREN;
    }
}
