package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jzk0 {
    public static final izk0 Companion = new izk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17418a;
    public final long b;

    public /* synthetic */ jzk0(int i, long j, boolean z) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, hzk0.f13911a.getDescriptor());
            throw null;
        }
        this.f17418a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzk0)) {
            return false;
        }
        jzk0 jzk0Var = (jzk0) obj;
        return this.f17418a == jzk0Var.f17418a && this.b == jzk0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.f17418a) * 31);
    }

    public final String toString() {
        return "SpinWheelRequest(freeSpin=" + this.f17418a + ", walletId=" + this.b + Separators.RPAREN;
    }

    public jzk0(boolean z, long j) {
        this.f17418a = z;
        this.b = j;
    }
}
