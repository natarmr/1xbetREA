package a;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class tcf0 extends f4x {
    public final transient wcf0 d;
    public final transient Object[] e;
    public final transient int f;

    public tcf0(wcf0 wcf0Var, Object[] objArr, int i) {
        this.d = wcf0Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // a.s3x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // a.s3x
    public final int e(int i, Object[] objArr) {
        return b().e(i, objArr);
    }

    @Override // a.s3x
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: j */
    public final eet0 iterator() {
        return b().listIterator(0);
    }

    @Override // a.f4x
    public final b4x o() {
        return new scf0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
