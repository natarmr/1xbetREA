package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class fc90 implements kc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9301a;
    public final int b;

    public fc90(int i, int i2) {
        this.f9301a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc90)) {
            return false;
        }
        fc90 fc90Var = (fc90) obj;
        return this.f9301a == fc90Var.f9301a && this.b == fc90Var.b;
    }

    @Override // a.kc90
    public final int getKey() {
        return this.f9301a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f9301a) * 31);
    }

    public final String toString() {
        return ohs0.m("PenaltyHappened(key=", this.f9301a, ", drawableRes=", Separators.RPAREN, this.b);
    }
}
