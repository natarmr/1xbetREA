package androidx.media3.exoplayer.video;

import a.f1t0;
import a.n4c;
import a.p7v;
import a.wu90;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {
    public static int d;
    public static boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45389a;
    public final wu90 b;
    public boolean c;

    public PlaceholderSurface(wu90 wu90Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = wu90Var;
        this.f45389a = z;
    }

    public static int a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (((i >= 26 || !(Payload.SOURCE_SAMSUNG.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) && (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) ? n4c.M("EGL_EXT_protected_content") : false) {
                return n4c.M("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        } catch (p7v e2) {
            f1t0.Q("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!e) {
                d = a(context);
                e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    wu90 wu90Var = this.b;
                    wu90Var.b.getClass();
                    wu90Var.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
