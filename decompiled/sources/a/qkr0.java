package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qkr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28899a;
    public final int b;

    public qkr0(int i, int i2) {
        this.f28899a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkr0)) {
            return false;
        }
        qkr0 qkr0Var = (qkr0) obj;
        return this.f28899a == qkr0Var.f28899a && this.b == qkr0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f28899a) * 31);
    }

    public final String toString() {
        return ohs0.m("TotoBetOutcomeModel(outcome=", this.f28899a, ", bukPercentage=", Separators.RPAREN, this.b);
    }
}
