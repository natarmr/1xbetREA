package a;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dx9 implements ey9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f6837a;
    public final /* synthetic */ x04 b;
    public final /* synthetic */ Surface c;
    public final /* synthetic */ SurfaceTexture d;

    public dx9(CountDownLatch countDownLatch, x04 x04Var, Surface surface, SurfaceTexture surfaceTexture) {
        this.f6837a = countDownLatch;
        this.b = x04Var;
        this.c = surface;
        this.d = surfaceTexture;
    }

    @Override // a.ey9
    public final void b(fy9 fy9Var) {
        fy9Var.getClass();
        Log.d("CXCP", "Empty capture session closed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
    }

    @Override // a.ey9
    public final void c(fy9 fy9Var) {
        fy9Var.getClass();
    }

    @Override // a.ey9
    public final void e(fy9 fy9Var) {
        fy9Var.getClass();
        Log.d("CXCP", "Empty capture session configure failed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
        this.f6837a.countDown();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.ey9
    public final void f(fy9 fy9Var) throws Exception {
        boolean zIsTerminated;
        fy9Var.getClass();
        Log.d("CXCP", "Empty capture session configured. Closing it");
        if (fy9Var instanceof AutoCloseable) {
            fy9Var.close();
        } else if (fy9Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) fy9Var;
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
        } else if (fy9Var instanceof TypedArray) {
            ((TypedArray) fy9Var).recycle();
        } else if (fy9Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) fy9Var).release();
        } else {
            if (!(fy9Var instanceof MediaDrm)) {
                e9d0.o();
                return;
            }
            ((MediaDrm) fy9Var).release();
        }
        this.f6837a.countDown();
    }

    @Override // a.ey9
    public final void g(fy9 fy9Var) {
        fy9Var.getClass();
    }

    @Override // a.ey9
    public final void h(fy9 fy9Var) {
        fy9Var.getClass();
    }

    @Override // a.iki0
    public final void a() {
    }

    @Override // a.iki0
    public final void d() {
    }
}
