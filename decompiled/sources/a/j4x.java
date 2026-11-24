package a;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j4x extends f4x implements NavigableSet, Iterable {
    public static final /* synthetic */ int f = 0;
    public final transient Comparator d;
    public transient j4x e;

    public j4x(Comparator comparator) {
        this.d = comparator;
    }

    public static zcf0 r(Comparator comparator) {
        if (s950.b == comparator) {
            return zcf0.h;
        }
        v3x v3xVar = b4x.b;
        return new zcf0(rcf0.e, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.d;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        j4x j4xVarR = this.e;
        if (j4xVarR == null) {
            zcf0 zcf0Var = (zcf0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(zcf0Var.d);
            j4xVarR = zcf0Var.isEmpty() ? r(comparatorReverseOrder) : new zcf0(zcf0Var.g.y(), comparatorReverseOrder);
            this.e = j4xVarR;
            j4xVarR.e = this;
        }
        return j4xVarR;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        zcf0 zcf0Var = (zcf0) this;
        return zcf0Var.t(0, zcf0Var.v(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final zcf0 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        x0x.A(this.d.compare(obj, obj2) <= 0);
        zcf0 zcf0Var = (zcf0) this;
        zcf0 zcf0VarT = zcf0Var.t(zcf0Var.w(obj, z), zcf0Var.g.size());
        return zcf0VarT.t(0, zcf0VarT.v(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        zcf0 zcf0Var = (zcf0) this;
        return zcf0Var.t(zcf0Var.w(obj, true), zcf0Var.g.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        zcf0 zcf0Var = (zcf0) this;
        return zcf0Var.t(0, zcf0Var.v(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        zcf0 zcf0Var = (zcf0) this;
        return zcf0Var.t(zcf0Var.w(obj, z), zcf0Var.g.size());
    }
}
