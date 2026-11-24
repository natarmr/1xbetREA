package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r9k0 implements pld, Iterable, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q9k0 f30087a;
    public final int b;
    public final int c;

    public r9k0(q9k0 q9k0Var, int i, int i2) {
        this.f30087a = q9k0Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r9k0)) {
            return false;
        }
        r9k0 r9k0Var = (r9k0) obj;
        return r9k0Var.b == this.b && r9k0Var.c == this.c && r9k0Var.f30087a == this.f30087a;
    }

    public final int hashCode() {
        return (this.f30087a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        q9k0 q9k0Var = this.f30087a;
        if (q9k0Var.h != this.c) {
            s9k0.e();
        }
        int i = this.b;
        q9k0Var.k(i);
        return new ygv(q9k0Var, i + 1, q9k0Var.f28352a[(i * 5) + 3] + i);
    }
}
