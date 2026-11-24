package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uoa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36003a;
    public final int b;

    public uoa0(int i, int i2) {
        this.f36003a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoa0)) {
            return false;
        }
        uoa0 uoa0Var = (uoa0) obj;
        return this.f36003a == uoa0Var.f36003a && this.b == uoa0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f36003a) * 31);
    }

    public final String toString() {
        return ohs0.m("PointUiModel(x=", this.f36003a, ", y=", Separators.RPAREN, this.b);
    }
}
