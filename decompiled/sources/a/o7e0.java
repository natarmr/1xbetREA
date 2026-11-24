package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o7e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sff0 f24783a;
    public final h7e0 b;
    public final kgz c;
    public final j0g0 d;
    public final boolean e;

    public o7e0(sff0 sff0Var, h7e0 h7e0Var, kgz kgzVar, j0g0 j0g0Var, boolean z) {
        this.f24783a = sff0Var;
        this.b = h7e0Var;
        this.c = kgzVar;
        this.d = j0g0Var;
        this.e = z;
    }

    public static o7e0 a(o7e0 o7e0Var, h7e0 h7e0Var, kgz kgzVar, j0g0 j0g0Var, boolean z, int i) {
        h7e0 h7e0Var2 = h7e0Var;
        sff0 sff0Var = o7e0Var.f24783a;
        if ((i & 2) != 0) {
            h7e0Var2 = o7e0Var.b;
        }
        if ((i & 4) != 0) {
            kgzVar = o7e0Var.c;
        }
        if ((i & 8) != 0) {
            j0g0Var = o7e0Var.d;
        }
        if ((i & 16) != 0) {
            z = o7e0Var.e;
        }
        boolean z2 = z;
        o7e0Var.getClass();
        j0g0 j0g0Var2 = j0g0Var;
        return new o7e0(sff0Var, h7e0Var2, kgzVar, j0g0Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7e0)) {
            return false;
        }
        o7e0 o7e0Var = (o7e0) obj;
        return this.f24783a.equals(o7e0Var.f24783a) && this.b.equals(o7e0Var.b) && this.c == o7e0Var.c && Intrinsics.d(this.d, o7e0Var.d) && this.e == o7e0Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f24783a.hashCode() * 31)) * 31)) * 31;
        j0g0 j0g0Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (j0g0Var == null ? 0 : j0g0.b(j0g0Var.f15681a))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RatingStateModel(remoteConfigModel=");
        sb.append(this.f24783a);
        sb.append(", currentSegment=");
        sb.append(this.b);
        sb.append(", gender=");
        sb.append(this.c);
        sb.append(", leaderboardResult=");
        sb.append(this.d);
        sb.append(", connected=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
