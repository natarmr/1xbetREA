package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class vi7 implements mj7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryMenuItem f37464a;
    public final String b;

    public vi7(HistoryMenuItem historyMenuItem, String str) {
        historyMenuItem.getClass();
        str.getClass();
        this.f37464a = historyMenuItem;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi7)) {
            return false;
        }
        vi7 vi7Var = (vi7) obj;
        return this.f37464a == vi7Var.f37464a && Intrinsics.d(this.b, vi7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37464a.hashCode() * 31);
    }

    public final String toString() {
        return "OnHistoryMenuActionClick(historyMenuItem=" + this.f37464a + ", betId=" + this.b + Separators.RPAREN;
    }
}
