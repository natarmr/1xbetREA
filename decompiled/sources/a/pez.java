package a;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class pez extends AbstractList implements RandomAccess, tez {
    public static final iet0 b = new iet0(new pez());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f26875a;

    public pez(tez tezVar) {
        this.f26875a = new ArrayList(tezVar.size());
        addAll(tezVar);
    }

    @Override // a.tez
    public final List a() {
        return Collections.unmodifiableList(this.f26875a);
    }

    @Override // a.tez
    public final pg9 a0(int i) {
        pg9 nh00Var;
        ArrayList arrayList = this.f26875a;
        Object obj = arrayList.get(i);
        if (obj instanceof pg9) {
            nh00Var = (pg9) obj;
        } else if (obj instanceof String) {
            try {
                nh00Var = new nh00(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e9d0.m("UTF-8 not supported?", e);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            nh00Var = new nh00(bArr2);
        }
        if (nh00Var != obj) {
            arrayList.set(i, nh00Var);
        }
        return nh00Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f26875a.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof tez) {
            collection = ((tez) collection).a();
        }
        boolean zAddAll = this.f26875a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f26875a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // a.tez
    public final iet0 d() {
        return new iet0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.f26875a;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof pg9) {
            pg9 pg9Var = (pg9) obj;
            String strQ = pg9Var.q();
            if (pg9Var.i()) {
                arrayList.set(i, strQ);
            }
            return strQ;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = emx.f8067a;
        try {
            String str = new String(bArr, "UTF-8");
            if (yum0.k(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            e9d0.m("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // a.tez
    public final void j0(nh00 nh00Var) {
        this.f26875a.add(nh00Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.f26875a.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof pg9) {
            return ((pg9) objRemove).q();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = emx.f8067a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e9d0.m("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f26875a.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof pg9) {
            return ((pg9) obj2).q();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = emx.f8067a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e9d0.m("UTF-8 not supported?", e);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26875a.size();
    }

    public pez() {
        this.f26875a = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f26875a.size(), collection);
    }
}
