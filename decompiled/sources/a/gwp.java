package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gwp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12037a;
    public final int b;
    public final int c;

    public gwp(int i, int i2, int i3) {
        this.f12037a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwp)) {
            return false;
        }
        gwp gwpVar = (gwp) obj;
        return this.f12037a == gwpVar.f12037a && this.b == gwpVar.b && this.c == gwpVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f12037a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("FighterRecordModel(wins=", this.f12037a, ", losses=", ", draws=", this.b));
    }
}
