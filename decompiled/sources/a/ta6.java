package a;

/* JADX INFO: loaded from: classes.dex */
public final class ta6 implements pf00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pf00 f33600a;
    public byte b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public ta6(pf00 pf00Var) {
        this.f33600a = pf00Var;
    }

    public final void a() {
        byte b = this.b;
        if (b == 0) {
            return;
        }
        pf00 pf00Var = this.f33600a;
        if (b == 1) {
            pf00Var.c(this.c, this.d);
        } else if (b == 2) {
            pf00Var.d(this.c, this.d);
        } else if (b == 3) {
            pf00Var.f(this.c, this.d, this.e);
        }
        this.e = null;
        this.b = (byte) 0;
    }

    @Override // a.pf00
    public final void c(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = (byte) 1;
    }

    @Override // a.pf00
    public final void d(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            a();
            this.c = i;
            this.d = i2;
            this.b = (byte) 2;
        }
    }

    @Override // a.pf00
    public final void f(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.e == obj) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = (byte) 3;
    }

    @Override // a.pf00
    public final void g(int i, int i2) {
        a();
        this.f33600a.g(i, i2);
    }
}
