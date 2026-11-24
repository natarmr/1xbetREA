package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ll60 extends fx3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j93 f20232a;
    public final int b;

    public ll60(int i, j93 j93Var) {
        this.f20232a = j93Var;
        this.b = i;
    }

    @Override // a.fx3
    public final int b() {
        return 1;
    }

    @Override // a.fx3
    public final void c(int i, j93 j93Var) {
        throw new IllegalStateException();
    }

    @Override // a.fx3
    public final Object get(int i) {
        if (i == this.b) {
            return this.f20232a;
        }
        return null;
    }

    @Override // a.fx3, java.lang.Iterable
    public final Iterator iterator() {
        return new kgi0(this, (byte) 2);
    }
}
