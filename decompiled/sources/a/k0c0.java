package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k0c0 implements u0c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17459a;
    public final int b;
    public final int c;

    public k0c0(int i, int i2, int i3) {
        this.f17459a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0c0)) {
            return false;
        }
        k0c0 k0c0Var = (k0c0) obj;
        return this.f17459a == k0c0Var.f17459a && this.b == k0c0Var.b && this.c == k0c0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f17459a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("OnBirthDayDateSelected(year=", this.f17459a, ", month=", ", day=", this.b));
    }
}
