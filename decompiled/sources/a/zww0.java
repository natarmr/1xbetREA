package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zww0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45130a;
    public final /* synthetic */ fxw0 b;

    public zww0(fxw0 fxw0Var, String str) {
        this.b = fxw0Var;
        this.f45130a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        uuw0 uuw0Var = ((kxw0) this.b.b).f;
        kxw0.g(uuw0Var);
        uuw0Var.g.b(th, this.f45130a);
    }
}
