package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jgw0 extends ghw0 {
    public final transient int f;
    public final transient int g;
    public final /* synthetic */ ghw0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgw0(ghw0 ghw0Var, int i, int i2) {
        super((byte) 0);
        this.h = ghw0Var;
        this.f = i;
        this.g = i2;
    }

    @Override // a.hdw0
    public final Object[] g() {
        return this.h.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        xcm0.w(i, this.g);
        return this.h.get(i + this.f);
    }

    @Override // a.hdw0
    public final int h() {
        return this.h.h() + this.f;
    }

    @Override // a.hdw0
    public final int i() {
        return this.h.h() + this.f + this.g;
    }

    @Override // a.ghw0, java.util.List
    /* JADX INFO: renamed from: o */
    public final ghw0 subList(int i, int i2) {
        xcm0.x(i, i2, this.g);
        int i3 = this.f;
        return this.h.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
