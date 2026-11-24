package a;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45276a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ b1x0 c;

    public zzw0(b1x0 b1x0Var, AtomicReference atomicReference, byte b) {
        this.f45276a = b;
        switch (b) {
            case 1:
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
        switch (this.f45276a) {
            case 0:
                AtomicReference atomicReference = this.b;
                synchronized (atomicReference) {
                    try {
                        try {
                            kxw0 kxw0Var = (kxw0) this.c.b;
                            atomicReference.set(Long.valueOf(kxw0Var.d.u1(kxw0Var.k().r1(), btw0.c0)));
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
                            atomicReference2.set(Double.valueOf(kxw0Var2.d.w1(kxw0Var2.k().r1(), btw0.e0)));
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
            case 2:
                b1x0 b1x0Var = this.c;
                wvw0 wvw0Var = ((kxw0) b1x0Var.b).e;
                kxw0.e(wvw0Var);
                Bundle bundleS = wvw0Var.o.s();
                a4x0 a4x0VarI = ((kxw0) b1x0Var.b).i();
                AtomicReference atomicReference3 = this.b;
                a4x0VarI.m1();
                a4x0VarI.n1();
                a4x0VarI.z1(new pb90(a4x0VarI, atomicReference3, a4x0VarI.B1(false), bundleS, (byte) 14));
                return;
            default:
                a4x0 a4x0VarI2 = ((kxw0) this.c.b).i();
                zzoo zzooVarM = zzoo.m(q1x0.SGTM_CLIENT);
                AtomicReference atomicReference4 = this.b;
                a4x0VarI2.m1();
                a4x0VarI2.n1();
                a4x0VarI2.z1(new pb90(a4x0VarI2, atomicReference4, a4x0VarI2.B1(false), zzooVarM, (byte) 15));
                return;
        }
    }

    public /* synthetic */ zzw0(b1x0 b1x0Var, AtomicReference atomicReference, byte b, boolean z) {
        this.f45276a = b;
        this.c = b1x0Var;
        this.b = atomicReference;
    }
}
