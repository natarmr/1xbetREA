package a;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class qwq extends fmq0 {
    public fmq0 e;

    public qwq(fmq0 fmq0Var) {
        fmq0Var.getClass();
        this.e = fmq0Var;
    }

    @Override // a.fmq0
    public final fmq0 a() {
        return this.e.a();
    }

    @Override // a.fmq0
    public final fmq0 b() {
        return this.e.b();
    }

    @Override // a.fmq0
    public final long c() {
        return this.e.c();
    }

    @Override // a.fmq0
    public final fmq0 d(long j) {
        return this.e.d(j);
    }

    @Override // a.fmq0
    public final boolean e() {
        return this.e.e();
    }

    @Override // a.fmq0
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // a.fmq0
    public final fmq0 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.g(j, timeUnit);
    }

    @Override // a.fmq0
    public final long h() {
        return this.e.h();
    }
}
