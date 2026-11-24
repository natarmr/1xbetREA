package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18094a;
    public final boolean b;
    public final long c;
    public final tnp0 d;

    public kd90(long j, boolean z, long j2, tnp0 tnp0Var) {
        tnp0Var.getClass();
        this.f18094a = j;
        this.b = z;
        this.c = j2;
        this.d = tnp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd90)) {
            return false;
        }
        kd90 kd90Var = (kd90) obj;
        return this.f18094a == kd90Var.f18094a && this.b == kd90Var.b && this.c == kd90Var.c && Intrinsics.d(this.d, kd90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(brm0.e(Long.hashCode(this.f18094a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f18094a, "PendingTeamModel(id=", ", adding=", this.b);
        kng0.A(sbR, ", lockTimestamp=", this.c, ", teamType=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
