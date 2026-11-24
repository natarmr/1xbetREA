package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class f0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8721a;
    public final BetHistoryScreenModel b;

    public f0k(String str, BetHistoryScreenModel betHistoryScreenModel) {
        str.getClass();
        this.f8721a = str;
        this.b = betHistoryScreenModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0k)) {
            return false;
        }
        f0k f0kVar = (f0k) obj;
        return Intrinsics.d(this.f8721a, f0kVar.f8721a) && this.b.equals(f0kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8721a.hashCode() * 31);
    }

    public final String toString() {
        return "OnHistoryItemClick(betId=" + this.f8721a + ", betHistoryScreenModel=" + this.b + Separators.RPAREN;
    }
}
