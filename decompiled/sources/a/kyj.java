package a;

/* JADX INFO: loaded from: classes.dex */
public final class kyj extends qyj implements Comparable {
    public final int e;
    public final int f;

    public kyj(int i, ccs0 ccs0Var, int i2, nyj nyjVar, int i3) {
        int i4;
        super(i, ccs0Var, i2);
        this.e = j16.n(i3, nyjVar.D) ? 1 : 0;
        androidx.media3.common.b bVar = this.d;
        int i5 = bVar.w;
        int i6 = -1;
        if (i5 != -1 && (i4 = bVar.x) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override // a.qyj
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((kyj) obj).f);
    }
}
