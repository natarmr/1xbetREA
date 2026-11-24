package a;

/* JADX INFO: loaded from: classes6.dex */
public final class aa50 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ba50 f509a;

    public aa50(ba50 ba50Var) {
        this.f509a = ba50Var;
    }

    public final void a(Float f) {
        Object value;
        p7m0 p7m0Var = this.f509a.f2242a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, db50.a((db50) value, false, f, 1)));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Object value;
        p7m0 p7m0Var = this.f509a.f2242a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, db50.a((db50) value, false, null, 1)));
    }
}
