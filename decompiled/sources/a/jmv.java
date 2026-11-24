package a;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.measurement.internal.zzbh;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class jmv implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16784a;
    public final /* synthetic */ Object b;

    public jmv(oyw0 oyw0Var, zzbh zzbhVar, String str) {
        this.f16784a = (byte) 3;
        this.b = oyw0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.f16784a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Runnable) obj).run();
                return null;
            case 1:
                h04 h04Var = (h04) obj;
                AtomicBoolean atomicBoolean = h04Var.c;
                h04Var.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        h04Var.e.b();
                        break;
                    } catch (q080 e) {
                        if (!atomicBoolean.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    h04Var.a(null);
                    return null;
                } catch (Throwable th) {
                    try {
                        atomicBoolean.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        h04Var.a(null);
                        throw th2;
                    }
                }
            case 2:
                return new lzw0(((uww0) obj).m);
            default:
                m6x0 m6x0Var = ((oyw0) obj).f26078a;
                m6x0Var.V();
                fvw0 fvw0Var = m6x0Var.h;
                m6x0.T(fvw0Var);
                fvw0Var.m1();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public /* synthetic */ jmv(Object obj, byte b) {
        this.f16784a = b;
        this.b = obj;
    }
}
