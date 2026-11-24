package a;

/* JADX INFO: loaded from: classes6.dex */
public final class tzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34803a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public tzh(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f34803a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzh)) {
            return false;
        }
        tzh tzhVar = (tzh) obj;
        return this.f34803a == tzhVar.f34803a && this.b == tzhVar.b && this.c == tzhVar.c && this.d == tzhVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(true) * 31, 31, this.f34803a), 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return ohs0.p(", firstLabel=", ", secondLabel=false)", f140.q("DSAggregatorGiftCardSeparators(timer=true, wager=", ", providers=", ", games=", this.f34803a, this.b), this.c, this.d);
    }
}
