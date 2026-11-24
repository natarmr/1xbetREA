package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cel0 implements eel0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4219a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public cel0(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.f4219a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cel0)) {
            return false;
        }
        cel0 cel0Var = (cel0) obj;
        return Intrinsics.d(this.f4219a, cel0Var.f4219a) && this.b.equals(cel0Var.b) && this.c == cel0Var.c && this.d == cel0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f4219a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", hastTopIcon=", Separators.RPAREN, b1j.n("GlobalChamp(sportIconUrl=", this.f4219a, ", globalChampIconUrl=", this.b, ", hasCustomSportIcon="), this.c, this.d);
    }
}
