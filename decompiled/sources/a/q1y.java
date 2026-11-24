package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q1y implements r1y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27976a;
    public final long b;
    public final String c;
    public final double d;
    public final String e;
    public final String f;

    public q1y(String str, long j, String str2, double d, String str3, String str4) {
        str3.getClass();
        str4.getClass();
        this.f27976a = str;
        this.b = j;
        this.c = str2;
        this.d = d;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1y)) {
            return false;
        }
        q1y q1yVar = (q1y) obj;
        return this.f27976a.equals(q1yVar.f27976a) && this.b == q1yVar.b && this.c.equals(q1yVar.c) && Double.compare(this.d, q1yVar.d) == 0 && Intrinsics.d(this.e, q1yVar.e) && Intrinsics.d(this.f, q1yVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.d(this.d, ua80.b(rw2.b(this.f27976a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ShowSuccessBetDialog(oldMessage=", this.f27976a, ", balanceId=");
        hne.B(sbO, ", ticket=", this.c, ", betSum=");
        hne.w(sbO, this.d, ", betType=", this.e);
        return rw2.o(sbO, ", currency=", this.f, Separators.RPAREN);
    }
}
