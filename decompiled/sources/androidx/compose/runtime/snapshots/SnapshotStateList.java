package androidx.compose.runtime.snapshots;

import a.b8m0;
import a.dsb0;
import a.e8m0;
import a.ezm0;
import a.h4;
import a.ii90;
import a.j4;
import a.lgk0;
import a.mak0;
import a.mhy;
import a.p8a;
import a.paw;
import a.rfk0;
import a.wha0;
import a.x7m0;
import a.x8v;
import a.xfk0;
import a.z08;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", TokenNames.T, "Landroid/os/Parcelable;", "La/b8m0;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotStateList<T> implements Parcelable, b8m0, List<T>, RandomAccess, mhy {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new lgk0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x7m0 f45348a;

    public SnapshotStateList(j4 j4Var) {
        rfk0 rfk0VarH = xfk0.h();
        x7m0 x7m0Var = new x7m0(rfk0VarH.g(), j4Var);
        if (!(rfk0VarH instanceof x8v)) {
            x7m0Var.b = new x7m0(1L, j4Var);
        }
        this.f45348a = x7m0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        j4 j4Var;
        rfk0 rfk0VarH;
        boolean zL;
        do {
            synchronized (p8a.l) {
                x7m0 x7m0Var = this.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            j4 j4VarF = j4Var.f(obj);
            if (j4VarF.equals(j4Var)) {
                return false;
            }
            x7m0 x7m0Var3 = this.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = p8a.L((x7m0) xfk0.w(x7m0Var3, this, rfk0VarH), i, j4VarF, true);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        j4 j4Var;
        rfk0 rfk0VarH;
        boolean zL;
        do {
            synchronized (p8a.l) {
                x7m0 x7m0Var = this.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            j4 j4VarG = j4Var.g(collection);
            if (Intrinsics.d(j4VarG, j4Var)) {
                return false;
            }
            x7m0 x7m0Var3 = this.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = p8a.L((x7m0) xfk0.w(x7m0Var3, this, rfk0VarH), i, j4VarG, true);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        rfk0 rfk0VarH;
        x7m0 x7m0Var = this.f45348a;
        x7m0Var.getClass();
        synchronized (xfk0.c) {
            rfk0VarH = xfk0.h();
            x7m0 x7m0Var2 = (x7m0) xfk0.w(x7m0Var, this, rfk0VarH);
            synchronized (p8a.l) {
                x7m0Var2.c = mak0.c;
                x7m0Var2.d++;
                x7m0Var2.e++;
            }
        }
        xfk0.l(rfk0VarH, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return p8a.V(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return p8a.V(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // a.b8m0
    public final e8m0 g() {
        return this.f45348a;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return p8a.V(this).c.get(i);
    }

    @Override // a.b8m0
    public final void h(e8m0 e8m0Var) {
        e8m0Var.b = this.f45348a;
        this.f45348a = (x7m0) e8m0Var;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return p8a.V(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return p8a.V(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    public final void k(int i, int i2) {
        int i3;
        j4 j4Var;
        rfk0 rfk0VarH;
        boolean zL;
        do {
            synchronized (p8a.l) {
                x7m0 x7m0Var = this.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i3 = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            ii90 ii90VarH = j4Var.h();
            ii90VarH.subList(i, i2).clear();
            j4 j4VarF = ii90VarH.f();
            if (Intrinsics.d(j4VarF, j4Var)) {
                return;
            }
            x7m0 x7m0Var3 = this.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = p8a.L((x7m0) xfk0.w(x7m0Var3, this, rfk0VarH), i3, j4VarF, true);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zL);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return p8a.V(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new paw(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        j4 j4Var;
        rfk0 rfk0VarH;
        boolean zL;
        do {
            synchronized (p8a.l) {
                x7m0 x7m0Var = this.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            int iIndexOf = j4Var.indexOf(obj);
            j4 j4VarK = iIndexOf != -1 ? j4Var.k(iIndexOf) : j4Var;
            if (j4VarK.equals(j4Var)) {
                return false;
            }
            x7m0 x7m0Var3 = this.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = p8a.L((x7m0) xfk0.w(x7m0Var3, this, rfk0VarH), i, j4VarK, true);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        j4 j4Var;
        rfk0 rfk0VarH;
        boolean zL;
        do {
            synchronized (p8a.l) {
                x7m0 x7m0Var = this.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            j4 j4VarJ = j4Var.j(new h4(collection, (byte) 0));
            if (Intrinsics.d(j4VarJ, j4Var)) {
                return false;
            }
            x7m0 x7m0Var3 = this.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = p8a.L((x7m0) xfk0.w(x7m0Var3, this, rfk0VarH), i, j4VarJ, true);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return p8a.a0(this, new h4(collection, (byte) 3));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        j4 j4Var;
        rfk0 rfk0VarH;
        boolean zL;
        Object obj2 = get(i);
        do {
            synchronized (p8a.l) {
                x7m0 x7m0Var = this.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i2 = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            j4 j4VarL = j4Var.l(i, obj);
            if (j4VarL.equals(j4Var)) {
                break;
            }
            x7m0 x7m0Var3 = this.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = p8a.L((x7m0) xfk0.w(x7m0Var3, this, rfk0VarH), i2, j4VarL, false);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zL);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return p8a.V(this).c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            dsb0.a("fromIndex or toIndex are out of bounds");
        }
        return new ezm0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return wha0.V(this);
    }

    public final String toString() {
        x7m0 x7m0Var = this.f45348a;
        x7m0Var.getClass();
        return "SnapshotStateList(value=" + ((x7m0) xfk0.f(x7m0Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j4 j4Var = p8a.V(this).c;
        int size = j4Var.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(j4Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wha0.W(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new paw(this, i);
    }

    public SnapshotStateList() {
        this(mak0.c);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        j4 j4Var;
        rfk0 rfk0VarH;
        boolean zL;
        do {
            synchronized (p8a.l) {
                x7m0 x7m0Var = this.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i2 = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            j4 j4VarE = j4Var.e(i, obj);
            if (j4VarE.equals(j4Var)) {
                return;
            }
            x7m0 x7m0Var3 = this.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = p8a.L((x7m0) xfk0.w(x7m0Var3, this, rfk0VarH), i2, j4VarE, true);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zL);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return p8a.a0(this, new z08(i, (Object) collection, (byte) 18));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        j4 j4Var;
        rfk0 rfk0VarH;
        boolean zL;
        Object obj = get(i);
        do {
            synchronized (p8a.l) {
                x7m0 x7m0Var = this.f45348a;
                x7m0Var.getClass();
                x7m0 x7m0Var2 = (x7m0) xfk0.f(x7m0Var);
                i2 = x7m0Var2.d;
                j4Var = x7m0Var2.c;
            }
            j4Var.getClass();
            j4 j4VarK = j4Var.k(i);
            if (j4VarK.equals(j4Var)) {
                break;
            }
            x7m0 x7m0Var3 = this.f45348a;
            x7m0Var3.getClass();
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zL = p8a.L((x7m0) xfk0.w(x7m0Var3, this, rfk0VarH), i2, j4VarK, true);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zL);
        return obj;
    }
}
