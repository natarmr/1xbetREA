package a;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pzw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27865a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ b1x0 c;

    public pzw0(b1x0 b1x0Var, AtomicReference atomicReference, byte b) {
        this.f27865a = b;
        switch (b) {
            case 1:
                this.b = atomicReference;
                Objects.requireNonNull(b1x0Var);
                this.c = b1x0Var;
                break;
            case 2:
                this.b = atomicReference;
                Objects.requireNonNull(b1x0Var);
                this.c = b1x0Var;
                break;
            default:
                this.b = atomicReference;
                Objects.requireNonNull(b1x0Var);
                this.c = b1x0Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27865a) {
            case 0:
                AtomicReference atomicReference = this.b;
                synchronized (atomicReference) {
                    try {
                        try {
                            kxw0 kxw0Var = (kxw0) this.c.b;
                            atomicReference.set(Boolean.valueOf(kxw0Var.d.x1(kxw0Var.k().r1(), btw0.a0)));
                            this.b.notify();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.b.notify();
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            kxw0 kxw0Var2 = (kxw0) this.c.b;
                            atomicReference2.set(kxw0Var2.d.t1(kxw0Var2.k().r1(), btw0.b0));
                            this.b.notify();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        this.b.notify();
                        throw th4;
                    }
                }
                return;
            default:
                AtomicReference atomicReference3 = this.b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            kxw0 kxw0Var3 = (kxw0) this.c.b;
                            atomicReference3.set(Integer.valueOf(kxw0Var3.d.v1(kxw0Var3.k().r1(), btw0.d0)));
                            this.b.notify();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        this.b.notify();
                        throw th6;
                    }
                }
                return;
        }
    }
}
