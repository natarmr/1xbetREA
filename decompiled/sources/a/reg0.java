package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class reg0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qeg0 f30333a;
    public eg9 b;
    public int c;

    public reg0(seg0 seg0Var) {
        qeg0 qeg0Var = new qeg0(seg0Var);
        this.f30333a = qeg0Var;
        this.b = new eg9(qeg0Var.next());
        this.c = seg0Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = new eg9(this.f30333a.next());
        }
        this.c--;
        return Byte.valueOf(this.b.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
