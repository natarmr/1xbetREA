package a;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class oz4 {
    public static final ArrayList g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26087a;
    public boolean b;
    public final boolean c;
    public final Camera d;
    public final Handler e;
    public final nz4 f;

    static {
        ArrayList arrayList = new ArrayList(2);
        g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public oz4(Camera camera, o2a o2aVar) {
        mz4 mz4Var = new mz4(this, (byte) 0);
        this.f = new nz4(this);
        this.e = new Handler(mz4Var);
        this.d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        o2aVar.getClass();
        boolean zContains = g.contains(focusMode);
        this.c = zContains;
        Log.i("oz4", "Current focus mode '" + focusMode + "'; use auto focus? " + zContains);
        this.f26087a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.f26087a && !this.e.hasMessages(1)) {
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    public final void b() {
        if (!this.c || this.f26087a || this.b) {
            return;
        }
        try {
            this.d.autoFocus(this.f);
            this.b = true;
        } catch (RuntimeException e) {
            Log.w("oz4", "Unexpected exception while focusing", e);
            a();
        }
    }

    public final void c() {
        this.f26087a = true;
        this.b = false;
        this.e.removeMessages(1);
        if (this.c) {
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e) {
                Log.w("oz4", "Unexpected exception while cancelling focusing", e);
            }
        }
    }
}
