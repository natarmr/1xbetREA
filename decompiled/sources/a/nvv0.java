package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class nvv0 implements svv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24206a;
    public final int b;

    public nvv0(int i, int i2) {
        this.f24206a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvv0)) {
            return false;
        }
        nvv0 nvv0Var = (nvv0) obj;
        return this.f24206a == nvv0Var.f24206a && this.b == nvv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f24206a) * 31);
    }

    public final String toString() {
        return ohs0.m("Arm(itemBottomPx=", this.f24206a, ", stopLinePx=", Separators.RPAREN, this.b);
    }
}
