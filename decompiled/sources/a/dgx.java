package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dgx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6064a;
    public final int b;
    public final int c;
    public final int d;

    public dgx(int i, int i2, int i3, int i4) {
        this.f6064a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgx)) {
            return false;
        }
        dgx dgxVar = (dgx) obj;
        return this.f6064a == dgxVar.f6064a && this.b == dgxVar.b && this.c == dgxVar.c && this.d == dgxVar.d;
    }

    public final int hashCode() {
        return (((((this.f6064a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", bottom=", Separators.RPAREN, dw9.t("InsetsValues(left=", this.f6064a, ", top=", ", right=", this.b));
    }
}
