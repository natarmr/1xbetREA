package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class n4k {
    public static final m4k Companion = new m4k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22901a;

    public /* synthetic */ n4k(int i, long j) {
        if (1 == (i & 1)) {
            this.f22901a = j;
        } else {
            m2x.I(i, 1, l4k.f19410a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4k) && this.f22901a == ((n4k) obj).f22901a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22901a);
    }

    public final String toString() {
        return axq.h(this.f22901a, "DeleteBetSubscriptionRequest(betId=", Separators.RPAREN);
    }

    public n4k(long j) {
        this.f22901a = j;
    }
}
