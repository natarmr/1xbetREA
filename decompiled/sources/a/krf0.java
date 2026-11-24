package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class krf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18763a;
    public final int b;

    public krf0(int i, int i2) {
        this.f18763a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krf0)) {
            return false;
        }
        krf0 krf0Var = (krf0) obj;
        return this.f18763a == krf0Var.f18763a && this.b == krf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f18763a) * 31);
    }

    public final String toString() {
        return ohs0.m("MarginHorizontal(leftMargin=", this.f18763a, ", rightMargin=", Separators.RPAREN, this.b);
    }
}
