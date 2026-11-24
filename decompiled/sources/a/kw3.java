package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kw3 extends ArrayList implements yxs0 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof zxs0) {
            return super.contains((zxs0) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof zxs0) {
            return super.indexOf((zxs0) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof zxs0) {
            return super.lastIndexOf((zxs0) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof zxs0) {
            return super.remove((zxs0) obj);
        }
        return false;
    }
}
