package a;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class wu90 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sgn f39780a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public PlaceholderSurface e;

    public final void a(int i) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f39780a.getClass();
        sgn sgnVar = this.f39780a;
        int[] iArr = sgnVar.b;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        n4c.I("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        n4c.I("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        sgnVar.c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, sgn.g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = vtt0.f38024a;
        n4c.I(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(sgnVar.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        n4c.I("eglCreateContext failed", eGLContextEglCreateContext != null);
        sgnVar.d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = sgnVar.c;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            n4c.I("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        n4c.I("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        sgnVar.e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        n4c.H();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        sgnVar.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(sgnVar);
        SurfaceTexture surfaceTexture2 = this.f39780a.f;
        surfaceTexture2.getClass();
        this.e = new PlaceholderSurface(this, surfaceTexture2, i != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f39780a.getClass();
        sgn sgnVar = this.f39780a;
        sgnVar.f32170a.removeCallbacks(sgnVar);
        try {
            SurfaceTexture surfaceTexture = sgnVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, sgnVar.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = sgnVar.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = sgnVar.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = sgnVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(sgnVar.c, sgnVar.e);
            }
            EGLContext eGLContext = sgnVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(sgnVar.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = sgnVar.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(sgnVar.c);
            }
            sgnVar.c = null;
            sgnVar.d = null;
            sgnVar.e = null;
            sgnVar.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (p7v e) {
                    f1t0.R("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    f1t0.R("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    f1t0.R("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th) {
                    try {
                        f1t0.R("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
