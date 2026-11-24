package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n39 extends pa5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n5a f22839a;
    public Function1 b;

    @Override // a.pa5
    public final void a() {
        this.b = null;
        this.f22839a = null;
    }

    @Override // a.pa5
    public final void b(Throwable th) {
        n5a n5aVar = this.f22839a;
        if (n5aVar != null) {
            e0g0 e0g0Var = j0g0.b;
            n5aVar.resumeWith(z1x.C(th));
        }
    }
}
