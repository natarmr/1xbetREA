package a;

/* JADX INFO: loaded from: classes.dex */
public final class cr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4831a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final fq80 f;
    public final fq80 g;
    public int h;
    public int i;

    public cr8(fq80 fq80Var, fq80 fq80Var2, boolean z) throws kq80 {
        this.g = fq80Var;
        this.f = fq80Var2;
        this.e = z;
        fq80Var2.M(12);
        this.f4831a = fq80Var2.D();
        fq80Var.M(12);
        this.i = fq80Var.D();
        obc.N("first_chunk must be 1", fq80Var.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.f4831a) {
            return false;
        }
        boolean z = this.e;
        fq80 fq80Var = this.f;
        this.d = z ? fq80Var.F() : fq80Var.B();
        if (this.b == this.h) {
            fq80 fq80Var2 = this.g;
            this.c = fq80Var2.D();
            fq80Var2.N(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? fq80Var2.D() - 1 : -1;
        }
        return true;
    }
}
