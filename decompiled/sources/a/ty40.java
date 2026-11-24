package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ty40 implements List, mhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34735a;
    public final Object b;

    public ty40() {
        this.f34735a = (byte) 2;
        this.b = new ArrayList();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        byte b = this.f34735a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vy40 vy40Var = (vy40) obj2;
                if (i < 0 || i > (i2 = vy40Var.b)) {
                    vy40Var.q(i);
                    throw null;
                }
                int i3 = i2 + 1;
                Object[] objArr = vy40Var.f38232a;
                if (objArr.length < i3) {
                    vy40Var.n(i3, objArr);
                }
                Object[] objArr2 = vy40Var.f38232a;
                int i4 = vy40Var.b;
                if (i != i4) {
                    qx3.e(i + 1, i, i4, objArr2, objArr2);
                }
                objArr2[i] = obj;
                vy40Var.b++;
                return;
            case 1:
                ((xz40) obj2).a(i, obj);
                return;
            default:
                ((ArrayList) obj2).add(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                vy40 vy40Var = (vy40) obj;
                if (i < 0 || i > vy40Var.b) {
                    vy40Var.q(i);
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + vy40Var.b;
                Object[] objArr = vy40Var.f38232a;
                if (objArr.length < size) {
                    vy40Var.n(size, objArr);
                }
                Object[] objArr2 = vy40Var.f38232a;
                if (i != vy40Var.b) {
                    qx3.e(collection.size() + i, i, vy40Var.b, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    objArr2[i2 + i] = obj2;
                    i2 = i3;
                }
                vy40Var.b = collection.size() + vy40Var.b;
                return true;
            case 1:
                return ((xz40) obj).e(i, collection);
            default:
                collection.getClass();
                return ((ArrayList) obj).addAll(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vy40) obj).d();
                break;
            case 1:
                ((xz40) obj).g();
                break;
            default:
                ((ArrayList) obj).clear();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.f34735a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((vy40) obj2).e(obj);
            case 1:
                return ((xz40) obj2).h(obj);
            default:
                return ((ArrayList) obj2).contains(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                vy40 vy40Var = (vy40) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!vy40Var.e(it.next())) {
                        return false;
                    }
                }
                return true;
            case 1:
                xz40 xz40Var = (xz40) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!xz40Var.h(it2.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                return ((ArrayList) obj).containsAll(collection);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                w960.a(i, this);
                return ((vy40) obj).g(i);
            case 1:
                yz40.a(i, this);
                return ((xz40) obj).f41739a[i];
            default:
                return ((ArrayList) obj).get(i);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.f34735a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((vy40) obj2).h(obj);
            case 1:
                return ((xz40) obj2).i(obj);
            default:
                return ((ArrayList) obj2).indexOf(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((vy40) obj).i();
            case 1:
                return ((xz40) obj).c == 0;
            default:
                return ((ArrayList) obj).isEmpty();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f34735a) {
            case 0:
                return new sy40(this, 0, (byte) 0);
            case 1:
                return new sy40(this, 0, (byte) 1);
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                it.getClass();
                return it;
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        byte b = this.f34735a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vy40 vy40Var = (vy40) obj2;
                Object[] objArr = vy40Var.f38232a;
                int i2 = vy40Var.b;
                if (obj == null) {
                    i = i2 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i2 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            case 1:
                xz40 xz40Var = (xz40) obj2;
                Object[] objArr2 = xz40Var.f41739a;
                for (int i3 = xz40Var.c - 1; i3 >= 0; i3--) {
                    if (Intrinsics.d(obj, objArr2[i3])) {
                        return i3;
                    }
                }
                return -1;
            default:
                return ((ArrayList) obj2).lastIndexOf(obj);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f34735a) {
            case 0:
                return new sy40(this, 0, (byte) 0);
            case 1:
                return new sy40(this, 0, (byte) 1);
            default:
                ListIterator listIterator = ((ArrayList) this.b).listIterator();
                listIterator.getClass();
                return listIterator;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                w960.a(i, this);
                return ((vy40) obj).l(i);
            case 1:
                yz40.a(i, this);
                return ((xz40) obj).k(i);
            default:
                return ((ArrayList) obj).remove(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                vy40 vy40Var = (vy40) obj;
                int i = vy40Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    vy40Var.k(it.next());
                }
                return i != vy40Var.b;
            case 1:
                xz40 xz40Var = (xz40) obj;
                if (!collection.isEmpty()) {
                    int i2 = xz40Var.c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        xz40Var.j(it2.next());
                    }
                    if (i2 != xz40Var.c) {
                        return true;
                    }
                }
                return false;
            default:
                collection.getClass();
                return ((ArrayList) obj).removeAll(collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                vy40 vy40Var = (vy40) obj;
                int i = vy40Var.b;
                Object[] objArr = vy40Var.f38232a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        vy40Var.l(i2);
                    }
                }
                return i != vy40Var.b;
            case 1:
                xz40 xz40Var = (xz40) obj;
                int i3 = xz40Var.c;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(xz40Var.f41739a[i4])) {
                        xz40Var.k(i4);
                    }
                }
                return i3 != xz40Var.c;
            default:
                collection.getClass();
                return ((ArrayList) obj).retainAll(collection);
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.f34735a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                w960.a(i, this);
                return ((vy40) obj2).o(i, obj);
            case 1:
                yz40.a(i, this);
                Object[] objArr = ((xz40) obj2).f41739a;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
            default:
                return ((ArrayList) obj2).set(i, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((vy40) obj).b;
            case 1:
                return ((xz40) obj).c;
            default:
                return ((ArrayList) obj).size();
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f34735a) {
            case 0:
                w960.b(i, i2, this);
                return new uy40(this, i, i2, (byte) 0);
            case 1:
                yz40.b(i, i2, this);
                return new uy40(this, i, i2, (byte) 1);
            default:
                List listSubList = ((ArrayList) this.b).subList(i, i2);
                listSubList.getClass();
                return listSubList;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f34735a) {
            case 0:
                objArr.getClass();
                break;
            case 1:
                break;
            default:
                objArr.getClass();
                break;
        }
        return wha0.W(this, objArr);
    }

    public /* synthetic */ ty40(Object obj, byte b) {
        this.f34735a = b;
        this.b = obj;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f34735a) {
            case 0:
                break;
            case 1:
                break;
        }
        return wha0.V(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f34735a) {
            case 0:
                return new sy40(this, i, (byte) 0);
            case 1:
                return new sy40(this, i, (byte) 1);
            default:
                ListIterator listIterator = ((ArrayList) this.b).listIterator(i);
                listIterator.getClass();
                return listIterator;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.f34735a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((vy40) obj2).k(obj);
            case 1:
                return ((xz40) obj2).j(obj);
            default:
                return ((ArrayList) obj2).remove(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.f34735a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((vy40) obj2).a(obj);
                return true;
            case 1:
                ((xz40) obj2).b(obj);
                return true;
            default:
                return ((ArrayList) obj2).add(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.f34735a;
        Object obj = this.b;
        switch (b) {
            case 0:
                collection.getClass();
                vy40 vy40Var = (vy40) obj;
                int i = vy40Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    vy40Var.a(it.next());
                }
                return i != vy40Var.b;
            case 1:
                xz40 xz40Var = (xz40) obj;
                return xz40Var.e(xz40Var.c, collection);
            default:
                collection.getClass();
                return ((ArrayList) obj).addAll(collection);
        }
    }
}
