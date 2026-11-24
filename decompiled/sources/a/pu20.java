package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pu20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27593a;
    public final String b;
    public final long c;
    public final boolean d;
    public final List e;

    public pu20(long j, String str, long j2, boolean z, List list) {
        this.f27593a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu20)) {
            return false;
        }
        pu20 pu20Var = (pu20) obj;
        return this.f27593a == pu20Var.f27593a && this.b.equals(pu20Var.b) && this.c == pu20Var.c && this.d == pu20Var.d && this.e.equals(pu20Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(rw2.b(ua80.b(Long.hashCode(this.f27593a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f27593a, "MarketGroupModel(id=", ", marketName=", this.b);
        kng0.A(sbO, ", countCols=", this.c, ", isAccuracy=");
        sbO.append(this.d);
        sbO.append(", events=");
        sbO.append(this.e);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
