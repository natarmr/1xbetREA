package a;

/* JADX INFO: loaded from: classes.dex */
public final class nf80 implements pf00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zi80 f23423a;
    public final fvt0 b;
    public int c;
    public int d;
    public int e;
    public byte f;
    public byte g;

    public nf80(zi80 zi80Var, zi80 zi80Var2, fvt0 fvt0Var) {
        zi80Var.getClass();
        this.f23423a = zi80Var2;
        this.b = fvt0Var;
        this.c = zi80Var.c;
        this.d = zi80Var.d;
        this.e = zi80Var.b;
        this.f = (byte) 1;
        this.g = (byte) 1;
    }

    @Override // a.pf00
    public final void c(int i, int i2) {
        int i3 = this.e;
        fvt0 fvt0Var = this.b;
        if (i >= i3 && this.g != 2) {
            int iMin = Math.min(i2, this.d);
            if (iMin > 0) {
                this.g = (byte) 3;
                fvt0Var.f(this.c + i, iMin, jmk.b);
                this.d -= iMin;
            }
            int i4 = i2 - iMin;
            if (i4 > 0) {
                fvt0Var.c(i + iMin + this.c, i4);
            }
        } else if (i <= 0 && this.f != 2) {
            int iMin2 = Math.min(i2, this.c);
            if (iMin2 > 0) {
                this.f = (byte) 3;
                fvt0Var.f((0 - iMin2) + this.c, iMin2, jmk.b);
                this.c -= iMin2;
            }
            int i5 = i2 - iMin2;
            if (i5 > 0) {
                fvt0Var.c(this.c, i5);
            }
        } else {
            fvt0Var.c(i + this.c, i2);
        }
        this.e += i2;
    }

    @Override // a.pf00
    public final void d(int i, int i2) {
        int i3;
        int i4 = i + i2;
        int i5 = this.e;
        zi80 zi80Var = this.f23423a;
        fvt0 fvt0Var = this.b;
        if (i4 >= i5 && this.g != 3) {
            int iMin = Math.min(zi80Var.d - this.d, i2);
            i3 = iMin >= 0 ? iMin : 0;
            int i6 = i2 - i3;
            if (i3 > 0) {
                this.g = (byte) 2;
                fvt0Var.f(this.c + i, i3, jmk.f16770a);
                this.d += i3;
            }
            if (i6 > 0) {
                fvt0Var.d(i + i3 + this.c, i6);
            }
        } else if (i <= 0 && this.f != 3) {
            int iMin2 = Math.min(zi80Var.c - this.c, i2);
            i3 = iMin2 >= 0 ? iMin2 : 0;
            int i7 = i2 - i3;
            if (i7 > 0) {
                fvt0Var.d(this.c, i7);
            }
            if (i3 > 0) {
                this.f = (byte) 2;
                fvt0Var.f(this.c, i3, jmk.f16770a);
                this.c += i3;
            }
        } else {
            fvt0Var.d(i + this.c, i2);
        }
        this.e -= i2;
    }

    @Override // a.pf00
    public final void f(int i, int i2, Object obj) {
        this.b.f(i + this.c, i2, obj);
    }

    @Override // a.pf00
    public final void g(int i, int i2) {
        int i3 = this.c;
        this.b.g(i + i3, i2 + i3);
    }
}
