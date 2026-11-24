package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class hez implements kbz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12949a;
    public final Object b;
    public final List c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final Object i;
    public final dbz j;
    public final long k;
    public boolean l = true;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public final long v;
    public long w;

    public hez(int i, Object obj, List list, boolean z, int i2, int i3, int i4, int i5, int i6, Object obj2, dbz dbzVar, long j) {
        int i7;
        int i8;
        int i9;
        this.f12949a = i;
        this.b = obj;
        this.c = list;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = obj2;
        this.j = dbzVar;
        this.k = j;
        int i10 = 1;
        if (!list.isEmpty()) {
            pu90 pu90Var = (pu90) list.get(0);
            i7 = z ? pu90Var.b : pu90Var.f27604a;
            int size = list.size() - 1;
            if (1 <= size) {
                int i11 = 1;
                while (true) {
                    pu90 pu90Var2 = (pu90) list.get(i11);
                    int i12 = this.d ? pu90Var2.b : pu90Var2.f27604a;
                    i7 = i12 > i7 ? i12 : i7;
                    if (i11 == size) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        this.m = i7;
        List list2 = this.c;
        if (!list2.isEmpty()) {
            pu90 pu90Var3 = (pu90) list2.get(0);
            i8 = this.d ? pu90Var3.f27604a : pu90Var3.b;
            int size2 = list2.size() - 1;
            if (1 <= size2) {
                while (true) {
                    pu90 pu90Var4 = (pu90) list2.get(i10);
                    int i13 = this.d ? pu90Var4.f27604a : pu90Var4.b;
                    i8 = i13 > i8 ? i13 : i8;
                    if (i10 == size2) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            i8 = 0;
        }
        this.r = Integer.MIN_VALUE;
        boolean z2 = this.d;
        if (z2) {
            this.q = i2;
            i9 = this.m;
            this.o = i9;
            this.n = i8;
            this.p = 0;
        } else {
            this.q = 0;
            this.o = i8;
            i9 = this.m;
            this.n = i9;
            this.p = i2;
        }
        this.v = z2 ? (((long) i9) & 4294967295L) | (((long) i8) << 32) : (((long) i9) << 32) | (((long) i8) & 4294967295L);
        this.w = 0L;
    }

    @Override // a.kbz
    public final void a(int i, int i2, int i3, int i4) {
        if (this.d) {
            i3 = i4;
        }
        o(i, i2, i3);
    }

    @Override // a.kbz
    public final int b() {
        return this.f;
    }

    @Override // a.kbz
    public final int c() {
        return this.o;
    }

    @Override // a.kbz
    public final long d() {
        return this.k;
    }

    @Override // a.kbz
    public final void e() {
        this.u = true;
    }

    @Override // a.kbz
    public final int f() {
        return this.p;
    }

    @Override // a.kbz
    public final List g() {
        return this.c;
    }

    @Override // a.kbz
    public final int getIndex() {
        return this.f12949a;
    }

    @Override // a.kbz
    public final Object getKey() {
        return this.b;
    }

    @Override // a.kbz
    public final int h() {
        return this.q;
    }

    @Override // a.kbz
    public final long i(int i) {
        return this.w;
    }

    @Override // a.kbz
    public final int j() {
        return this.e;
    }

    @Override // a.kbz
    public final int k() {
        return this.n;
    }

    public final int l(long j) {
        return (int) (this.d ? j & 4294967295L : j >> 32);
    }

    public final int m() {
        long j = this.w;
        return (int) (!this.d ? j >> 32 : j & 4294967295L);
    }

    public final int n() {
        int i;
        int i2;
        if (this.d) {
            i = this.o;
            i2 = this.q;
        } else {
            i = this.n;
            i2 = this.p;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public final void o(int i, int i2, int i3) {
        long j;
        this.r = i3;
        this.s = -this.g;
        this.t = i3 + this.h;
        if (this.d) {
            j = (((long) i2) << 32) | (4294967295L & ((long) i));
        } else {
            j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        this.w = j;
    }
}
