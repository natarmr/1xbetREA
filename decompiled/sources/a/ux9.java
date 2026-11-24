package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ux9 implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f36429a = new LinkedHashMap();
    public final n0o0 b = maz.b(new mn9(13));
    public volatile Map c;

    public ux9() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.c = lunVar;
    }

    public static int g(gnf0 gnf0Var) {
        eoo0 eoo0Var = (eoo0) gnf0Var.a(vso0.f37960a);
        Object obj = eoo0Var != null ? eoo0Var.f8147a.get("CAPTURE_CONFIG_ID_KEY") : null;
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // a.bmf0
    public final void a(gnf0 gnf0Var, long j) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                CameraCaptureSession cameraCaptureSessionF = f(gnf0Var);
                CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(sre0.f32672a.b(CaptureRequest.class));
                if (cameraCaptureSessionF != null && captureRequest != null) {
                    executor.execute(new tx9((o3a) vx9Var, cameraCaptureSessionF, j, (byte) 0));
                }
            }
        }
    }

    public final void b(vx9 vx9Var, Executor executor) {
        vx9Var.getClass();
        executor.getClass();
        if (this.c.containsKey(vx9Var)) {
            throw new IllegalStateException((vx9Var + " was already registered!").toString());
        }
        synchronized (this.f36429a) {
            this.f36429a.put(vx9Var, executor);
            this.c = xp20.n(this.f36429a);
        }
    }

    @Override // a.bmf0
    public final void c(gnf0 gnf0Var, long j, pz2 pz2Var) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                tre0 tre0Var = sre0.f32672a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gnf0Var.H(tre0Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(tre0Var.b(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) pz2Var.H(tre0Var.b(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new rx9((o3a) vx9Var, cameraCaptureSession, captureRequest, captureResult, (byte) 1));
                }
            }
        }
    }

    @Override // a.bmf0
    public final void d(gnf0 gnf0Var, long j, oz2 oz2Var) {
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                CameraCaptureSession cameraCaptureSessionF = f(gnf0Var);
                tre0 tre0Var = sre0.f32672a;
                CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(tre0Var.b(CaptureRequest.class));
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) oz2Var.H(tre0Var.b(TotalCaptureResult.class));
                if (cameraCaptureSessionF != null && captureRequest != null && totalCaptureResult != null) {
                    executor.execute(new qx9(vx9Var, (Object) cameraCaptureSessionF, (Object) captureRequest, (Object) totalCaptureResult, (byte) 0));
                }
            } else {
                executor.execute(new b1(vx9Var, this, gnf0Var, new j9a(gnf0Var, oz2Var), (byte) 4));
            }
        }
    }

    @Override // a.bmf0
    public final void e(gnf0 gnf0Var, int i) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                tre0 tre0Var = sre0.f32672a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gnf0Var.H(tre0Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(tre0Var.b(CaptureRequest.class));
                CaptureResult captureResult = (CaptureResult) gnf0Var.H(tre0Var.b(CaptureResult.class));
                if (cameraCaptureSession != null && captureRequest != null && captureResult != null) {
                    executor.execute(new rx9((o3a) vx9Var, cameraCaptureSession, captureRequest, captureResult, (byte) 0));
                }
            } else {
                executor.execute(new f58(vx9Var, this, gnf0Var, i));
            }
        }
    }

    public final CameraCaptureSession f(gnf0 gnf0Var) {
        tre0 tre0Var = sre0.f32672a;
        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gnf0Var.H(tre0Var.b(CameraCaptureSession.class));
        if (cameraCaptureSession != null) {
            return cameraCaptureSession;
        }
        if (Build.VERSION.SDK_INT < 31 || kn4.h(gnf0Var.H(tre0Var.b(kn4.C()))) == null) {
            return null;
        }
        return (CameraCaptureSession) this.b.getValue();
    }

    @Override // a.bmf0
    public final void l(gnf0 gnf0Var, long j, long j2) {
        gnf0Var.getClass();
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                tre0 tre0Var = sre0.f32672a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gnf0Var.H(tre0Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(tre0Var.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new ox9((o3a) vx9Var, cameraCaptureSession, captureRequest, j2, j, (byte) 1));
                }
            }
        }
    }

    @Override // a.bmf0
    public final void q(cmf0 cmf0Var) {
        cmf0Var.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            Object obj = cmf0Var.c.get(vso0.f37960a);
            eoo0 eoo0Var = obj instanceof eoo0 ? (eoo0) obj : null;
            Object obj2 = eoo0Var != null ? eoo0Var.f8147a.get("CAPTURE_CONFIG_ID_KEY") : null;
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            executor.execute(new n23((Object) vx9Var, num != null ? num.intValue() : -1, (byte) 4));
        }
    }

    @Override // a.bmf0
    public final void r(gnf0 gnf0Var, final long j, int i, int i2) {
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                tre0 tre0Var = sre0.f32672a;
                final CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gnf0Var.H(tre0Var.b(CameraCaptureSession.class));
                final CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(tre0Var.b(CaptureRequest.class));
                final Surface surface = (Surface) gnf0Var.Q().get(new mrm0(i));
                if (cameraCaptureSession != null && captureRequest != null && surface != null) {
                    final o3a o3aVar = (o3a) vx9Var;
                    executor.execute(new Runnable() { // from class: a.sx9
                        @Override // java.lang.Runnable
                        public final void run() {
                            o3aVar.f24573a.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
                        }
                    });
                }
            }
        }
    }

    @Override // a.bmf0
    public final void v(gnf0 gnf0Var, long j, long j2) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                CameraCaptureSession cameraCaptureSessionF = f(gnf0Var);
                CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(sre0.f32672a.b(CaptureRequest.class));
                if (cameraCaptureSessionF != null && captureRequest != null) {
                    executor.execute(new ox9((o3a) vx9Var, cameraCaptureSessionF, captureRequest, j2, j, (byte) 0));
                }
            } else {
                executor.execute(new px9(vx9Var, this, gnf0Var, (byte) 0));
            }
        }
    }

    @Override // a.bmf0
    public final void w(gnf0 gnf0Var, long j, qmf0 qmf0Var) {
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                CameraCaptureSession cameraCaptureSessionF = f(gnf0Var);
                tre0 tre0Var = sre0.f32672a;
                CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(tre0Var.b(CaptureRequest.class));
                CaptureFailure captureFailure = (CaptureFailure) qmf0Var.H(tre0Var.b(CaptureFailure.class));
                if (cameraCaptureSessionF != null && captureRequest != null && captureFailure != null) {
                    executor.execute(new qx9(vx9Var, (Object) cameraCaptureSessionF, (Object) captureRequest, (Object) captureFailure, (byte) 1));
                }
            } else {
                executor.execute(new b1(vx9Var, this, gnf0Var, new yk5(), (byte) 5));
            }
        }
    }

    @Override // a.bmf0
    public final void x(gnf0 gnf0Var) {
        gnf0Var.getClass();
        for (Map.Entry entry : this.c.entrySet()) {
            vx9 vx9Var = (vx9) entry.getKey();
            Executor executor = (Executor) entry.getValue();
            if (vx9Var instanceof o3a) {
                tre0 tre0Var = sre0.f32672a;
                CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) gnf0Var.H(tre0Var.b(CameraCaptureSession.class));
                CaptureRequest captureRequest = (CaptureRequest) gnf0Var.H(tre0Var.b(CaptureRequest.class));
                if (cameraCaptureSession != null && captureRequest != null) {
                    executor.execute(new fy2((o3a) vx9Var, cameraCaptureSession, (byte) 14));
                }
            } else {
                executor.execute(new px9(vx9Var, this, gnf0Var, (byte) 1));
            }
        }
    }
}
