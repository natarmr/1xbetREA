package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes6.dex */
public final class j8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4i f16107a;
    public final HistoryTypeModel b;

    public j8w(s4i s4iVar, HistoryTypeModel historyTypeModel) {
        this.f16107a = s4iVar;
        this.b = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8w)) {
            return false;
        }
        j8w j8wVar = (j8w) obj;
        return this.f16107a.equals(j8wVar.f16107a) && this.b == j8wVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16107a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryTypeTabUiModel(tabModel=" + this.f16107a + ", historyTypeModel=" + this.b + Separators.RPAREN;
    }
}
