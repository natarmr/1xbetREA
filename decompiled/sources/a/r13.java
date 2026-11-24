package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r13 implements t1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ehf0 f29657a;
    public final String b;
    public final n0o0 c = maz.b(new a13(this, (byte) 2));

    public r13(ehf0 ehf0Var, String str) {
        this.f29657a = ehf0Var;
        this.b = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((s13) this.c.getValue()).getClass();
        throw null;
    }

    @Override // a.t1e
    public final Object m(boolean z, Function2 function2, zje zjeVar) {
        return function2.invoke((s13) this.c.getValue(), zjeVar);
    }
}
