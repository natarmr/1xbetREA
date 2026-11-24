package a;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24412a;
    public final /* synthetic */ q0a b;
    public final /* synthetic */ yqc c;

    public /* synthetic */ o0a(q0a q0aVar, yqc yqcVar, byte b) {
        this.f24412a = b;
        this.b = q0aVar;
        this.c = yqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f24412a;
        yqc yqcVar = this.c;
        q0a q0aVar = this.b;
        switch (b) {
            case 0:
                if (!q0aVar.f) {
                    Log.d("q0a", "Camera is closed, not requesting preview");
                } else {
                    q0aVar.f27887a.e(new o0a(q0aVar, yqcVar, (byte) 1));
                }
                break;
            default:
                a1a a1aVar = q0aVar.c;
                Camera camera = a1aVar.f63a;
                if (camera != null && a1aVar.e) {
                    z0a z0aVar = a1aVar.l;
                    z0aVar.f43556a = yqcVar;
                    camera.setOneShotPreviewCallback(z0aVar);
                    break;
                }
                break;
        }
    }
}
