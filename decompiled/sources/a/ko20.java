package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ko20 extends u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo20 f18609a;

    public ko20(jo20 jo20Var) {
        this.f18609a = jo20Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // a.g4
    public final int b() {
        return this.f18609a.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f18609a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f18609a.f(collection);
    }

    @Override // a.u3
    public final boolean e(Map.Entry entry) {
        Object key = entry.getKey();
        jo20 jo20Var = this.f18609a;
        int iH = jo20Var.h(key);
        if (iH < 0) {
            return false;
        }
        Object[] objArr = jo20Var.b;
        objArr.getClass();
        return Intrinsics.d(objArr[iH], entry.getValue());
    }

    @Override // a.u3
    public final boolean f(Map.Entry entry) {
        jo20 jo20Var = this.f18609a;
        jo20Var.d();
        int iH = jo20Var.h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = jo20Var.b;
        objArr.getClass();
        if (!Intrinsics.d(objArr[iH], entry.getValue())) {
            return false;
        }
        jo20Var.m(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f18609a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new go20(this.f18609a, (byte) 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        this.f18609a.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        this.f18609a.d();
        return super.retainAll(collection);
    }
}
