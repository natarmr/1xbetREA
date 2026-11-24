package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v6y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36898a;
    public final String b;
    public final String c;

    public v6y(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f36898a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6y)) {
            return false;
        }
        v6y v6yVar = (v6y) obj;
        return this.f36898a == v6yVar.f36898a && Intrinsics.d(this.b, v6yVar.b) && Intrinsics.d(this.c, v6yVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f36898a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f36898a, "JackpotPeriodUiModel(titleRes=", ", amount=", this.b, ", currencySymbol="), this.c, Separators.RPAREN);
    }
}
