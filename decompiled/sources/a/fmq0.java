package a;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class fmq0 {
    public static final dmq0 d = new dmq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9798a;
    public long b;
    public long c;

    public fmq0 a() {
        this.f9798a = false;
        return this;
    }

    public fmq0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.f9798a) {
            return this.b;
        }
        jf4.n("No deadline");
        return 0L;
    }

    public fmq0 d(long j) {
        this.f9798a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.f9798a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f9798a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public fmq0 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        c99.s(h97.h(j, "timeout < 0: "));
        return null;
    }

    public long h() {
        return this.c;
    }
}
