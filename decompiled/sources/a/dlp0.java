package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dlp0 {
    public static final dlp0 d = new dlp0(0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6296a;
    public final int b;
    public final int c;

    public dlp0(int i, int i2, int i3) {
        this.f6296a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlp0)) {
            return false;
        }
        dlp0 dlp0Var = (dlp0) obj;
        return this.f6296a == dlp0Var.f6296a && this.b == dlp0Var.b && this.c == dlp0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f6296a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("TeamStatModel(goals=", this.f6296a, ", redCards=", ", yellowCards=", this.b));
    }
}
