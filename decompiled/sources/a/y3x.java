package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y3x extends b3 implements a4x {
    public final i4 b;
    public final int c;
    public final int d;

    public y3x(i4 i4Var, int i, int i2) {
        this.b = i4Var;
        this.c = i;
        zvw.L(i, i2, i4Var.size());
        this.d = i2 - i;
    }

    @Override // a.u1
    public final int b() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zvw.J(i, this.d);
        return this.b.get(this.c + i);
    }

    @Override // a.b3, java.util.List
    public final List subList(int i, int i2) {
        zvw.L(i, i2, this.d);
        int i3 = this.c;
        return new y3x(this.b, i + i3, i3 + i2);
    }
}
