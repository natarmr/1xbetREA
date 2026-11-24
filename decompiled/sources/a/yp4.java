package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yp4 implements zp4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43013a;
    public final long b;

    public yp4(long j, long j2) {
        this.f43013a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp4)) {
            return false;
        }
        yp4 yp4Var = (yp4) obj;
        return this.f43013a == yp4Var.f43013a && this.b == yp4Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f43013a) * 31);
    }

    public final String toString() {
        return brm0.k(this.b, Separators.RPAREN, kng0.q(this.f43013a, "ShowDatePicker(startDate=", ", defaultFromDateInSec="));
    }
}
