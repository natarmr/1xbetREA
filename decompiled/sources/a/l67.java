package a;

import android.gov.nist.core.Separators;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class l67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8w f19492a;
    public final HistoryTypeModel b;

    public l67(f8w f8wVar, HistoryTypeModel historyTypeModel) {
        this.f19492a = f8wVar;
        this.b = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l67)) {
            return false;
        }
        l67 l67Var = (l67) obj;
        return this.f19492a == l67Var.f19492a && this.b == l67Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19492a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAllFiltersDialog(historyTypeScreen=" + this.f19492a + ", historyTypeModel=" + this.b + Separators.RPAREN;
    }
}
