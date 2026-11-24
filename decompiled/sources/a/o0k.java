package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class o0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24429a;
    public final long b;
    public final HistoryTypeModel c;

    public o0k(String str, long j, HistoryTypeModel historyTypeModel) {
        str.getClass();
        historyTypeModel.getClass();
        this.f24429a = str;
        this.b = j;
        this.c = historyTypeModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0k)) {
            return false;
        }
        o0k o0kVar = (o0k) obj;
        return Intrinsics.d(this.f24429a, o0kVar.f24429a) && this.b == o0kVar.b && this.c == o0kVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f24429a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "OnSaleClicked(betId=", this.f24429a, ", balanceId=");
        sbO.append(", historyTypeModel=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
