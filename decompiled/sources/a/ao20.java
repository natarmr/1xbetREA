package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ao20 implements x440 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x440[] f1180a;

    @Override // a.x440
    public final x9e0 a(Class cls) {
        for (x440 x440Var : this.f1180a) {
            if (x440Var.b(cls)) {
                return x440Var.a(cls);
            }
        }
        v4i0.p("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // a.x440
    public final boolean b(Class cls) {
        for (x440 x440Var : this.f1180a) {
            if (x440Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
