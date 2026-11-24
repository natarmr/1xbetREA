package a;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class wmn0 extends dvb0 {
    public SurfaceView e;
    public final vmn0 f;

    public wmn0(FrameLayout frameLayout, n8z n8zVar) {
        super(frameLayout, n8zVar);
        this.f = new vmn0(this);
    }

    @Override // a.dvb0
    public final View a() {
        return this.e;
    }

    @Override // a.dvb0
    public final Bitmap b() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: a.umn0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    l8x.U("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    l8x.X("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                l8x.X("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e) {
            l8x.Y("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // a.dvb0
    public final void e(pmn0 pmn0Var, hi hiVar) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals(this.f6735a, pmn0Var.b);
        if (surfaceView == null || !zEquals) {
            Size size = pmn0Var.b;
            this.f6735a = size;
            size.getClass();
            FrameLayout frameLayout = this.b;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.f6735a.getWidth(), this.f6735a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorO0 = jiq0.o0(this.e.getContext());
        pmn0Var.j.a(new apj0((Object) hiVar, (byte) 7), executorO0);
        this.e.post(new b1(this, pmn0Var, hiVar, (byte) 27));
    }
}
