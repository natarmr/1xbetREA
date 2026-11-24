package a;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class pcw0 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26780a;
    public final /* synthetic */ qcw0 b;

    public pcw0(qcw0 qcw0Var, int i) {
        this.b = qcw0Var;
        this.f26780a = i;
    }

    public final int b() {
        int i = this.f26780a;
        if (i == -1) {
            return 0;
        }
        return this.b.b[i];
    }

    public final int c() {
        return this.b.b[this.f26780a + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.f28505a, b(), c(), obj, this.f26780a == -1 ? qcw0.f : rcw0.b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ocw0(this, (byte) 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return c() - b();
    }
}
