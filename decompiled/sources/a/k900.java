package a;

/* JADX INFO: loaded from: classes2.dex */
public final class k900 extends u06 {
    public int q;
    public int r;
    public boolean s;
    public int t;
    public Integer u;
    public int v;
    public float w;
    public boolean x;
    public boolean y;

    @Override // a.u06
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // a.u06
    public final void d() {
        super.d();
        if (this.t < 0) {
            jf4.o("Stop indicator size must be >= 0.");
            return;
        }
        if (this.q == 0) {
            if ((a() > 0 || (this.y && e() > 0)) && this.i == 0) {
                jf4.o("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.e.length >= 3) {
                    return;
                }
                jf4.o("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        if (this.y) {
            return this.x ? (int) (this.f34840a * this.w) : this.v;
        }
        return a();
    }
}
