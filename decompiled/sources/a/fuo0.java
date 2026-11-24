package a;

/* JADX INFO: loaded from: classes2.dex */
public final class fuo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u6w0 f10174a = new u6w0();

    public final void a(Exception exc) {
        u6w0 u6w0Var = this.f10174a;
        synchronized (u6w0Var.f35157a) {
            try {
                if (!u6w0Var.b) {
                    u6w0Var.b = true;
                    u6w0Var.d = exc;
                    u6w0Var.f35157a.notifyAll();
                    u6w0Var.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj) {
        u6w0 u6w0Var = this.f10174a;
        synchronized (u6w0Var.f35157a) {
            try {
                if (!u6w0Var.b) {
                    u6w0Var.b = true;
                    u6w0Var.c = obj;
                    u6w0Var.f35157a.notifyAll();
                    u6w0Var.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
