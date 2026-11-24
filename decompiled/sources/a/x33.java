package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x33 implements b43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v33 f40196a;
    public final v33 b;

    public x33(v33 v33Var, v33 v33Var2) {
        this.f40196a = v33Var;
        this.b = v33Var2;
    }

    @Override // a.b43
    public final sz5 f0() {
        return new a0l0(this.f40196a.f0(), this.b.f0());
    }

    @Override // a.b43
    public final boolean g() {
        return this.f40196a.g() && this.b.g();
    }

    @Override // a.b43
    public final List j0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
