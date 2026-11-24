package a;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iyj implements pyj, fps0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f15592a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iyj(Object obj, Object obj2, boolean z, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.f15592a = z;
        this.d = obj3;
    }

    @Override // a.pyj
    public rcf0 a(int i, ccs0 ccs0Var, int[] iArr) {
        syj syjVar = (syj) this.b;
        nyj nyjVar = (nyj) this.c;
        int[] iArr2 = (int[]) this.d;
        syjVar.getClass();
        hyj hyjVar = new hyj(syjVar, nyjVar);
        int i2 = iArr2[i];
        u3x u3xVarL = b4x.l();
        for (int i3 = 0; i3 < ccs0Var.f4128a; i3++) {
            u3xVarL.b(new jyj(i, ccs0Var, i3, nyjVar, iArr[i3], this.f15592a, hyjVar, i2));
        }
        return u3xVarL.g();
    }

    @Override // a.fps0
    public void b(Exception exc) throws Throwable {
        amf0 amf0Var = (amf0) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        x15 x15Var = (x15) this.d;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f15592a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new oh60(amf0Var, countDownLatch, (byte) 14)).start();
            ExecutorService executorService = eut0.f8440a;
            boolean z2 = false;
            try {
                long jNanoTime = 2000000000;
                long jNanoTime2 = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        jNanoTime = jNanoTime2 - System.nanoTime();
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        taskCompletionSource.trySetResult(x15Var);
    }
}
