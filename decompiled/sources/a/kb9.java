package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class kb9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18002a;
    public final int b;
    public final int c;

    public kb9(int i, int i2, int i3) {
        this.f18002a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb9)) {
            return false;
        }
        kb9 kb9Var = (kb9) obj;
        return this.f18002a == kb9Var.f18002a && this.b == kb9Var.b && this.c == kb9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f18002a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("BuilderCouponGameKeyModel(gameType=", this.f18002a, ", period=", ", gameVid=", this.b));
    }
}
