package a;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ex9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qcq0 f8567a;
    public final jx9 b;
    public final iag0 c;

    public ex9(qcq0 qcq0Var, jx9 jx9Var, iag0 iag0Var) {
        qcq0Var.getClass();
        jx9Var.getClass();
        iag0Var.getClass();
        this.f8567a = qcq0Var;
        this.b = jx9Var;
        this.c = iag0Var;
    }

    public static void c(yy9 yy9Var) throws InterruptedException {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, Response.TEMPORARILY_UNAVAILABLE);
        Surface surface = new Surface(surfaceTexture);
        x04 x04VarX = o2e.X(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (yy9Var.l(kotlin.collections.a.c(surface), new dx9(countDownLatch, x04VarX, surface, surfaceTexture))) {
            countDownLatch.await();
            return;
        }
        Log.e("CXCP", "Failed to create a blank capture session! Surfaces may not be disconnected properly.");
        if (x04VarX.a()) {
            surface.release();
            surfaceTexture.release();
        }
    }

    public final void a(yy9 yy9Var, CameraDevice cameraDevice, tw2 tw2Var, x34 x34Var, boolean z, boolean z2) {
        oa5 oa5Var;
        x34Var.getClass();
        Pair pair = null;
        CameraDevice cameraDevice2 = yy9Var != null ? (CameraDevice) yy9Var.H(sre0.f32672a.b(CameraDevice.class)) : null;
        if (cameraDevice2 == null) {
            if (cameraDevice != null) {
                b(cameraDevice, tw2Var);
                return;
            }
            return;
        }
        String id = cameraDevice2.getId();
        id.getClass();
        g0a.a(id);
        if (cameraDevice != null && !id.equals(cameraDevice.getId())) {
            StringBuilder sbT = kng0.t("Unwrapped camera device has camera ID ", id, ", but the wrapped camera device has camera ID ");
            sbT.append(cameraDevice.getId());
            sbT.append('!');
            throw new IllegalStateException(sbT.toString().toString());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            yy9Var.getClass();
            if (i >= 30) {
                x34Var.e.remove(yy9Var);
            }
        }
        Log.d("CXCP", "handleQuirksBeforeClosing(" + cameraDevice2 + ')');
        String strF = yy9Var.F();
        if (z) {
            try {
                Trace.beginSection("Camera2DeviceCloserImpl#reopenCameraDevice");
                Log.d("CXCP", "Reopening camera device");
                b(cameraDevice2, tw2Var);
                oa5Var = this.c.a(strF, this);
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            oa5Var = new oa5(yy9Var, tw2Var);
        }
        yy9 yy9Var2 = oa5Var.f24914a;
        tw2 tw2Var2 = oa5Var.b;
        if (yy9Var2 == null || tw2Var2 == null) {
            Log.e("CXCP", "Failed to retain an opened camera device!");
        } else {
            if (z2) {
                try {
                    Trace.beginSection("Camera2DeviceCloserImpl#createCaptureSession");
                    Log.d("CXCP", "Creating an empty capture session before closing " + ((Object) g0a.b(strF)));
                    c(yy9Var2);
                    Log.d("CXCP", "Created an empty capture session.");
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            pair = new Pair(yy9Var2, tw2Var2);
        }
        if (pair == null) {
            Log.e("CXCP", "Failed to handle quirks before closing the camera device!");
            yy9Var.n();
            yy9Var.T();
            tw2Var.d(cameraDevice2);
            return;
        }
        yy9 yy9Var3 = (yy9) pair.f46059a;
        tw2 tw2Var3 = (tw2) pair.b;
        Object objH = yy9Var3.H(sre0.f32672a.b(CameraDevice.class));
        if (objH == null) {
            jf4.n("Required value was null.");
            return;
        }
        yy9Var.n();
        b((CameraDevice) objH, tw2Var3);
        yy9Var.T();
        if (z) {
            tw2Var.d(cameraDevice2);
        }
    }

    public final void b(CameraDevice cameraDevice, tw2 tw2Var) {
        String id = cameraDevice.getId();
        id.getClass();
        Log.d("CXCP", "closeCameraDevice(" + id + ')');
        hie0 hie0Var = new hie0();
        if (((Unit) this.f8567a.b(7000L, new r72(cameraDevice, hie0Var, null, (byte) 4))) == null) {
            Log.e("CXCP", "Failed to close CameraDevice(" + id + ") after 7000ms. The camera is likely in a bad state.");
        }
        String id2 = cameraDevice.getId();
        id2.getClass();
        g0a.a(id2);
        jx9 jx9Var = this.b;
        jx9Var.getClass();
        jx9Var.b.getClass();
        b1a b1aVar = c1a.a0;
        c1a c1aVarA = jx9Var.f17293a.a(id2);
        b1aVar.getClass();
        if (b1a.c(c1aVarA) && hie0Var.f13108a) {
            Log.d("CXCP", "Waiting for OnClosed from " + ((Object) g0a.b(id2)));
            if (tw2Var.r.await(2000L, TimeUnit.MILLISECONDS)) {
                Log.d("CXCP", "Received OnClosed for " + ((Object) g0a.b(id2)));
            } else {
                Log.w("CXCP", "Failed to close " + ((Object) g0a.b(id2)) + " after 2000ms!");
            }
        }
    }
}
