package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32987a;
    public final int b;
    public final int c;

    public sxo0(int i, int i2, int i3) {
        this.f32987a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxo0)) {
            return false;
        }
        sxo0 sxo0Var = (sxo0) obj;
        return this.f32987a == sxo0Var.f32987a && this.b == sxo0Var.b && this.c == sxo0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f32987a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("TeamActionParams(currentTeamId=", this.f32987a, ", gameId=", ", playerId=", this.b));
    }
}
