package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bo20 implements y440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y440[] f2912a;

    @Override // a.y440
    public final y9e0 a(Class cls) {
        for (y440 y440Var : this.f2912a) {
            if (y440Var.b(cls)) {
                return y440Var.a(cls);
            }
        }
        v4i0.p("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // a.y440
    public final boolean b(Class cls) {
        for (y440 y440Var : this.f2912a) {
            if (y440Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
