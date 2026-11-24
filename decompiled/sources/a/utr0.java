package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class utr0 implements vtr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36268a;
    public final int b;

    public utr0(int i, int i2) {
        this.f36268a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utr0)) {
            return false;
        }
        utr0 utr0Var = (utr0) obj;
        return this.f36268a == utr0Var.f36268a && this.b == utr0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f36268a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnOutcomeChipClick(blockPosition=", this.f36268a, ", chipPosition=", Separators.RPAREN, this.b);
    }
}
