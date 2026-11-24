package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class r5k {
    public static final q5k Companion = new q5k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29890a;

    public /* synthetic */ r5k(int i, int i2) {
        if (1 == (i & 1)) {
            this.f29890a = i2;
        } else {
            m2x.I(i, 1, p5k.f26407a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5k) && this.f29890a == ((r5k) obj).f29890a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29890a);
    }

    public final String toString() {
        return ua80.e(this.f29890a, "DeleteReferralRequest(referralId=", Separators.RPAREN);
    }

    public r5k(int i) {
        this.f29890a = i;
    }
}
