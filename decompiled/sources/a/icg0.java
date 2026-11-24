package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class icg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14536a;
    public final hcg0 b;

    public icg0(hcg0 hcg0Var, int i) {
        long j = y3d.g;
        hcg0Var = (i & 2) != 0 ? null : hcg0Var;
        this.f14536a = j;
        this.b = hcg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icg0)) {
            return false;
        }
        icg0 icg0Var = (icg0) obj;
        long j = icg0Var.f14536a;
        int i = y3d.h;
        return h2t0.a(this.f14536a, j) && Intrinsics.d(this.b, icg0Var.b);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        int iHashCode = Long.hashCode(this.f14536a) * 31;
        hcg0 hcg0Var = this.b;
        return iHashCode + (hcg0Var != null ? hcg0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        dw9.w(this.f14536a, ", rippleAlpha=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
