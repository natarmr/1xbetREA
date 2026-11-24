package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rs00 implements Collection, khy {
    public static final rs00 c = new rs00(iun.f15405a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31011a;
    public final int b;

    public rs00(List list) {
        this.f31011a = list;
        this.b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof qs00)) {
            return false;
        }
        return this.f31011a.contains((qs00) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f31011a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rs00) {
            return Intrinsics.d(this.f31011a, ((rs00) obj).f31011a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f31011a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f31011a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f31011a.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return wha0.V(this);
    }

    public final String toString() {
        return twn.r(this.f31011a, "LocaleList(localeList=", Separators.RPAREN);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wha0.W(this, objArr);
    }
}
