package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class d5n0 implements Collection, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5516a;
    public final Object b;

    public d5n0() {
        this.f5516a = (byte) 0;
        this.b = ha80.a();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5516a) {
            case 0:
                return ((xy40) this.b).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5516a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f5516a) {
            case 0:
                ((xy40) this.b).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.f5516a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((xy40) obj2).c(obj);
            default:
                return ((hz40) obj2).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.f5516a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((xy40) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((hz40) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        byte b = this.f5516a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((xy40) obj).g == 0;
            default:
                return ((hz40) obj).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5516a) {
            case 0:
                return new sjt(new zy40((xy40) this.b));
            default:
                return igi0.a(new vzn(this, null, (byte) 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5516a) {
            case 0:
                return ((xy40) this.b).h(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5516a) {
            case 0:
                return ((xy40) this.b).h(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f5516a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5516a) {
            case 0:
                return ((xy40) this.b).j(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        byte b = this.f5516a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((xy40) obj).g;
            default:
                return ((hz40) obj).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5516a) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return wha0.W(this, objArr);
    }

    public String toString() {
        switch (this.f5516a) {
            case 1:
                return CollectionsKt.b0(this, null, "[", "]", null, 57);
            default:
                return super.toString();
        }
    }

    public d5n0(hz40 hz40Var) {
        this.f5516a = (byte) 1;
        this.b = hz40Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f5516a) {
            case 0:
                break;
        }
        return wha0.V(this);
    }
}
