package a;

/* JADX INFO: loaded from: classes2.dex */
public final class co20 implements z440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z440[] f4682a;

    @Override // a.z440
    public final z9e0 a(Class cls) {
        for (z440 z440Var : this.f4682a) {
            if (z440Var.b(cls)) {
                return z440Var.a(cls);
            }
        }
        v4i0.p("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // a.z440
    public final boolean b(Class cls) {
        for (z440 z440Var : this.f4682a) {
            if (z440Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
