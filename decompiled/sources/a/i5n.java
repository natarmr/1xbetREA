package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class i5n implements k5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f14200a;
    public final d4d b;
    public final sul c;
    public final oe9 d;

    public i5n() {
        d4d d4dVar = d4d.STATIC_WHITE;
        d4d d4dVar2 = d4d.STATIC_WHITE60;
        oul oulVar = oul.e;
        oe9 oe9Var = oe9.d;
        this.f14200a = d4dVar;
        this.b = d4dVar2;
        this.c = oulVar;
        this.d = oe9Var;
    }

    @Override // a.k5n
    public final d4d a() {
        return this.b;
    }

    @Override // a.k5n
    public final sul b() {
        return this.c;
    }

    @Override // a.k5n
    public final d4d c() {
        return this.f14200a;
    }

    @Override // a.k5n
    public final oe9 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5n)) {
            return false;
        }
        i5n i5nVar = (i5n) obj;
        return this.f14200a == i5nVar.f14200a && this.b == i5nVar.b && this.c.equals(i5nVar.c) && this.d == i5nVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + dw9.b(this.b, this.f14200a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "Static(labelTint=" + this.f14200a + ", iconTint=" + this.b + ", buttonColorType=" + this.c + ", buttonSize=" + this.d + Separators.RPAREN;
    }
}
