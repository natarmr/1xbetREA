package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mnj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22091a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;

    public mnj(int i, int i2, int i3, boolean z, boolean z2) {
        this.f22091a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnj)) {
            return false;
        }
        mnj mnjVar = (mnj) obj;
        return this.f22091a == mnjVar.f22091a && this.b == mnjVar.b && this.c == mnjVar.c && this.d == mnjVar.d && this.e == mnjVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + twn.a(this.e, twn.a(this.d, twn.a(this.c, brm0.e(Boolean.hashCode(this.f22091a) * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("NewsMain(fromAggregator=", ", showNavBar=", ", position=", this.f22091a, this.b);
        axq.r(this.c, this.d, ", bannerId=", ", bannerType=", sbQ);
        return rz4.j(this.e, ", hasBackStack=false)", sbQ);
    }
}
