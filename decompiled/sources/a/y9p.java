package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42260a;
    public final d4d b;
    public final d4d c;

    public y9p(int i, d4d d4dVar, d4d d4dVar2) {
        this.f42260a = i;
        this.b = d4dVar;
        this.c = d4dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9p)) {
            return false;
        }
        y9p y9pVar = (y9p) obj;
        return this.f42260a == y9pVar.f42260a && this.b == y9pVar.b && this.c == y9pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.b(this.b, Integer.hashCode(this.f42260a) * 31, 31);
    }

    public final String toString() {
        return "FavoriteIconConfig(iconRes=" + this.f42260a + ", contentColorKey=" + this.b + ", backgroundColorKey=" + this.c + Separators.RPAREN;
    }
}
