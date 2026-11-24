package a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tu9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f34540a;
    public wu9 b;
    public msf0 c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        msf0 msf0Var = this.c;
        if (msf0Var != null) {
            msf0Var.a(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        wu9 wu9Var = this.b;
        boolean z = wu9Var != null && wu9Var.b.l(obj);
        if (z) {
            this.f34540a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        wu9 wu9Var = this.b;
        if (wu9Var == null || !wu9Var.b.cancel(true)) {
            return;
        }
        this.f34540a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        wu9 wu9Var = this.b;
        boolean z = wu9Var != null && wu9Var.b.m(th);
        if (z) {
            this.f34540a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        msf0 msf0Var;
        wu9 wu9Var = this.b;
        if (wu9Var != null && !wu9Var.b.isDone()) {
            wu9Var.b(new s4("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f34540a, (byte) 1));
        }
        if (this.d || (msf0Var = this.c) == null) {
            return;
        }
        msf0Var.l(null);
    }
}
