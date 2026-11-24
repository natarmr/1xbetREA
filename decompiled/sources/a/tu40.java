package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class tu40 {
    public static final su40 Companion = new su40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f34534a;

    public /* synthetic */ tu40(double d, int i) {
        if (1 == (i & 1)) {
            this.f34534a = d;
        } else {
            m2x.I(i, 1, ru40.f31107a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu40) && Double.compare(this.f34534a, ((tu40) obj).f34534a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f34534a);
    }

    public final String toString() {
        return "MoveMoneyRequest(transferAmount=" + this.f34534a + Separators.RPAREN;
    }

    public tu40(double d) {
        this.f34534a = d;
    }
}
