package a;

/* JADX INFO: loaded from: classes2.dex */
public final class znw0 extends cow0 {
    public final transient cow0 f;

    public znw0(cow0 cow0Var) {
        super((byte) 2);
        this.f = cow0Var;
    }

    @Override // a.cow0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        cow0 cow0Var = this.f;
        xsm0.A(i, cow0Var.size());
        return cow0Var.get((cow0Var.size() - 1) - i);
    }

    @Override // a.cow0, java.util.List
    public final int indexOf(Object obj) {
        cow0 cow0Var = this.f;
        int iLastIndexOf = cow0Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (cow0Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // a.cow0, java.util.List
    public final int lastIndexOf(Object obj) {
        cow0 cow0Var = this.f;
        int iIndexOf = cow0Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (cow0Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // a.cow0
    public final cow0 m() {
        return this.f;
    }

    @Override // a.cow0, java.util.List
    /* JADX INFO: renamed from: o */
    public final cow0 subList(int i, int i2) {
        cow0 cow0Var = this.f;
        xsm0.B(i, i2, cow0Var.size());
        return cow0Var.subList(cow0Var.size() - i2, cow0Var.size() - i).m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.size();
    }
}
