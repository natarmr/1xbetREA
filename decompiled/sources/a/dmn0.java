package a;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class dmn0 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lrm0 f6330a;
    public final o5d0 b;
    public final j3a c;
    public final Map d;
    public final Object e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public boolean h;
    public boolean i;

    public dmn0(lrm0 lrm0Var, w1k w1kVar, j3a j3aVar, Map map) {
        w1kVar.getClass();
        map.getClass();
        this.f6330a = lrm0Var;
        this.b = w1kVar;
        this.c = j3aVar;
        this.d = map;
        this.e = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((c1x) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.f = linkedHashMap;
        this.g = new LinkedHashMap();
        this.h = true;
    }

    public final void a() {
        Map linkedHashMap;
        synchronized (this.e) {
            linkedHashMap = new LinkedHashMap();
            loop0: for (jrm0 jrm0Var : this.f6330a.c) {
                for (f3a f3aVar : jrm0Var.l) {
                    Surface surface = (Surface) this.f.get(new mrm0(f3aVar.f8851a));
                    if (surface == null) {
                        if (!(jrm0Var.f != null)) {
                            linkedHashMap = lun.f20680a;
                            linkedHashMap.getClass();
                            break loop0;
                        }
                    } else {
                        linkedHashMap.put(new mrm0(f3aVar.f8851a), surface);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        iw9 iw9Var = (iw9) this.b.get();
        iw9Var.getClass();
        synchronized (iw9Var.q) {
            if (iw9Var.c()) {
                return;
            }
            iw9Var.A = linkedHashMap;
            r9a r9aVar = iw9Var.z;
            if (r9aVar != null) {
                r9aVar.j(linkedHashMap);
            }
        }
    }

    public final void c() {
        synchronized (this.e) {
            try {
                if (this.i) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.f.values()) {
                    this.g.put(surface, this.c.a(surface));
                }
                this.h = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        synchronized (this.e) {
            if (this.i) {
                return;
            }
            this.i = true;
            this.f.clear();
            List<AutoCloseable> listL0 = CollectionsKt.L0(this.g.values());
            this.g.clear();
            for (AutoCloseable autoCloseable : listL0) {
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
        }
    }

    public final void d() throws Exception {
        List<AutoCloseable> listL0;
        boolean zIsTerminated;
        synchronized (this.e) {
            this.h = false;
            listL0 = CollectionsKt.L0(this.g.values());
            this.g.clear();
        }
        for (AutoCloseable autoCloseable : listL0) {
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
    }
}
