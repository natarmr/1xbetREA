package a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class qw2 implements fy9, kft0, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw2 f29414a;
    public final CameraExtensionSession b;
    public final gx9 c;
    public final k03 d;
    public final b14 e;
    public final HashMap f;

    public qw2(nw2 nw2Var, CameraExtensionSession cameraExtensionSession, gx9 gx9Var, k03 k03Var) {
        cameraExtensionSession.getClass();
        gx9Var.getClass();
        this.f29414a = nw2Var;
        this.b = cameraExtensionSession;
        this.c = gx9Var;
        this.d = k03Var;
        z04 z04Var = w0a.f38340a;
        z04Var.getClass();
        z04.b.incrementAndGet(z04Var);
        b14 b14Var = new b14();
        b14Var.f1789a = 0L;
        this.e = b14Var;
        this.f = new HashMap();
    }

    @Override // a.fy9
    public final boolean C() {
        return false;
    }

    @Override // a.fy9
    public final yy9 E() {
        return this.f29414a;
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        if (sgyVar.equals(sre0.f32672a.b(kn4.C()))) {
            return this.b;
        }
        return null;
    }

    @Override // a.fy9
    public final boolean K(List list) {
        list.getClass();
        Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }

    @Override // a.fy9
    public final boolean M0() throws Exception {
        Unit unit;
        String str = this.f29414a.c;
        try {
            this.b.stopRepeating();
            unit = Unit.f46060a;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            gx9 gx9Var = this.c;
            if (z) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                int i = 3;
                if (reason != 1) {
                    if (reason == 2) {
                        i = 6;
                    } else if (reason == 3) {
                        i = 0;
                    } else if (reason == 4) {
                        i = 1;
                    } else if (reason != 5) {
                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                        i = 11;
                    } else {
                        i = 2;
                    }
                }
                gx9Var.a(str, i, true);
            } else if ((e instanceof IllegalArgumentException) || (e instanceof SecurityException) || (e instanceof UnsupportedOperationException) || (e instanceof NullPointerException)) {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                gx9Var.a(str, 9, false);
            } else {
                if (!(e instanceof IllegalStateException)) {
                    throw e;
                }
                Log.d("CXCP", "Failed to execute call: Camera may be closed");
            }
            unit = null;
        }
        return unit != null;
    }

    @Override // a.fy9
    public final Integer T0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) {
        if (arrayList.size() == 1) {
            return d0((CaptureRequest) CollectionsKt.v0(arrayList), captureCallback);
        }
        jf4.n("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws CameraAccessException {
        this.b.close();
    }

    @Override // a.fy9
    public final Integer d0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        captureRequest.getClass();
        String str = this.f29414a.c;
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.b;
            k03 k03Var = this.d;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, k03Var, new pw2(this, (tw9) captureCallback)) : cameraExtensionSession.setRepeatingRequest(captureRequest, k03Var, new pw2(this, (tw9) captureCallback, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            gx9 gx9Var = this.c;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                gx9Var.a(str, 9, false);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            gx9Var.a(str, i2, true);
            return null;
        }
    }

    @Override // a.fy9
    public final Integer g0(ArrayList arrayList, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w0((CaptureRequest) it.next(), captureCallback);
        }
        return null;
    }

    @Override // a.fy9
    public final Surface getInputSurface() {
        return null;
    }

    @Override // a.fy9
    public final Integer w0(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws Exception {
        captureRequest.getClass();
        String str = this.f29414a.c;
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.b;
            k03 k03Var = this.d;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.capture(captureRequest, k03Var, new pw2(this, (tw9) captureCallback)) : cameraExtensionSession.capture(captureRequest, k03Var, new pw2(this, (tw9) captureCallback, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            gx9 gx9Var = this.c;
            if (!z) {
                if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                    if (!(e instanceof IllegalStateException)) {
                        throw e;
                    }
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                gx9Var.a(str, 9, false);
                return null;
            }
            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
            CameraAccessException cameraAccessException = (CameraAccessException) e;
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                i2 = 3;
            } else if (reason == 2) {
                i2 = 6;
            } else if (reason != 3) {
                if (reason == 4) {
                    i2 = 1;
                } else if (reason != 5) {
                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                    i2 = 11;
                } else {
                    i2 = 2;
                }
            }
            gx9Var.a(str, i2, true);
            return null;
        }
    }
}
