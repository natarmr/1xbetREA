package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class z4a {
    public static final y4a Companion = new y4a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43760a;

    public /* synthetic */ z4a(int i, int i2) {
        if (1 == (i & 1)) {
            this.f43760a = i2;
        } else {
            m2x.I(i, 1, x4a.f40255a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4a) && this.f43760a == ((z4a) obj).f43760a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43760a);
    }

    public final String toString() {
        return ua80.e(this.f43760a, "CancelBonusRequest(data=", Separators.RPAREN);
    }

    public z4a(int i) {
        this.f43760a = i;
    }
}
