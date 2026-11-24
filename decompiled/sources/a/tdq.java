package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tdq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33781a;
    public final int[] b;
    public final d3g0[] c;

    public tdq(int i, int i2, int i3, int i4, int[] iArr) {
        this.f33781a = i;
        this.b = iArr;
        float f = i4;
        this.c = new d3g0[]{new d3g0(i2, f), new d3g0(i3, f)};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tdq) && this.f33781a == ((tdq) obj).f33781a;
    }

    public final int hashCode() {
        return this.f33781a;
    }
}
