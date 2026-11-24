package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mb90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21497a;
    public final String b;
    public final int c;
    public final boolean d;

    public mb90(int i, String str, String str2, boolean z) {
        str.getClass();
        this.f21497a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb90)) {
            return false;
        }
        mb90 mb90Var = (mb90) obj;
        return Intrinsics.d(this.f21497a, mb90Var.f21497a) && this.b.equals(mb90Var.b) && this.c == mb90Var.c && this.d == mb90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(this.c, ua80.b(this.f21497a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return ohs0.k(this.c, ", isVisible=", Separators.RPAREN, b1j.n("PayoutUiModel(payoutTitle=", this.f21497a, ", payoutSum=", this.b, ", sumColor="), this.d);
    }
}
