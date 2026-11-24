package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class x9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40519a;
    public final d4d b;
    public final d4d c;

    public x9p(int i, d4d d4dVar, d4d d4dVar2) {
        this.f40519a = i;
        this.b = d4dVar;
        this.c = d4dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9p)) {
            return false;
        }
        x9p x9pVar = (x9p) obj;
        return this.f40519a == x9pVar.f40519a && this.b == x9pVar.b && this.c == x9pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.b(this.b, Integer.hashCode(this.f40519a) * 31, 31);
    }

    public final String toString() {
        return "FavoriteIconConfig(iconRes=" + this.f40519a + ", contentColorKey=" + this.b + ", backgroundColorKey=" + this.c + Separators.RPAREN;
    }
}
