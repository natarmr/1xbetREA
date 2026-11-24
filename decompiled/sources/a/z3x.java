package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z3x extends b3 {
    public final j4 b;
    public final int c;
    public final int d;

    public z3x(j4 j4Var, int i, int i2) {
        this.b = j4Var;
        this.c = i;
        bww.D(i, i2, j4Var.size());
        this.d = i2 - i;
    }

    @Override // a.u1
    public final int b() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        bww.A(i, this.d);
        return this.b.get(this.c + i);
    }

    @Override // a.b3, java.util.List
    public final List subList(int i, int i2) {
        bww.D(i, i2, this.d);
        int i3 = this.c;
        return new z3x(this.b, i + i3, i3 + i2);
    }
}
