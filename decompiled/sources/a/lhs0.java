package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lhs0 {
    public static final khs0 Companion = new khs0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20073a;

    public /* synthetic */ lhs0(double d, int i) {
        if (1 == (i & 1)) {
            this.f20073a = d;
        } else {
            m2x.I(i, 1, jhs0.f16544a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhs0) && Double.compare(this.f20073a, ((lhs0) obj).f20073a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f20073a);
    }

    public final String toString() {
        return "TransferCashbackRequest(sum=" + this.f20073a + Separators.RPAREN;
    }

    public lhs0(double d) {
        this.f20073a = d;
    }
}
