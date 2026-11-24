package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class gce0 {
    public static final ece0 Companion = new ece0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11057a;
    public final int b;

    public /* synthetic */ gce0(int i, int i2, long j) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, cce0.f4107a.getDescriptor());
            throw null;
        }
        this.f11057a = j;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gce0)) {
            return false;
        }
        gce0 gce0Var = (gce0) obj;
        return this.f11057a == gce0Var.f11057a && this.b == gce0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f11057a) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f11057a, "RealityLimitActionRequest(openTs=", ", actionTypeId=");
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }

    public gce0(long j, int i) {
        this.f11057a = j;
        this.b = i;
    }
}
