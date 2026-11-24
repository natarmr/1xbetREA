package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rwm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31223a;
    public final long b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public rwm0(long j, long j2, String str, boolean z, boolean z2) {
        str.getClass();
        this.f31223a = j;
        this.b = j2;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwm0)) {
            return false;
        }
        rwm0 rwm0Var = (rwm0) obj;
        return this.f31223a == rwm0Var.f31223a && this.b == rwm0Var.b && Intrinsics.d(this.c, rwm0Var.c) && this.d == rwm0Var.d && this.e == rwm0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(rw2.b(Long.hashCode(this.f31223a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f31223a, "SubGameUiModel(gameId=", ", subGameId=");
        kng0.z(sbQ, this.b, ", name=", this.c);
        w6x.A(", isSpecial=", ", isSelected=", sbQ, this.d, this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
