package a;

/* JADX INFO: loaded from: classes.dex */
public final class sx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32952a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final Object f;

    public sx2(int i, woq woqVar, long j, int i2, int i3, int i4) {
        this.f32952a = i;
        this.f = woqVar;
        this.b = j;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public wvb a(soq soqVar, boolean z, int i, int i2, int i3, int i4) {
        if (!soqVar.b) {
            return null;
        }
        ((woq) this.f).getClass();
        voq voqVar = voq.f37778a;
        return null;
    }

    public soq b(boolean z, int i, long j, akx akxVar, int i2, int i3, int i4, boolean z2, boolean z3) {
        woq woqVar = (woq) this.f;
        int i5 = i3 + i4;
        if (akxVar == null) {
            return new soq(true, true);
        }
        long j2 = akxVar.f1044a;
        woqVar.getClass();
        voq voqVar = voq.f37778a;
        voq voqVar2 = voq.f37778a;
        if (i2 >= this.c || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new soq(true, true);
        }
        if (i != 0 && (i >= this.f32952a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new soq(true, true) : new soq(true, b(z, 0, akx.a(p4e.i(this.b), (((int) (j & 4294967295L)) - this.e) - i4), new akx(akx.a(((int) (j2 >> 32)) - this.d, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
        }
        return new soq(false, false);
    }

    public sx2(tai0 tai0Var, int i, int i2, int i3, int i4, long j) {
        this.f = tai0Var;
        this.f32952a = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.b = j;
    }
}
