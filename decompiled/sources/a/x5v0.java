package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class x5v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40336a;
    public final long b;
    public final ArrayList c;

    public x5v0(long j, long j2, ArrayList arrayList) {
        this.f40336a = j;
        this.b = j2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5v0)) {
            return false;
        }
        x5v0 x5v0Var = (x5v0) obj;
        return this.f40336a == x5v0Var.f40336a && this.b == x5v0Var.b && this.c.equals(x5v0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Long.hashCode(this.f40336a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f40336a, "WeekJackpotInfoModel(fromDate=", ", toDate=");
        sbQ.append(this.b);
        sbQ.append(", winsList=");
        sbQ.append(this.c);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
