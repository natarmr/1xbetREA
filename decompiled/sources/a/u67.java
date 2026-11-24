package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class u67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8w f35124a;
    public final HistoryTypeModel b;

    public u67(f8w f8wVar, HistoryTypeModel historyTypeModel) {
        this.f35124a = f8wVar;
        this.b = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u67)) {
            return false;
        }
        u67 u67Var = (u67) obj;
        return this.f35124a == u67Var.f35124a && this.b == u67Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35124a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowHistoryCouponStatusFilter(historyTypeScreen=" + this.f35124a + ", historyTypeModel=" + this.b + Separators.RPAREN;
    }
}
