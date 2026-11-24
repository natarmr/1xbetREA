package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j5n implements k5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f15940a;
    public final d4d b;
    public final sul c;
    public final oe9 d;

    public j5n() {
        d4d d4dVar = d4d.TEXT_PRIMARY;
        d4d d4dVar2 = d4d.SECONDARY;
        mul mulVar = mul.e;
        oe9 oe9Var = oe9.d;
        this.f15940a = d4dVar;
        this.b = d4dVar2;
        this.c = mulVar;
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
        return this.f15940a;
    }

    @Override // a.k5n
    public final oe9 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5n)) {
            return false;
        }
        j5n j5nVar = (j5n) obj;
        return this.f15940a == j5nVar.f15940a && this.b == j5nVar.b && this.c.equals(j5nVar.c) && this.d == j5nVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + dw9.b(this.b, this.f15940a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "Theme(labelTint=" + this.f15940a + ", iconTint=" + this.b + ", buttonColorType=" + this.c + ", buttonSize=" + this.d + Separators.RPAREN;
    }
}
