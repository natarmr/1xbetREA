package a;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class s3 extends k3 implements ListIterator {
    public final /* synthetic */ t3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(t3 t3Var, int i) {
        super(t3Var, ((List) t3Var.b).listIterator(i));
        this.e = t3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        t3 t3Var = this.e;
        boolean zIsEmpty = t3Var.isEmpty();
        b().add(obj);
        t3Var.f.e++;
        if (zIsEmpty) {
            t3Var.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(t3 t3Var) {
        super(t3Var);
        this.e = t3Var;
    }
}
