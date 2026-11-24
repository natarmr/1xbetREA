package a;

/* JADX INFO: loaded from: classes.dex */
public final class kcz extends p4 {
    public final icz c;
    public final jbz d;
    public final long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ jbz g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ xx7 j;
    public final /* synthetic */ yx7 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ xcz p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcz(long j, boolean z, icz iczVar, jbz jbzVar, int i, int i2, xx7 xx7Var, yx7 yx7Var, boolean z2, int i3, int i4, long j2, xcz xczVar) {
        super((byte) 6);
        this.f = z;
        this.g = jbzVar;
        this.h = i;
        this.i = i2;
        this.j = xx7Var;
        this.k = yx7Var;
        this.l = z2;
        this.m = i3;
        this.n = i4;
        this.o = j2;
        this.p = xczVar;
        this.c = iczVar;
        this.d = jbzVar;
        this.e = r4e.b(0, z ? p4e.i(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : p4e.h(j), 5);
    }

    public final ncz n1(int i, long j) {
        icz iczVar = this.c;
        Object objD = iczVar.d(i);
        Object objA = iczVar.b.a(i);
        return new ncz(i, z0(this.d, i, j), this.f, this.j, this.k, this.g.b.getLayoutDirection(), this.l, this.m, this.n, i == this.h + (-1) ? 0 : this.i, this.o, objD, objA, this.p.o, j);
    }

    @Override // a.p4
    public final kbz w0(int i, int i2, int i3, long j) {
        return n1(i, j);
    }
}
