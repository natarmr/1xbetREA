package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lmp0 {
    public static final lmp0 d = new lmp0(0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20309a;
    public final int b;
    public final int c;

    public lmp0(int i, int i2, int i3) {
        this.f20309a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmp0)) {
            return false;
        }
        lmp0 lmp0Var = (lmp0) obj;
        return this.f20309a == lmp0Var.f20309a && this.b == lmp0Var.b && this.c == lmp0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f20309a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("TeamStatsModel(penaltiesConceded=", this.f20309a, ", redCards=", ", yellowCards=", this.b));
    }
}
