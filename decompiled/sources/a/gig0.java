package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f11345a;
    public final short b;
    public final float c;
    public final float d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public gig0(int i, long j) {
        this.f11345a = i;
        this.b = (int) j;
        this.c = 250.0f;
        this.d = 0.53f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gig0)) {
            return false;
        }
        gig0 gig0Var = (gig0) obj;
        return this.f11345a == gig0Var.f11345a && ((long) this.b) == ((long) gig0Var.b) && Float.compare(this.c, gig0Var.c) == 0 && Float.compare(this.d, gig0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(rw2.b(Integer.hashCode(this.f11345a) * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f11345a, this.b, "RpsAnimationParams(duration=", ", totalDuration=");
        sbQ.append(", springStiffness=");
        sbQ.append(this.c);
        sbQ.append(", springDampingRatio=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public /* synthetic */ gig0() {
        this(500, 600L);
    }
}
