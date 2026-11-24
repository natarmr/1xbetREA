package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31962a;
    public final String b;
    public final long c;
    public final String d;
    public final double e;
    public final boolean f;

    public sc(double d, long j, long j2, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f31962a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = d;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc)) {
            return false;
        }
        sc scVar = (sc) obj;
        return this.f31962a == scVar.f31962a && Intrinsics.d(this.b, scVar.b) && this.c == scVar.c && Intrinsics.d(this.d, scVar.d) && Double.compare(this.e, scVar.e) == 0 && this.f == scVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.d(this.e, ua80.b(rw2.b(ua80.b(Long.hashCode(this.f31962a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31962a, "AccountActionsState(balanceId=", ", balanceName=", this.b);
        kng0.A(sbO, ", currencyId=", this.c, ", currencySymbol=");
        hne.A(sbO, this.d, ", money=", this.e);
        return f140.n(sbO, ", deletable=", this.f, Separators.RPAREN);
    }
}
