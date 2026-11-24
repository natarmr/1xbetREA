package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dp60 implements vp60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6448a;
    public final int b;

    public dp60(int i, int i2) {
        this.f6448a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp60)) {
            return false;
        }
        dp60 dp60Var = (dp60) obj;
        return this.f6448a == dp60Var.f6448a && this.b == dp60Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f6448a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnCurrentCardScrolled(index=", this.f6448a, ", offset=", Separators.RPAREN, this.b);
    }
}
