package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ygv implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9k0 f42604a;
    public final int b;
    public int c;
    public final int d;

    public ygv(q9k0 q9k0Var, int i, int i2) {
        this.f42604a = q9k0Var;
        this.b = i2;
        this.c = i;
        this.d = q9k0Var.h;
        if (q9k0Var.g) {
            s9k0.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        q9k0 q9k0Var = this.f42604a;
        int i = q9k0Var.h;
        int i2 = this.d;
        if (i != i2) {
            s9k0.e();
        }
        int i3 = this.c;
        this.c = q9k0Var.f28352a[(i3 * 5) + 3] + i3;
        return new r9k0(q9k0Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
