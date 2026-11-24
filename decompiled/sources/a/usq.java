package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class usq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36224a;
    public final int b;
    public final int c;

    public usq(int i, int i2, int i3) {
        this.f36224a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usq)) {
            return false;
        }
        usq usqVar = (usq) obj;
        return this.f36224a == usqVar.f36224a && this.b == usqVar.b && this.c == usqVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f36224a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("FootballEventsUiModel(corners=", this.f36224a, ", yellowCards=", ", redCards=", this.b));
    }
}
