package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n5h0 extends p5h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22944a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public n5h0(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f22944a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5h0)) {
            return false;
        }
        n5h0 n5h0Var = (n5h0) obj;
        return Intrinsics.d(this.f22944a, n5h0Var.f22944a) && Intrinsics.d(this.b, n5h0Var.b) && this.c == n5h0Var.c && this.d == n5h0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f22944a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", secondScoreChanged=", Separators.RPAREN, b1j.n("Score(firstScore=", this.f22944a, ", secondScore=", this.b, ", firstScoreChanged="), this.c, this.d);
    }
}
