package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class a0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28a;
    public final long b;
    public final boolean c;
    public final HistoryTypeModel d;

    public a0k(String str, long j, boolean z, HistoryTypeModel historyTypeModel) {
        str.getClass();
        historyTypeModel.getClass();
        this.f28a = str;
        this.b = j;
        this.c = z;
        this.d = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0k)) {
            return false;
        }
        a0k a0kVar = (a0k) obj;
        return Intrinsics.d(this.f28a, a0kVar.f28a) && this.b == a0kVar.b && this.c == a0kVar.c && this.d == a0kVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(rw2.b(this.f28a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnAutoSaleClicked(betId=", this.f28a, ", balanceId=");
        sbO.append(", updateHistoryOnExit=");
        sbO.append(this.c);
        sbO.append(", historyTypeModel=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
