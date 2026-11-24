package a;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class p0a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26139a;
    public final /* synthetic */ q0a b;

    public /* synthetic */ p0a(q0a q0aVar, byte b) {
        this.f26139a = b;
        this.b = q0aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Camera cameraOpen = null;
        Object g7k0Var = null;
        switch (this.f26139a) {
            case 0:
                q0a q0aVar = this.b;
                try {
                    Log.d("q0a", "Opening camera");
                    a1a a1aVar = q0aVar.c;
                    int iB = g8x.B(a1aVar.g.f24522a);
                    if (iB != -1) {
                        cameraOpen = Camera.open(iB);
                    }
                    a1aVar.f63a = cameraOpen;
                    if (cameraOpen == null) {
                        itt0.k("Failed to open camera");
                        return;
                    }
                    int iB2 = g8x.B(a1aVar.g.f24522a);
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    a1aVar.b = cameraInfo;
                    Camera.getCameraInfo(iB2, cameraInfo);
                    return;
                } catch (Exception e) {
                    Handler handler = q0aVar.d;
                    if (handler != null) {
                        handler.obtainMessage(R.id.zxing_camera_error, e).sendToTarget();
                    }
                    Log.e("q0a", "Failed to open camera", e);
                    return;
                }
            case 1:
                q0a q0aVar2 = this.b;
                a1a a1aVar2 = q0aVar2.c;
                try {
                    Log.d("q0a", "Configuring camera");
                    a1aVar2.b();
                    Handler handler2 = q0aVar2.d;
                    if (handler2 != null) {
                        g7k0 g7k0Var2 = a1aVar2.j;
                        if (g7k0Var2 != null) {
                            int i = a1aVar2.k;
                            if (i == -1) {
                                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                            }
                            g7k0Var = i % 180 != 0 ? new g7k0(g7k0Var2.b, g7k0Var2.f10819a) : g7k0Var2;
                        }
                        handler2.obtainMessage(R.id.zxing_prewiew_size_ready, g7k0Var).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    Handler handler3 = q0aVar2.d;
                    if (handler3 != null) {
                        handler3.obtainMessage(R.id.zxing_camera_error, e2).sendToTarget();
                    }
                    Log.e("q0a", "Failed to configure camera", e2);
                    return;
                }
            case 2:
                q0a q0aVar3 = this.b;
                a1a a1aVar3 = q0aVar3.c;
                try {
                    Log.d("q0a", "Starting preview");
                    c5k c5kVar = q0aVar3.b;
                    Camera camera = a1aVar3.f63a;
                    SurfaceHolder surfaceHolder = (SurfaceHolder) c5kVar.f3775a;
                    if (surfaceHolder != null) {
                        camera.setPreviewDisplay(surfaceHolder);
                    } else {
                        camera.setPreviewTexture((SurfaceTexture) c5kVar.b);
                    }
                    a1aVar3.e();
                    return;
                } catch (Exception e3) {
                    Handler handler4 = q0aVar3.d;
                    if (handler4 != null) {
                        handler4.obtainMessage(R.id.zxing_camera_error, e3).sendToTarget();
                    }
                    Log.e("q0a", "Failed to start preview", e3);
                    return;
                }
            default:
                try {
                    Log.d("q0a", "Closing camera");
                    a1a a1aVar4 = this.b.c;
                    oz4 oz4Var = a1aVar4.c;
                    if (oz4Var != null) {
                        oz4Var.c();
                        a1aVar4.c = null;
                    }
                    if (a1aVar4.d != null) {
                        a1aVar4.d = null;
                    }
                    Camera camera2 = a1aVar4.f63a;
                    if (camera2 != null && a1aVar4.e) {
                        camera2.stopPreview();
                        a1aVar4.l.f43556a = null;
                        a1aVar4.e = false;
                    }
                    a1a a1aVar5 = this.b.c;
                    Camera camera3 = a1aVar5.f63a;
                    if (camera3 != null) {
                        camera3.release();
                        a1aVar5.f63a = null;
                    }
                    break;
                } catch (Exception e4) {
                    Log.e("q0a", "Failed to close camera", e4);
                }
                q0a q0aVar4 = this.b;
                q0aVar4.g = true;
                q0aVar4.d.sendEmptyMessage(R.id.zxing_camera_closed);
                sbx0 sbx0Var = this.b.f27887a;
                synchronized (sbx0Var.e) {
                    int i2 = sbx0Var.b - 1;
                    sbx0Var.b = i2;
                    if (i2 == 0) {
                        synchronized (sbx0Var.e) {
                            ((HandlerThread) sbx0Var.d).quit();
                            sbx0Var.d = null;
                            sbx0Var.c = null;
                        }
                    }
                    break;
                }
                return;
        }
    }
}
