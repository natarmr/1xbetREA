package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ing implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15073a;
    public final int b;
    public final int c;

    public ing(int i, int i2, int i3) {
        this.f15073a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ing)) {
            return false;
        }
        ing ingVar = (ing) obj;
        return this.f15073a == ingVar.f15073a && this.b == ingVar.b && this.c == ingVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f15073a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("CardDeck(countCard=", this.f15073a, ", trumpCard=", ", suit=", this.b));
    }
}
