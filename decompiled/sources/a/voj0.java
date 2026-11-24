package a;

import android.content.res.TypedArray;
import android.media.Image;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class voj0 implements ye80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ye80 f37770a;
    public final ywu b;
    public final x04 c = o2e.X(false);

    public voj0(ye80 ye80Var, ywu ywuVar) {
        this.f37770a = ye80Var;
        this.b = ywuVar;
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (this.c.b()) {
            return null;
        }
        tre0 tre0Var = sre0.f32672a;
        if (sgyVar.equals(tre0Var.b(voj0.class)) || sgyVar.equals(tre0Var.b(ye80.class)) || sgyVar.equals(tre0Var.b(b3x.class))) {
            return this;
        }
        if (!sgyVar.equals(tre0Var.b(Image.class))) {
            return this.f37770a.H(sgyVar);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public final voj0 a() {
        int i;
        int i2;
        voj0 voj0Var;
        if (this.c.b()) {
            voj0Var = null;
        } else {
            ywu ywuVar = this.b;
            z04 z04Var = (z04) ywuVar.c;
            do {
                i = z04Var.f43546a;
                i2 = i == 0 ? 0 : i + 1;
            } while (!z04.b.compareAndSet(z04Var, i, i2));
            if ((i2 != 0 ? (ye80) ywuVar.b : null) != null) {
                voj0Var = new voj0(this.f37770a, this.b);
            } else {
                voj0Var = null;
            }
        }
        if (voj0Var != null) {
            return voj0Var;
        }
        jf4.n("Required value was null.");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        if (this.c.a()) {
            ywu ywuVar = this.b;
            if (z04.b.decrementAndGet((z04) ywuVar.c) == 0) {
                ((hvc) c14.b.getAndSet((c14) ywuVar.d, null)).getClass();
                AutoCloseable autoCloseable = (ye80) ywuVar.b;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (!(autoCloseable instanceof ExecutorService)) {
                    if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        return;
                    }
                    if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                        return;
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                        return;
                    } else {
                        e9d0.o();
                        return;
                    }
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                    return;
                }
                executorService.shutdown();
                boolean z = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final String toString() {
        return this.f37770a.toString();
    }
}
