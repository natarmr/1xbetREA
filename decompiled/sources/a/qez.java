package a;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class qez extends m4 implements rez, RandomAccess {
    public final ArrayList b;

    static {
        new qez(10).f21141a = false;
    }

    public qez(int i) {
        this(new ArrayList(i));
    }

    @Override // a.rez
    public final List a() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // a.m4, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        if (collection instanceof rez) {
            collection = ((rez) collection).a();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // a.m4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // a.rez
    public final rez d() {
        return this.f21141a ? new jet0(this) : this;
    }

    @Override // a.rez
    public final void f0(og9 og9Var) {
        b();
        this.b.add(og9Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        String str;
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof og9)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, cmx.f4629a);
            if (ptt0.f27581a.n(bArr, 0, bArr.length)) {
                arrayList.set(i, str2);
            }
            return str2;
        }
        og9 og9Var = (og9) obj;
        Charset charset = cmx.f4629a;
        if (og9Var.size() == 0) {
            str = "";
        } else {
            kg9 kg9Var = (kg9) og9Var;
            str = new String(kg9Var.d, kg9Var.i(), kg9Var.size(), charset);
        }
        kg9 kg9Var2 = (kg9) og9Var;
        int i2 = kg9Var2.i();
        if (ptt0.f27581a.n(kg9Var2.d, i2, kg9Var2.size() + i2)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // a.zlx
    public final zlx n(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            e9d0.o();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new qez(arrayList2);
    }

    @Override // a.m4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof og9)) {
            return new String((byte[]) objRemove, cmx.f4629a);
        }
        og9 og9Var = (og9) objRemove;
        Charset charset = cmx.f4629a;
        if (og9Var.size() == 0) {
            return "";
        }
        kg9 kg9Var = (kg9) og9Var;
        return new String(kg9Var.d, kg9Var.i(), kg9Var.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof og9)) {
            return new String((byte[]) obj2, cmx.f4629a);
        }
        og9 og9Var = (og9) obj2;
        Charset charset = cmx.f4629a;
        if (og9Var.size() == 0) {
            return "";
        }
        kg9 kg9Var = (kg9) og9Var;
        return new String(kg9Var.d, kg9Var.i(), kg9Var.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // a.rez
    public final Object x(int i) {
        return this.b.get(i);
    }

    public qez(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // a.m4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
