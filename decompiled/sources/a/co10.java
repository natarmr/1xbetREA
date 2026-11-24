package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class co10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csr f4680a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;

    public co10(int i, int i2, csr csrVar, String str, boolean z) {
        this.f4680a = csrVar;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co10)) {
            return false;
        }
        co10 co10Var = (co10) obj;
        return this.f4680a.equals(co10Var.f4680a) && this.b == co10Var.b && this.c.equals(co10Var.c) && this.d == co10Var.d && this.e == co10Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, ua80.b(twn.a(this.b, this.f4680a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LuckyWheelPrizeUiItem(bonus=");
        sb.append(this.f4680a);
        sb.append(", iconResId=");
        sb.append(this.b);
        sb.append(", message=");
        twn.w(this.d, this.c, ", count=", ", clickable=", sb);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
