package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21a;
    public final long b;
    public final boolean c;

    public a0d(String str, long j, boolean z) {
        str.getClass();
        this.f21a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0d)) {
            return false;
        }
        a0d a0dVar = (a0d) obj;
        return Intrinsics.d(this.f21a, a0dVar.f21a) && this.b == a0dVar.b && this.c == a0dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(this.f21a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(f140.o(this.b, "CoeffUiModel(coeff=", this.f21a, ", sportId="), ", isBonus=", this.c, Separators.RPAREN);
    }
}
