package a;

/* JADX INFO: loaded from: classes.dex */
public final class tmu0 extends vmu0 {
    public final int e;
    public final int f;

    public tmu0(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.e = i;
        this.f = i2;
    }

    @Override // a.vmu0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmu0)) {
            return false;
        }
        tmu0 tmu0Var = (tmu0) obj;
        return this.e == tmu0Var.e && this.f == tmu0Var.f && this.f37689a == tmu0Var.f37689a && this.b == tmu0Var.b && this.c == tmu0Var.c && this.d == tmu0Var.d;
    }

    @Override // a.vmu0
    public final int hashCode() {
        return Integer.hashCode(this.f) + Integer.hashCode(this.e) + super.hashCode();
    }

    public final String toString() {
        return ntm0.d("ViewportHint.Access(\n            |    pageOffset=" + this.e + ",\n            |    indexInPage=" + this.f + ",\n            |    presentedItemsBefore=" + this.f37689a + ",\n            |    presentedItemsAfter=" + this.b + ",\n            |    originalPageOffsetFirst=" + this.c + ",\n            |    originalPageOffsetLast=" + this.d + ",\n            |)");
    }
}
