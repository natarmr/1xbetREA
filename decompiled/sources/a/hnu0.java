package a;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class hnu0 extends ewq {
    public final String b;
    public int c;

    public hnu0(n0a n0aVar) {
        super(n0aVar);
        this.b = "virtual-" + n0aVar.e() + "-" + UUID.randomUUID().toString();
    }

    @Override // a.ewq, a.j0a
    public final int B(int i) {
        return jls0.i(this.f8539a.B(i) - this.c);
    }

    @Override // a.ewq, a.j0a
    public final int d() {
        return B(0);
    }

    @Override // a.ewq, a.n0a
    public final String e() {
        return this.b;
    }
}
