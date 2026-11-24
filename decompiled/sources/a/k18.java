package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class k18 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17508a;
    public final int b;

    public k18(int i, int i2) {
        this.f17508a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k18)) {
            return false;
        }
        k18 k18Var = (k18) obj;
        return this.f17508a == k18Var.f17508a && this.b == k18Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f17508a) * 31);
    }

    public final String toString() {
        return ohs0.m("BigPigThrowModel(firstDice=", this.f17508a, ", secondDice=", Separators.RPAREN, this.b);
    }
}
