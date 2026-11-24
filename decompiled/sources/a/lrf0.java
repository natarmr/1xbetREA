package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lrf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20530a;
    public final int b;

    public lrf0(int i, int i2) {
        this.f20530a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrf0)) {
            return false;
        }
        lrf0 lrf0Var = (lrf0) obj;
        return this.f20530a == lrf0Var.f20530a && this.b == lrf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f20530a) * 31);
    }

    public final String toString() {
        return ohs0.m("StepsSize(width=", this.f20530a, ", height=", Separators.RPAREN, this.b);
    }
}
