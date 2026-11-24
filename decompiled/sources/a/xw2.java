package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xw2 extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw2 f41589a;
    public final ey9 b;
    public final gx9 c;
    public final chf0 d;
    public final Handler e;
    public final c14 f;
    public final c14 g;

    public xw2(nw2 nw2Var, ey9 ey9Var, iki0 iki0Var, gx9 gx9Var, chf0 chf0Var, Handler handler) {
        ey9Var.getClass();
        gx9Var.getClass();
        handler.getClass();
        this.f41589a = nw2Var;
        this.b = ey9Var;
        this.c = gx9Var;
        this.d = chf0Var;
        this.e = handler;
        this.f = o2e.Z(iki0Var);
        this.g = o2e.Z(null);
    }

    public final fy9 a(CameraCaptureSession cameraCaptureSession, gx9 gx9Var) {
        fy9 fy9Var = (fy9) this.g.f3556a;
        if (fy9Var != null) {
            return fy9Var;
        }
        Handler handler = this.e;
        boolean z = cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession;
        nw2 nw2Var = this.f41589a;
        fy9 mw2Var = z ? new mw2(nw2Var, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession, gx9Var, handler) : new lw2(nw2Var, cameraCaptureSession, gx9Var, handler);
        if (this.g.a(null, mw2Var)) {
            return mw2Var;
        }
        Object obj = this.g.f3556a;
        obj.getClass();
        return (fy9) obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.c(a(cameraCaptureSession, this.c));
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            this.f41589a.c.getClass();
            Iterator it = ((List) ((c14) chf0Var.c).f3556a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onActive((adf0) chf0Var.b);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.h(a(cameraCaptureSession, this.c));
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            this.f41589a.c.getClass();
            if (Build.VERSION.SDK_INT < 26) {
                if (l8x.g0()) {
                    Log.e("CXCP", "onCaptureQueueEmpty called for unsupported OS version.");
                }
            } else {
                adf0 adf0Var = (adf0) chf0Var.b;
                Iterator it = ((List) ((c14) chf0Var.c).f3556a).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(adf0Var);
                }
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        gx9 gx9Var = this.c;
        a(cameraCaptureSession, gx9Var);
        fy9 fy9VarA = a(cameraCaptureSession, gx9Var);
        ey9 ey9Var = this.b;
        ey9Var.b(fy9VarA);
        iki0 iki0Var = (iki0) c14.b.getAndSet(this.f, null);
        if (iki0Var != null) {
            iki0Var.a();
        }
        ey9Var.a();
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            chf0Var.Y(this.f41589a.c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        fy9 fy9VarA = a(cameraCaptureSession, this.c);
        ey9 ey9Var = this.b;
        ey9Var.e(fy9VarA);
        iki0 iki0Var = (iki0) c14.b.getAndSet(this.f, null);
        if (iki0Var != null) {
            iki0Var.a();
        }
        ey9Var.a();
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            chf0Var.Z(this.f41589a.c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        this.b.f(a(cameraCaptureSession, this.c));
        iki0 iki0Var = (iki0) c14.b.getAndSet(this.f, null);
        if (iki0Var != null) {
            iki0Var.a();
        }
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            chf0Var.a0(this.f41589a.c);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.getClass();
        a(cameraCaptureSession, this.c);
        this.b.g(a(cameraCaptureSession, this.c));
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            this.f41589a.c.getClass();
            Iterator it = ((List) ((c14) chf0Var.c).f3556a).iterator();
            while (it.hasNext()) {
                ((CameraCaptureSession.StateCallback) it.next()).onReady((adf0) chf0Var.b);
            }
        }
    }
}
