package a;

/* JADX INFO: loaded from: classes.dex */
public class scs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32003a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final b4x i;
    public final b4x j;
    public final b4x k;
    public final b4x l;
    public final b4x m;
    public final int n;
    public final int o;
    public final b4x p;
    public final qcs0 q;
    public final b4x r;
    public final b4x s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final wcf0 w;
    public final f4x x;

    static {
        new scs0(new rcs0());
        vtt0.H(1);
        vtt0.H(2);
        vtt0.H(3);
        vtt0.H(4);
        hne.s(5, 6, 7, 8, 9);
        hne.s(10, 11, 12, 13, 14);
        hne.s(15, 16, 17, 18, 19);
        hne.s(20, 21, 22, 23, 24);
        hne.s(25, 26, 27, 28, 29);
        hne.s(30, 31, 32, 33, 34);
        vtt0.H(35);
        vtt0.H(36);
        vtt0.H(37);
        vtt0.H(38);
    }

    public scs0(rcs0 rcs0Var) {
        this.f32003a = rcs0Var.f30255a;
        this.b = rcs0Var.b;
        this.c = rcs0Var.c;
        this.d = rcs0Var.d;
        this.e = rcs0Var.e;
        this.f = rcs0Var.f;
        this.g = rcs0Var.g;
        this.h = rcs0Var.h;
        this.i = rcs0Var.i;
        this.j = rcs0Var.j;
        this.k = rcs0Var.k;
        this.l = rcs0Var.l;
        this.n = rcs0Var.n;
        this.m = rcs0Var.m;
        this.o = rcs0Var.o;
        this.p = rcs0Var.p;
        this.q = rcs0Var.q;
        this.r = rcs0Var.r;
        this.t = rcs0Var.s;
        this.s = rcs0Var.t;
        this.u = rcs0Var.u;
        this.v = rcs0Var.v;
        this.w = wcf0.b(rcs0Var.w);
        this.x = f4x.m(rcs0Var.x);
    }

    public rcs0 a() {
        rcs0 rcs0Var = new rcs0();
        rcs0Var.c(this);
        return rcs0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        scs0 scs0Var = (scs0) obj;
        return this.f32003a == scs0Var.f32003a && this.b == scs0Var.b && this.c == scs0Var.c && this.d == scs0Var.d && this.h == scs0Var.h && this.e == scs0Var.e && this.f == scs0Var.f && this.g == scs0Var.g && this.i.equals(scs0Var.i) && this.j.equals(scs0Var.j) && this.k.equals(scs0Var.k) && this.l.equals(scs0Var.l) && this.n == scs0Var.n && this.m.equals(scs0Var.m) && this.o == scs0Var.o && this.p.equals(scs0Var.p) && this.q.equals(scs0Var.q) && this.s.equals(scs0Var.s) && this.r.equals(scs0Var.r) && this.t == scs0Var.t && this.u == scs0Var.u && this.v == scs0Var.v && k9x.I(this.w, scs0Var.w) && this.x.equals(scs0Var.x);
    }

    public int hashCode() {
        int iHashCode = (this.p.hashCode() + ((((this.m.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.f32003a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31;
        this.q.getClass();
        return this.x.hashCode() + ((this.w.hashCode() + ((((((this.s.hashCode() + ((((this.r.hashCode() + ((iHashCode + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 31) + this.u) * 923521) + (this.v ? 1 : 0)) * 31)) * 31);
    }
}
