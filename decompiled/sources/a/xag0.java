package a;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xag0 implements ListIterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40553a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public xag0(ah30 ah30Var, int i) {
        this.c = ah30Var;
        this.b = ((List) ah30Var.c).listIterator(x3d.C(i, ah30Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f40553a) {
            case 0:
                ListIterator listIterator = (ListIterator) this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f40553a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((kie0) obj).f18333a < ((ezm0) this.c).d - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        byte b = this.f40553a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                return ((kie0) obj).f18333a >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.f40553a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                kie0 kie0Var = (kie0) obj;
                int i = kie0Var.f18333a + 1;
                ezm0 ezm0Var = (ezm0) this.c;
                p8a.i0(i, ezm0Var.d);
                kie0Var.f18333a = i;
                return ezm0Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        byte b = this.f40553a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((yag0) obj).size();
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((ah30) obj).size();
                break;
            default:
                return ((kie0) obj2).f18333a + 1;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.f40553a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                kie0 kie0Var = (kie0) obj;
                int i = kie0Var.f18333a;
                ezm0 ezm0Var = (ezm0) this.c;
                p8a.i0(i, ezm0Var.d);
                kie0Var.f18333a = i - 1;
                return ezm0Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        byte b = this.f40553a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((yag0) obj).size();
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((ah30) obj).size();
                break;
            default:
                return ((kie0) obj2).f18333a;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f40553a) {
            case 0:
                ((ListIterator) this.b).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f40553a) {
            case 0:
                ((ListIterator) this.b).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public xag0(yag0 yag0Var, int i) {
        this.c = yag0Var;
        this.b = yag0Var.f42296a.listIterator(x3d.C(i, yag0Var));
    }

    public xag0(kie0 kie0Var, ezm0 ezm0Var) {
        this.b = kie0Var;
        this.c = ezm0Var;
    }
}
