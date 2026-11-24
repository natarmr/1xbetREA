package a;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class z2 extends y2 implements ListIterator {
    public final /* synthetic */ b3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(b3 b3Var, int i) {
        super(b3Var, (byte) 0);
        this.d = b3Var;
        x2 x2Var = b3.f1878a;
        int iB = b3Var.b();
        x2Var.getClass();
        x2.c(i, iB);
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            itt0.a();
            return null;
        }
        int i = this.b - 1;
        this.b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
