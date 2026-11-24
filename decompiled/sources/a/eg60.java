package a;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class eg60 {
    public boolean b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7748a = new ArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public eg60(boolean z) {
        this.b = z;
    }

    public final void e() {
        boolean zIsTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
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
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    e9d0.o();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.f7748a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((dg60) it2.next()).h();
        }
        arrayList.clear();
    }

    public final void f(boolean z) {
        this.b = z;
        for (dg60 dg60Var : this.f7748a) {
            dg60Var.i(dg60Var.i && z);
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void c(pb5 pb5Var) {
    }

    public void d(pb5 pb5Var) {
    }
}
