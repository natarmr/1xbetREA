package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class aej {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f732a;
    public final int b;
    public final int c;

    public aej(int i, int i2, int i3) {
        this.f732a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aej)) {
            return false;
        }
        aej aejVar = (aej) obj;
        return this.f732a == aejVar.f732a && this.b == aejVar.b && this.c == aejVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f732a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("SimpleDate(year=", this.f732a, ", month=", ", day=", this.b));
    }
}
