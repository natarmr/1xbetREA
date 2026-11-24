package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bel0 implements del0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2456a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public bel0(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        this.f2456a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bel0)) {
            return false;
        }
        bel0 bel0Var = (bel0) obj;
        return Intrinsics.d(this.f2456a, bel0Var.f2456a) && this.b.equals(bel0Var.b) && this.c == bel0Var.c && this.d == bel0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f2456a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", hastTopIcon=", Separators.RPAREN, b1j.n("GlobalChamp(sportIconUrl=", this.f2456a, ", globalChampIconUrl=", this.b, ", hasCustomSportIcon="), this.c, this.d);
    }
}
