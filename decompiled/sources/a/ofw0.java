package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ofw0 extends ghw0 {
    public final transient ghw0 f;

    public ofw0(ghw0 ghw0Var) {
        super((byte) 0);
        this.f = ghw0Var;
    }

    @Override // a.ghw0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        ghw0 ghw0Var = this.f;
        xcm0.w(i, ghw0Var.size());
        return ghw0Var.get((ghw0Var.size() - 1) - i);
    }

    @Override // a.ghw0, java.util.List
    public final int indexOf(Object obj) {
        ghw0 ghw0Var = this.f;
        int iLastIndexOf = ghw0Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (ghw0Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // a.ghw0, java.util.List
    public final int lastIndexOf(Object obj) {
        ghw0 ghw0Var = this.f;
        int iIndexOf = ghw0Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (ghw0Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // a.ghw0
    public final ghw0 m() {
        return this.f;
    }

    @Override // a.ghw0, java.util.List
    /* JADX INFO: renamed from: o */
    public final ghw0 subList(int i, int i2) {
        ghw0 ghw0Var = this.f;
        xcm0.x(i, i2, ghw0Var.size());
        return ghw0Var.subList(ghw0Var.size() - i2, ghw0Var.size() - i).m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.size();
    }
}
