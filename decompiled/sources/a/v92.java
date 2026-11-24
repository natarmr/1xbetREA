package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v92 implements ea2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37013a;
    public final int b;
    public final int c;

    public v92(int i, int i2, int i3) {
        this.f37013a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v92)) {
            return false;
        }
        v92 v92Var = (v92) obj;
        return this.f37013a == v92Var.f37013a && this.b == v92Var.b && this.c == v92Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f37013a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("OnCalendarChoose(year=", this.f37013a, ", month=", ", dayOfMonth=", this.b));
    }
}
