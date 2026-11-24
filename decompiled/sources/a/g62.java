package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class g62 implements s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10742a;
    public final int b;
    public final int c;

    public g62(int i, int i2, int i3) {
        this.f10742a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g62)) {
            return false;
        }
        g62 g62Var = (g62) obj;
        return this.f10742a == g62Var.f10742a && this.b == g62Var.b && this.c == g62Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f10742a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("OnCalendarChoose(year=", this.f10742a, ", month=", ", dayOfMonth=", this.b));
    }
}
