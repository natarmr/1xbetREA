package a;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class z0a implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yqc f43556a;
    public g7k0 b;
    public final /* synthetic */ a1a c;

    public z0a(a1a a1aVar) {
        this.c = a1aVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        g7k0 g7k0Var = this.b;
        yqc yqcVar = this.f43556a;
        if (g7k0Var == null || yqcVar == null) {
            Log.d("a1a", "Got preview callback, but no handler or resolution available");
            if (yqcVar != null) {
                new Exception("No resolution available");
                yqcVar.x();
                return;
            }
            return;
        }
        try {
            if (bArr == null) {
                throw new NullPointerException("No preview data received");
            }
            fmk0 fmk0Var = new fmk0(bArr, g7k0Var.f10819a, g7k0Var.b, camera.getParameters().getPreviewFormat(), this.c.k);
            if (this.c.b.facing == 1) {
                fmk0Var.e = true;
            }
            synchronized (((jrs0) yqcVar.b).h) {
                try {
                    jrs0 jrs0Var = (jrs0) yqcVar.b;
                    if (jrs0Var.f17020a) {
                        ((Handler) jrs0Var.d).obtainMessage(R.id.zxing_decode, fmk0Var).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RuntimeException e) {
            Log.e("a1a", "Camera preview failed", e);
            yqcVar.x();
        }
    }
}
