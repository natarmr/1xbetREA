package a;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ix3 extends fx3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f15521a;
    public int b;

    @Override // a.fx3
    public final int b() {
        return this.b;
    }

    @Override // a.fx3
    public final void c(int i, j93 j93Var) {
        Object[] objArrCopyOf = this.f15521a;
        if (objArrCopyOf.length <= i) {
            int length = objArrCopyOf.length;
            do {
                length *= 2;
            } while (length <= i);
            objArrCopyOf = Arrays.copyOf(this.f15521a, length);
            this.f15521a = objArrCopyOf;
        }
        if (objArrCopyOf[i] == null) {
            this.b++;
        }
        objArrCopyOf[i] = j93Var;
    }

    @Override // a.fx3
    public final Object get(int i) {
        return tx3.G(i, this.f15521a);
    }

    @Override // a.fx3, java.lang.Iterable
    public final Iterator iterator() {
        return new hx3(this);
    }
}
