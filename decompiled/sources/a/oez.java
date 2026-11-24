package a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class oez extends n4 implements sez, RandomAccess {
    public final List b;

    static {
        new oez();
    }

    public oez() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // a.sez
    public final void L0(lg9 lg9Var) {
        b();
        this.b.add(lg9Var);
        ((AbstractList) this).modCount++;
    }

    @Override // a.sez
    public final List a() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // a.n4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof sez) {
            collection = ((sez) collection).a();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // a.n4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // a.sez
    public final sez d() {
        return this.f22873a ? new het0(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof lg9)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, dmx.f6339a);
            if (qtt0.f29315a.v(bArr, 0, bArr.length) == 0) {
                list.set(i, str);
            }
            return str;
        }
        lg9 lg9Var = (lg9) obj;
        String str2 = lg9Var.size() == 0 ? "" : new String(lg9Var.b, lg9Var.f(), lg9Var.size(), dmx.f6339a);
        int iF = lg9Var.f();
        if (qtt0.f29315a.v(lg9Var.b, iF, lg9Var.size() + iF) == 0) {
            list.set(i, str2);
        }
        return str2;
    }

    @Override // a.amx
    public final amx n(int i) {
        List list = this.b;
        if (i < list.size()) {
            e9d0.o();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new oez(arrayList);
    }

    @Override // a.n4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof lg9)) {
            return new String((byte[]) objRemove, dmx.f6339a);
        }
        lg9 lg9Var = (lg9) objRemove;
        return lg9Var.size() == 0 ? "" : new String(lg9Var.b, lg9Var.f(), lg9Var.size(), dmx.f6339a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof lg9)) {
            return new String((byte[]) obj2, dmx.f6339a);
        }
        lg9 lg9Var = (lg9) obj2;
        return lg9Var.size() == 0 ? "" : new String(lg9Var.b, lg9Var.f(), lg9Var.size(), dmx.f6339a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // a.sez
    public final Object x(int i) {
        return this.b.get(i);
    }

    public oez(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public oez(int i) {
        this(new ArrayList(i));
    }

    @Override // a.n4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
