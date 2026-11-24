package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class jc90 implements oc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16266a;
    public final int b;

    public jc90(int i, int i2) {
        this.f16266a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc90)) {
            return false;
        }
        jc90 jc90Var = (jc90) obj;
        return this.f16266a == jc90Var.f16266a && this.b == jc90Var.b;
    }

    @Override // a.oc90
    public final int getKey() {
        return this.f16266a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f16266a) * 31);
    }

    public final String toString() {
        return ohs0.m("PenaltyHappened(key=", this.f16266a, ", drawableRes=", Separators.RPAREN, this.b);
    }
}
