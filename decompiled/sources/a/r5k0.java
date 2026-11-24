package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r5k0 extends f4x {
    public final transient Object d;

    public r5k0(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // a.f4x, a.s3x
    public final b4x b() {
        return b4x.t(this.d);
    }

    @Override // a.s3x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // a.s3x
    public final int e(int i, Object[] objArr) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // a.f4x, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // a.s3x
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final eet0 iterator() {
        return new fzx(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
