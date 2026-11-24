package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class t27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HistoryMenuItem f33202a;
    public final String b;

    public t27(HistoryMenuItem historyMenuItem, String str) {
        historyMenuItem.getClass();
        str.getClass();
        this.f33202a = historyMenuItem;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t27)) {
            return false;
        }
        t27 t27Var = (t27) obj;
        return this.f33202a == t27Var.f33202a && Intrinsics.d(this.b, t27Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33202a.hashCode() * 31);
    }

    public final String toString() {
        return "OnHistoryMenuActionClick(historyMenuItem=" + this.f33202a + ", betId=" + this.b + Separators.RPAREN;
    }
}
