package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sd7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f32019a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public sd7(int i, int i2) {
        this.f32019a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd7)) {
            return false;
        }
        sd7 sd7Var = (sd7) obj;
        return this.f32019a == sd7Var.f32019a && this.b == sd7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f32019a) * 31);
    }

    public final String toString() {
        return ohs0.m("FormatParams(maxIntegerPartLength=", this.f32019a, ", maxFractionalPartLength=", Separators.RPAREN, this.b);
    }
}
