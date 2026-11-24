package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f22676a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public n0(Long l, Long l2, String str, String str2, String str3, String str4, boolean z) {
        this.f22676a = l;
        this.b = l2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f22676a, n0Var.f22676a) && Intrinsics.d(this.b, n0Var.b) && this.c.equals(n0Var.c) && this.d.equals(n0Var.d) && this.e.equals(n0Var.e) && this.f.equals(n0Var.f) && this.g == n0Var.g;
    }

    public final int hashCode() {
        Long l = this.f22676a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return Boolean.hashCode(this.g) + ua80.b(ua80.b(ua80.b(ua80.b((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = rz4.o(this.f22676a, this.b, "AboutTournamentWithDataModel(startedAtStamp=", ", endedAtStamp=", ", type=");
        f140.v(sbO, this.c, ", location=", this.d, ", description=");
        f140.v(sbO, this.e, ", prizePool=", this.f, ", isExpanded=");
        return rw2.p(sbO, this.g, Separators.RPAREN);
    }
}
