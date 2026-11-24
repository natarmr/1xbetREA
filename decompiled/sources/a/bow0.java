package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bow0 extends cow0 {
    public final transient int f;
    public final transient int g;
    public final /* synthetic */ cow0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bow0(cow0 cow0Var, int i, int i2) {
        super((byte) 2);
        this.h = cow0Var;
        this.f = i;
        this.g = i2;
    }

    @Override // a.hdw0
    public final int f() {
        return this.h.h() + this.f + this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xsm0.A(i, this.g);
        return this.h.get(i + this.f);
    }

    @Override // a.hdw0
    public final int h() {
        return this.h.h() + this.f;
    }

    @Override // a.hdw0
    public final Object[] k() {
        return this.h.k();
    }

    @Override // a.cow0, java.util.List
    /* JADX INFO: renamed from: o */
    public final cow0 subList(int i, int i2) {
        xsm0.B(i, i2, this.g);
        int i3 = this.f;
        return this.h.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
