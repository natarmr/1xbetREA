package a;

/* JADX INFO: loaded from: classes2.dex */
public final class nkw0 extends hhw0 {
    public final transient int f;
    public final transient int g;
    public final /* synthetic */ hhw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nkw0(hhw0 hhw0Var, int i, int i2) {
        super((byte) 1);
        this.h = hhw0Var;
        this.f = i;
        this.g = i2;
    }

    @Override // a.hdw0
    public final int b() {
        return this.h.f() + this.f + this.g;
    }

    @Override // a.hdw0
    public final int f() {
        return this.h.f() + this.f;
    }

    @Override // java.util.List
    public final Object get(int i) {
        dem0.v(i, this.g);
        return this.h.get(i + this.f);
    }

    @Override // a.hdw0
    public final Object[] k() {
        return this.h.k();
    }

    @Override // a.hhw0, java.util.List
    /* JADX INFO: renamed from: m */
    public final hhw0 subList(int i, int i2) {
        dem0.w(i, i2, this.g);
        int i3 = this.f;
        return (hhw0) this.h.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
