package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class u6w0 extends duo0 {
    public boolean b;
    public Object c;
    public Exception d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35157a = new Object();
    public ArrayList e = new ArrayList();

    @Override // a.duo0
    public final u6w0 a(fh60 fh60Var) {
        e(new e6w0(muo0.c.b, fh60Var));
        return this;
    }

    @Override // a.duo0
    public final Exception b() {
        Exception exc;
        synchronized (this.f35157a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // a.duo0
    public final Object c() {
        Object obj;
        synchronized (this.f35157a) {
            try {
                Exception exc = this.d;
                if (exc != null) {
                    throw new RuntimeException(exc);
                }
                obj = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // a.duo0
    public final boolean d() {
        boolean z;
        synchronized (this.f35157a) {
            try {
                z = this.b && this.d == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void e(e6w0 e6w0Var) {
        boolean z;
        synchronized (this.f35157a) {
            try {
                synchronized (this.f35157a) {
                    z = this.b;
                }
                if (!z) {
                    this.e.add(e6w0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e6w0Var.a(this);
        }
    }

    public final void f() {
        synchronized (this.f35157a) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                try {
                    ((e6w0) it.next()).a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.e = null;
        }
    }
}
