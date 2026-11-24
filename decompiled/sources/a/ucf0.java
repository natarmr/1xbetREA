package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ucf0 extends f4x {
    public final transient wcf0 d;
    public final transient vcf0 e;

    public ucf0(wcf0 wcf0Var, vcf0 vcf0Var) {
        this.d = wcf0Var;
        this.e = vcf0Var;
    }

    @Override // a.f4x, a.s3x
    public final b4x b() {
        return this.e;
    }

    @Override // a.s3x, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // a.s3x
    public final int e(int i, Object[] objArr) {
        return this.e.e(i, objArr);
    }

    @Override // a.s3x
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: j */
    public final eet0 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
