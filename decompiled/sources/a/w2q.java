package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38463a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public w2q(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f38463a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2q)) {
            return false;
        }
        w2q w2qVar = (w2q) obj;
        return Intrinsics.d(this.f38463a, w2qVar.f38463a) && this.b == w2qVar.b && this.c == w2qVar.c && this.d == w2qVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f38463a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isEnabled=", Separators.RPAREN, brm0.u("FilterButtonUiModel(filterButtonTitle=", this.f38463a, ", isFilterButtonVisible=", this.b, ", isActiveFilter="), this.c, this.d);
    }
}
