package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class sm7 implements vm7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32430a;
    public final long b;
    public final boolean c;
    public final boolean d;

    public sm7(long j, long j2, boolean z, boolean z2) {
        this.f32430a = j;
        this.b = j2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm7)) {
            return false;
        }
        sm7 sm7Var = (sm7) obj;
        return this.f32430a == sm7Var.f32430a && this.b == sm7Var.b && this.c == sm7Var.c && this.d == sm7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(rw2.b(Long.hashCode(this.f32430a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f32430a, "FavouriteClick(sportId=", ", subSportId=");
        hne.t(this.b, ", live=", sbQ, this.c);
        return f140.n(sbQ, ", added=", this.d, Separators.RPAREN);
    }
}
